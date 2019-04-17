import Data_Type.Attribute_form;
import Data_Type.Data_Type;
import Data_Type.Variable_form;
import Hplsql.HplsqlBaseVisitor;
import Hplsql.HplsqlParser;
import codgen.reducers.AggregationFunction;
import codgen.reducers.PickAny;
import codgen.Query;

import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

public class Visitor<T> extends HplsqlBaseVisitor {
    @Override
    public T visitCreate_external_table_stmt(HplsqlParser.Create_external_table_stmtContext ctx) {
        Variable_form variable = new Variable_form();

        //get the table columns from the create_external_table_definition() rule
        variable.setAttributes((ArrayList<Attribute_form>) visit(ctx.create_external_table_definition()));

        //info[0] have delimiter
        //info[1] have HDFSPath for the table
        String[] info = (String[]) visit(ctx.create_external_table_definition().create_table_options());
        variable.setDelimiter(info[0]);
        variable.setHDFSPath(info[1]);
        return (T) variable;
    }

    @Override
    public ArrayList<Attribute_form> visitCreate_external_table_definition(HplsqlParser.Create_external_table_definitionContext ctx) {
        ArrayList<Attribute_form> attributes = new ArrayList<>();

        //forEach col we get the colName and colType
        ctx.create_external_table_columns().forEach(e -> {
            String attributeName = e.create_external_table_columns_item().column_name().ident().getText();
            String attributeType = e.create_external_table_columns_item().dtype().getText();
            attributes.add(new Attribute_form(attributeName, attributeType));
        });

        return attributes;
    }

    @Override
    public Object visitCreate_table_options(HplsqlParser.Create_table_optionsContext ctx) {
        String[] info = new String[2];
        ctx.create_table_options_item().forEach(e -> {
            if (e.create_table_options_hive_item() != null) {
                info[0] = e.create_table_options_hive_item().create_table_hive_row_format().create_table_hive_row_format_fields(0).ident().getText();
                info[1] = e.create_table_options_hive_item().create_table_hive_row_format().create_table_hive_row_format_fields(0).location().string().getText();
            }
        });
        info[1] = info[1].substring(1, info[1].length() - 1);
        info[0] = info[0].substring(1, info[0].length() - 1);
        return info;
    }

    @Override
    public String visitSelect_stmt(HplsqlParser.Select_stmtContext ctx) {
        visit(ctx.fullselect_stmt().fullselect_stmt_item(0).subselect_stmt());
        return "";
    }

    @Override
    public String visitSubselect_stmt(HplsqlParser.Subselect_stmtContext ctx) {
        final String finalResultFileName = "finalFile";

        ArrayList<String> finalFiles = (ArrayList<String>) visit(ctx.select_list());
        try {
            Query.accumulate(finalFiles);
        } catch (IOException e) {
            e.printStackTrace();
        }
        return "";

    }

    @Override
    public ArrayList<String> visitSelect_list(HplsqlParser.Select_listContext ctx) {
        ArrayList<String> finalFiles = new ArrayList<>();
        ctx.select_list_item().forEach(e -> finalFiles.add((String) visit(e)));

        return finalFiles;
    }

    @Override
    public String visitSelect_list_item(HplsqlParser.Select_list_itemContext ctx) {
        String finalPhaseFileName = null;

        //if it col then
        if (ctx.expr().expr_atom() != null) {
            //get the shuffled map for the col
            ArrayList<String> fileEntries = getFileEntriesForCol(ctx.expr());

            //reduce it by pick any, cause it without aggregation function
            Query.reduce(fileEntries, new PickAny());

            //get the process files in one file that represent the all phase process
            try {
                finalPhaseFileName = Query.getFinalPhaseResult(fileEntries, new PickAny());
            } catch (IOException e) {
                e.printStackTrace();
            }

        }
        //so it is an aggregation function
        else if (ctx.expr().expr_agg_window_func() != null) {
            try {

                // get the finalPhaseFile by tow steps:
                // 1. get the entriesFile from the aggregation function
                // 2. reduce the files by the last aggregation function we did
                finalPhaseFileName = Query.getFinalPhaseResult(
                        (ArrayList<String>) visit(ctx.expr().expr_agg_window_func()),
                        AggregationFunction.choseReducer(ctx.expr().expr_agg_window_func().getChild(0).getText()));
            } catch (IOException e) {
                e.printStackTrace();
            }
        }
        //TODO: make the function so

        return finalPhaseFileName;
    }


    @Override
    public ArrayList<String> visitExpr_agg_window_func(HplsqlParser.Expr_agg_window_funcContext ctx) {

        //visit the param if it col or aggregation function so.. , and get the fileEntries
        ArrayList<String> fileEntries = (ArrayList<String>) visit(ctx.agg_param());

        //reduce them by the aggregation function
        Query.reduce(fileEntries, AggregationFunction.choseReducer(ctx.getChild(0).getText()));

        return fileEntries;

    }


    @Override
    public ArrayList<String> visitAgg_param(HplsqlParser.Agg_paramContext ctx) {
        ArrayList<String> fileEntries = null;

        // if it an col then get the shuffled map files without reduce
        if (ctx.expr().expr_atom() != null) {
            fileEntries = getFileEntriesForCol(ctx.expr());
        } else {

            // if it an aggregation function so get the shuffled map files reduced by the inner aggregation function
            if (ctx.expr().expr_agg_window_func() != null) {
                fileEntries = (ArrayList<String>) visit(ctx.expr().expr_agg_window_func());
            }
        }
        return fileEntries;
    }

    /**
     * get file entries for col that contained map and shuffles without reduce
     */
    private ArrayList<String> getFileEntriesForCol(HplsqlParser.ExprContext ctx) {
        String colName = ctx.expr_atom().ident().getText();

        String tableName = colExistedInTable(ctx, Query.Tables);
        ArrayList<String> fileEntries = null;

        try {
            if (tableName != null) {
                fileEntries = Query.startProcess(colName, tableName);
            } else
                throw new ColumnNotContainedException(colName);
        } catch (IOException | ColumnNotContainedException e) {
            e.printStackTrace();
        }
        return fileEntries;

    }

    /**
     * to find if column existed in any table and
     * there is no conflict
     */
    private String colExistedInTable(HplsqlParser.ExprContext ctx, List<String> tables) {
        boolean status = false;
        String tableName = null;
        String colName = ctx.expr_atom().ident().getText();


        //check if col existed in table and there is no conflict
        for (String table : Query.Tables) {
            if (Data_Type.checkIfItAttributes(table, colName))
                if (!status) {
                    status = true;
                    tableName = table;
                } else
                    try {
                        throw new ColumnConflictException(colName);
                    } catch (ColumnConflictException e) {
                        e.printStackTrace();
                    }
        }
        return tableName;
    }

    static class ColumnConflictException extends Exception {
        ColumnConflictException(String s) {
            super(s + "is in more than one table");
        }
    }

    static class ColumnNotContainedException extends Exception {
        ColumnNotContainedException(String s) {
            super(s + "is not contained in any table");
        }
    }
}

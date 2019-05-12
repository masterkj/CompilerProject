import Data_Type.Attribute_form;
import Data_Type.Data_Type;
import Data_Type.Variable_form;
import Hplsql.HplsqlBaseVisitor;
import Hplsql.HplsqlParser;
import codgen.FlatProcess;
import codgen.reducers.AggregationFunction;
import codgen.Query;
import codgen.row_functions.RowFunction;

import sympol_table.Scope;
import sympol_table.Symbol_table;


import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

import static codgen.Query.OUTPUT_FLAT_PATH;
import static codgen.Query.TEMP_PATH;

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

        visit(ctx.select_list());
        Query.accumulateReducers();
        return "";
    }


    @Override
    public String visitSelect_list(HplsqlParser.Select_listContext ctx) {
        ctx.select_list_item().forEach(e -> visit(e));

        return "";
    }

    @Override
    public String visitSelect_list_item(HplsqlParser.Select_list_itemContext ctx) {

        if (ctx.expr().expr_agg_window_func() != null)
            visit(ctx.expr().expr_agg_window_func());

        return "";
    }

    @Override
    public String visitExpr_agg_window_func(HplsqlParser.Expr_agg_window_funcContext ctx) {
        //TODO: sum(salary) s

        //visit the param if it col or aggregation function so.. , and get the fileEntries
        String colName = (String) visit(ctx.agg_param());
        String sourceFilePath = null;
        if (ctx.agg_param().expr().expr_func() == null)
            sourceFilePath = TEMP_PATH + "/" + colName + "/main.csv";
        else
            sourceFilePath = OUTPUT_FLAT_PATH + "/" + ctx.agg_param().expr().expr_func().getText() + ".csv";

        //flat them by the aggregation function

        Query.reduce(sourceFilePath, AggregationFunction.choseReducer(ctx.getChild(0).getText()), ctx.getText());

        return "";
    }

    @Override
    public String visitAgg_param(HplsqlParser.Agg_paramContext ctx) {
        ArrayList<String> fileEntries = null;

        String colName = null;
        // if it an col then get the shuffled map files without flat
        if (ctx.expr().expr_atom() != null) {
            colName = getColName(ctx.expr());
        } else {

            // if it an aggregation function so get the shuffled map files reduced by the inner aggregation function
            if (ctx.expr().expr_agg_window_func() != null) {
                try {
                    throw new NestedAggregationFunctionException(ctx.expr().expr_agg_window_func().getChild(0).getText());
                } catch (NestedAggregationFunctionException e) {
                    e.printStackTrace();
                }
            }
            if (ctx.expr().expr_func() != null) {
                colName = (String) visit(ctx.expr().expr_func());
            }
        }
        return colName;
    }

    @Override
    public String visitExpr_func(HplsqlParser.Expr_funcContext ctx) {
        //funcparam.expr.exprdunc
        //funcparam.idnet

        String colName = null;

        HplsqlParser.IdentContext colRule;
        HplsqlParser.Expr_funcContext funcRule;
        if ((colRule = ctx.expr_func_params().func_param(0).ident()) != null) {
            colName = colRule.getText();

            if (Query.shufflePhaseEnded)
                try {
                    FlatProcess.flat(TEMP_PATH + "/" + colName + "/main.csv", RowFunction.choseFunction(ctx), ctx.expr_func_params().getText());
                } catch (IOException e) {
                    e.printStackTrace();
                }

        } else if ((funcRule = ctx.expr_func_params().func_param(0).expr().expr_func()) != null) {

            colName = (String) visit(funcRule);
            if (Query.shufflePhaseEnded)
                try {
                    FlatProcess.flat(TEMP_PATH + "/flat/" + funcRule.getText() + ".csv", RowFunction.choseFunction(ctx), ctx.expr_func_params().getText());
                } catch (IOException e) {
                    e.printStackTrace();
                }


        }
        return colName;
    }


    @Override
    public Object visitInit_expression_cpp_stmt (HplsqlParser.Init_expression_cpp_stmtContext ctx){

            String dType = ctx.declear_variable().dtype().getText();

            if (!Data_Type.isDT(dType)) {
                try {
                    throw new Data_Type.DataTypeNotFoundException(dType);
                } catch (Data_Type.DataTypeNotFoundException e) {
                    e.printStackTrace();
                }
            } else {
                String varName = ctx.declear_variable().ident().getText();
                try {
                    Symbol_table.addVar(varName, dType);
                } catch (Scope.VarAlreadyDeclaredException e) {
                    e.printStackTrace();
                } catch (Data_Type.DataTypeNotFoundException e) {
                    e.printStackTrace();
                }
            }
            return null;
        }

        /**
         * get file entries for col that contained map and shuffles without flat
         */
        private String getColName (HplsqlParser.ExprContext ctx){
            String colName = ctx.expr_atom().ident().getText();

            String tableName = colExistedInTable(ctx, Query.Tables);

            try {
                if (tableName == null)
                    throw new ColumnNotContainedException(colName);
            } catch (ColumnNotContainedException e) {
                e.printStackTrace();
            }
            return colName;

        }

        /**
         * to find if column existed in any table and
         * there is no conflict
         */
        private String colExistedInTable (HplsqlParser.ExprContext ctx, List < String > tables){
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

        static class NestedAggregationFunctionException extends Exception {
            NestedAggregationFunctionException(String s) {
                super(s + "is in another aggregation function");
            }
        }


        static class GroupByException extends Exception {
            GroupByException(String column) {
                super(column + " Is Not Found In Group By");
            }
        }

        static class GroupByAggriException extends Exception {
            GroupByAggriException() {
                super("Group by cannot contain aggrigation function");
            }
        }
    }
import Data_Type.Data_Type;
import Data_Type.Variable_form;
import Hplsql.*;
import codgen.Query;
import org.json.simple.parser.ParseException;

import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.ArrayList;

public class Listener extends HplsqlBaseListener {
    @Override
    public void enterCreate_external_table_stmt(HplsqlParser.Create_external_table_stmtContext ctx) {
        String dataTypeName = ctx.table_name().ident().getText();
        Visitor<Variable_form> dataTypeVisitor = new Visitor<>();

        try {
            Data_Type.addDataType(dataTypeName, (Variable_form) dataTypeVisitor.visit(ctx));
        } catch (Data_Type.TableDeclaredException | FileNotFoundException e) {
            e.printStackTrace();
        }


    }

    @Override
    public void enterSelect_stmt(HplsqlParser.Select_stmtContext ctx) {
        //FIXME: malty tables

        //prepare the query (tables,keys,values)


        //add tables
        ArrayList<String> tables = new ArrayList<>();
        String table1 = ctx.fullselect_stmt().fullselect_stmt_item(0).subselect_stmt().from_clause().from_table_clause().from_table_name_clause().table_name().ident().getText();
        tables.add(table1);

        ctx.fullselect_stmt().fullselect_stmt_item(0).subselect_stmt().from_clause().from_join_clause().forEach(e->{
            tables.add(e.from_table_clause().from_table_name_clause().table_name().ident().getText());
        });

        for (String table : tables) {
            if (!Data_Type.isDT(table))
                try {
                    throw new Data_Type.DataTypeNotFoundException(table);
                } catch (Data_Type.DataTypeNotFoundException e) {
                    e.printStackTrace();
                }
        }
        Query.Tables.addAll(tables);

        //add keys
        if (ctx.fullselect_stmt().fullselect_stmt_item(0).subselect_stmt().group_by_clause() != null)
            ctx.fullselect_stmt().fullselect_stmt_item(0).subselect_stmt().group_by_clause().expr().forEach(e->{
                Query.keys.add(e.expr_atom().ident().getText());
            });
        else
            Query.keys.add(Query.Tables.get(0));

        //add values for the shuffled map
        ctx.fullselect_stmt().fullselect_stmt_item(0).subselect_stmt().select_list().select_list_item().forEach(e->{
            Query.addValue(getValue(e));
        });

        //do final shuffled files
        try {
            Query.prepareShuffledFiles();
        } catch (Query.AttributeWithoutTableException | IOException e) {
            e.printStackTrace();
        }


//        Visitor queryVisitor = new Visitor<>();
//        queryVisitor.visit(ctx);


//
//        if(Data_Type.checkIfItAttributes(data_type,attributeNames)) {
//            ReadCSVData.read(attributeNames,Data_Type.getHDFSPath(data_type), Data_Type.getDelimiter(data_type));
//        }
    }

    private String getValue(HplsqlParser.Select_list_itemContext e) {
        HplsqlParser.Expr_agg_window_funcContext agg_function;
        if((agg_function = e.expr().expr_agg_window_func()) != null){
            if(agg_function.agg_param().expr().expr_atom()!= null)
                return  agg_function.agg_param().expr().expr_atom().ident().getText();
            HplsqlParser.Expr_funcContext row_func;
            if((row_func = agg_function.agg_param().expr().expr_func())!= null){
                return getValue(row_func);
            }
        }
        return null;
    }

    private String getValue(HplsqlParser.Expr_funcContext row_func) {
        HplsqlParser.IdentContext value;
        if((value =  row_func.expr_func_params().func_param(0).ident())!=null)
            return value.getText();
        return getValue(row_func.expr_func_params().func_param(0).expr().expr_func());
    }


    @Override
    public void enterWrite_stmt(HplsqlParser.Write_stmtContext ctx) {
        if (ctx.ident(0).getText().equals("CLEAR")) {
            try {
                Data_Type.clearDataTypeTables();
                System.out.println("DATA_TYPE cleared");
            } catch (IOException | ParseException | Data_Type.TableDeclaredException e) {
                e.printStackTrace();
            }
        }
    }
}
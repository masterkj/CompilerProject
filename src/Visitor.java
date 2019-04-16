import Data_Type.Attribute_form;
import Data_Type.Variable_form;
import Hplsql.HplsqlBaseVisitor;
import Hplsql.HplsqlParser;
import codgen.Query;

import java.io.IOException;
import java.util.ArrayList;

public class Visitor<T> extends HplsqlBaseVisitor {
    @Override
    public T visitCreate_external_table_stmt(HplsqlParser.Create_external_table_stmtContext ctx) {
        Variable_form variable = new Variable_form();
        variable.setAttributes((ArrayList<Attribute_form>)visit(ctx.create_external_table_definition()));
        String[] info = (String[]) visit(ctx.create_external_table_definition().create_table_options());
        variable.setDelimiter(info[0]);
        variable.setHDFSPath(info[1]);
        return (T) variable;
    }

    @Override
    public ArrayList<Attribute_form> visitCreate_external_table_definition(HplsqlParser.Create_external_table_definitionContext ctx) {
        ArrayList<Attribute_form> attributes= new ArrayList<>();
        ctx.create_external_table_columns().forEach(e-> {
            String attributeName = e.create_external_table_columns_item().column_name().ident().getText();
            String attriputeType = e.create_external_table_columns_item().dtype().getText();
            attributes.add(new Attribute_form(attributeName, attriputeType));
        });
        return attributes;
    }

    @Override
    public Object visitCreate_table_options(HplsqlParser.Create_table_optionsContext ctx) {
        String[] info = new String[2];
        ctx.create_table_options_item().forEach(e-> {
            if(e.create_table_options_hive_item() != null){
                info[0] = e.create_table_options_hive_item().create_table_hive_row_format().create_table_hive_row_format_fields(0).ident().getText();
                info[1] = e.create_table_options_hive_item().create_table_hive_row_format().create_table_hive_row_format_fields(0).location().string().getText();
            }
        });
        info[1] = info[1].substring(1,info[1].length()-1);
        info[0] = info[0].substring(1,info[0].length()-1);
        return info;
    }

    @Override
    public T visitSelect_stmt(HplsqlParser.Select_stmtContext ctx) {

        visit(ctx.fullselect_stmt().fullselect_stmt_item(0).subselect_stmt());



        return (T) "s";
    }

    @Override
    public T visitSubselect_stmt(HplsqlParser.Subselect_stmtContext ctx) {
        final String finalResultFileName = "finalFile";

        ArrayList<String> columns = (ArrayList<String>) visit(ctx.select_list());
        return (T)"";

    }

    @Override
    public ArrayList<String> visitSelect_list(HplsqlParser.Select_listContext ctx) {
       ctx.select_list_item().forEach(e->visit(e));

        return null;
    }

    @Override
    public Object visitSelect_list_item(HplsqlParser.Select_list_itemContext ctx) {
        String fileName = null;
        if(ctx.expr().expr_atom()!=null) {
            try {
                fileName = Query.startProcess(ctx.expr().expr_atom().ident().getText());
            } catch (IOException e) {
                e.printStackTrace();
            }
        }
        return fileName;
    }
}

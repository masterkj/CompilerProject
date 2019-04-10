import Data_Type.Attribute_form;
import Data_Type.Data_Type;
import Data_Type.Variable_form;
import Hplsql.*;
import java.io.FileNotFoundException;
import java.util.ArrayList;
public class Listener extends HplsqlBaseListener {
    @Override
    public void enterCreate_external_table_stmt(HplsqlParser.Create_external_table_stmtContext ctx) {
        String dataTypeName = ctx.table_name().ident().getText();
        Variable_form  variable_form = new Variable_form();

        ctx.create_external_table_definition().create_external_table_columns().forEach(e -> {
            String attributeName = e.create_external_table_columns_item().column_name().ident().getText();
            String attriputeType = e.create_external_table_columns_item().dtype().getText();
            variable_form.addAttribute(new Attribute_form(attributeName, attriputeType));
        });

        try {
            Data_Type.set_DT(dataTypeName, variable_form);
        } catch (Data_Type.TableDeclaredException | FileNotFoundException e) {
            e.printStackTrace();
        }

    }
    @Override
    public void enterSelect_stmt(HplsqlParser.Select_stmtContext ctx){
        String data_type=ctx.fullselect_stmt().fullselect_stmt_item(0).subselect_stmt().select_list().select_list_item(0).tabname().ident().getText();
        System.out.println(data_type);
        if(!Data_Type.isDT(data_type)){
            //TODO: throw exception
        }
        ArrayList<String> attrinbuteNames = new ArrayList<>();
        ctx.fullselect_stmt().fullselect_stmt_item().get(0).subselect_stmt().select_list().select_list_item(0).column().forEach(e->{
            attrinbuteNames.add(e.ident().getText());
        });
        ReadCSVData.read(attrinbuteNames);
    }
}
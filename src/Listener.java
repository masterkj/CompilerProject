import Data_Type.Attribute_form;
import Data_Type.Data_Type;
import Data_Type.Variable_form;
import Hplsql.*;

import java.io.FileNotFoundException;

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
            Data_Type.addDataType(dataTypeName, variable_form);
        } catch (Data_Type.TableDeclearedException e) {
            e.printStackTrace();
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        }

    }
}

import Data_Type.Attribute_form;
import Data_Type.Data_Type;
import Data_Type.Variable_form;
import Hplsql.*;
import com.sun.prism.PixelFormat;

import java.io.FileNotFoundException;
import java.util.ArrayList;
public class Listener extends HplsqlBaseListener {
    @Override
    public void enterCreate_external_table_stmt(HplsqlParser.Create_external_table_stmtContext ctx) {
        String dataTypeName = ctx.table_name().ident().getText();
        Visitor<Variable_form> dataTypeVisitor = new Visitor<>();

        try {
            Data_Type.addDataType(dataTypeName, (Variable_form)dataTypeVisitor.visit(ctx));
        } catch (Data_Type.TableDeclaredException | FileNotFoundException e) {
            e.printStackTrace();
        }


    }
    @Override
    public void enterSelect_stmt(HplsqlParser.Select_stmtContext ctx){
        String data_type=ctx.fullselect_stmt().fullselect_stmt_item(0).subselect_stmt().select_list().select_list_item(0).tabname().ident().getText();
        if(!Data_Type.isDT(data_type)){
            //TODO: throw exception
        }
        ArrayList<String> attributeNames = new ArrayList<>();
        ctx.fullselect_stmt().fullselect_stmt_item().get(0).subselect_stmt().select_list().select_list_item(0).column().forEach(e->{
            attributeNames.add(e.ident().getText());
        });

        if(Data_Type.checkIfItAttributes(data_type,attributeNames)) {
            ReadCSVData.read(attributeNames,Data_Type.getHDFSPath(data_type), Data_Type.getDelimiter(data_type));
        }
    }
}
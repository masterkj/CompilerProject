import Data_Type.Attribute_form;
import Data_Type.Data_Type;
import Data_Type.Variable_form;
import Hplsql.*;
import codgen.Query;
import com.sun.prism.PixelFormat;
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

        String table = ctx.fullselect_stmt().fullselect_stmt_item(0).subselect_stmt().from_clause().from_table_clause().from_table_name_clause().table_name().ident().getText();
        if (!Data_Type.isDT(table))
            try {
                throw new Data_Type.DataTypeNotFoundException(table);
            } catch (Data_Type.DataTypeNotFoundException e) {
                e.printStackTrace();
            }

        Query.Tables.add(table);
        if (ctx.fullselect_stmt().fullselect_stmt_item(0).subselect_stmt().group_by_clause() != null)
            Query.key = ctx.fullselect_stmt().fullselect_stmt_item(0).subselect_stmt().group_by_clause().expr(0).expr_atom().ident().getText();
        else
            Query.key = table;

        Visitor<String> queryVisitor = new Visitor<>();
        queryVisitor.visit(ctx);


//
//        if(Data_Type.checkIfItAttributes(data_type,attributeNames)) {
//            ReadCSVData.read(attributeNames,Data_Type.getHDFSPath(data_type), Data_Type.getDelimiter(data_type));
//        }
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
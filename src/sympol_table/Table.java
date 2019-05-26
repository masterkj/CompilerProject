package sympol_table;

import Data_Type.*;
import java.util.ArrayList;
import java.util.List;

public class Table extends Var {
    private String HDFSPath;
    private String Delimiter;
//    List<Attribute_form> attributes = new ArrayList<>();
    private String tableName;
    public Table(String dataType) throws Data_Type.DataTypeNotFoundException {
        super(dataType);
        tableName = dataType;
        HDFSPath = Data_Type.getHDFSPath(tableName);
        Delimiter = Data_Type.getDelimiter(tableName);
//        Variable_form variable_form=Data_Type.get_DT(tableName);
//        attributes=variable_form.getAttributes();
    }

    public String getHDFSPath() {
        return HDFSPath;
    }

    public String getDelimiter() {
        return Delimiter;
    }

    public String getTableName() {
        return tableName;
    }
}

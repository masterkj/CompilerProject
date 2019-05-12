package sympol_table;

import Data_Type.*;
import java.util.ArrayList;
import java.util.List;

public class Table extends Var {
    private String HDFSPath;
    private String Delimiter;
    List<Attribute_form> attributes = new ArrayList<>();
    public Table(String dataType) throws Data_Type.DataTypeNotFoundException {
        super(dataType);
        HDFSPath = Data_Type.getHDFSPath(dataType);
        Delimiter = Data_Type.getDelimiter(dataType);
        Variable_form variable_form=Data_Type.get_DT(dataType);
        attributes=variable_form.getAttributes();
    }

    public String getHDFSPath() {
        return HDFSPath;
    }

    public String getDelimiter() {
        return Delimiter;
    }
}

package sympol_table;

import Data_Type.Data_Type;

public class Table extends Var {
    private String HDFSPath;
    private String Delimiter;
    public Table(String dataType) {
        super(dataType);
        HDFSPath = Data_Type.getHDFSPath(dataType);
        Delimiter = Data_Type.getDelimiter(dataType);
    }

    public String getHDFSPath() {
        return HDFSPath;
    }

    public String getDelimiter() {
        return Delimiter;
    }
}

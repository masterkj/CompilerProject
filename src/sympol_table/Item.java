package sympol_table;

import java.util.Hashtable;

public class Item {
    private String  dataType;
    private Kind kind;
    public enum Kind{
        function , variable
    }

    public Item( String type, Kind kind) {
        this.dataType = type;
        this.kind = kind;
    }
    public Kind getKind() {
        return kind;
    }

    public String getDataType() {
        return dataType;
    }
}
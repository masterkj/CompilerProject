package Data_Type;

import java.io.Serializable;

public class Variable_DT implements Serializable {
    private String name;
    private String type;
    private Variables details;

    public Variable_DT(String name, String type, Variables details) {
        this.name = name;
        this.type = type;
        this.details = details;
    }

    public Variable_DT(String name, String type) {
        this.name = name;
        this.type = type;
        this.details = null;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public Variables getDetails() {
        return details;
    }

    public void setDetails(Variables details) {
        this.details = details;
    }



}

package Data_Type;

import java.io.Serializable;

public class Attribute_form implements Serializable {
    private String name;
    private String type;
    private Variable_form details;

    public Attribute_form() {
    }

    public Attribute_form(String name, String type, Variable_form details) {
        this.name = name;
        this.type = type;
        this.details = details;
    }

    public Attribute_form(String name, String type) {
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

    public Variable_form getDetails() {
        return details;
    }

    public void setDetails(Variable_form details) {
        this.details = details;
    }



}

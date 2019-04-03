package Data_Type;

import java.io.Serializable;

public class Attribute_form implements Serializable {
    private String name;
    private String type;

    public Attribute_form() {
    }


    public Attribute_form(String name, String type) {
        this.name = name;
        this.type = type;
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

    @Override
    public String toString() {
        return "\nAttribute_form{" +
                "name='" + name + '\'' +
                ", type='" + type + '\'' +
                '}';
    }
}

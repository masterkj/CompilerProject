package sympol_table;

public class Attribute<T> {
    private String name;
    private String type;
    private T value;

    public Attribute(String name, String type) {
        this.name = name;
        this.type = type;
        this.value = null;
    }

    public Attribute(String name, String type, T value) {
        this.name = name;
        this.type = type;
        this.value = value;
    }

    public String getType() {
        return type;
    }

    public String getName() {
        return name;
    }

    public T getValue() {
        return this.value;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setValue(T value) {
        this.value = value;
    }
}
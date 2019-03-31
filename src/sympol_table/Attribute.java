package sympol_table;

public class Attribute<T> {
    private String type;
    private T value;

    public Attribute(String type) {
        this.type = type;
        this.value = null;
    }

    public Attribute(String type, T value) {
        this.type = type;
        this.value = value;
    }

    public String getType() {
        return type;
    }

    public T getValue() {
        return this.value;
    }

    /**
     * @param value of the attripute
     * we are checking the type before we assign it*/
    public void setValue(Object value) {
        //TODO: throw exception if the value is different DT
            this.value = (T) value;
    }
}
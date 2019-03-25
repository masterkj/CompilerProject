package sympol_table;

public class Variable<T> extends Item  {
    T value;
    public Variable(String type, T variable) {
        super(type, Kind.variable);
        this.value = variable;
    }

    public T getValue() {
        return value;
    }



}

package sympol_table;

class ImperativeVar<T> extends Var {
    private T value;

    ImperativeVar(String dataType) {
        super(dataType);
    }

    T getValue() {
        return value;
    }

    void setValue(T value) {
        this.value = value;
    }
}

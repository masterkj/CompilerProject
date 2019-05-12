package sympol_table;


abstract class Var {

    private String dataType;
    private boolean isImperative;

    Var(String dataType) {
        this.dataType = dataType;
        this.isImperative = this instanceof ImperativeVar;
    }

    String getDataType() {
        return dataType;
    }

    boolean isImperative() {
        return isImperative;
    }

    static class NotImperativeException extends Exception {
        NotImperativeException(String dataType) {
            super(dataType + " is not imperative variable");
        }
    }


}

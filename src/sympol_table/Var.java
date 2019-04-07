package sympol_table;

import java.util.HashMap;
import java.util.Map;

import Data_Type.Data_Type;
import Data_Type.Variable_form;
import Data_Type.Attribute_form;

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

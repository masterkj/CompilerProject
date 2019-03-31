package sympol_table;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import Data_Type.Data_Type;
import Data_Type.Variable_form;
import Data_Type.Attribute_form;

public class Var {
    /**
     * @author masterKj
     * the Var object can contain a multible attripute,
     * in the Attribute_form also we can hav Var
     */

    Map<String,Attribute> attriputes = new HashMap<>();
    String dataType;

    Var(String dataType) throws Data_Type.TableNotFoundException {
        if (Data_Type.isDT(dataType))
            initializeVar(Data_Type.get_DT(dataType));
    }

    private void initializeVar(Variable_form attributes) {
        for (Attribute_form attripute_form : attributes.getAttriputes()) {
            this.addAttripute(attripute_form.getName(), new Attribute(attripute_form.getType()));
        }
    }

    public void addAttripute(String attriputeName, Attribute attripute) {
        attriputes.put(attriputeName, attripute);
    }

    /**
     * @param attriputeNmae we will check if it existed
     * @param value will be type checked in the setValue function
     * @throw AttriputeNotFoundException if we didn't find the attripute in the Var
     */
    public void setAttriputeValue(String attriputeNmae, Object value) throws AttriputeNotFoundException {
        if(this.attriputes.containsKey(attriputeNmae))
            this.attriputes.get(attriputeNmae).setValue(value);
        else
            throw new AttriputeNotFoundException(attriputeNmae + " doesn't found in "+dataType);
    }

    /**
     * @param value , this function for an imperative DT,
     * so it is without attriputeName
     */
    public void setAttriputeValue(Object value) throws Data_Type.TableNotFoundException {
        if(Data_Type.get_DT(this.dataType).isImperative())
            this.attriputes.get(dataType).setValue(value);
    }

    public Object getAttriputeValue(String attriputeName) {
        return this.attriputes.get(attriputeName).getValue();
    }

    static class AttriputeNotFoundException extends Exception {
        AttriputeNotFoundException(String s) { super(s); }
    }

    static class DiffirentDTException extends Exception {
        DiffirentDTException(String s) { super(s); }
    }

}

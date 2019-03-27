package sympol_table;

import java.util.ArrayList;
import java.util.List;

import Data_Type.Data_Type;
import Data_Type.Variable_form;
import Data_Type.Attribute_form;

public class Var {
    /**
     * @author masterKj
     * the Var object can contain a multible attripute,
     * in the Attribute_form also we can hav Var  */

    List<Attribute> attriputes = new ArrayList<>();
    String dataType;

    Var(String dataType) throws Data_Type.Data_Type.TableNotFoundException {
        if(Data_Type.isDT(dataType))
            initializeVar(Data_Type.get_DT(dataType));
    }


    private void initializeVar(Variable_form attributes) {
        for ( Attribute_form attripute_form: attributes.getAttriputes()) {
            this.addAttripute(new Attribute(attripute_form.getName(), attripute_form.getType()));
        }
    }

    public void addAttripute(Attribute attripute) {
        attriputes.add(attripute);
    }

}

package Data_Type;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Variable_form implements Serializable {
    /**
     * this is thr form of the Table or the DataType by general
     * the attriputes meaning the variables in the table we have*/

    List<Attribute_form> attriputes = new ArrayList<>();
    boolean isImperative;

    public Variable_form() {
    }

    /**
     * @param attribute_form, jsut one attribute, so
     * it is an imperative variable*/
    public Variable_form(Attribute_form attribute_form) {
        this.attriputes.add(attribute_form);
        this.isImperative = true;
    }

    public Variable_form(Attribute_form... variables) {
        Collections.addAll(this.attriputes, variables);
    }

    public List<Attribute_form> getAttriputes() {
        return attriputes;
    }

    public void addVariable(Attribute_form... variable){ Collections.addAll(attriputes,variable); }

}

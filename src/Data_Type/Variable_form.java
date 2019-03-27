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

    public Variable_form() {
    }

    public Variable_form(Attribute_form... variables) {
        Collections.addAll(this.attriputes, variables);
    }

    public List<Attribute_form> getAttriputes() {
        return attriputes;
    }

    public void addVariable(Attribute_form... variable){ Collections.addAll(attriputes,variable); }

    public void show(){
        System.out.println("{ ");
        for(Attribute_form variable : attriputes){
            System.out.println("{ ");
                System.out.println("type : " + variable.getName()+ ",");
                System.out.println("name : " + variable.getType()+ ",");
            if(variable.getDetails()!=null) {
                System.out.println("details : ");
                variable.getDetails().show();
            }
            System.out.println(" }");
        }
        System.out.println(" }");
    }
}

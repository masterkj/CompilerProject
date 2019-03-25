package Data_Type;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Variables implements Serializable {
    List<Variable_DT> VARIABLES = new ArrayList<>();

    public Variables() {
    }

    public Variables(Variable_DT... variables) {
        Collections.addAll(this.VARIABLES, variables);
    }

    public List<Variable_DT> getVARIABLES() {
        return VARIABLES;
    }

    public void addVariable(Variable_DT... variable){ Collections.addAll(VARIABLES,variable); }

    public void show(){
        System.out.println("{ ");
        for(Variable_DT variable : VARIABLES){
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

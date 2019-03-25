package sympol_table;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Function extends Item {
    private List<Variable> parameters = new ArrayList<>();

    public Function(String dataType,Variable ... parameters) {
        super(dataType, Kind.function);
        Collections.addAll(this.parameters,parameters);
    }

    public void showParameters(){
        for(Variable variable : parameters){
            System.out.println(variable.getValue());
        }
    }
}

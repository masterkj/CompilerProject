package sympol_table;

import Data_Type.Data_Type;

import java.util.*;

public class Scope {

    private Hashtable<String, Var> table = new Hashtable<>();
    private Scope parentScope;
    private int id;

    Scope(Scope parentScope, int id) {
        this.parentScope = parentScope;
        this.id = id;
    }

    /**
     * if the var is imperativeVar -> will determine the type of it and put it in the table
     * if it Table so will initialize it and put it in the table
     */
    void addVar(String varName, String DT) throws VarAlreadyDeclaredException, Data_Type.DataTypeNotFoundException {
        if (varName == null) throw new IllegalArgumentException("called DeclareVariable with null key");
        if (contains(varName)) throw new VarAlreadyDeclaredException(varName);
        if (!Data_Type.isDT(DT)) throw new Data_Type.DataTypeNotFoundException(DT);
        if (Data_Type.isImperative(DT)) {
            switch (DT) {
                case ("INT"):
                    this.table.put(varName, new ImperativeVar<Integer>(DT));
                    break;
                case ("REAL"):
                    this.table.put(varName, new ImperativeVar<Float>(DT));
                    break;
                case ("BOOLEAN"):
                    this.table.put(varName, new ImperativeVar<Boolean>(DT));
                    break;
                case ("STRING"):
                    this.table.put(varName, new ImperativeVar<String>(DT));
                    break;
            }
        }
        if (!Data_Type.isImperative(DT))
            this.table.put(varName, new Table(DT));

    }

    /**
     * to ensure that an variable is existed in the Scope
     */
    private boolean contains(String varName) {
        if (varName == null) throw new IllegalArgumentException("called contaisns() with null key");
        return table.containsKey(varName);
    }

    Scope getParentScope() {
        return parentScope;
    }

    int getId() {
        return id;
    }

    /**
     * lookfor variabl
     */
    public boolean isExisted(String varName) {
        if (this.contains(varName)) return true;

        if (this.getId() == 0)
            return false;
        return this.getParentScope().isExisted(varName);
    }


//    /**
//     * it's imperative Var
//     * if it existed in this tabe -> return it
//     * @throws exception if it not exist in the global array
//     */
//    public Object getValue(String varName) throws VarNotExisted, Var.NotImperativeException, Data_Type.DataTypeNotFoundException {
//        if (this.contains(varName))
//            return this.table.get(varName).getAttriputeValue();
//        else if (this.getId() == 0)
//            throw new VarNotExisted(varName);
//        else return this.getParentScope().getValue(varName);
//    }

    static class VarNotExisted extends Exception {
        VarNotExisted(String varName) {
            super(varName + " not existed ! ");
        }
    }

    static class VarAlreadyDeclaredException extends Exception {
        VarAlreadyDeclaredException(String varName) {
            super(varName + " is already declared in this scope");
        }
    }
}

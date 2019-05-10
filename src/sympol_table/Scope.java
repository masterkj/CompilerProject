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
        if (varName == null) throw new IllegalArgumentException("called DeclareVariable with null keys");
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
                case ("BIGINT"):
                    this.table.put(varName, new ImperativeVar<Long>(DT));
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
        if (varName == null) throw new IllegalArgumentException("called contaisns() with null keys");
        return table.containsKey(varName);
    }

    Scope getParentScope() {
        return parentScope;
    }

    int getId() {
        return id;
    }

    /**
     * look for variable
     */
    public boolean isExisted(String varName) {
        if (this.contains(varName)) return true;

        if (this.getId() == 0)
            return false;
        return this.getParentScope().isExisted(varName);
    }

    /**
     * if it contains && instanceOf Table -> return it
     * else get it from parent scope
     *
     * @throw NotTableVarException if it not instanceof Table
     * @throw VarNotExistedException if it not existed
     */
    Table getTable(String varName) throws NotTableVarException, VarNotExistedException {
        if (this.contains(varName))
            if (!(this.table.get(varName) instanceof Table)) throw new NotTableVarException(varName);
            else return (Table) this.table.get(varName);
        else if (this.getId() == 0)
            throw new VarNotExistedException(varName);
        else return this.getParentScope().getTable(varName);
    }

    /**
     * if it contains && instanceOf ImperativeVar -> return it
     * else get it from parent scope
     *
     * @throw NotTableVarException if it not instanceof Table
     * @throw VarNotExistedException if it not existed
     */
    ImperativeVar getImperativeVar(String varName) throws NotImperativeVarException, VarNotExistedException {
        if (this.contains(varName))
            if (!(this.table.get(varName) instanceof ImperativeVar)) throw new NotImperativeVarException(varName);
            else return (ImperativeVar) this.table.get(varName);
        else if (this.getId() == 0)
            throw new VarNotExistedException(varName);
        else return this.getParentScope().getImperativeVar(varName);
    }


    static class VarNotExistedException extends Exception {
        VarNotExistedException(String varName) {
            super(varName + " not existed ! ");
        }
    }

    public static class VarAlreadyDeclaredException extends Exception {
        VarAlreadyDeclaredException(String varName) {
            super(varName + " is already declared in this scope");
        }
    }

    static class NotTableVarException extends Exception {
        NotTableVarException(String varName) {
            super(varName + " isn't table");
        }
    }

    static class NotImperativeVarException extends Exception {
        NotImperativeVarException(String varName) {
            super(varName + " isn't Imperative");
        }
    }
}

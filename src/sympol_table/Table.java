package sympol_table;

import Data_Type.Data_Type;

import java.util.*;

public class Table {

    /**
     * @author masterKj
     * this is the table class, in each element in
     * the hashTable we have:
     * <variable name, var>
     */

    private Hashtable<String, Var> table;
    private List<Table> innerScopes;
    private Table parentScope;
    private int id;

    public Table() {
        table = new Hashtable<>();
        innerScopes = new ArrayList<>();
        id = 0;
    }

    public Table(Table parentScope, int id) {
        this.parentScope = parentScope;
        this.id = id;
        table = new Hashtable<>();
        innerScopes = new ArrayList<>();
    }

    public void DeclearVariable(String varName, Var var) {
        if (varName == null) throw new IllegalArgumentException("called DeclearVariable with null key");
        if (var == null) throw new IllegalArgumentException("called DeclearVariable with null value");
        if (contains(varName)) {
            System.err.println(varName + " is alredy decleared");
            return;
        }
        table.put(varName, var);
    }

    /**
     * to ensure that an variable is existed in the Table
     *
     * @param variable name
     */
    public boolean contains(String varName) {
        if (varName == null) throw new IllegalArgumentException("called contaisns() with null key");
        return table.containsKey(varName);
    }

    public Table getParentScope() {
        return parentScope;
    }

    public int getId() {
        return id;
    }

    public void addInnerScope(Table table) {
        this.innerScopes.add(table);
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

    //TODO: set attriput value, or set imperative value

    /**
     * it's imperative DT
     * @param varName to set the value */
    public void setValue(String varName, Object value) throws Data_Type.DataTypeNotFoundException, VarNotExisted, Var.NotImperativeException {
        if (this.contains(varName))
            this.table.get(varName).setAttriputeValue(value);
        else if (this.getId() == 0)
            throw new VarNotExisted(varName);
        else this.getParentScope().setValue(varName, value);
    }

    /**
     * @param varName       is for the intire variable name
     * @param attriputeName for the attripute in the Var
     */
    public void setValue(String varName, String attriputeName, Object value) throws Var.AttriputeNotFoundException, VarNotExisted, Data_Type.DataTypeNotFoundException {
        if (this.contains(varName))
            this.table.get(varName).setAttriputeValue(attriputeName, value);
        else if (this.getId() == 0)
            throw new VarNotExisted(varName);
        else this.getParentScope().setValue(varName, attriputeName, value);
    }

    /**
     * it's imperative Var
     * if it existed in this tabe -> return it
     * @throws exception if it not exist in the global array
     */
    public Object getValue(String varName) throws VarNotExisted, Var.NotImperativeException, Data_Type.DataTypeNotFoundException {
        if (this.contains(varName))
            return this.table.get(varName).getAttriputeValue();
        else if (this.getId() == 0)
            throw new VarNotExisted(varName);
        else return this.getParentScope().getValue(varName);
    }

    /**
     * @param varName       is for the intire variable name
     * @param attriputeName for the attripute in the Var
     */
    public Object getValue(String varName, String attriputeName) throws VarNotExisted {
        if (this.contains(varName))
            return this.table.get(varName).getAttriputeValue(attriputeName);
        else if (this.getId() == 0)
            throw new VarNotExisted(varName);
        else return this.getParentScope().getValue(varName, attriputeName);
    }

    static class IllegalDeclear extends RuntimeException {
        IllegalDeclear(String s) {
            super(s);
        }
    }

    static class VarNotExisted extends Exception {
        VarNotExisted(String varName) {
            super(varName + " not existed ! ");
        }
    }
}

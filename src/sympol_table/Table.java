package sympol_table;

import java.util.*;

public class Table {

    /**
    * @author masterKj
     * this is the table class, in each element in
     * the hashTable we have:
     * <variable name, var>*/

    private Hashtable<String, Attribute> table;
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

    public void DeclearVariable(String name, Attribute var) {
        if (name == null) throw new IllegalArgumentException("called DeclearVariable with null key");
        if (var == null) throw new IllegalArgumentException("called DeclearVariable with null value");
        if (contains(name)) {
            System.err.println(name + " is alredy decleared");
            return;
        }
        table.put(name, var);
    }

    /**
     * to ensure that an variable is existed in the Table
    * @param variable name
     */
    public boolean contains(String varName) {
        if (varName == null) throw new IllegalArgumentException("called contaisns() with null key");
        return table.containsKey(varName);
    }

    public void remove(String name) {
        if (name == null) throw new IllegalArgumentException();
        table.remove(name);
    }

    public int size() {
        return table.size();
    }

    public Table getParentScope() {
        return parentScope;
    }

    public Iterable<String> keys() {
        return table.keySet();
    }

    public Iterator<String> iterator() {
        return table.keySet().iterator();
    }

    public int getId() {
        return id;
    }

    public void addInnerScope(Table table) {
        this.innerScopes.add(table);
    }


    /**
     * lookfor variabl*/
    public boolean isExisted(String varName) {
        if (this.contains(varName)) return true;

        if (this.getId() == 0)
            return false;
        return this.getParentScope().isExisted(varName);
    }

    public Object getValue(String varName) {
        if (table.contains(varName))
            if (this.getId() == 0)
                return null;
            else
                return this.getParentScope().getValue(varName);
        else
            return table.get(varName);
    }

    class IllegalDeclear extends RuntimeException {
        IllegalDeclear(String s) {
            super(s);
        }
    }
}

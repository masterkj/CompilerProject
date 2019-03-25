package sympol_table;

import javax.swing.text.TabableView;
import java.util.*;

public class Table {

    private Hashtable<String, Item> table;
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

    public Table(Table parentScope, int id, Hashtable<String, Variable> parameters) {
        this.parentScope = parentScope;
        this.id = id;
        table = new Hashtable<>();
        innerScopes = new ArrayList<>();
        insertAll(parameters);
    }

    public void insert(String name, Item item) {
        if (name == null) throw new IllegalArgumentException("called insert with null key");
        if (item == null) throw new IllegalArgumentException("called insert with null value");
        if (contains(name)) {
            System.err.println(name + " is alredy decleared");
            return;
        }
        table.put(name, item);
        if (Symbol_table.DEBUG) {
            System.out.println("\" you'v been created : " + name + " in scope : " + this.getId() + " of type : " + item.getDataType() + " of kind : " + item.getKind());
            if (item.getKind() == Item.Kind.variable)
                System.out.println("of variable : " + ((Variable) item).getValue());
        }
    }

    public void insertAll(Hashtable<String, Variable> parameters) {
        table.putAll(parameters);
    }

    //look recursivly
    public boolean contains(String name) {
        if (name == null) throw new IllegalArgumentException("called contaisns() with null key");
        return table.containsKey(name);
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


    //
    public boolean isExisted(String name) {
        if (this.contains(name)) {
            System.out.println("case 1");
            return true;
        }
        if (this.getId() == 0)
            return false;
        return this.getParentScope().isExisted(name);
    }

    public Object getValue(String name) {
        if (table.get(name) == null)
            if (this.getId() == 0)
                return null;
            else
                return this.getParentScope().getValue(name);
        else
            return table.get(name);
    }

    class IllegalDeclear extends RuntimeException {
        IllegalDeclear(String s) {
            super(s);
        }
    }
}

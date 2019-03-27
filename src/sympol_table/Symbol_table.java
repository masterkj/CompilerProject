package sympol_table;

import java.util.Hashtable;


public class Symbol_table {
    private static int total_id = 0;
    private static Table GLOBAL_SCOPE = new Table(null, incrementId());
    private static Table currentScobe = GLOBAL_SCOPE;
    public static final boolean DEBUG = true;


    public static int incrementId() {
        return total_id++;
    }

    public static void moveToScope(Table scobe) {
        currentScobe = scobe;
    }

    public static void exitFromScobe() {
        if (currentScobe.getId() > 0)
            currentScobe = currentScobe.getParentScope();
    }

    public static void initNewScobe() {
        Table table = new Table(currentScobe, incrementId());
        currentScobe.addInnerScope(table);
        moveToScope(table);
    }

    public static void initNewScobe(Hashtable<String, Variable> parameters) {
        Table table = new Table(currentScobe, incrementId(), parameters);
        currentScobe.addInnerScope(table);
        moveToScope(table);
    }

    public static void initItem(String name, Attribute item) {
        currentScobe.DeclearVariable(name, item);
    }

    public static void initVariable(String name, String Type, Object value) {

        switch (Type) {
            case "int":
                currentScobe.DeclearVariable(name, new Variable<Integer>("int", ((Double) value).intValue()));
                break;
            case "boolean":
                if ((Double) value == 0)
                    value = false;
                currentScobe.DeclearVariable(name, new Variable<Boolean>("boolean", (Boolean) value));
                value = (Boolean) value;
                break;
            case "real":
                currentScobe.DeclearVariable(name, new Variable<Double>("float", (Double) value));
                value = (Double) value;
                break;
            case "string":
                if ((Double) value == 0)
                    value = "";
                currentScobe.DeclearVariable(name, new Variable<String>("float", (String) value));
                value = (String) value;
                break;
        }

        if (DEBUG)
            System.out.println("\" you'v been created : " + name + " of type : " + Type + " have value " + value + " in scope : " + currentScobe.getId() + " \"");
    }

    public static Object getValue(String name) {
        return currentScobe.getValue(name);
    }

}

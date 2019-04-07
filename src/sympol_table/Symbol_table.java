package sympol_table;


import Data_Type.Data_Type;


public class Symbol_table {
    private static int total_id = 0;
    private static Scope GLOBAL_SCOPE = new Scope(null, incrementId());
    private static Scope currentScobe = GLOBAL_SCOPE;
    public static final boolean DEBUG = true;


    public static int incrementId() {
        return total_id++;
    }

    public static void moveToScope(Scope scobe) {
        currentScobe = scobe;
    }

    public static void exitFromScobe() {
        if (currentScobe.getId() > 0)
            currentScobe = currentScobe.getParentScope();
    }

    public static void initNewScobe() {
        Scope table = new Scope(currentScobe, incrementId());
        moveToScope(table);
    }

    public static void addVar(String varName, String DT) throws Scope.VarAlreadyDeclaredException {
        currentScobe.addVar(varName, DT);
    }

    public static Table getTable(String varName) {
        return  null;
    }

    public static ImperativeVar getImperativeVar(String varName) {
        return null;
    }

    public static void setVarValue(String imperativeVarName, Object value) {
        getImperativeVar(imperativeVarName).setValue(value);
    }

}

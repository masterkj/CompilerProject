package sympol_table;


import Data_Type.Data_Type;


public class Symbol_table {
    private static int total_id = 0;
    public static Scope GLOBAL_SCOPE = new Scope(null, incrementId());
    private static Scope currentScobe = GLOBAL_SCOPE;


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

    public static void addVar(String varName, String DT) throws Scope.VarAlreadyDeclaredException, Data_Type.DataTypeNotFoundException {
        currentScobe.addVar(varName, DT);
    }

    public static Table getTable(String varName) throws Scope.NotTableVarException, Scope.VarNotExistedException {
        return currentScobe.getTable(varName);
    }

    public static ImperativeVar getImperativeVar(String varName) throws Scope.VarNotExistedException, Scope.NotImperativeVarException {
        return currentScobe.getImperativeVar(varName);
    }

    public static void setVarValue(String imperativeVarName, Object value) throws Scope.NotImperativeVarException, Scope.VarNotExistedException {
        getImperativeVar(imperativeVarName).setValue(value);
    }


}

package sympol_table;


import java.util.Hashtable;
import Data_Type.Data_Type;


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



    /**
     * @param varName is the key in table
     * @param dt      is to determain the Var dt then initialize it
     *                (Var can initialize itself by knowing his DT)
     */
    public static void initVar(String varName, String dt) throws Data_Type.DataTypeNotFoundException {
        currentScobe.DeclearVariable(varName, new Var(dt));
    }

    //set value to var.attripute
    public static void setValue(String varName, String attriputeName, Object value) throws Table.VarNotExisted, Data_Type.DataTypeNotFoundException, Var.AttriputeNotFoundException {
        currentScobe.setValue(varName, attriputeName, value);
    }

    //set value to imperative var
    public static void setValue(String varName, Object value) throws Var.NotImperativeException, Table.VarNotExisted, Data_Type.DataTypeNotFoundException {
        currentScobe.setValue(varName, value);
    }

    public static Object getValue(String varName) throws Var.NotImperativeException, Table.VarNotExisted, Data_Type.DataTypeNotFoundException {
        return currentScobe.getValue(varName);
    }

    public static Object getValue(String varName, String attriputeName) throws Var.NotImperativeException, Table.VarNotExisted, Data_Type.DataTypeNotFoundException {
        return currentScobe.getValue(varName, attriputeName);
    }

}

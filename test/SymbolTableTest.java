import Data_Type.Data_Type;
import org.json.simple.parser.ParseException;
import sympol_table.Scope;
import sympol_table.Symbol_table;

import java.io.IOException;

public class SymbolTableTest {
    public static void main(String[] args) throws Scope.VarAlreadyDeclaredException, Data_Type.DataTypeNotFoundException, Scope.NotTableVarException, Scope.VarNotExistedException, IOException, ParseException {
        Data_Type.loadDataTypeFile();


        final String STATE = "duplicateVarsInScope";

        switch (STATE) {
            case "passed":
                Symbol_table.addVar("e", "employees");
                Symbol_table.initNewScobe();
                Symbol_table.addVar("d", "departments");

                System.out.println(Symbol_table.getTable("d").getTableName());

                Symbol_table.exitFromScobe();
                System.out.println(Symbol_table.getTable("e").getTableName());
                break;

            case "localVar":
                Symbol_table.addVar("e", "employees");
                Symbol_table.initNewScobe();
                Symbol_table.addVar("d", "departments");


                Symbol_table.exitFromScobe();
                System.out.println(Symbol_table.getTable("d").getTableName());

                System.out.println(Symbol_table.getTable("e").getTableName());
                break;

            case "duplicateVarsInScope":
                Symbol_table.initNewScobe();
                Symbol_table.addVar("e", "departments");
                Symbol_table.addVar("e", "employees");
                break;
        }

    }
}

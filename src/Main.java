import Data_Type.Data_Type;

import java.io.IOException;

import static org.antlr.v4.runtime.CharStreams.fromFileName;

import Hplsql.HplsqlLexer;
import Hplsql.HplsqlParser;
import org.antlr.v4.runtime.CharStream;
import org.antlr.v4.runtime.CommonTokenStream;
import org.antlr.v4.runtime.tree.ParseTree;
import org.antlr.v4.runtime.tree.ParseTreeWalker;
import org.json.simple.parser.ParseException;

public class Main {
    public static void main(String[] args) throws IOException, Data_Type.TableDeclaredException, ParseException {
//
           // Data_Type.loadDataTypeFile();
          ///  Data_Type.clearDataTypeTables();
           // Data_Type.updateDataTypeFile();
          //  Data_Type.loadDataTypeFile();
            //Data_Type.updateDataTypeFile();
          //  Data_Type.printDataTypes();


            String filename = "F:\\GithubProject\\CompilerProject\\code.txt";
            CharStream cs = fromFileName(filename);
            HplsqlLexer lexer = new HplsqlLexer(cs);
            CommonTokenStream tokens = new CommonTokenStream(lexer);
            HplsqlParser parser = new HplsqlParser(tokens);
            ParseTree tree = parser.program();
            Listener listener = new Listener();
            ParseTreeWalker parseTreeWalker = new ParseTreeWalker();
            parseTreeWalker.walk(listener,tree);





//            Data_Type.updateDataTypeFile();


//            Data_Type.clearDataTypeTables();


    }
}

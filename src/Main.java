import Data_Type.Data_Type;

import java.io.IOException;

import static org.antlr.v4.runtime.CharStreams.fromFileName;

import org.json.simple.parser.ParseException;

public class Main {
    public static void main(String[] args) throws IOException, Data_Type.TableDeclaredException, ParseException {
//
            Data_Type.loadDataTypeFile();
            Data_Type.clearDataTypeTables();
            Data_Type.updateDataTypeFile();
          //  Data_Type.loadDataTypeFile();
            Data_Type.updateDataTypeFile();
        //    Data_Type.printDataTypes();


//            CharStream cs = fromFileName("./assest/code.txt");
//            HplsqlLexer lexer = new HplsqlLexer(cs);
//            CommonTokenStream tokens = new CommonTokenStream(lexer);
//            HplsqlParser parser = new HplsqlParser(tokens);
//            ParseTree tree = parser.program();        1
//            Listener listener = new Listener();
//            ParseTreeWalker parseTreeWalker = new ParseTreeWalker();
//            parseTreeWalker.walk(listener,tree);





//            Data_Type.updateDataTypeFile();


//            Data_Type.clearDataTypeTables();


    }
}

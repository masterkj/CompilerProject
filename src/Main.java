import Data_Type.Data_Type;
import org.antlr.v4.runtime.CharStream;
import org.antlr.v4.runtime.CommonTokenStream;
import org.antlr.v4.runtime.tree.ParseTree;

import java.io.IOException;

import static org.antlr.v4.runtime.CharStreams.fromFileName;
import Hplsql.*;
import org.antlr.v4.runtime.tree.ParseTreeWalker;

public class Main {
    public static void main(String[] args) throws IOException {

            CharStream cs = fromFileName("./assest/code.txt");
            HplsqlLexer lexer = new HplsqlLexer(cs);
            CommonTokenStream tokens = new CommonTokenStream(lexer);
            HplsqlParser parser = new HplsqlParser(tokens);
            ParseTree tree = parser.program();
            Listener listener = new Listener();
            ParseTreeWalker parseTreeWalker = new ParseTreeWalker();
            parseTreeWalker.walk(listener,tree);
            Data_Type.printDataType("page_view");




//      build the symbol table(the input in "code.txt")
//
//
//

    }


}

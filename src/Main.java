import org.antlr.v4.runtime.CharStream;
import org.antlr.v4.runtime.CommonTokenStream;
import org.antlr.v4.runtime.tree.ParseTree;

import java.io.IOException;

import static org.antlr.v4.runtime.CharStreams.fromFileName;
import Hplsql.*;

public class Main {
    public static void main(String[] args) throws IOException {
//        Data_Type.setMainDT();
//        CharStream input = fromFileName("assest/code.txt");
//        HplsqlLexer lexer = new HplsqlLexer(input);
//        CommonTokenStream tokens = new CommonTokenStream(lexer);
//        HplsqlParser parser = new HplsqlParser(tokens);
//        ParseTree tree = parser.program();
//        System.out.println(tree.toStringTree(parser));
//
////      print the AST (the input in "ASTInput.txt")
//        readAndWriteFile.readAndWrite();

        try {
            CharStream cs = fromFileName("./assest/code.txt");
            HplsqlLexer lexer = new HplsqlLexer(cs);
            CommonTokenStream tokens = new CommonTokenStream(lexer);
            HplsqlParser parser = new HplsqlParser(tokens);
            ParseTree tree = parser.program();
            HplsqlBaseVisitor visitor = new HplsqlBaseVisitor();
            visitor.visit(tree);
            System.out.println(tree.toStringTree(parser));


        } catch (IOException e) {
            e.printStackTrace();
        }

//      build the symbol table(the input in "code.txt")
//        Listener listener = new Listener();
//        ParseTreeWalker parseTreeWalker = new ParseTreeWalker();
//        parseTreeWalker.walk(listener,tree);

    }


}

import Data_Type.Data_Type;

import java.io.File;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.util.Comparator;

import static org.antlr.v4.runtime.CharStreams.fromFileName;

import Hplsql.HplsqlLexer;
import Hplsql.HplsqlParser;
import codgen.Query;
import org.antlr.v4.runtime.CharStream;
import org.antlr.v4.runtime.CommonTokenStream;
import org.antlr.v4.runtime.tree.ParseTree;
import org.antlr.v4.runtime.tree.ParseTreeWalker;
import org.json.simple.parser.ParseException;

public class Main {
    public static void main(String[] args) throws IOException, Data_Type.TableDeclaredException, ParseException {
        String line ="gqwfg,qfgqwg";
       // System.out.println(line.substring(line.indexOf(','),line.length()));

        Data_Type.loadDataTypeFile();
        clearFiles();

        CharStream cs = fromFileName("assets/code.txt");
        HplsqlLexer lexer = new HplsqlLexer(cs);
        CommonTokenStream tokens = new CommonTokenStream(lexer);
        HplsqlParser parser = new HplsqlParser(tokens);
        ParseTree tree = parser.program();
        Listener listener = new Listener();
        ParseTreeWalker parseTreeWalker = new ParseTreeWalker();
        parseTreeWalker.walk(listener, tree);

    }

    private static void clearFiles() throws IOException {
        File tempFile = new File(Query.TEMP_PATH);
        for (File file : tempFile.listFiles()) {
            deleteDirectoryStream(file.toPath());
        }
    }

    static void deleteDirectoryStream(Path path) throws IOException {
        Files.walk(path)
                .sorted(Comparator.reverseOrder())
                .map(Path::toFile)
                .forEach(File::delete);
    }
}

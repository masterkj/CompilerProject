import org.antlr.v4.runtime.ANTLRInputStream;
import org.antlr.v4.runtime.CommonTokenStream;
import java.io.File;
import java.io.IOException;
import java.nio.charset.Charset;
import java.nio.file.Files;

import Hplsql.*;


public class readAndWriteFile {

    private static String readFile(File file, Charset encoding) throws IOException {
        byte[] encoded = Files.readAllBytes(file.toPath());
        return new String(encoded, encoding);
    }

    public HplsqlParser.ProgramContext parse(File file) throws IOException {
        String code = readFile(file, Charset.forName("UTF-8"));
        HplsqlLexer lexer = new HplsqlLexer(new ANTLRInputStream(code));
        CommonTokenStream tokens = new CommonTokenStream(lexer);
        HplsqlParser parser = new HplsqlParser(tokens);
        return parser.program();
    }
    public static void main(String[] args) throws IOException {
        readAndWriteFile parserFacade = new readAndWriteFile();
        Ast astPrinter = new Ast();
        astPrinter.print(parserFacade.parse(new File("./assest/code.txt")));
    }
}
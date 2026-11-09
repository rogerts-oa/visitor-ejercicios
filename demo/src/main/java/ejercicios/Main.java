package ejercicios;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;

import org.antlr.v4.gui.Trees;
import org.antlr.v4.runtime.CharStream;
import org.antlr.v4.runtime.CharStreams;
import org.antlr.v4.runtime.CommonTokenStream;

public class Main {

    private static final String EXTENSION = "rj";
    private static final String DIRBASE = "src/test/resources/";

    public static void main(String[] args) throws IOException {
        String files[] = args.length == 0 ? new String[] { "test." + EXTENSION } : args;
        Path base = Path.of(DIRBASE);
        if (!Files.isDirectory(base)) {
            base = Path.of("demo").resolve(DIRBASE);
        }
        System.out.println("Dirbase: " + base.toAbsolutePath());
        for (String file : files) {
            System.out.println("START: " + file);

            CharStream in = CharStreams.fromPath(base.resolve(file));
            RJLexer lexer = new RJLexer(in);
            CommonTokenStream tokens = new CommonTokenStream(lexer);

            tokens.fill();
            System.out.println("TOKENS");
            tokens.getTokens().forEach(token -> {
                System.out.println(
                    "Texto: " + token.getText() +
                    "| Tipo: " + RJLexer.VOCABULARY.getSymbolicName(token.getType()) +
                    "| Ln: " + token.getLine() + ", Col " + token.getCharPositionInLine()
                );
            });

            RJParser parser = new RJParser(tokens);
            RJParser.ProgramaContext tree = parser.programa();
            if (parser.getNumberOfSyntaxErrors() > 0) {
                throw new IllegalArgumentException("Sintaxis inválida: " + file);
            }
            System.out.println("ARBOL");
            System.out.println(tree.toStringTree(parser));
            Trees.inspect(tree, parser);

            System.out.println("FINISH: " + file);
        }
    }
}

import java.io.BufferedReader;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import org.antlr.v4.gui.Trees;
import org.antlr.v4.runtime.ANTLRFileStream;
import org.antlr.v4.runtime.ANTLRInputStream;
import org.antlr.v4.runtime.CharStream;
import org.antlr.v4.runtime.CommonTokenStream;
import org.antlr.v4.runtime.tree.ParseTree;
public class checktest {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		ANTLRInputStream input = new ANTLRInputStream(System.in);
		CalcLexer lexer = new CalcLexer(input);
		CommonTokenStream tokens = new CommonTokenStream(lexer); 
		CalcParser parser = new CalcParser(tokens);
		//parser.prog(); // print the value
		parser.setBuildParseTree(true);
		ParseTree tree= parser.start();
		//System.out.println(tree.toStringTree(parser));
		Trees.inspect(tree, parser);
		
	}

}

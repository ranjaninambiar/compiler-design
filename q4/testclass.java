import org.antlr.runtime.ANTLRStringStream;
import org.antlr.v4.runtime.ANTLRInputStream;
import org.antlr.v4.runtime.CommonTokenStream;
public class testclass {

	public static void main(String[] args) {
		
		
		// TODO Auto-generated method stub
		ANTLRInputStream input = new ANTLRInputStream("(a,a)$");
		calcLexer lexer = new calcLexer(input);
		CommonTokenStream tokens = new CommonTokenStream(lexer);
		calcParser parser = new calcParser(tokens);
		System.out.println(parser.start()); // print the value
		
	}

}

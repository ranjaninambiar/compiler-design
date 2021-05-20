import org.antlr.runtime.ANTLRStringStream;
import org.antlr.v4.runtime.ANTLRInputStream;
import org.antlr.v4.runtime.CommonTokenStream;

public class test {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		ANTLRInputStream input = new ANTLRInputStream("(()())");
		CalctestLexer lexer = new CalctestLexer(input);
		CommonTokenStream tokens = new CommonTokenStream(lexer);
		CalctestParser parser = new CalctestParser(tokens);
		System.out.println(parser.start()); // print the value

	}

}

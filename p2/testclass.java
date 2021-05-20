

import org.antlr.v4.runtime.ANTLRInputStream;
import org.antlr.v4.runtime.CommonTokenStream;

public class testclass {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ANTLRInputStream input = new ANTLRInputStream("2&");
		clLexer lexer = new clLexer(input);
		CommonTokenStream tokens = new CommonTokenStream(lexer);
		clParser parser = new clParser(tokens);
		System.out.println(parser.start()); // print the value

	}

}

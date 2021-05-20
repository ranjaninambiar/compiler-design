

import org.antlr.v4.runtime.ANTLRFileStream;
import org.antlr.v4.runtime.CharStream;
import org.antlr.v4.runtime.Token;

public class testclass {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		try {
			CharStream input = new
			ANTLRFileStream("C:\\Users\\SREE RANJANI\\eclipse-workspace\\ssn\\src\\input");
			/* give your filepath in the above place*/
			calcssn lexer = new calcssn(input);
			Token token;
			while ((token = lexer.nextToken()).getType()!=-1)
			{
			System.err.println(token.getText()+'\n');
			}
			} catch(Exception e)
			{
			System.out.println(e);
			}

	}

}

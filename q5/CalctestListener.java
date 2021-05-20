// Generated from Calctest.g4 by ANTLR 4.9
import org.antlr.v4.runtime.tree.ParseTreeListener;

/**
 * This interface defines a complete listener for a parse tree produced by
 * {@link CalctestParser}.
 */
public interface CalctestListener extends ParseTreeListener {
	/**
	 * Enter a parse tree produced by {@link CalctestParser#start}.
	 * @param ctx the parse tree
	 */
	void enterStart(CalctestParser.StartContext ctx);
	/**
	 * Exit a parse tree produced by {@link CalctestParser#start}.
	 * @param ctx the parse tree
	 */
	void exitStart(CalctestParser.StartContext ctx);
	/**
	 * Enter a parse tree produced by {@link CalctestParser#exp}.
	 * @param ctx the parse tree
	 */
	void enterExp(CalctestParser.ExpContext ctx);
	/**
	 * Exit a parse tree produced by {@link CalctestParser#exp}.
	 * @param ctx the parse tree
	 */
	void exitExp(CalctestParser.ExpContext ctx);
	/**
	 * Enter a parse tree produced by {@link CalctestParser#f}.
	 * @param ctx the parse tree
	 */
	void enterF(CalctestParser.FContext ctx);
	/**
	 * Exit a parse tree produced by {@link CalctestParser#f}.
	 * @param ctx the parse tree
	 */
	void exitF(CalctestParser.FContext ctx);
}
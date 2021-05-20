// Generated from cl.g4 by ANTLR 4.9
import org.antlr.v4.runtime.tree.ParseTreeListener;

/**
 * This interface defines a complete listener for a parse tree produced by
 * {@link clParser}.
 */
public interface clListener extends ParseTreeListener {
	/**
	 * Enter a parse tree produced by {@link clParser#start}.
	 * @param ctx the parse tree
	 */
	void enterStart(clParser.StartContext ctx);
	/**
	 * Exit a parse tree produced by {@link clParser#start}.
	 * @param ctx the parse tree
	 */
	void exitStart(clParser.StartContext ctx);
	/**
	 * Enter a parse tree produced by {@link clParser#exp}.
	 * @param ctx the parse tree
	 */
	void enterExp(clParser.ExpContext ctx);
	/**
	 * Exit a parse tree produced by {@link clParser#exp}.
	 * @param ctx the parse tree
	 */
	void exitExp(clParser.ExpContext ctx);
	/**
	 * Enter a parse tree produced by {@link clParser#term}.
	 * @param ctx the parse tree
	 */
	void enterTerm(clParser.TermContext ctx);
	/**
	 * Exit a parse tree produced by {@link clParser#term}.
	 * @param ctx the parse tree
	 */
	void exitTerm(clParser.TermContext ctx);
	/**
	 * Enter a parse tree produced by {@link clParser#factor}.
	 * @param ctx the parse tree
	 */
	void enterFactor(clParser.FactorContext ctx);
	/**
	 * Exit a parse tree produced by {@link clParser#factor}.
	 * @param ctx the parse tree
	 */
	void exitFactor(clParser.FactorContext ctx);
	/**
	 * Enter a parse tree produced by {@link clParser#p}.
	 * @param ctx the parse tree
	 */
	void enterP(clParser.PContext ctx);
	/**
	 * Exit a parse tree produced by {@link clParser#p}.
	 * @param ctx the parse tree
	 */
	void exitP(clParser.PContext ctx);
}
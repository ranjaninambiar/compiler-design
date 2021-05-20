// Generated from calc.g4 by ANTLR 4.9
import org.antlr.v4.runtime.tree.ParseTreeListener;

/**
 * This interface defines a complete listener for a parse tree produced by
 * {@link calcParser}.
 */
public interface calcListener extends ParseTreeListener {
	/**
	 * Enter a parse tree produced by {@link calcParser#start}.
	 * @param ctx the parse tree
	 */
	void enterStart(calcParser.StartContext ctx);
	/**
	 * Exit a parse tree produced by {@link calcParser#start}.
	 * @param ctx the parse tree
	 */
	void exitStart(calcParser.StartContext ctx);
	/**
	 * Enter a parse tree produced by {@link calcParser#exp}.
	 * @param ctx the parse tree
	 */
	void enterExp(calcParser.ExpContext ctx);
	/**
	 * Exit a parse tree produced by {@link calcParser#exp}.
	 * @param ctx the parse tree
	 */
	void exitExp(calcParser.ExpContext ctx);
	/**
	 * Enter a parse tree produced by {@link calcParser#l}.
	 * @param ctx the parse tree
	 */
	void enterL(calcParser.LContext ctx);
	/**
	 * Exit a parse tree produced by {@link calcParser#l}.
	 * @param ctx the parse tree
	 */
	void exitL(calcParser.LContext ctx);
	/**
	 * Enter a parse tree produced by {@link calcParser#factor}.
	 * @param ctx the parse tree
	 */
	void enterFactor(calcParser.FactorContext ctx);
	/**
	 * Exit a parse tree produced by {@link calcParser#factor}.
	 * @param ctx the parse tree
	 */
	void exitFactor(calcParser.FactorContext ctx);
}
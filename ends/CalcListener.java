// Generated from Calc.g4 by ANTLR 4.9

import java.util.HashMap;
import java.util.*;

import org.antlr.v4.runtime.tree.ParseTreeListener;

/**
 * This interface defines a complete listener for a parse tree produced by
 * {@link CalcParser}.
 */
public interface CalcListener extends ParseTreeListener {
	/**
	 * Enter a parse tree produced by {@link CalcParser#start}.
	 * @param ctx the parse tree
	 */
	void enterStart(CalcParser.StartContext ctx);
	/**
	 * Exit a parse tree produced by {@link CalcParser#start}.
	 * @param ctx the parse tree
	 */
	void exitStart(CalcParser.StartContext ctx);
	/**
	 * Enter a parse tree produced by {@link CalcParser#l}.
	 * @param ctx the parse tree
	 */
	void enterL(CalcParser.LContext ctx);
	/**
	 * Exit a parse tree produced by {@link CalcParser#l}.
	 * @param ctx the parse tree
	 */
	void exitL(CalcParser.LContext ctx);
	/**
	 * Enter a parse tree produced by {@link CalcParser#expr}.
	 * @param ctx the parse tree
	 */
	void enterExpr(CalcParser.ExprContext ctx);
	/**
	 * Exit a parse tree produced by {@link CalcParser#expr}.
	 * @param ctx the parse tree
	 */
	void exitExpr(CalcParser.ExprContext ctx);
	/**
	 * Enter a parse tree produced by {@link CalcParser#exprp}.
	 * @param ctx the parse tree
	 */
	void enterExprp(CalcParser.ExprpContext ctx);
	/**
	 * Exit a parse tree produced by {@link CalcParser#exprp}.
	 * @param ctx the parse tree
	 */
	void exitExprp(CalcParser.ExprpContext ctx);
	/**
	 * Enter a parse tree produced by {@link CalcParser#term}.
	 * @param ctx the parse tree
	 */
	void enterTerm(CalcParser.TermContext ctx);
	/**
	 * Exit a parse tree produced by {@link CalcParser#term}.
	 * @param ctx the parse tree
	 */
	void exitTerm(CalcParser.TermContext ctx);
	/**
	 * Enter a parse tree produced by {@link CalcParser#termp}.
	 * @param ctx the parse tree
	 */
	void enterTermp(CalcParser.TermpContext ctx);
	/**
	 * Exit a parse tree produced by {@link CalcParser#termp}.
	 * @param ctx the parse tree
	 */
	void exitTermp(CalcParser.TermpContext ctx);
	/**
	 * Enter a parse tree produced by {@link CalcParser#fact}.
	 * @param ctx the parse tree
	 */
	void enterFact(CalcParser.FactContext ctx);
	/**
	 * Exit a parse tree produced by {@link CalcParser#fact}.
	 * @param ctx the parse tree
	 */
	void exitFact(CalcParser.FactContext ctx);
}
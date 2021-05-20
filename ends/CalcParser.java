// Generated from Calc.g4 by ANTLR 4.9

import java.util.HashMap;
import java.util.*;

import org.antlr.v4.runtime.atn.*;
import org.antlr.v4.runtime.dfa.DFA;
import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.misc.*;
import org.antlr.v4.runtime.tree.*;
import java.util.List;
import java.util.Iterator;
import java.util.ArrayList;

@SuppressWarnings({"all", "warnings", "unchecked", "unused", "cast"})
public class CalcParser extends Parser {
	static { RuntimeMetaData.checkVersion("4.9", RuntimeMetaData.VERSION); }

	protected static final DFA[] _decisionToDFA;
	protected static final PredictionContextCache _sharedContextCache =
		new PredictionContextCache();
	public static final int
		T__0=1, T__1=2, T__2=3, T__3=4, T__4=5, LP=6, RP=7, ID=8, NEWLINE=9, NUM=10, 
		WS=11;
	public static final int
		RULE_start = 0, RULE_l = 1, RULE_expr = 2, RULE_exprp = 3, RULE_term = 4, 
		RULE_termp = 5, RULE_fact = 6;
	private static String[] makeRuleNames() {
		return new String[] {
			"start", "l", "expr", "exprp", "term", "termp", "fact"
		};
	}
	public static final String[] ruleNames = makeRuleNames();

	private static String[] makeLiteralNames() {
		return new String[] {
			null, "'='", "'+'", "'-'", "'*'", "'/'", "'('", "')'"
		};
	}
	private static final String[] _LITERAL_NAMES = makeLiteralNames();
	private static String[] makeSymbolicNames() {
		return new String[] {
			null, null, null, null, null, null, "LP", "RP", "ID", "NEWLINE", "NUM", 
			"WS"
		};
	}
	private static final String[] _SYMBOLIC_NAMES = makeSymbolicNames();
	public static final Vocabulary VOCABULARY = new VocabularyImpl(_LITERAL_NAMES, _SYMBOLIC_NAMES);

	/**
	 * @deprecated Use {@link #VOCABULARY} instead.
	 */
	@Deprecated
	public static final String[] tokenNames;
	static {
		tokenNames = new String[_SYMBOLIC_NAMES.length];
		for (int i = 0; i < tokenNames.length; i++) {
			tokenNames[i] = VOCABULARY.getLiteralName(i);
			if (tokenNames[i] == null) {
				tokenNames[i] = VOCABULARY.getSymbolicName(i);
			}

			if (tokenNames[i] == null) {
				tokenNames[i] = "<INVALID>";
			}
		}
	}

	@Override
	@Deprecated
	public String[] getTokenNames() {
		return tokenNames;
	}

	@Override

	public Vocabulary getVocabulary() {
		return VOCABULARY;
	}

	@Override
	public String getGrammarFileName() { return "Calc.g4"; }

	@Override
	public String[] getRuleNames() { return ruleNames; }

	@Override
	public String getSerializedATN() { return _serializedATN; }

	@Override
	public ATN getATN() { return _ATN; }


	/** Map variable name to Integer object holding value */
	ArrayList<String> v = new ArrayList<String>();
	HashMap memory = new HashMap();
	void print(String value) {
		System.out.println(value);
	}

	public CalcParser(TokenStream input) {
		super(input);
		_interp = new ParserATNSimulator(this,_ATN,_decisionToDFA,_sharedContextCache);
	}

	public static class StartContext extends ParserRuleContext {
		public List<LContext> l() {
			return getRuleContexts(LContext.class);
		}
		public LContext l(int i) {
			return getRuleContext(LContext.class,i);
		}
		public StartContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_start; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof CalcListener ) ((CalcListener)listener).enterStart(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof CalcListener ) ((CalcListener)listener).exitStart(this);
		}
	}

	public final StartContext start() throws RecognitionException {
		StartContext _localctx = new StartContext(_ctx, getState());
		enterRule(_localctx, 0, RULE_start);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(15); 
			_errHandler.sync(this);
			_la = _input.LA(1);
			do {
				{
				{
				setState(14);
				l();
				}
				}
				setState(17); 
				_errHandler.sync(this);
				_la = _input.LA(1);
			} while ( (((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << LP) | (1L << ID) | (1L << NEWLINE) | (1L << NUM))) != 0) );
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class LContext extends ParserRuleContext {
		public int val;
		public ExprContext expr;
		public Token ID;
		public ExprContext expr() {
			return getRuleContext(ExprContext.class,0);
		}
		public TerminalNode NEWLINE() { return getToken(CalcParser.NEWLINE, 0); }
		public TerminalNode ID() { return getToken(CalcParser.ID, 0); }
		public LContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_l; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof CalcListener ) ((CalcListener)listener).enterL(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof CalcListener ) ((CalcListener)listener).exitL(this);
		}
	}

	public final LContext l() throws RecognitionException {
		LContext _localctx = new LContext(_ctx, getState());
		enterRule(_localctx, 2, RULE_l);
		try {
			setState(30);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,1,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(19);
				((LContext)_localctx).expr = expr();
				setState(20);
				match(NEWLINE);
				System.out.println("Evaluated expr is"+((LContext)_localctx).expr.val);
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(23);
				((LContext)_localctx).ID = match(ID);
				setState(24);
				match(T__0);
				setState(25);
				((LContext)_localctx).expr = expr();
				setState(26);
				match(NEWLINE);
				memory.put((((LContext)_localctx).ID!=null?((LContext)_localctx).ID.getText():null), new Integer(((LContext)_localctx).expr.val));
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(29);
				match(NEWLINE);
				}
				break;
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class ExprContext extends ParserRuleContext {
		public int val;
		public TermContext term;
		public ExprpContext exprp;
		public TermContext term() {
			return getRuleContext(TermContext.class,0);
		}
		public ExprpContext exprp() {
			return getRuleContext(ExprpContext.class,0);
		}
		public ExprContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_expr; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof CalcListener ) ((CalcListener)listener).enterExpr(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof CalcListener ) ((CalcListener)listener).exitExpr(this);
		}
	}

	public final ExprContext expr() throws RecognitionException {
		ExprContext _localctx = new ExprContext(_ctx, getState());
		enterRule(_localctx, 4, RULE_expr);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(32);
			((ExprContext)_localctx).term = term();
			setState(33);
			((ExprContext)_localctx).exprp = exprp(((ExprContext)_localctx).term.val);
			((ExprContext)_localctx).val =  ((ExprContext)_localctx).exprp.syn;
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class ExprpContext extends ParserRuleContext {
		public int inh;
		public int syn;
		public TermContext term;
		public ExprpContext e1p;
		public TermContext term() {
			return getRuleContext(TermContext.class,0);
		}
		public ExprpContext exprp() {
			return getRuleContext(ExprpContext.class,0);
		}
		public ExprpContext(ParserRuleContext parent, int invokingState) { super(parent, invokingState); }
		public ExprpContext(ParserRuleContext parent, int invokingState, int inh) {
			super(parent, invokingState);
			this.inh = inh;
		}
		@Override public int getRuleIndex() { return RULE_exprp; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof CalcListener ) ((CalcListener)listener).enterExprp(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof CalcListener ) ((CalcListener)listener).exitExprp(this);
		}
	}

	public final ExprpContext exprp(int inh) throws RecognitionException {
		ExprpContext _localctx = new ExprpContext(_ctx, getState(), inh);
		enterRule(_localctx, 6, RULE_exprp);
		try {
			setState(49);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case T__1:
				enterOuterAlt(_localctx, 1);
				{
				print("+");
				setState(37);
				match(T__1);
				setState(38);
				((ExprpContext)_localctx).term = term();
				setState(39);
				((ExprpContext)_localctx).e1p = exprp(_localctx.inh + ((ExprpContext)_localctx).term.val);
				((ExprpContext)_localctx).syn =  ((ExprpContext)_localctx).e1p.syn;
					try{int index = v.size() - 2;
					print(v.remove(index));
					print(v.remove(index));}
					catch (Exception e) {
				}
					
					
					

				}
				break;
			case T__2:
				enterOuterAlt(_localctx, 2);
				{
				print("-");
				setState(43);
				match(T__2);
				setState(44);
				((ExprpContext)_localctx).term = term();
				setState(45);
				((ExprpContext)_localctx).e1p = exprp(_localctx.inh - ((ExprpContext)_localctx).term.val);
				((ExprpContext)_localctx).syn =  ((ExprpContext)_localctx).e1p.syn;
					try{
					int index = v.size() - 2;
					print(v.remove(index));
					print(v.remove(index));
				}catch (Exception e) {
				}


				}
				break;
			case RP:
			case NEWLINE:
				enterOuterAlt(_localctx, 3);
				{
				((ExprpContext)_localctx).syn =  _localctx.inh;
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class TermContext extends ParserRuleContext {
		public int val;
		public FactContext fact;
		public TermpContext termp;
		public FactContext fact() {
			return getRuleContext(FactContext.class,0);
		}
		public TermpContext termp() {
			return getRuleContext(TermpContext.class,0);
		}
		public TermContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_term; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof CalcListener ) ((CalcListener)listener).enterTerm(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof CalcListener ) ((CalcListener)listener).exitTerm(this);
		}
	}

	public final TermContext term() throws RecognitionException {
		TermContext _localctx = new TermContext(_ctx, getState());
		enterRule(_localctx, 8, RULE_term);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(51);
			((TermContext)_localctx).fact = fact();
			setState(52);
			((TermContext)_localctx).termp = termp(((TermContext)_localctx).fact.val);
			 ((TermContext)_localctx).val =  ((TermContext)_localctx).termp.syn; 
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class TermpContext extends ParserRuleContext {
		public int inh;
		public int syn;
		public FactContext fact;
		public TermpContext t1p;
		public FactContext fact() {
			return getRuleContext(FactContext.class,0);
		}
		public TermpContext termp() {
			return getRuleContext(TermpContext.class,0);
		}
		public TermpContext(ParserRuleContext parent, int invokingState) { super(parent, invokingState); }
		public TermpContext(ParserRuleContext parent, int invokingState, int inh) {
			super(parent, invokingState);
			this.inh = inh;
		}
		@Override public int getRuleIndex() { return RULE_termp; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof CalcListener ) ((CalcListener)listener).enterTermp(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof CalcListener ) ((CalcListener)listener).exitTermp(this);
		}
	}

	public final TermpContext termp(int inh) throws RecognitionException {
		TermpContext _localctx = new TermpContext(_ctx, getState(), inh);
		enterRule(_localctx, 10, RULE_termp);
		try {
			setState(68);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case T__3:
				enterOuterAlt(_localctx, 1);
				{
				print("*");
				setState(56);
				match(T__3);
				setState(57);
				((TermpContext)_localctx).fact = fact();
				setState(58);
				((TermpContext)_localctx).t1p = termp(_localctx.inh * ((TermpContext)_localctx).fact.val);
				 ((TermpContext)_localctx).syn =  ((TermpContext)_localctx).t1p.syn;
					try{
					int index = v.size() - 2;
					print(v.remove(index));
					print(v.remove(index));}
					catch (Exception e) {
				}
					
					

				}
				break;
			case T__4:
				enterOuterAlt(_localctx, 2);
				{
				print("/");
				setState(62);
				match(T__4);
				setState(63);
				((TermpContext)_localctx).fact = fact();
				setState(64);
				((TermpContext)_localctx).t1p = termp(_localctx.inh / ((TermpContext)_localctx).fact.val);
				 ((TermpContext)_localctx).syn =  ((TermpContext)_localctx).t1p.syn;
					try{
					int index = v.size() - 2;
					print(v.remove(index));
					print(v.remove(index));
				}
				catch (Exception e) {
				}


				}
				break;
			case T__1:
			case T__2:
			case RP:
			case NEWLINE:
				enterOuterAlt(_localctx, 3);
				{
				 ((TermpContext)_localctx).syn =  _localctx.inh; 
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class FactContext extends ParserRuleContext {
		public int val;
		public ExprContext expr;
		public Token NUM;
		public Token ID;
		public TerminalNode LP() { return getToken(CalcParser.LP, 0); }
		public ExprContext expr() {
			return getRuleContext(ExprContext.class,0);
		}
		public TerminalNode RP() { return getToken(CalcParser.RP, 0); }
		public TerminalNode NUM() { return getToken(CalcParser.NUM, 0); }
		public TerminalNode ID() { return getToken(CalcParser.ID, 0); }
		public FactContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_fact; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof CalcListener ) ((CalcListener)listener).enterFact(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof CalcListener ) ((CalcListener)listener).exitFact(this);
		}
	}

	public final FactContext fact() throws RecognitionException {
		FactContext _localctx = new FactContext(_ctx, getState());
		enterRule(_localctx, 12, RULE_fact);
		try {
			setState(79);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case LP:
				enterOuterAlt(_localctx, 1);
				{
				setState(70);
				match(LP);
				setState(71);
				((FactContext)_localctx).expr = expr();
				setState(72);
				match(RP);
				((FactContext)_localctx).val =  ((FactContext)_localctx).expr.val;
				}
				break;
			case NUM:
				enterOuterAlt(_localctx, 2);
				{
				setState(75);
				((FactContext)_localctx).NUM = match(NUM);
				 ((FactContext)_localctx).val =  Integer.parseInt((((FactContext)_localctx).NUM!=null?((FactContext)_localctx).NUM.getText():null)); 
					v.add((((FactContext)_localctx).NUM!=null?((FactContext)_localctx).NUM.getText():null));

				}
				break;
			case ID:
				enterOuterAlt(_localctx, 3);
				{
				setState(77);
				((FactContext)_localctx).ID = match(ID);

				Integer v = (Integer)memory.get((((FactContext)_localctx).ID!=null?((FactContext)_localctx).ID.getText():null));
				if ( v!=null ) ((FactContext)_localctx).val =  v.intValue();
				else System.err.println("undefined variable "+(((FactContext)_localctx).ID!=null?((FactContext)_localctx).ID.getText():null));

				}
				break;
			default:
				throw new NoViableAltException(this);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static final String _serializedATN =
		"\3\u608b\ua72a\u8133\ub9ed\u417c\u3be7\u7786\u5964\3\rT\4\2\t\2\4\3\t"+
		"\3\4\4\t\4\4\5\t\5\4\6\t\6\4\7\t\7\4\b\t\b\3\2\6\2\22\n\2\r\2\16\2\23"+
		"\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\5\3!\n\3\3\4\3\4\3\4\3\4"+
		"\3\5\3\5\3\5\3\5\3\5\3\5\3\5\3\5\3\5\3\5\3\5\3\5\3\5\5\5\64\n\5\3\6\3"+
		"\6\3\6\3\6\3\7\3\7\3\7\3\7\3\7\3\7\3\7\3\7\3\7\3\7\3\7\3\7\3\7\5\7G\n"+
		"\7\3\b\3\b\3\b\3\b\3\b\3\b\3\b\3\b\3\b\5\bR\n\b\3\b\2\2\t\2\4\6\b\n\f"+
		"\16\2\2\2U\2\21\3\2\2\2\4 \3\2\2\2\6\"\3\2\2\2\b\63\3\2\2\2\n\65\3\2\2"+
		"\2\fF\3\2\2\2\16Q\3\2\2\2\20\22\5\4\3\2\21\20\3\2\2\2\22\23\3\2\2\2\23"+
		"\21\3\2\2\2\23\24\3\2\2\2\24\3\3\2\2\2\25\26\5\6\4\2\26\27\7\13\2\2\27"+
		"\30\b\3\1\2\30!\3\2\2\2\31\32\7\n\2\2\32\33\7\3\2\2\33\34\5\6\4\2\34\35"+
		"\7\13\2\2\35\36\b\3\1\2\36!\3\2\2\2\37!\7\13\2\2 \25\3\2\2\2 \31\3\2\2"+
		"\2 \37\3\2\2\2!\5\3\2\2\2\"#\5\n\6\2#$\5\b\5\2$%\b\4\1\2%\7\3\2\2\2&\'"+
		"\b\5\1\2\'(\7\4\2\2()\5\n\6\2)*\5\b\5\2*+\b\5\1\2+\64\3\2\2\2,-\b\5\1"+
		"\2-.\7\5\2\2./\5\n\6\2/\60\5\b\5\2\60\61\b\5\1\2\61\64\3\2\2\2\62\64\b"+
		"\5\1\2\63&\3\2\2\2\63,\3\2\2\2\63\62\3\2\2\2\64\t\3\2\2\2\65\66\5\16\b"+
		"\2\66\67\5\f\7\2\678\b\6\1\28\13\3\2\2\29:\b\7\1\2:;\7\6\2\2;<\5\16\b"+
		"\2<=\5\f\7\2=>\b\7\1\2>G\3\2\2\2?@\b\7\1\2@A\7\7\2\2AB\5\16\b\2BC\5\f"+
		"\7\2CD\b\7\1\2DG\3\2\2\2EG\b\7\1\2F9\3\2\2\2F?\3\2\2\2FE\3\2\2\2G\r\3"+
		"\2\2\2HI\7\b\2\2IJ\5\6\4\2JK\7\t\2\2KL\b\b\1\2LR\3\2\2\2MN\7\f\2\2NR\b"+
		"\b\1\2OP\7\n\2\2PR\b\b\1\2QH\3\2\2\2QM\3\2\2\2QO\3\2\2\2R\17\3\2\2\2\7"+
		"\23 \63FQ";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}
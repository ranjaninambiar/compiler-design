// Generated from calcssn.g4 by ANTLR 4.9
import org.antlr.v4.runtime.Lexer;
import org.antlr.v4.runtime.CharStream;
import org.antlr.v4.runtime.Token;
import org.antlr.v4.runtime.TokenStream;
import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.atn.*;
import org.antlr.v4.runtime.dfa.DFA;
import org.antlr.v4.runtime.misc.*;

@SuppressWarnings({"all", "warnings", "unchecked", "unused", "cast"})
public class calcssn extends Lexer {
	static { RuntimeMetaData.checkVersion("4.9", RuntimeMetaData.VERSION); }

	protected static final DFA[] _decisionToDFA;
	protected static final PredictionContextCache _sharedContextCache =
		new PredictionContextCache();
	public static final int
		S=1, Y=2, M=3, L=4, O=5, SP=6, C=7, N=8, SSN=9, SSNNV=10, WS=11;
	public static String[] channelNames = {
		"DEFAULT_TOKEN_CHANNEL", "HIDDEN"
	};

	public static String[] modeNames = {
		"DEFAULT_MODE"
	};

	private static String[] makeRuleNames() {
		return new String[] {
			"S", "Y", "M", "L", "O", "SP", "C", "N", "SSN", "SSNNV", "WS"
		};
	}
	public static final String[] ruleNames = makeRuleNames();

	private static String[] makeLiteralNames() {
		return new String[] {
			null, null, null, null, null, null, "' '"
		};
	}
	private static final String[] _LITERAL_NAMES = makeLiteralNames();
	private static String[] makeSymbolicNames() {
		return new String[] {
			null, "S", "Y", "M", "L", "O", "SP", "C", "N", "SSN", "SSNNV", "WS"
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


	public calcssn(CharStream input) {
		super(input);
		_interp = new LexerATNSimulator(this,_ATN,_decisionToDFA,_sharedContextCache);
	}

	@Override
	public String getGrammarFileName() { return "calcssn.g4"; }

	@Override
	public String[] getRuleNames() { return ruleNames; }

	@Override
	public String getSerializedATN() { return _serializedATN; }

	@Override
	public String[] getChannelNames() { return channelNames; }

	@Override
	public String[] getModeNames() { return modeNames; }

	@Override
	public ATN getATN() { return _ATN; }

	@Override
	public void action(RuleContext _localctx, int ruleIndex, int actionIndex) {
		switch (ruleIndex) {
		case 8:
			SSN_action((RuleContext)_localctx, actionIndex);
			break;
		case 9:
			SSNNV_action((RuleContext)_localctx, actionIndex);
			break;
		}
	}
	private void SSN_action(RuleContext _localctx, int actionIndex) {
		switch (actionIndex) {
		case 0:
			System.out.println("SSN is valid\n");
			break;
		}
	}
	private void SSNNV_action(RuleContext _localctx, int actionIndex) {
		switch (actionIndex) {
		case 1:
			System.out.println("SSN is not valid\n");
			break;
		}
	}

	public static final String _serializedATN =
		"\3\u608b\ua72a\u8133\ub9ed\u417c\u3be7\u7786\u5964\2\rX\b\1\4\2\t\2\4"+
		"\3\t\3\4\4\t\4\4\5\t\5\4\6\t\6\4\7\t\7\4\b\t\b\4\t\t\t\4\n\t\n\4\13\t"+
		"\13\4\f\t\f\3\2\3\2\3\3\3\3\3\3\3\4\3\4\3\4\3\4\5\4#\n\4\3\5\3\5\3\5\3"+
		"\5\5\5)\n\5\3\6\3\6\3\6\3\6\3\6\3\6\5\6\61\n\6\3\7\3\7\3\b\3\b\3\b\3\t"+
		"\3\t\3\n\3\n\3\n\3\n\3\n\3\n\3\n\3\n\3\n\3\13\3\13\3\13\3\13\3\13\3\13"+
		"\3\13\3\13\3\13\3\13\3\13\3\13\3\13\3\13\3\13\3\f\6\fS\n\f\r\f\16\fT\3"+
		"\f\3\f\2\2\r\3\3\5\4\7\5\t\6\13\7\r\b\17\t\21\n\23\13\25\f\27\r\3\2\f"+
		"\3\2\63\64\3\2\62;\3\2\62\62\3\2\63;\3\2\63\63\3\2\62\64\3\2C\\\3\2\63"+
		"9\6\2\"\"\62;C\\c|\4\2\13\f\17\17\2[\2\3\3\2\2\2\2\5\3\2\2\2\2\7\3\2\2"+
		"\2\2\t\3\2\2\2\2\13\3\2\2\2\2\r\3\2\2\2\2\17\3\2\2\2\2\21\3\2\2\2\2\23"+
		"\3\2\2\2\2\25\3\2\2\2\2\27\3\2\2\2\3\31\3\2\2\2\5\33\3\2\2\2\7\"\3\2\2"+
		"\2\t(\3\2\2\2\13\60\3\2\2\2\r\62\3\2\2\2\17\64\3\2\2\2\21\67\3\2\2\2\23"+
		"9\3\2\2\2\25B\3\2\2\2\27R\3\2\2\2\31\32\t\2\2\2\32\4\3\2\2\2\33\34\t\3"+
		"\2\2\34\35\t\3\2\2\35\6\3\2\2\2\36\37\t\4\2\2\37#\t\5\2\2 !\t\6\2\2!#"+
		"\t\7\2\2\"\36\3\2\2\2\" \3\2\2\2#\b\3\2\2\2$%\t\3\2\2%)\t\3\2\2&\'\t\3"+
		"\2\2\')\t\b\2\2($\3\2\2\2(&\3\2\2\2)\n\3\2\2\2*+\t\3\2\2+,\t\3\2\2,\61"+
		"\t\3\2\2-.\t\3\2\2./\t\3\2\2/\61\t\b\2\2\60*\3\2\2\2\60-\3\2\2\2\61\f"+
		"\3\2\2\2\62\63\7\"\2\2\63\16\3\2\2\2\64\65\t\3\2\2\65\66\t\t\2\2\66\20"+
		"\3\2\2\2\678\t\n\2\28\22\3\2\2\29:\5\3\2\2:;\5\5\3\2;<\5\7\4\2<=\5\t\5"+
		"\2=>\5\13\6\2>?\5\r\7\2?@\5\17\b\2@A\b\n\2\2A\24\3\2\2\2BC\5\21\t\2CD"+
		"\5\21\t\2DE\5\21\t\2EF\5\21\t\2FG\5\21\t\2GH\5\21\t\2HI\5\21\t\2IJ\5\21"+
		"\t\2JK\5\21\t\2KL\5\21\t\2LM\5\r\7\2MN\5\21\t\2NO\5\21\t\2OP\b\13\3\2"+
		"P\26\3\2\2\2QS\t\13\2\2RQ\3\2\2\2ST\3\2\2\2TR\3\2\2\2TU\3\2\2\2UV\3\2"+
		"\2\2VW\b\f\4\2W\30\3\2\2\2\7\2\"(\60T\5\3\n\2\3\13\3\b\2\2";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}
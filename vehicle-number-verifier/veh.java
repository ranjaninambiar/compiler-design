// Generated from veh.g4 by ANTLR 4.9
import org.antlr.v4.runtime.Lexer;
import org.antlr.v4.runtime.CharStream;
import org.antlr.v4.runtime.Token;
import org.antlr.v4.runtime.TokenStream;
import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.atn.*;
import org.antlr.v4.runtime.dfa.DFA;
import org.antlr.v4.runtime.misc.*;

@SuppressWarnings({"all", "warnings", "unchecked", "unused", "cast"})
public class veh extends Lexer {
	static { RuntimeMetaData.checkVersion("4.9", RuntimeMetaData.VERSION); }

	protected static final DFA[] _decisionToDFA;
	protected static final PredictionContextCache _sharedContextCache =
		new PredictionContextCache();
	public static final int
		STATE=1, D=2, T=3, NUM=4, S=5, VEHNO=6, WS=7;
	public static String[] channelNames = {
		"DEFAULT_TOKEN_CHANNEL", "HIDDEN"
	};

	public static String[] modeNames = {
		"DEFAULT_MODE"
	};

	private static String[] makeRuleNames() {
		return new String[] {
			"STATE", "D", "T", "NUM", "S", "VEHNO", "WS"
		};
	}
	public static final String[] ruleNames = makeRuleNames();

	private static String[] makeLiteralNames() {
		return new String[] {
			null, null, null, null, null, "' '"
		};
	}
	private static final String[] _LITERAL_NAMES = makeLiteralNames();
	private static String[] makeSymbolicNames() {
		return new String[] {
			null, "STATE", "D", "T", "NUM", "S", "VEHNO", "WS"
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


	public veh(CharStream input) {
		super(input);
		_interp = new LexerATNSimulator(this,_ATN,_decisionToDFA,_sharedContextCache);
	}

	@Override
	public String getGrammarFileName() { return "veh.g4"; }

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
		case 0:
			STATE_action((RuleContext)_localctx, actionIndex);
			break;
		case 5:
			VEHNO_action((RuleContext)_localctx, actionIndex);
			break;
		}
	}
	private void STATE_action(RuleContext _localctx, int actionIndex) {
		switch (actionIndex) {
		case 0:
			System.out.println("Tamil Nadu");
			break;
		case 1:
			System.out.println("Kerala");
			break;
		case 2:
			System.out.println("Delhi");
			break;
		case 3:
			System.out.println("Maharashtra");
			break;
		}
	}
	private void VEHNO_action(RuleContext _localctx, int actionIndex) {
		switch (actionIndex) {
		case 4:
			System.out.println("Vehicle no. valid");
			break;
		}
	}

	public static final String _serializedATN =
		"\3\u608b\ua72a\u8133\ub9ed\u417c\u3be7\u7786\u5964\2\t=\b\1\4\2\t\2\4"+
		"\3\t\3\4\4\t\4\4\5\t\5\4\6\t\6\4\7\t\7\4\b\t\b\3\2\3\2\3\2\3\2\3\2\3\2"+
		"\3\2\3\2\3\2\3\2\3\2\3\2\3\2\3\2\3\2\3\2\5\2\"\n\2\3\3\3\3\3\3\3\4\3\4"+
		"\3\4\3\5\3\5\3\5\3\5\3\5\3\6\3\6\3\7\3\7\3\7\3\7\3\7\3\7\3\7\3\7\3\7\3"+
		"\b\3\b\3\b\3\b\2\2\t\3\3\5\4\7\5\t\6\13\7\r\b\17\t\3\2\5\3\2\62;\3\2C"+
		"\\\4\2\13\f\17\17\2?\2\3\3\2\2\2\2\5\3\2\2\2\2\7\3\2\2\2\2\t\3\2\2\2\2"+
		"\13\3\2\2\2\2\r\3\2\2\2\2\17\3\2\2\2\3!\3\2\2\2\5#\3\2\2\2\7&\3\2\2\2"+
		"\t)\3\2\2\2\13.\3\2\2\2\r\60\3\2\2\2\179\3\2\2\2\21\22\7V\2\2\22\23\7"+
		"P\2\2\23\24\3\2\2\2\24\"\b\2\2\2\25\26\7M\2\2\26\27\7N\2\2\27\30\3\2\2"+
		"\2\30\"\b\2\3\2\31\32\7F\2\2\32\33\7N\2\2\33\34\3\2\2\2\34\"\b\2\4\2\35"+
		"\36\7O\2\2\36\37\7J\2\2\37 \3\2\2\2 \"\b\2\5\2!\21\3\2\2\2!\25\3\2\2\2"+
		"!\31\3\2\2\2!\35\3\2\2\2\"\4\3\2\2\2#$\t\2\2\2$%\t\2\2\2%\6\3\2\2\2&\'"+
		"\t\3\2\2\'(\t\3\2\2(\b\3\2\2\2)*\t\2\2\2*+\t\2\2\2+,\t\2\2\2,-\t\2\2\2"+
		"-\n\3\2\2\2./\7\"\2\2/\f\3\2\2\2\60\61\5\3\2\2\61\62\5\13\6\2\62\63\5"+
		"\5\3\2\63\64\5\13\6\2\64\65\5\7\4\2\65\66\5\13\6\2\66\67\5\t\5\2\678\b"+
		"\7\6\28\16\3\2\2\29:\t\4\2\2:;\3\2\2\2;<\b\b\7\2<\20\3\2\2\2\4\2!\b\3"+
		"\2\2\3\2\3\3\2\4\3\2\5\3\7\6\b\2\2";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}
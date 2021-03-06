// Generated from cal.g4 by ANTLR 4.9.2
import org.antlr.v4.runtime.Lexer;
import org.antlr.v4.runtime.CharStream;
import org.antlr.v4.runtime.Token;
import org.antlr.v4.runtime.TokenStream;
import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.atn.*;
import org.antlr.v4.runtime.dfa.DFA;
import org.antlr.v4.runtime.misc.*;

@SuppressWarnings({"all", "warnings", "unchecked", "unused", "cast"})
public class calLexer extends Lexer {
	static { RuntimeMetaData.checkVersion("4.9.2", RuntimeMetaData.VERSION); }

	protected static final DFA[] _decisionToDFA;
	protected static final PredictionContextCache _sharedContextCache =
		new PredictionContextCache();
	public static final int
		Variable=1, Const=2, Return=3, Integer=4, Boolean=5, Void=6, Main=7, If=8, 
		Else=9, True=10, False=11, While=12, Skip=13, SemiColon=14, Colon=15, 
		Comma=16, ID=17, NUMBER=18, BOOLEAN=19, Lbrace=20, Rbrace=21, Lsb=22, 
		RSb=23, Lb=24, Rb=25, MINUS=26, PLUS=27, ASSIGNMENT=28, NEGATION=29, OR=30, 
		AND=31, EQUAL=32, NOTEQUAL=33, Less_Than=34, Less_ThanE=35, Greater=36, 
		GreaterE=37, Multi_Comment=38, Single_Comment=39, WhiteSpace=40;
	public static String[] channelNames = {
		"DEFAULT_TOKEN_CHANNEL", "HIDDEN"
	};

	public static String[] modeNames = {
		"DEFAULT_MODE"
	};

	private static String[] makeRuleNames() {
		return new String[] {
			"Variable", "Const", "Return", "Integer", "Boolean", "Void", "Main", 
			"If", "Else", "True", "False", "While", "Skip", "SemiColon", "Colon", 
			"Comma", "ID", "NUMBER", "BOOLEAN", "Lbrace", "Rbrace", "Lsb", "RSb", 
			"Lb", "Rb", "MINUS", "PLUS", "ASSIGNMENT", "NEGATION", "OR", "AND", "EQUAL", 
			"NOTEQUAL", "Less_Than", "Less_ThanE", "Greater", "GreaterE", "A", "B", 
			"C", "D", "E", "F", "G", "H", "I", "K", "L", "M", "N", "O", "P", "R", 
			"S", "T", "U", "V", "W", "Letter", "Digit", "NonZero", "UnderScore", 
			"Dot", "Multi_Comment", "Single_Comment", "WhiteSpace"
		};
	}
	public static final String[] ruleNames = makeRuleNames();

	private static String[] makeLiteralNames() {
		return new String[] {
			null, null, null, null, null, null, null, null, null, null, null, null, 
			null, null, "';'", "':'", "','", null, null, null, "'{'", "'}'", "'['", 
			"']'", "'('", "')'", "'-'", "'+'", "'='", "'~'", "'||'", "'&&'", "'=='", 
			"'!='", "'<'", "'<='", "'>'", "'>='"
		};
	}
	private static final String[] _LITERAL_NAMES = makeLiteralNames();
	private static String[] makeSymbolicNames() {
		return new String[] {
			null, "Variable", "Const", "Return", "Integer", "Boolean", "Void", "Main", 
			"If", "Else", "True", "False", "While", "Skip", "SemiColon", "Colon", 
			"Comma", "ID", "NUMBER", "BOOLEAN", "Lbrace", "Rbrace", "Lsb", "RSb", 
			"Lb", "Rb", "MINUS", "PLUS", "ASSIGNMENT", "NEGATION", "OR", "AND", "EQUAL", 
			"NOTEQUAL", "Less_Than", "Less_ThanE", "Greater", "GreaterE", "Multi_Comment", 
			"Single_Comment", "WhiteSpace"
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


	public calLexer(CharStream input) {
		super(input);
		_interp = new LexerATNSimulator(this,_ATN,_decisionToDFA,_sharedContextCache);
	}

	@Override
	public String getGrammarFileName() { return "cal.g4"; }

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

	public static final String _serializedATN =
		"\3\u608b\ua72a\u8133\ub9ed\u417c\u3be7\u7786\u5964\2*\u017c\b\1\4\2\t"+
		"\2\4\3\t\3\4\4\t\4\4\5\t\5\4\6\t\6\4\7\t\7\4\b\t\b\4\t\t\t\4\n\t\n\4\13"+
		"\t\13\4\f\t\f\4\r\t\r\4\16\t\16\4\17\t\17\4\20\t\20\4\21\t\21\4\22\t\22"+
		"\4\23\t\23\4\24\t\24\4\25\t\25\4\26\t\26\4\27\t\27\4\30\t\30\4\31\t\31"+
		"\4\32\t\32\4\33\t\33\4\34\t\34\4\35\t\35\4\36\t\36\4\37\t\37\4 \t \4!"+
		"\t!\4\"\t\"\4#\t#\4$\t$\4%\t%\4&\t&\4\'\t\'\4(\t(\4)\t)\4*\t*\4+\t+\4"+
		",\t,\4-\t-\4.\t.\4/\t/\4\60\t\60\4\61\t\61\4\62\t\62\4\63\t\63\4\64\t"+
		"\64\4\65\t\65\4\66\t\66\4\67\t\67\48\t8\49\t9\4:\t:\4;\t;\4<\t<\4=\t="+
		"\4>\t>\4?\t?\4@\t@\4A\tA\4B\tB\4C\tC\3\2\3\2\3\2\3\2\3\2\3\2\3\2\3\2\3"+
		"\2\3\3\3\3\3\3\3\3\3\3\3\3\3\4\3\4\3\4\3\4\3\4\3\4\3\4\3\5\3\5\3\5\3\5"+
		"\3\5\3\5\3\5\3\5\3\6\3\6\3\6\3\6\3\6\3\6\3\6\3\6\3\7\3\7\3\7\3\7\3\7\3"+
		"\b\3\b\3\b\3\b\3\b\3\t\3\t\3\t\3\n\3\n\3\n\3\n\3\n\3\13\3\13\3\13\3\13"+
		"\3\13\3\f\3\f\3\f\3\f\3\f\3\f\3\r\3\r\3\r\3\r\3\r\3\r\3\16\3\16\3\16\3"+
		"\16\3\16\3\17\3\17\3\20\3\20\3\21\3\21\3\22\3\22\3\22\3\22\7\22\u00e0"+
		"\n\22\f\22\16\22\u00e3\13\22\3\23\5\23\u00e6\n\23\3\23\3\23\3\23\6\23"+
		"\u00eb\n\23\r\23\16\23\u00ec\5\23\u00ef\n\23\3\24\3\24\3\24\3\24\3\24"+
		"\3\24\3\24\3\24\3\24\5\24\u00fa\n\24\3\25\3\25\3\26\3\26\3\27\3\27\3\30"+
		"\3\30\3\31\3\31\3\32\3\32\3\33\3\33\3\34\3\34\3\35\3\35\3\36\3\36\3\37"+
		"\3\37\3\37\3 \3 \3 \3!\3!\3!\3\"\3\"\3\"\3#\3#\3$\3$\3$\3%\3%\3&\3&\3"+
		"&\3\'\3\'\3(\3(\3)\3)\3*\3*\3+\3+\3,\3,\3-\3-\3.\3.\3/\3/\3\60\3\60\3"+
		"\61\3\61\3\62\3\62\3\63\3\63\3\64\3\64\3\65\3\65\3\66\3\66\3\67\3\67\3"+
		"8\38\39\39\3:\3:\3;\3;\3<\3<\3=\3=\3>\3>\3?\3?\3@\3@\3A\3A\3A\3A\3A\7"+
		"A\u015f\nA\fA\16A\u0162\13A\3A\3A\3A\3A\3A\3B\3B\3B\3B\7B\u016d\nB\fB"+
		"\16B\u0170\13B\3B\3B\3B\3B\3C\6C\u0177\nC\rC\16C\u0178\3C\3C\4\u0160\u016e"+
		"\2D\3\3\5\4\7\5\t\6\13\7\r\b\17\t\21\n\23\13\25\f\27\r\31\16\33\17\35"+
		"\20\37\21!\22#\23%\24\'\25)\26+\27-\30/\31\61\32\63\33\65\34\67\359\36"+
		";\37= ?!A\"C#E$G%I&K\'M\2O\2Q\2S\2U\2W\2Y\2[\2]\2_\2a\2c\2e\2g\2i\2k\2"+
		"m\2o\2q\2s\2u\2w\2y\2{\2}\2\177\2\u0081(\u0083)\u0085*\3\2\33\4\2CCcc"+
		"\4\2DDdd\4\2EEee\4\2FFff\4\2GGgg\4\2HHhh\4\2IIii\4\2JJjj\4\2KKkk\4\2M"+
		"Mmm\4\2NNnn\4\2OOoo\4\2PPpp\4\2QQqq\4\2RRrr\4\2TTtt\4\2UUuu\4\2VVvv\4"+
		"\2WWww\4\2XXxx\4\2YYyy\4\2C\\c|\3\2\62;\3\2\63;\5\2\13\f\17\17\"\"\2\u016c"+
		"\2\3\3\2\2\2\2\5\3\2\2\2\2\7\3\2\2\2\2\t\3\2\2\2\2\13\3\2\2\2\2\r\3\2"+
		"\2\2\2\17\3\2\2\2\2\21\3\2\2\2\2\23\3\2\2\2\2\25\3\2\2\2\2\27\3\2\2\2"+
		"\2\31\3\2\2\2\2\33\3\2\2\2\2\35\3\2\2\2\2\37\3\2\2\2\2!\3\2\2\2\2#\3\2"+
		"\2\2\2%\3\2\2\2\2\'\3\2\2\2\2)\3\2\2\2\2+\3\2\2\2\2-\3\2\2\2\2/\3\2\2"+
		"\2\2\61\3\2\2\2\2\63\3\2\2\2\2\65\3\2\2\2\2\67\3\2\2\2\29\3\2\2\2\2;\3"+
		"\2\2\2\2=\3\2\2\2\2?\3\2\2\2\2A\3\2\2\2\2C\3\2\2\2\2E\3\2\2\2\2G\3\2\2"+
		"\2\2I\3\2\2\2\2K\3\2\2\2\2\u0081\3\2\2\2\2\u0083\3\2\2\2\2\u0085\3\2\2"+
		"\2\3\u0087\3\2\2\2\5\u0090\3\2\2\2\7\u0096\3\2\2\2\t\u009d\3\2\2\2\13"+
		"\u00a5\3\2\2\2\r\u00ad\3\2\2\2\17\u00b2\3\2\2\2\21\u00b7\3\2\2\2\23\u00ba"+
		"\3\2\2\2\25\u00bf\3\2\2\2\27\u00c4\3\2\2\2\31\u00ca\3\2\2\2\33\u00d0\3"+
		"\2\2\2\35\u00d5\3\2\2\2\37\u00d7\3\2\2\2!\u00d9\3\2\2\2#\u00db\3\2\2\2"+
		"%\u00e5\3\2\2\2\'\u00f9\3\2\2\2)\u00fb\3\2\2\2+\u00fd\3\2\2\2-\u00ff\3"+
		"\2\2\2/\u0101\3\2\2\2\61\u0103\3\2\2\2\63\u0105\3\2\2\2\65\u0107\3\2\2"+
		"\2\67\u0109\3\2\2\29\u010b\3\2\2\2;\u010d\3\2\2\2=\u010f\3\2\2\2?\u0112"+
		"\3\2\2\2A\u0115\3\2\2\2C\u0118\3\2\2\2E\u011b\3\2\2\2G\u011d\3\2\2\2I"+
		"\u0120\3\2\2\2K\u0122\3\2\2\2M\u0125\3\2\2\2O\u0127\3\2\2\2Q\u0129\3\2"+
		"\2\2S\u012b\3\2\2\2U\u012d\3\2\2\2W\u012f\3\2\2\2Y\u0131\3\2\2\2[\u0133"+
		"\3\2\2\2]\u0135\3\2\2\2_\u0137\3\2\2\2a\u0139\3\2\2\2c\u013b\3\2\2\2e"+
		"\u013d\3\2\2\2g\u013f\3\2\2\2i\u0141\3\2\2\2k\u0143\3\2\2\2m\u0145\3\2"+
		"\2\2o\u0147\3\2\2\2q\u0149\3\2\2\2s\u014b\3\2\2\2u\u014d\3\2\2\2w\u014f"+
		"\3\2\2\2y\u0151\3\2\2\2{\u0153\3\2\2\2}\u0155\3\2\2\2\177\u0157\3\2\2"+
		"\2\u0081\u0159\3\2\2\2\u0083\u0168\3\2\2\2\u0085\u0176\3\2\2\2\u0087\u0088"+
		"\5s:\2\u0088\u0089\5M\'\2\u0089\u008a\5k\66\2\u008a\u008b\5]/\2\u008b"+
		"\u008c\5M\'\2\u008c\u008d\5O(\2\u008d\u008e\5a\61\2\u008e\u008f\5U+\2"+
		"\u008f\4\3\2\2\2\u0090\u0091\5Q)\2\u0091\u0092\5g\64\2\u0092\u0093\5e"+
		"\63\2\u0093\u0094\5m\67\2\u0094\u0095\5o8\2\u0095\6\3\2\2\2\u0096\u0097"+
		"\5k\66\2\u0097\u0098\5U+\2\u0098\u0099\5o8\2\u0099\u009a\5q9\2\u009a\u009b"+
		"\5k\66\2\u009b\u009c\5e\63\2\u009c\b\3\2\2\2\u009d\u009e\5]/\2\u009e\u009f"+
		"\5e\63\2\u009f\u00a0\5o8\2\u00a0\u00a1\5U+\2\u00a1\u00a2\5Y-\2\u00a2\u00a3"+
		"\5U+\2\u00a3\u00a4\5k\66\2\u00a4\n\3\2\2\2\u00a5\u00a6\5O(\2\u00a6\u00a7"+
		"\5g\64\2\u00a7\u00a8\5g\64\2\u00a8\u00a9\5a\61\2\u00a9\u00aa\5U+\2\u00aa"+
		"\u00ab\5M\'\2\u00ab\u00ac\5e\63\2\u00ac\f\3\2\2\2\u00ad\u00ae\5s:\2\u00ae"+
		"\u00af\5g\64\2\u00af\u00b0\5]/\2\u00b0\u00b1\5S*\2\u00b1\16\3\2\2\2\u00b2"+
		"\u00b3\5c\62\2\u00b3\u00b4\5M\'\2\u00b4\u00b5\5]/\2\u00b5\u00b6\5e\63"+
		"\2\u00b6\20\3\2\2\2\u00b7\u00b8\5]/\2\u00b8\u00b9\5W,\2\u00b9\22\3\2\2"+
		"\2\u00ba\u00bb\5U+\2\u00bb\u00bc\5a\61\2\u00bc\u00bd\5m\67\2\u00bd\u00be"+
		"\5U+\2\u00be\24\3\2\2\2\u00bf\u00c0\5o8\2\u00c0\u00c1\5k\66\2\u00c1\u00c2"+
		"\5q9\2\u00c2\u00c3\5U+\2\u00c3\26\3\2\2\2\u00c4\u00c5\5W,\2\u00c5\u00c6"+
		"\5M\'\2\u00c6\u00c7\5a\61\2\u00c7\u00c8\5m\67\2\u00c8\u00c9\5U+\2\u00c9"+
		"\30\3\2\2\2\u00ca\u00cb\5u;\2\u00cb\u00cc\5[.\2\u00cc\u00cd\5]/\2\u00cd"+
		"\u00ce\5a\61\2\u00ce\u00cf\5U+\2\u00cf\32\3\2\2\2\u00d0\u00d1\5m\67\2"+
		"\u00d1\u00d2\5_\60\2\u00d2\u00d3\5]/\2\u00d3\u00d4\5i\65\2\u00d4\34\3"+
		"\2\2\2\u00d5\u00d6\7=\2\2\u00d6\36\3\2\2\2\u00d7\u00d8\7<\2\2\u00d8 \3"+
		"\2\2\2\u00d9\u00da\7.\2\2\u00da\"\3\2\2\2\u00db\u00e1\5w<\2\u00dc\u00e0"+
		"\5w<\2\u00dd\u00e0\5y=\2\u00de\u00e0\5}?\2\u00df\u00dc\3\2\2\2\u00df\u00dd"+
		"\3\2\2\2\u00df\u00de\3\2\2\2\u00e0\u00e3\3\2\2\2\u00e1\u00df\3\2\2\2\u00e1"+
		"\u00e2\3\2\2\2\u00e2$\3\2\2\2\u00e3\u00e1\3\2\2\2\u00e4\u00e6\5\65\33"+
		"\2\u00e5\u00e4\3\2\2\2\u00e5\u00e6\3\2\2\2\u00e6\u00ee\3\2\2\2\u00e7\u00ef"+
		"\5y=\2\u00e8\u00ea\5{>\2\u00e9\u00eb\5y=\2\u00ea\u00e9\3\2\2\2\u00eb\u00ec"+
		"\3\2\2\2\u00ec\u00ea\3\2\2\2\u00ec\u00ed\3\2\2\2\u00ed\u00ef\3\2\2\2\u00ee"+
		"\u00e7\3\2\2\2\u00ee\u00e8\3\2\2\2\u00ef&\3\2\2\2\u00f0\u00f1\7v\2\2\u00f1"+
		"\u00f2\7t\2\2\u00f2\u00f3\7w\2\2\u00f3\u00fa\7g\2\2\u00f4\u00f5\7h\2\2"+
		"\u00f5\u00f6\7c\2\2\u00f6\u00f7\7n\2\2\u00f7\u00f8\7u\2\2\u00f8\u00fa"+
		"\7g\2\2\u00f9\u00f0\3\2\2\2\u00f9\u00f4\3\2\2\2\u00fa(\3\2\2\2\u00fb\u00fc"+
		"\7}\2\2\u00fc*\3\2\2\2\u00fd\u00fe\7\177\2\2\u00fe,\3\2\2\2\u00ff\u0100"+
		"\7]\2\2\u0100.\3\2\2\2\u0101\u0102\7_\2\2\u0102\60\3\2\2\2\u0103\u0104"+
		"\7*\2\2\u0104\62\3\2\2\2\u0105\u0106\7+\2\2\u0106\64\3\2\2\2\u0107\u0108"+
		"\7/\2\2\u0108\66\3\2\2\2\u0109\u010a\7-\2\2\u010a8\3\2\2\2\u010b\u010c"+
		"\7?\2\2\u010c:\3\2\2\2\u010d\u010e\7\u0080\2\2\u010e<\3\2\2\2\u010f\u0110"+
		"\7~\2\2\u0110\u0111\7~\2\2\u0111>\3\2\2\2\u0112\u0113\7(\2\2\u0113\u0114"+
		"\7(\2\2\u0114@\3\2\2\2\u0115\u0116\7?\2\2\u0116\u0117\7?\2\2\u0117B\3"+
		"\2\2\2\u0118\u0119\7#\2\2\u0119\u011a\7?\2\2\u011aD\3\2\2\2\u011b\u011c"+
		"\7>\2\2\u011cF\3\2\2\2\u011d\u011e\7>\2\2\u011e\u011f\7?\2\2\u011fH\3"+
		"\2\2\2\u0120\u0121\7@\2\2\u0121J\3\2\2\2\u0122\u0123\7@\2\2\u0123\u0124"+
		"\7?\2\2\u0124L\3\2\2\2\u0125\u0126\t\2\2\2\u0126N\3\2\2\2\u0127\u0128"+
		"\t\3\2\2\u0128P\3\2\2\2\u0129\u012a\t\4\2\2\u012aR\3\2\2\2\u012b\u012c"+
		"\t\5\2\2\u012cT\3\2\2\2\u012d\u012e\t\6\2\2\u012eV\3\2\2\2\u012f\u0130"+
		"\t\7\2\2\u0130X\3\2\2\2\u0131\u0132\t\b\2\2\u0132Z\3\2\2\2\u0133\u0134"+
		"\t\t\2\2\u0134\\\3\2\2\2\u0135\u0136\t\n\2\2\u0136^\3\2\2\2\u0137\u0138"+
		"\t\13\2\2\u0138`\3\2\2\2\u0139\u013a\t\f\2\2\u013ab\3\2\2\2\u013b\u013c"+
		"\t\r\2\2\u013cd\3\2\2\2\u013d\u013e\t\16\2\2\u013ef\3\2\2\2\u013f\u0140"+
		"\t\17\2\2\u0140h\3\2\2\2\u0141\u0142\t\20\2\2\u0142j\3\2\2\2\u0143\u0144"+
		"\t\21\2\2\u0144l\3\2\2\2\u0145\u0146\t\22\2\2\u0146n\3\2\2\2\u0147\u0148"+
		"\t\23\2\2\u0148p\3\2\2\2\u0149\u014a\t\24\2\2\u014ar\3\2\2\2\u014b\u014c"+
		"\t\25\2\2\u014ct\3\2\2\2\u014d\u014e\t\26\2\2\u014ev\3\2\2\2\u014f\u0150"+
		"\t\27\2\2\u0150x\3\2\2\2\u0151\u0152\t\30\2\2\u0152z\3\2\2\2\u0153\u0154"+
		"\t\31\2\2\u0154|\3\2\2\2\u0155\u0156\7a\2\2\u0156~\3\2\2\2\u0157\u0158"+
		"\7\60\2\2\u0158\u0080\3\2\2\2\u0159\u015a\7\61\2\2\u015a\u015b\7,\2\2"+
		"\u015b\u0160\3\2\2\2\u015c\u015f\5\u0081A\2\u015d\u015f\13\2\2\2\u015e"+
		"\u015c\3\2\2\2\u015e\u015d\3\2\2\2\u015f\u0162\3\2\2\2\u0160\u0161\3\2"+
		"\2\2\u0160\u015e\3\2\2\2\u0161\u0163\3\2\2\2\u0162\u0160\3\2\2\2\u0163"+
		"\u0164\7,\2\2\u0164\u0165\7\61\2\2\u0165\u0166\3\2\2\2\u0166\u0167\bA"+
		"\2\2\u0167\u0082\3\2\2\2\u0168\u0169\7\61\2\2\u0169\u016a\7\61\2\2\u016a"+
		"\u016e\3\2\2\2\u016b\u016d\13\2\2\2\u016c\u016b\3\2\2\2\u016d\u0170\3"+
		"\2\2\2\u016e\u016f\3\2\2\2\u016e\u016c\3\2\2\2\u016f\u0171\3\2\2\2\u0170"+
		"\u016e\3\2\2\2\u0171\u0172\7\f\2\2\u0172\u0173\3\2\2\2\u0173\u0174\bB"+
		"\2\2\u0174\u0084\3\2\2\2\u0175\u0177\t\32\2\2\u0176\u0175\3\2\2\2\u0177"+
		"\u0178\3\2\2\2\u0178\u0176\3\2\2\2\u0178\u0179\3\2\2\2\u0179\u017a\3\2"+
		"\2\2\u017a\u017b\bC\2\2\u017b\u0086\3\2\2\2\r\2\u00df\u00e1\u00e5\u00ec"+
		"\u00ee\u00f9\u015e\u0160\u016e\u0178\3\b\2\2";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}
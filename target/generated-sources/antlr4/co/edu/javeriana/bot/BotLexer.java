// Generated from co\edu\javeriana\bot\Bot.g4 by ANTLR 4.5.1
package co.edu.javeriana.bot;

	import org.jpavlich.bot.*;
	import org.jpavlich.bot.Bot;
	import co.edu.javeriana.bot.ast.*;
	import java.util.Map;
	import java.util.HashMap;

import org.antlr.v4.runtime.Lexer;
import org.antlr.v4.runtime.CharStream;
import org.antlr.v4.runtime.Token;
import org.antlr.v4.runtime.TokenStream;
import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.atn.*;
import org.antlr.v4.runtime.dfa.DFA;
import org.antlr.v4.runtime.misc.*;

@SuppressWarnings({"all", "warnings", "unchecked", "unused", "cast"})
public class BotLexer extends Lexer {
	static { RuntimeMetaData.checkVersion("4.5.1", RuntimeMetaData.VERSION); }

	protected static final DFA[] _decisionToDFA;
	protected static final PredictionContextCache _sharedContextCache =
		new PredictionContextCache();
	public static final int
		STRING=1, TRUE=2, FALSE=3, NUMBER=4, BOOLEAN=5, COMMENT=6, UP=7, LEFT=8, 
		RIGHT=9, DOWN=10, DROP=11, PICK=12, SEMICOLON=13, PLUS=14, SUBTRACTION=15, 
		MULTIPLICATION=16, DIVISION=17, COMMA=18, ASSIGN=19, QUESTION=20, DOLLAR=21, 
		IF=22, ELSE=23, ARROW_RIGHT=24, END=25, AND=26, OR=27, NOT=28, MINOR=29, 
		MAYOR=30, MINOREQ=31, MAYOREQ=32, EQUAL=33, NOTEQUAL=34, PARENTHESIS=35, 
		RIGHTPARENTHESIS=36, DEFINE=37, WHILE=38, BR_OPEN=39, BR_CLOSE=40, VAR=41, 
		ID=42, WS=43;
	public static String[] modeNames = {
		"DEFAULT_MODE"
	};

	public static final String[] ruleNames = {
		"STRING", "TRUE", "FALSE", "NUMBER", "BOOLEAN", "COMMENT", "UP", "LEFT", 
		"RIGHT", "DOWN", "DROP", "PICK", "SEMICOLON", "PLUS", "SUBTRACTION", "MULTIPLICATION", 
		"DIVISION", "COMMA", "ASSIGN", "QUESTION", "DOLLAR", "IF", "ELSE", "ARROW_RIGHT", 
		"END", "AND", "OR", "NOT", "MINOR", "MAYOR", "MINOREQ", "MAYOREQ", "EQUAL", 
		"NOTEQUAL", "PARENTHESIS", "RIGHTPARENTHESIS", "DEFINE", "WHILE", "BR_OPEN", 
		"BR_CLOSE", "VAR", "ID", "WS"
	};

	private static final String[] _LITERAL_NAMES = {
		null, null, "'@T'", "'@F'", null, null, "'#'", "'^'", null, null, "'V'", 
		"'D'", "'P'", "';'", "'+'", "'-'", "'*'", "'/'", "','", "'<-'", "'?'", 
		"'$'", "'if'", "'else'", "'->'", "'end'", "'&'", "'|'", "'!'", null, null, 
		"'<='", "'>='", "'='", "'<>'", "'('", "')'", "'define'", "'while'", "'{'", 
		"'}'", "'''"
	};
	private static final String[] _SYMBOLIC_NAMES = {
		null, "STRING", "TRUE", "FALSE", "NUMBER", "BOOLEAN", "COMMENT", "UP", 
		"LEFT", "RIGHT", "DOWN", "DROP", "PICK", "SEMICOLON", "PLUS", "SUBTRACTION", 
		"MULTIPLICATION", "DIVISION", "COMMA", "ASSIGN", "QUESTION", "DOLLAR", 
		"IF", "ELSE", "ARROW_RIGHT", "END", "AND", "OR", "NOT", "MINOR", "MAYOR", 
		"MINOREQ", "MAYOREQ", "EQUAL", "NOTEQUAL", "PARENTHESIS", "RIGHTPARENTHESIS", 
		"DEFINE", "WHILE", "BR_OPEN", "BR_CLOSE", "VAR", "ID", "WS"
	};
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


	public BotLexer(CharStream input) {
		super(input);
		_interp = new LexerATNSimulator(this,_ATN,_decisionToDFA,_sharedContextCache);
	}

	@Override
	public String getGrammarFileName() { return "Bot.g4"; }

	@Override
	public String[] getRuleNames() { return ruleNames; }

	@Override
	public String getSerializedATN() { return _serializedATN; }

	@Override
	public String[] getModeNames() { return modeNames; }

	@Override
	public ATN getATN() { return _ATN; }

	public static final String _serializedATN =
		"\3\u0430\ud6d1\u8206\uad2d\u4417\uaef1\u8d80\uaadd\2-\u00e1\b\1\4\2\t"+
		"\2\4\3\t\3\4\4\t\4\4\5\t\5\4\6\t\6\4\7\t\7\4\b\t\b\4\t\t\t\4\n\t\n\4\13"+
		"\t\13\4\f\t\f\4\r\t\r\4\16\t\16\4\17\t\17\4\20\t\20\4\21\t\21\4\22\t\22"+
		"\4\23\t\23\4\24\t\24\4\25\t\25\4\26\t\26\4\27\t\27\4\30\t\30\4\31\t\31"+
		"\4\32\t\32\4\33\t\33\4\34\t\34\4\35\t\35\4\36\t\36\4\37\t\37\4 \t \4!"+
		"\t!\4\"\t\"\4#\t#\4$\t$\4%\t%\4&\t&\4\'\t\'\4(\t(\4)\t)\4*\t*\4+\t+\4"+
		",\t,\3\2\3\2\6\2\\\n\2\r\2\16\2]\3\2\3\2\3\3\3\3\3\3\3\4\3\4\3\4\3\5\6"+
		"\5i\n\5\r\5\16\5j\3\5\3\5\6\5o\n\5\r\5\16\5p\5\5s\n\5\3\6\3\6\3\6\3\7"+
		"\3\7\3\b\3\b\3\t\3\t\3\n\3\n\3\13\3\13\3\f\3\f\3\r\3\r\3\16\3\16\3\17"+
		"\3\17\3\20\3\20\3\21\3\21\3\22\3\22\3\23\3\23\3\24\3\24\3\24\3\25\3\25"+
		"\3\26\3\26\3\27\3\27\3\27\3\30\3\30\3\30\3\30\3\30\3\31\3\31\3\31\3\32"+
		"\3\32\3\32\3\32\3\33\3\33\3\34\3\34\3\35\3\35\3\36\3\36\3\37\3\37\3 \3"+
		" \3 \3!\3!\3!\3\"\3\"\3#\3#\3#\3$\3$\3%\3%\3&\3&\3&\3&\3&\3&\3&\3\'\3"+
		"\'\3\'\3\'\3\'\3\'\3(\3(\3)\3)\3*\3*\3+\3+\7+\u00d6\n+\f+\16+\u00d9\13"+
		"+\3,\6,\u00dc\n,\r,\16,\u00dd\3,\3,\2\2-\3\3\5\4\7\5\t\6\13\7\r\b\17\t"+
		"\21\n\23\13\25\f\27\r\31\16\33\17\35\20\37\21!\22#\23%\24\'\25)\26+\27"+
		"-\30/\31\61\32\63\33\65\34\67\359\36;\37= ?!A\"C#E$G%I&K\'M(O)Q*S+U,W"+
		"-\3\2\b\3\2$$\3\2\62;\5\2hhvv~~\3\2C|\4\2\62;C|\5\2\13\f\17\17\"\"\u00e6"+
		"\2\3\3\2\2\2\2\5\3\2\2\2\2\7\3\2\2\2\2\t\3\2\2\2\2\13\3\2\2\2\2\r\3\2"+
		"\2\2\2\17\3\2\2\2\2\21\3\2\2\2\2\23\3\2\2\2\2\25\3\2\2\2\2\27\3\2\2\2"+
		"\2\31\3\2\2\2\2\33\3\2\2\2\2\35\3\2\2\2\2\37\3\2\2\2\2!\3\2\2\2\2#\3\2"+
		"\2\2\2%\3\2\2\2\2\'\3\2\2\2\2)\3\2\2\2\2+\3\2\2\2\2-\3\2\2\2\2/\3\2\2"+
		"\2\2\61\3\2\2\2\2\63\3\2\2\2\2\65\3\2\2\2\2\67\3\2\2\2\29\3\2\2\2\2;\3"+
		"\2\2\2\2=\3\2\2\2\2?\3\2\2\2\2A\3\2\2\2\2C\3\2\2\2\2E\3\2\2\2\2G\3\2\2"+
		"\2\2I\3\2\2\2\2K\3\2\2\2\2M\3\2\2\2\2O\3\2\2\2\2Q\3\2\2\2\2S\3\2\2\2\2"+
		"U\3\2\2\2\2W\3\2\2\2\3Y\3\2\2\2\5a\3\2\2\2\7d\3\2\2\2\th\3\2\2\2\13t\3"+
		"\2\2\2\rw\3\2\2\2\17y\3\2\2\2\21{\3\2\2\2\23}\3\2\2\2\25\177\3\2\2\2\27"+
		"\u0081\3\2\2\2\31\u0083\3\2\2\2\33\u0085\3\2\2\2\35\u0087\3\2\2\2\37\u0089"+
		"\3\2\2\2!\u008b\3\2\2\2#\u008d\3\2\2\2%\u008f\3\2\2\2\'\u0091\3\2\2\2"+
		")\u0094\3\2\2\2+\u0096\3\2\2\2-\u0098\3\2\2\2/\u009b\3\2\2\2\61\u00a0"+
		"\3\2\2\2\63\u00a3\3\2\2\2\65\u00a7\3\2\2\2\67\u00a9\3\2\2\29\u00ab\3\2"+
		"\2\2;\u00ad\3\2\2\2=\u00af\3\2\2\2?\u00b1\3\2\2\2A\u00b4\3\2\2\2C\u00b7"+
		"\3\2\2\2E\u00b9\3\2\2\2G\u00bc\3\2\2\2I\u00be\3\2\2\2K\u00c0\3\2\2\2M"+
		"\u00c7\3\2\2\2O\u00cd\3\2\2\2Q\u00cf\3\2\2\2S\u00d1\3\2\2\2U\u00d3\3\2"+
		"\2\2W\u00db\3\2\2\2Y[\7$\2\2Z\\\n\2\2\2[Z\3\2\2\2\\]\3\2\2\2][\3\2\2\2"+
		"]^\3\2\2\2^_\3\2\2\2_`\7$\2\2`\4\3\2\2\2ab\7B\2\2bc\7V\2\2c\6\3\2\2\2"+
		"de\7B\2\2ef\7H\2\2f\b\3\2\2\2gi\t\3\2\2hg\3\2\2\2ij\3\2\2\2jh\3\2\2\2"+
		"jk\3\2\2\2kr\3\2\2\2ln\7\60\2\2mo\t\3\2\2nm\3\2\2\2op\3\2\2\2pn\3\2\2"+
		"\2pq\3\2\2\2qs\3\2\2\2rl\3\2\2\2rs\3\2\2\2s\n\3\2\2\2tu\7B\2\2uv\t\4\2"+
		"\2v\f\3\2\2\2wx\7%\2\2x\16\3\2\2\2yz\7`\2\2z\20\3\2\2\2{|\7>\2\2|\22\3"+
		"\2\2\2}~\7@\2\2~\24\3\2\2\2\177\u0080\7X\2\2\u0080\26\3\2\2\2\u0081\u0082"+
		"\7F\2\2\u0082\30\3\2\2\2\u0083\u0084\7R\2\2\u0084\32\3\2\2\2\u0085\u0086"+
		"\7=\2\2\u0086\34\3\2\2\2\u0087\u0088\7-\2\2\u0088\36\3\2\2\2\u0089\u008a"+
		"\7/\2\2\u008a \3\2\2\2\u008b\u008c\7,\2\2\u008c\"\3\2\2\2\u008d\u008e"+
		"\7\61\2\2\u008e$\3\2\2\2\u008f\u0090\7.\2\2\u0090&\3\2\2\2\u0091\u0092"+
		"\7>\2\2\u0092\u0093\7/\2\2\u0093(\3\2\2\2\u0094\u0095\7A\2\2\u0095*\3"+
		"\2\2\2\u0096\u0097\7&\2\2\u0097,\3\2\2\2\u0098\u0099\7k\2\2\u0099\u009a"+
		"\7h\2\2\u009a.\3\2\2\2\u009b\u009c\7g\2\2\u009c\u009d\7n\2\2\u009d\u009e"+
		"\7u\2\2\u009e\u009f\7g\2\2\u009f\60\3\2\2\2\u00a0\u00a1\7/\2\2\u00a1\u00a2"+
		"\7@\2\2\u00a2\62\3\2\2\2\u00a3\u00a4\7g\2\2\u00a4\u00a5\7p\2\2\u00a5\u00a6"+
		"\7f\2\2\u00a6\64\3\2\2\2\u00a7\u00a8\7(\2\2\u00a8\66\3\2\2\2\u00a9\u00aa"+
		"\7~\2\2\u00aa8\3\2\2\2\u00ab\u00ac\7#\2\2\u00ac:\3\2\2\2\u00ad\u00ae\7"+
		">\2\2\u00ae<\3\2\2\2\u00af\u00b0\7@\2\2\u00b0>\3\2\2\2\u00b1\u00b2\7>"+
		"\2\2\u00b2\u00b3\7?\2\2\u00b3@\3\2\2\2\u00b4\u00b5\7@\2\2\u00b5\u00b6"+
		"\7?\2\2\u00b6B\3\2\2\2\u00b7\u00b8\7?\2\2\u00b8D\3\2\2\2\u00b9\u00ba\7"+
		">\2\2\u00ba\u00bb\7@\2\2\u00bbF\3\2\2\2\u00bc\u00bd\7*\2\2\u00bdH\3\2"+
		"\2\2\u00be\u00bf\7+\2\2\u00bfJ\3\2\2\2\u00c0\u00c1\7f\2\2\u00c1\u00c2"+
		"\7g\2\2\u00c2\u00c3\7h\2\2\u00c3\u00c4\7k\2\2\u00c4\u00c5\7p\2\2\u00c5"+
		"\u00c6\7g\2\2\u00c6L\3\2\2\2\u00c7\u00c8\7y\2\2\u00c8\u00c9\7j\2\2\u00c9"+
		"\u00ca\7k\2\2\u00ca\u00cb\7n\2\2\u00cb\u00cc\7g\2\2\u00ccN\3\2\2\2\u00cd"+
		"\u00ce\7}\2\2\u00ceP\3\2\2\2\u00cf\u00d0\7\177\2\2\u00d0R\3\2\2\2\u00d1"+
		"\u00d2\7)\2\2\u00d2T\3\2\2\2\u00d3\u00d7\t\5\2\2\u00d4\u00d6\t\6\2\2\u00d5"+
		"\u00d4\3\2\2\2\u00d6\u00d9\3\2\2\2\u00d7\u00d5\3\2\2\2\u00d7\u00d8\3\2"+
		"\2\2\u00d8V\3\2\2\2\u00d9\u00d7\3\2\2\2\u00da\u00dc\t\7\2\2\u00db\u00da"+
		"\3\2\2\2\u00dc\u00dd\3\2\2\2\u00dd\u00db\3\2\2\2\u00dd\u00de\3\2\2\2\u00de"+
		"\u00df\3\2\2\2\u00df\u00e0\b,\2\2\u00e0X\3\2\2\2\t\2]jpr\u00d7\u00dd\3"+
		"\b\2\2";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}
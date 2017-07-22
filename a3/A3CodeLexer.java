// Generated from A3Code.g4 by ANTLR 4.5.3


import java.io.*;
import java.util.*;

import org.antlr.v4.runtime.Lexer;
import org.antlr.v4.runtime.CharStream;
import org.antlr.v4.runtime.Token;
import org.antlr.v4.runtime.TokenStream;
import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.atn.*;
import org.antlr.v4.runtime.dfa.DFA;
import org.antlr.v4.runtime.misc.*;

@SuppressWarnings({"all", "warnings", "unchecked", "unused", "cast"})
public class A3CodeLexer extends Lexer {
	static { RuntimeMetaData.checkVersion("4.5.3", RuntimeMetaData.VERSION); }

	protected static final DFA[] _decisionToDFA;
	protected static final PredictionContextCache _sharedContextCache =
		new PredictionContextCache();
	public static final int
		T__0=1, T__1=2, T__2=3, T__3=4, T__4=5, T__5=6, T__6=7, T__7=8, WhiteSpace=9, 
		Char=10, Str=11, Class=12, Program=13, Void=14, If=15, Else=16, For=17, 
		Ret=18, Brk=19, Cnt=20, Callout=21, DecNum=22, HexNum=23, BoolLit=24, 
		Type=25, Ident=26, RelOp=27, AssignOp=28, MulDiv=29, AddOp=30, SubOp=31, 
		AndOp=32, OrOp=33;
	public static String[] modeNames = {
		"DEFAULT_MODE"
	};

	public static final String[] ruleNames = {
		"T__0", "T__1", "T__2", "T__3", "T__4", "T__5", "T__6", "T__7", "Delim", 
		"Letter", "Digit", "HexDigit", "Alpha", "AlphaNum", "WhiteSpace", "Char", 
		"Str", "Class", "Program", "Void", "If", "Else", "For", "Ret", "Brk", 
		"Cnt", "Callout", "DecNum", "HexNum", "BoolLit", "Type", "Ident", "RelOp", 
		"AssignOp", "MulDiv", "AddOp", "SubOp", "AndOp", "OrOp"
	};

	private static final String[] _LITERAL_NAMES = {
		null, "'{'", "'}'", "';'", "','", "'('", "')'", "'='", "'!'", null, null, 
		null, "'class'", "'Program'", "'void'", "'if'", "'else'", "'for'", "'return'", 
		"'break'", "'continue'", "'callout'", null, null, null, null, null, null, 
		null, null, "'+'", "'-'", "'&&'", "'||'"
	};
	private static final String[] _SYMBOLIC_NAMES = {
		null, null, null, null, null, null, null, null, null, "WhiteSpace", "Char", 
		"Str", "Class", "Program", "Void", "If", "Else", "For", "Ret", "Brk", 
		"Cnt", "Callout", "DecNum", "HexNum", "BoolLit", "Type", "Ident", "RelOp", 
		"AssignOp", "MulDiv", "AddOp", "SubOp", "AndOp", "OrOp"
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


	public A3CodeLexer(CharStream input) {
		super(input);
		_interp = new LexerATNSimulator(this,_ATN,_decisionToDFA,_sharedContextCache);
	}

	@Override
	public String getGrammarFileName() { return "A3Code.g4"; }

	@Override
	public String[] getRuleNames() { return ruleNames; }

	@Override
	public String getSerializedATN() { return _serializedATN; }

	@Override
	public String[] getModeNames() { return modeNames; }

	@Override
	public ATN getATN() { return _ATN; }

	public static final String _serializedATN =
		"\3\u0430\ud6d1\u8206\uad2d\u4417\uaef1\u8d80\uaadd\2#\u0114\b\1\4\2\t"+
		"\2\4\3\t\3\4\4\t\4\4\5\t\5\4\6\t\6\4\7\t\7\4\b\t\b\4\t\t\t\4\n\t\n\4\13"+
		"\t\13\4\f\t\f\4\r\t\r\4\16\t\16\4\17\t\17\4\20\t\20\4\21\t\21\4\22\t\22"+
		"\4\23\t\23\4\24\t\24\4\25\t\25\4\26\t\26\4\27\t\27\4\30\t\30\4\31\t\31"+
		"\4\32\t\32\4\33\t\33\4\34\t\34\4\35\t\35\4\36\t\36\4\37\t\37\4 \t \4!"+
		"\t!\4\"\t\"\4#\t#\4$\t$\4%\t%\4&\t&\4\'\t\'\4(\t(\3\2\3\2\3\3\3\3\3\4"+
		"\3\4\3\5\3\5\3\6\3\6\3\7\3\7\3\b\3\b\3\t\3\t\3\n\3\n\3\13\3\13\3\f\3\f"+
		"\3\r\3\r\5\rj\n\r\3\16\3\16\5\16n\n\16\3\17\3\17\5\17r\n\17\3\20\6\20"+
		"u\n\20\r\20\16\20v\3\20\3\20\3\21\3\21\3\21\3\21\3\21\3\21\3\21\3\21\5"+
		"\21\u0083\n\21\3\22\3\22\3\22\3\22\7\22\u0089\n\22\f\22\16\22\u008c\13"+
		"\22\3\22\3\22\3\23\3\23\3\23\3\23\3\23\3\23\3\24\3\24\3\24\3\24\3\24\3"+
		"\24\3\24\3\24\3\25\3\25\3\25\3\25\3\25\3\26\3\26\3\26\3\27\3\27\3\27\3"+
		"\27\3\27\3\30\3\30\3\30\3\30\3\31\3\31\3\31\3\31\3\31\3\31\3\31\3\32\3"+
		"\32\3\32\3\32\3\32\3\32\3\33\3\33\3\33\3\33\3\33\3\33\3\33\3\33\3\33\3"+
		"\34\3\34\3\34\3\34\3\34\3\34\3\34\3\34\3\35\6\35\u00ce\n\35\r\35\16\35"+
		"\u00cf\3\36\3\36\3\36\3\36\6\36\u00d6\n\36\r\36\16\36\u00d7\3\37\3\37"+
		"\3\37\3\37\3\37\3\37\3\37\3\37\3\37\5\37\u00e3\n\37\3 \3 \3 \3 \3 \3 "+
		"\3 \3 \3 \3 \5 \u00ef\n \3!\3!\7!\u00f3\n!\f!\16!\u00f6\13!\3\"\3\"\3"+
		"\"\3\"\3\"\3\"\3\"\3\"\3\"\5\"\u0101\n\"\3#\3#\3#\3#\5#\u0107\n#\3$\3"+
		"$\3%\3%\3&\3&\3\'\3\'\3\'\3(\3(\3(\2\2)\3\3\5\4\7\5\t\6\13\7\r\b\17\t"+
		"\21\n\23\2\25\2\27\2\31\2\33\2\35\2\37\13!\f#\r%\16\'\17)\20+\21-\22/"+
		"\23\61\24\63\25\65\26\67\279\30;\31=\32?\33A\34C\35E\36G\37I K!M\"O#\3"+
		"\2\n\4\2\13\f\"\"\4\2C\\c|\3\2\62;\4\2CHch\3\2^^\4\2$$^^\4\2>>@@\5\2\'"+
		"\',,\61\61\u011e\2\3\3\2\2\2\2\5\3\2\2\2\2\7\3\2\2\2\2\t\3\2\2\2\2\13"+
		"\3\2\2\2\2\r\3\2\2\2\2\17\3\2\2\2\2\21\3\2\2\2\2\37\3\2\2\2\2!\3\2\2\2"+
		"\2#\3\2\2\2\2%\3\2\2\2\2\'\3\2\2\2\2)\3\2\2\2\2+\3\2\2\2\2-\3\2\2\2\2"+
		"/\3\2\2\2\2\61\3\2\2\2\2\63\3\2\2\2\2\65\3\2\2\2\2\67\3\2\2\2\29\3\2\2"+
		"\2\2;\3\2\2\2\2=\3\2\2\2\2?\3\2\2\2\2A\3\2\2\2\2C\3\2\2\2\2E\3\2\2\2\2"+
		"G\3\2\2\2\2I\3\2\2\2\2K\3\2\2\2\2M\3\2\2\2\2O\3\2\2\2\3Q\3\2\2\2\5S\3"+
		"\2\2\2\7U\3\2\2\2\tW\3\2\2\2\13Y\3\2\2\2\r[\3\2\2\2\17]\3\2\2\2\21_\3"+
		"\2\2\2\23a\3\2\2\2\25c\3\2\2\2\27e\3\2\2\2\31i\3\2\2\2\33m\3\2\2\2\35"+
		"q\3\2\2\2\37t\3\2\2\2!\u0082\3\2\2\2#\u0084\3\2\2\2%\u008f\3\2\2\2\'\u0095"+
		"\3\2\2\2)\u009d\3\2\2\2+\u00a2\3\2\2\2-\u00a5\3\2\2\2/\u00aa\3\2\2\2\61"+
		"\u00ae\3\2\2\2\63\u00b5\3\2\2\2\65\u00bb\3\2\2\2\67\u00c4\3\2\2\29\u00cd"+
		"\3\2\2\2;\u00d1\3\2\2\2=\u00e2\3\2\2\2?\u00ee\3\2\2\2A\u00f0\3\2\2\2C"+
		"\u0100\3\2\2\2E\u0106\3\2\2\2G\u0108\3\2\2\2I\u010a\3\2\2\2K\u010c\3\2"+
		"\2\2M\u010e\3\2\2\2O\u0111\3\2\2\2QR\7}\2\2R\4\3\2\2\2ST\7\177\2\2T\6"+
		"\3\2\2\2UV\7=\2\2V\b\3\2\2\2WX\7.\2\2X\n\3\2\2\2YZ\7*\2\2Z\f\3\2\2\2["+
		"\\\7+\2\2\\\16\3\2\2\2]^\7?\2\2^\20\3\2\2\2_`\7#\2\2`\22\3\2\2\2ab\t\2"+
		"\2\2b\24\3\2\2\2cd\t\3\2\2d\26\3\2\2\2ef\t\4\2\2f\30\3\2\2\2gj\5\27\f"+
		"\2hj\t\5\2\2ig\3\2\2\2ih\3\2\2\2j\32\3\2\2\2kn\5\25\13\2ln\7a\2\2mk\3"+
		"\2\2\2ml\3\2\2\2n\34\3\2\2\2or\5\33\16\2pr\5\27\f\2qo\3\2\2\2qp\3\2\2"+
		"\2r\36\3\2\2\2su\5\23\n\2ts\3\2\2\2uv\3\2\2\2vt\3\2\2\2vw\3\2\2\2wx\3"+
		"\2\2\2xy\b\20\2\2y \3\2\2\2z{\7)\2\2{|\n\6\2\2|\u0083\7)\2\2}~\7)\2\2"+
		"~\177\7^\2\2\177\u0080\3\2\2\2\u0080\u0081\13\2\2\2\u0081\u0083\7)\2\2"+
		"\u0082z\3\2\2\2\u0082}\3\2\2\2\u0083\"\3\2\2\2\u0084\u008a\7$\2\2\u0085"+
		"\u0089\n\7\2\2\u0086\u0087\7^\2\2\u0087\u0089\13\2\2\2\u0088\u0085\3\2"+
		"\2\2\u0088\u0086\3\2\2\2\u0089\u008c\3\2\2\2\u008a\u0088\3\2\2\2\u008a"+
		"\u008b\3\2\2\2\u008b\u008d\3\2\2\2\u008c\u008a\3\2\2\2\u008d\u008e\7$"+
		"\2\2\u008e$\3\2\2\2\u008f\u0090\7e\2\2\u0090\u0091\7n\2\2\u0091\u0092"+
		"\7c\2\2\u0092\u0093\7u\2\2\u0093\u0094\7u\2\2\u0094&\3\2\2\2\u0095\u0096"+
		"\7R\2\2\u0096\u0097\7t\2\2\u0097\u0098\7q\2\2\u0098\u0099\7i\2\2\u0099"+
		"\u009a\7t\2\2\u009a\u009b\7c\2\2\u009b\u009c\7o\2\2\u009c(\3\2\2\2\u009d"+
		"\u009e\7x\2\2\u009e\u009f\7q\2\2\u009f\u00a0\7k\2\2\u00a0\u00a1\7f\2\2"+
		"\u00a1*\3\2\2\2\u00a2\u00a3\7k\2\2\u00a3\u00a4\7h\2\2\u00a4,\3\2\2\2\u00a5"+
		"\u00a6\7g\2\2\u00a6\u00a7\7n\2\2\u00a7\u00a8\7u\2\2\u00a8\u00a9\7g\2\2"+
		"\u00a9.\3\2\2\2\u00aa\u00ab\7h\2\2\u00ab\u00ac\7q\2\2\u00ac\u00ad\7t\2"+
		"\2\u00ad\60\3\2\2\2\u00ae\u00af\7t\2\2\u00af\u00b0\7g\2\2\u00b0\u00b1"+
		"\7v\2\2\u00b1\u00b2\7w\2\2\u00b2\u00b3\7t\2\2\u00b3\u00b4\7p\2\2\u00b4"+
		"\62\3\2\2\2\u00b5\u00b6\7d\2\2\u00b6\u00b7\7t\2\2\u00b7\u00b8\7g\2\2\u00b8"+
		"\u00b9\7c\2\2\u00b9\u00ba\7m\2\2\u00ba\64\3\2\2\2\u00bb\u00bc\7e\2\2\u00bc"+
		"\u00bd\7q\2\2\u00bd\u00be\7p\2\2\u00be\u00bf\7v\2\2\u00bf\u00c0\7k\2\2"+
		"\u00c0\u00c1\7p\2\2\u00c1\u00c2\7w\2\2\u00c2\u00c3\7g\2\2\u00c3\66\3\2"+
		"\2\2\u00c4\u00c5\7e\2\2\u00c5\u00c6\7c\2\2\u00c6\u00c7\7n\2\2\u00c7\u00c8"+
		"\7n\2\2\u00c8\u00c9\7q\2\2\u00c9\u00ca\7w\2\2\u00ca\u00cb\7v\2\2\u00cb"+
		"8\3\2\2\2\u00cc\u00ce\5\27\f\2\u00cd\u00cc\3\2\2\2\u00ce\u00cf\3\2\2\2"+
		"\u00cf\u00cd\3\2\2\2\u00cf\u00d0\3\2\2\2\u00d0:\3\2\2\2\u00d1\u00d2\7"+
		"\62\2\2\u00d2\u00d3\7z\2\2\u00d3\u00d5\3\2\2\2\u00d4\u00d6\5\31\r\2\u00d5"+
		"\u00d4\3\2\2\2\u00d6\u00d7\3\2\2\2\u00d7\u00d5\3\2\2\2\u00d7\u00d8\3\2"+
		"\2\2\u00d8<\3\2\2\2\u00d9\u00da\7v\2\2\u00da\u00db\7t\2\2\u00db\u00dc"+
		"\7w\2\2\u00dc\u00e3\7g\2\2\u00dd\u00de\7h\2\2\u00de\u00df\7c\2\2\u00df"+
		"\u00e0\7n\2\2\u00e0\u00e1\7u\2\2\u00e1\u00e3\7g\2\2\u00e2\u00d9\3\2\2"+
		"\2\u00e2\u00dd\3\2\2\2\u00e3>\3\2\2\2\u00e4\u00e5\7k\2\2\u00e5\u00e6\7"+
		"p\2\2\u00e6\u00ef\7v\2\2\u00e7\u00e8\7d\2\2\u00e8\u00e9\7q\2\2\u00e9\u00ea"+
		"\7q\2\2\u00ea\u00eb\7n\2\2\u00eb\u00ec\7g\2\2\u00ec\u00ed\7c\2\2\u00ed"+
		"\u00ef\7p\2\2\u00ee\u00e4\3\2\2\2\u00ee\u00e7\3\2\2\2\u00ef@\3\2\2\2\u00f0"+
		"\u00f4\5\33\16\2\u00f1\u00f3\5\35\17\2\u00f2\u00f1\3\2\2\2\u00f3\u00f6"+
		"\3\2\2\2\u00f4\u00f2\3\2\2\2\u00f4\u00f5\3\2\2\2\u00f5B\3\2\2\2\u00f6"+
		"\u00f4\3\2\2\2\u00f7\u00f8\7>\2\2\u00f8\u0101\7?\2\2\u00f9\u00fa\7@\2"+
		"\2\u00fa\u0101\7?\2\2\u00fb\u0101\t\b\2\2\u00fc\u00fd\7?\2\2\u00fd\u0101"+
		"\7?\2\2\u00fe\u00ff\7#\2\2\u00ff\u0101\7?\2\2\u0100\u00f7\3\2\2\2\u0100"+
		"\u00f9\3\2\2\2\u0100\u00fb\3\2\2\2\u0100\u00fc\3\2\2\2\u0100\u00fe\3\2"+
		"\2\2\u0101D\3\2\2\2\u0102\u0103\7-\2\2\u0103\u0107\7?\2\2\u0104\u0105"+
		"\7/\2\2\u0105\u0107\7?\2\2\u0106\u0102\3\2\2\2\u0106\u0104\3\2\2\2\u0107"+
		"F\3\2\2\2\u0108\u0109\t\t\2\2\u0109H\3\2\2\2\u010a\u010b\7-\2\2\u010b"+
		"J\3\2\2\2\u010c\u010d\7/\2\2\u010dL\3\2\2\2\u010e\u010f\7(\2\2\u010f\u0110"+
		"\7(\2\2\u0110N\3\2\2\2\u0111\u0112\7~\2\2\u0112\u0113\7~\2\2\u0113P\3"+
		"\2\2\2\21\2imqv\u0082\u0088\u008a\u00cf\u00d7\u00e2\u00ee\u00f4\u0100"+
		"\u0106\3\b\2\2";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}
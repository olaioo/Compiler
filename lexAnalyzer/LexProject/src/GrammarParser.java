// Generated from Grammar.g4 by ANTLR 4.5
import org.antlr.v4.runtime.atn.*;
import org.antlr.v4.runtime.dfa.DFA;
import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.misc.*;
import org.antlr.v4.runtime.tree.*;
import java.util.List;
import java.util.Iterator;
import java.util.ArrayList;

@SuppressWarnings({"all", "warnings", "unchecked", "unused", "cast"})
public class GrammarParser extends Parser {
	static { RuntimeMetaData.checkVersion("4.5", RuntimeMetaData.VERSION); }

	protected static final DFA[] _decisionToDFA;
	protected static final PredictionContextCache _sharedContextCache =
		new PredictionContextCache();
	public static final int
		T__0=1, T__1=2, T__2=3, T__3=4, T__4=5, T__5=6, T__6=7, T__7=8, T__8=9, 
		T__9=10, T__10=11, T__11=12, T__12=13, T__13=14, T__14=15, T__15=16, T__16=17, 
		T__17=18, T__18=19, T__19=20, T__20=21, T__21=22, T__22=23, T__23=24, 
		T__24=25, T__25=26, INT=27, VOID=28, MAIN=29, PRINTF=30, FOR=31, WHILE=32, 
		IF=33, ELSE=34, FLOAT=35, DOUBLE=36, CHAR=37, BOOL=38, Identifier=39, 
		Numberid=40, Word=41, WS=42;
	public static final int
		RULE_source = 0, RULE_statement = 1, RULE_declaration = 2, RULE_declarationPart = 3, 
		RULE_attribution = 4, RULE_attributionPart = 5, RULE_print = 6, RULE_loopFor = 7, 
		RULE_loopForPart = 8, RULE_loopForPart2 = 9, RULE_loopForPart3 = 10, RULE_loopWhile = 11, 
		RULE_conditional = 12, RULE_conditionalElse = 13, RULE_lexpression = 14, 
		RULE_lexpressionPart = 15, RULE_type = 16, RULE_op = 17, RULE_lop = 18, 
		RULE_lop2 = 19, RULE_variable = 20, RULE_number = 21;
	public static final String[] ruleNames = {
		"source", "statement", "declaration", "declarationPart", "attribution", 
		"attributionPart", "print", "loopFor", "loopForPart", "loopForPart2", 
		"loopForPart3", "loopWhile", "conditional", "conditionalElse", "lexpression", 
		"lexpressionPart", "type", "op", "lop", "lop2", "variable", "number"
	};

	private static final String[] _LITERAL_NAMES = {
		null, "'('", "')'", "'{'", "'}'", "';'", "','", "'='", "'\"'", "'++'", 
		"'--'", "'+='", "'*='", "'/='", "'+'", "'-'", "'*'", "'/'", "'%'", "'<'", 
		"'>'", "'>='", "'<='", "'=='", "'!='", "'&&'", "'||'", "'int'", "'void'", 
		"'main'", "'printf'", "'for'", "'while'", "'if'", "'else'", "'float'", 
		"'double'", "'char'", "'bool'"
	};
	private static final String[] _SYMBOLIC_NAMES = {
		null, null, null, null, null, null, null, null, null, null, null, null, 
		null, null, null, null, null, null, null, null, null, null, null, null, 
		null, null, null, "INT", "VOID", "MAIN", "PRINTF", "FOR", "WHILE", "IF", 
		"ELSE", "FLOAT", "DOUBLE", "CHAR", "BOOL", "Identifier", "Numberid", "Word", 
		"WS"
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

	@Override
	public String getGrammarFileName() { return "Grammar.g4"; }

	@Override
	public String[] getRuleNames() { return ruleNames; }

	@Override
	public String getSerializedATN() { return _serializedATN; }

	@Override
	public ATN getATN() { return _ATN; }

	public GrammarParser(TokenStream input) {
		super(input);
		_interp = new ParserATNSimulator(this,_ATN,_decisionToDFA,_sharedContextCache);
	}
	public static class SourceContext extends ParserRuleContext {
		public TerminalNode MAIN() { return getToken(GrammarParser.MAIN, 0); }
		public TerminalNode INT() { return getToken(GrammarParser.INT, 0); }
		public TerminalNode VOID() { return getToken(GrammarParser.VOID, 0); }
		public StatementContext statement() {
			return getRuleContext(StatementContext.class,0);
		}
		public SourceContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_source; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof GrammarListener ) ((GrammarListener)listener).enterSource(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof GrammarListener ) ((GrammarListener)listener).exitSource(this);
		}
	}

	public final SourceContext source() throws RecognitionException {
		SourceContext _localctx = new SourceContext(_ctx, getState());
		enterRule(_localctx, 0, RULE_source);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(44);
			_la = _input.LA(1);
			if ( !(_la==INT || _la==VOID) ) {
			_errHandler.recoverInline(this);
			} else {
				consume();
			}
			setState(45);
			match(MAIN);
			setState(46);
			match(T__0);
			setState(47);
			match(T__1);
			setState(48);
			match(T__2);
			setState(50);
			_la = _input.LA(1);
			if ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << INT) | (1L << PRINTF) | (1L << FOR) | (1L << WHILE) | (1L << IF) | (1L << FLOAT) | (1L << DOUBLE) | (1L << CHAR) | (1L << BOOL) | (1L << Identifier))) != 0)) {
				{
				setState(49);
				statement();
				}
			}

			setState(52);
			match(T__3);
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

	public static class StatementContext extends ParserRuleContext {
		public DeclarationContext declaration() {
			return getRuleContext(DeclarationContext.class,0);
		}
		public AttributionContext attribution() {
			return getRuleContext(AttributionContext.class,0);
		}
		public PrintContext print() {
			return getRuleContext(PrintContext.class,0);
		}
		public ConditionalContext conditional() {
			return getRuleContext(ConditionalContext.class,0);
		}
		public LoopForContext loopFor() {
			return getRuleContext(LoopForContext.class,0);
		}
		public LoopWhileContext loopWhile() {
			return getRuleContext(LoopWhileContext.class,0);
		}
		public StatementContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_statement; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof GrammarListener ) ((GrammarListener)listener).enterStatement(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof GrammarListener ) ((GrammarListener)listener).exitStatement(this);
		}
	}

	public final StatementContext statement() throws RecognitionException {
		StatementContext _localctx = new StatementContext(_ctx, getState());
		enterRule(_localctx, 2, RULE_statement);
		try {
			setState(60);
			switch (_input.LA(1)) {
			case INT:
			case FLOAT:
			case DOUBLE:
			case CHAR:
			case BOOL:
				enterOuterAlt(_localctx, 1);
				{
				setState(54);
				declaration();
				}
				break;
			case Identifier:
				enterOuterAlt(_localctx, 2);
				{
				setState(55);
				attribution();
				}
				break;
			case PRINTF:
				enterOuterAlt(_localctx, 3);
				{
				setState(56);
				print();
				}
				break;
			case IF:
				enterOuterAlt(_localctx, 4);
				{
				setState(57);
				conditional();
				}
				break;
			case FOR:
				enterOuterAlt(_localctx, 5);
				{
				setState(58);
				loopFor();
				}
				break;
			case WHILE:
				enterOuterAlt(_localctx, 6);
				{
				setState(59);
				loopWhile();
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

	public static class DeclarationContext extends ParserRuleContext {
		public TypeContext type() {
			return getRuleContext(TypeContext.class,0);
		}
		public DeclarationPartContext declarationPart() {
			return getRuleContext(DeclarationPartContext.class,0);
		}
		public DeclarationContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_declaration; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof GrammarListener ) ((GrammarListener)listener).enterDeclaration(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof GrammarListener ) ((GrammarListener)listener).exitDeclaration(this);
		}
	}

	public final DeclarationContext declaration() throws RecognitionException {
		DeclarationContext _localctx = new DeclarationContext(_ctx, getState());
		enterRule(_localctx, 4, RULE_declaration);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(62);
			type();
			setState(63);
			declarationPart();
			setState(64);
			match(T__4);
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

	public static class DeclarationPartContext extends ParserRuleContext {
		public List<VariableContext> variable() {
			return getRuleContexts(VariableContext.class);
		}
		public VariableContext variable(int i) {
			return getRuleContext(VariableContext.class,i);
		}
		public DeclarationPartContext declarationPart() {
			return getRuleContext(DeclarationPartContext.class,0);
		}
		public NumberContext number() {
			return getRuleContext(NumberContext.class,0);
		}
		public DeclarationPartContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_declarationPart; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof GrammarListener ) ((GrammarListener)listener).enterDeclarationPart(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof GrammarListener ) ((GrammarListener)listener).exitDeclarationPart(this);
		}
	}

	public final DeclarationPartContext declarationPart() throws RecognitionException {
		DeclarationPartContext _localctx = new DeclarationPartContext(_ctx, getState());
		enterRule(_localctx, 6, RULE_declarationPart);
		int _la;
		try {
			setState(89);
			switch ( getInterpreter().adaptivePredict(_input,7,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(66);
				variable();
				setState(73);
				_la = _input.LA(1);
				if (_la==T__5) {
					{
					setState(68); 
					_errHandler.sync(this);
					_la = _input.LA(1);
					do {
						{
						{
						setState(67);
						match(T__5);
						}
						}
						setState(70); 
						_errHandler.sync(this);
						_la = _input.LA(1);
					} while ( _la==T__5 );
					setState(72);
					declarationPart();
					}
				}

				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(75);
				variable();
				setState(76);
				match(T__6);
				setState(79);
				switch (_input.LA(1)) {
				case Numberid:
					{
					setState(77);
					number();
					}
					break;
				case Identifier:
					{
					setState(78);
					variable();
					}
					break;
				default:
					throw new NoViableAltException(this);
				}
				setState(87);
				_la = _input.LA(1);
				if (_la==T__5) {
					{
					setState(82); 
					_errHandler.sync(this);
					_la = _input.LA(1);
					do {
						{
						{
						setState(81);
						match(T__5);
						}
						}
						setState(84); 
						_errHandler.sync(this);
						_la = _input.LA(1);
					} while ( _la==T__5 );
					setState(86);
					declarationPart();
					}
				}

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

	public static class AttributionContext extends ParserRuleContext {
		public VariableContext variable() {
			return getRuleContext(VariableContext.class,0);
		}
		public AttributionPartContext attributionPart() {
			return getRuleContext(AttributionPartContext.class,0);
		}
		public AttributionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_attribution; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof GrammarListener ) ((GrammarListener)listener).enterAttribution(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof GrammarListener ) ((GrammarListener)listener).exitAttribution(this);
		}
	}

	public final AttributionContext attribution() throws RecognitionException {
		AttributionContext _localctx = new AttributionContext(_ctx, getState());
		enterRule(_localctx, 8, RULE_attribution);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(91);
			variable();
			setState(92);
			match(T__6);
			setState(93);
			attributionPart();
			setState(94);
			match(T__4);
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

	public static class AttributionPartContext extends ParserRuleContext {
		public List<NumberContext> number() {
			return getRuleContexts(NumberContext.class);
		}
		public NumberContext number(int i) {
			return getRuleContext(NumberContext.class,i);
		}
		public AttributionPartContext attributionPart() {
			return getRuleContext(AttributionPartContext.class,0);
		}
		public List<VariableContext> variable() {
			return getRuleContexts(VariableContext.class);
		}
		public VariableContext variable(int i) {
			return getRuleContext(VariableContext.class,i);
		}
		public List<OpContext> op() {
			return getRuleContexts(OpContext.class);
		}
		public OpContext op(int i) {
			return getRuleContext(OpContext.class,i);
		}
		public AttributionPartContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_attributionPart; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof GrammarListener ) ((GrammarListener)listener).enterAttributionPart(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof GrammarListener ) ((GrammarListener)listener).exitAttributionPart(this);
		}
	}

	public final AttributionPartContext attributionPart() throws RecognitionException {
		AttributionPartContext _localctx = new AttributionPartContext(_ctx, getState());
		enterRule(_localctx, 10, RULE_attributionPart);
		int _la;
		try {
			int _alt;
			setState(142);
			switch (_input.LA(1)) {
			case Numberid:
				enterOuterAlt(_localctx, 1);
				{
				setState(96);
				number();
				setState(108);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,10,_ctx);
				while ( _alt!=1 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
					if ( _alt==1+1 ) {
						{
						{
						setState(98); 
						_errHandler.sync(this);
						_la = _input.LA(1);
						do {
							{
							{
							setState(97);
							op();
							}
							}
							setState(100); 
							_errHandler.sync(this);
							_la = _input.LA(1);
						} while ( (((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__13) | (1L << T__14) | (1L << T__15) | (1L << T__16) | (1L << T__17))) != 0) );
						setState(104);
						switch (_input.LA(1)) {
						case Identifier:
							{
							setState(102);
							variable();
							}
							break;
						case Numberid:
							{
							setState(103);
							number();
							}
							break;
						default:
							throw new NoViableAltException(this);
						}
						}
						} 
					}
					setState(110);
					_errHandler.sync(this);
					_alt = getInterpreter().adaptivePredict(_input,10,_ctx);
				}
				setState(117);
				_la = _input.LA(1);
				if (_la==T__5) {
					{
					setState(112); 
					_errHandler.sync(this);
					_la = _input.LA(1);
					do {
						{
						{
						setState(111);
						match(T__5);
						}
						}
						setState(114); 
						_errHandler.sync(this);
						_la = _input.LA(1);
					} while ( _la==T__5 );
					setState(116);
					attributionPart();
					}
				}

				}
				break;
			case Identifier:
				enterOuterAlt(_localctx, 2);
				{
				setState(119);
				variable();
				setState(131);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,15,_ctx);
				while ( _alt!=1 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
					if ( _alt==1+1 ) {
						{
						{
						setState(121); 
						_errHandler.sync(this);
						_la = _input.LA(1);
						do {
							{
							{
							setState(120);
							op();
							}
							}
							setState(123); 
							_errHandler.sync(this);
							_la = _input.LA(1);
						} while ( (((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__13) | (1L << T__14) | (1L << T__15) | (1L << T__16) | (1L << T__17))) != 0) );
						setState(127);
						switch (_input.LA(1)) {
						case Identifier:
							{
							setState(125);
							variable();
							}
							break;
						case Numberid:
							{
							setState(126);
							number();
							}
							break;
						default:
							throw new NoViableAltException(this);
						}
						}
						} 
					}
					setState(133);
					_errHandler.sync(this);
					_alt = getInterpreter().adaptivePredict(_input,15,_ctx);
				}
				setState(140);
				_la = _input.LA(1);
				if (_la==T__5) {
					{
					setState(135); 
					_errHandler.sync(this);
					_la = _input.LA(1);
					do {
						{
						{
						setState(134);
						match(T__5);
						}
						}
						setState(137); 
						_errHandler.sync(this);
						_la = _input.LA(1);
					} while ( _la==T__5 );
					setState(139);
					attributionPart();
					}
				}

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

	public static class PrintContext extends ParserRuleContext {
		public TerminalNode PRINTF() { return getToken(GrammarParser.PRINTF, 0); }
		public TerminalNode Word() { return getToken(GrammarParser.Word, 0); }
		public List<VariableContext> variable() {
			return getRuleContexts(VariableContext.class);
		}
		public VariableContext variable(int i) {
			return getRuleContext(VariableContext.class,i);
		}
		public PrintContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_print; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof GrammarListener ) ((GrammarListener)listener).enterPrint(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof GrammarListener ) ((GrammarListener)listener).exitPrint(this);
		}
	}

	public final PrintContext print() throws RecognitionException {
		PrintContext _localctx = new PrintContext(_ctx, getState());
		enterRule(_localctx, 12, RULE_print);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(144);
			match(PRINTF);
			setState(145);
			match(T__0);
			setState(146);
			match(T__7);
			setState(148);
			_la = _input.LA(1);
			if (_la==Word) {
				{
				setState(147);
				match(Word);
				}
			}

			setState(150);
			match(T__7);
			setState(155);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==T__5) {
				{
				{
				setState(151);
				match(T__5);
				setState(152);
				variable();
				}
				}
				setState(157);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(158);
			match(T__1);
			setState(159);
			match(T__4);
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

	public static class LoopForContext extends ParserRuleContext {
		public TerminalNode FOR() { return getToken(GrammarParser.FOR, 0); }
		public LoopForPartContext loopForPart() {
			return getRuleContext(LoopForPartContext.class,0);
		}
		public LoopForPart2Context loopForPart2() {
			return getRuleContext(LoopForPart2Context.class,0);
		}
		public LoopForPart3Context loopForPart3() {
			return getRuleContext(LoopForPart3Context.class,0);
		}
		public StatementContext statement() {
			return getRuleContext(StatementContext.class,0);
		}
		public LoopForContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_loopFor; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof GrammarListener ) ((GrammarListener)listener).enterLoopFor(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof GrammarListener ) ((GrammarListener)listener).exitLoopFor(this);
		}
	}

	public final LoopForContext loopFor() throws RecognitionException {
		LoopForContext _localctx = new LoopForContext(_ctx, getState());
		enterRule(_localctx, 14, RULE_loopFor);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(161);
			match(FOR);
			setState(162);
			match(T__0);
			setState(163);
			loopForPart();
			setState(164);
			loopForPart2();
			setState(165);
			match(T__4);
			setState(166);
			loopForPart3();
			setState(167);
			match(T__1);
			setState(168);
			match(T__2);
			setState(170);
			_la = _input.LA(1);
			if ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << INT) | (1L << PRINTF) | (1L << FOR) | (1L << WHILE) | (1L << IF) | (1L << FLOAT) | (1L << DOUBLE) | (1L << CHAR) | (1L << BOOL) | (1L << Identifier))) != 0)) {
				{
				setState(169);
				statement();
				}
			}

			setState(172);
			match(T__3);
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

	public static class LoopForPartContext extends ParserRuleContext {
		public DeclarationContext declaration() {
			return getRuleContext(DeclarationContext.class,0);
		}
		public AttributionContext attribution() {
			return getRuleContext(AttributionContext.class,0);
		}
		public LoopForPartContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_loopForPart; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof GrammarListener ) ((GrammarListener)listener).enterLoopForPart(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof GrammarListener ) ((GrammarListener)listener).exitLoopForPart(this);
		}
	}

	public final LoopForPartContext loopForPart() throws RecognitionException {
		LoopForPartContext _localctx = new LoopForPartContext(_ctx, getState());
		enterRule(_localctx, 16, RULE_loopForPart);
		try {
			setState(176);
			switch (_input.LA(1)) {
			case INT:
			case FLOAT:
			case DOUBLE:
			case CHAR:
			case BOOL:
				enterOuterAlt(_localctx, 1);
				{
				setState(174);
				declaration();
				}
				break;
			case Identifier:
				enterOuterAlt(_localctx, 2);
				{
				setState(175);
				attribution();
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

	public static class LoopForPart2Context extends ParserRuleContext {
		public LexpressionContext lexpression() {
			return getRuleContext(LexpressionContext.class,0);
		}
		public LoopForPart2Context(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_loopForPart2; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof GrammarListener ) ((GrammarListener)listener).enterLoopForPart2(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof GrammarListener ) ((GrammarListener)listener).exitLoopForPart2(this);
		}
	}

	public final LoopForPart2Context loopForPart2() throws RecognitionException {
		LoopForPart2Context _localctx = new LoopForPart2Context(_ctx, getState());
		enterRule(_localctx, 18, RULE_loopForPart2);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(178);
			lexpression(0);
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

	public static class LoopForPart3Context extends ParserRuleContext {
		public List<VariableContext> variable() {
			return getRuleContexts(VariableContext.class);
		}
		public VariableContext variable(int i) {
			return getRuleContext(VariableContext.class,i);
		}
		public NumberContext number() {
			return getRuleContext(NumberContext.class,0);
		}
		public OpContext op() {
			return getRuleContext(OpContext.class,0);
		}
		public LoopForPart3Context(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_loopForPart3; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof GrammarListener ) ((GrammarListener)listener).enterLoopForPart3(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof GrammarListener ) ((GrammarListener)listener).exitLoopForPart3(this);
		}
	}

	public final LoopForPart3Context loopForPart3() throws RecognitionException {
		LoopForPart3Context _localctx = new LoopForPart3Context(_ctx, getState());
		enterRule(_localctx, 20, RULE_loopForPart3);
		int _la;
		try {
			setState(193);
			switch ( getInterpreter().adaptivePredict(_input,23,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(180);
				variable();
				setState(181);
				_la = _input.LA(1);
				if ( !(_la==T__8 || _la==T__9) ) {
				_errHandler.recoverInline(this);
				} else {
					consume();
				}
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(183);
				variable();
				setState(184);
				_la = _input.LA(1);
				if ( !((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__10) | (1L << T__11) | (1L << T__12))) != 0)) ) {
				_errHandler.recoverInline(this);
				} else {
					consume();
				}
				setState(185);
				number();
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(187);
				variable();
				setState(188);
				match(T__6);
				setState(189);
				variable();
				setState(190);
				op();
				setState(191);
				number();
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

	public static class LoopWhileContext extends ParserRuleContext {
		public TerminalNode WHILE() { return getToken(GrammarParser.WHILE, 0); }
		public LexpressionContext lexpression() {
			return getRuleContext(LexpressionContext.class,0);
		}
		public StatementContext statement() {
			return getRuleContext(StatementContext.class,0);
		}
		public LoopWhileContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_loopWhile; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof GrammarListener ) ((GrammarListener)listener).enterLoopWhile(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof GrammarListener ) ((GrammarListener)listener).exitLoopWhile(this);
		}
	}

	public final LoopWhileContext loopWhile() throws RecognitionException {
		LoopWhileContext _localctx = new LoopWhileContext(_ctx, getState());
		enterRule(_localctx, 22, RULE_loopWhile);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(195);
			match(WHILE);
			setState(196);
			match(T__0);
			setState(197);
			lexpression(0);
			setState(198);
			match(T__1);
			setState(199);
			match(T__2);
			setState(201);
			_la = _input.LA(1);
			if ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << INT) | (1L << PRINTF) | (1L << FOR) | (1L << WHILE) | (1L << IF) | (1L << FLOAT) | (1L << DOUBLE) | (1L << CHAR) | (1L << BOOL) | (1L << Identifier))) != 0)) {
				{
				setState(200);
				statement();
				}
			}

			setState(203);
			match(T__3);
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

	public static class ConditionalContext extends ParserRuleContext {
		public TerminalNode IF() { return getToken(GrammarParser.IF, 0); }
		public LexpressionContext lexpression() {
			return getRuleContext(LexpressionContext.class,0);
		}
		public StatementContext statement() {
			return getRuleContext(StatementContext.class,0);
		}
		public ConditionalElseContext conditionalElse() {
			return getRuleContext(ConditionalElseContext.class,0);
		}
		public ConditionalContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_conditional; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof GrammarListener ) ((GrammarListener)listener).enterConditional(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof GrammarListener ) ((GrammarListener)listener).exitConditional(this);
		}
	}

	public final ConditionalContext conditional() throws RecognitionException {
		ConditionalContext _localctx = new ConditionalContext(_ctx, getState());
		enterRule(_localctx, 24, RULE_conditional);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(205);
			match(IF);
			setState(206);
			match(T__0);
			setState(207);
			lexpression(0);
			setState(208);
			match(T__1);
			setState(209);
			match(T__2);
			setState(211);
			_la = _input.LA(1);
			if ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << INT) | (1L << PRINTF) | (1L << FOR) | (1L << WHILE) | (1L << IF) | (1L << FLOAT) | (1L << DOUBLE) | (1L << CHAR) | (1L << BOOL) | (1L << Identifier))) != 0)) {
				{
				setState(210);
				statement();
				}
			}

			setState(213);
			match(T__3);
			setState(215);
			_la = _input.LA(1);
			if (_la==ELSE) {
				{
				setState(214);
				conditionalElse();
				}
			}

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

	public static class ConditionalElseContext extends ParserRuleContext {
		public TerminalNode ELSE() { return getToken(GrammarParser.ELSE, 0); }
		public StatementContext statement() {
			return getRuleContext(StatementContext.class,0);
		}
		public ConditionalElseContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_conditionalElse; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof GrammarListener ) ((GrammarListener)listener).enterConditionalElse(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof GrammarListener ) ((GrammarListener)listener).exitConditionalElse(this);
		}
	}

	public final ConditionalElseContext conditionalElse() throws RecognitionException {
		ConditionalElseContext _localctx = new ConditionalElseContext(_ctx, getState());
		enterRule(_localctx, 26, RULE_conditionalElse);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(217);
			match(ELSE);
			setState(218);
			match(T__2);
			setState(220);
			_la = _input.LA(1);
			if ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << INT) | (1L << PRINTF) | (1L << FOR) | (1L << WHILE) | (1L << IF) | (1L << FLOAT) | (1L << DOUBLE) | (1L << CHAR) | (1L << BOOL) | (1L << Identifier))) != 0)) {
				{
				setState(219);
				statement();
				}
			}

			setState(222);
			match(T__3);
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

	public static class LexpressionContext extends ParserRuleContext {
		public LexpressionPartContext lexpressionPart() {
			return getRuleContext(LexpressionPartContext.class,0);
		}
		public List<LexpressionContext> lexpression() {
			return getRuleContexts(LexpressionContext.class);
		}
		public LexpressionContext lexpression(int i) {
			return getRuleContext(LexpressionContext.class,i);
		}
		public LopContext lop() {
			return getRuleContext(LopContext.class,0);
		}
		public Lop2Context lop2() {
			return getRuleContext(Lop2Context.class,0);
		}
		public LexpressionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_lexpression; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof GrammarListener ) ((GrammarListener)listener).enterLexpression(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof GrammarListener ) ((GrammarListener)listener).exitLexpression(this);
		}
	}

	public final LexpressionContext lexpression() throws RecognitionException {
		return lexpression(0);
	}

	private LexpressionContext lexpression(int _p) throws RecognitionException {
		ParserRuleContext _parentctx = _ctx;
		int _parentState = getState();
		LexpressionContext _localctx = new LexpressionContext(_ctx, _parentState);
		LexpressionContext _prevctx = _localctx;
		int _startState = 28;
		enterRecursionRule(_localctx, 28, RULE_lexpression, _p);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(238);
			switch ( getInterpreter().adaptivePredict(_input,28,_ctx) ) {
			case 1:
				{
				setState(225);
				lexpressionPart();
				}
				break;
			case 2:
				{
				setState(226);
				match(T__0);
				setState(227);
				lexpression(0);
				setState(228);
				lop();
				setState(229);
				lexpression(0);
				setState(230);
				match(T__1);
				}
				break;
			case 3:
				{
				setState(232);
				match(T__0);
				setState(233);
				lexpression(0);
				setState(234);
				lop2();
				setState(235);
				lexpression(0);
				setState(236);
				match(T__1);
				}
				break;
			}
			_ctx.stop = _input.LT(-1);
			setState(250);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,30,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					if ( _parseListeners!=null ) triggerExitRuleEvent();
					_prevctx = _localctx;
					{
					setState(248);
					switch ( getInterpreter().adaptivePredict(_input,29,_ctx) ) {
					case 1:
						{
						_localctx = new LexpressionContext(_parentctx, _parentState);
						pushNewRecursionContext(_localctx, _startState, RULE_lexpression);
						setState(240);
						if (!(precpred(_ctx, 4))) throw new FailedPredicateException(this, "precpred(_ctx, 4)");
						setState(241);
						lop();
						setState(242);
						lexpression(5);
						}
						break;
					case 2:
						{
						_localctx = new LexpressionContext(_parentctx, _parentState);
						pushNewRecursionContext(_localctx, _startState, RULE_lexpression);
						setState(244);
						if (!(precpred(_ctx, 2))) throw new FailedPredicateException(this, "precpred(_ctx, 2)");
						setState(245);
						lop2();
						setState(246);
						lexpression(3);
						}
						break;
					}
					} 
				}
				setState(252);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,30,_ctx);
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			unrollRecursionContexts(_parentctx);
		}
		return _localctx;
	}

	public static class LexpressionPartContext extends ParserRuleContext {
		public VariableContext variable() {
			return getRuleContext(VariableContext.class,0);
		}
		public NumberContext number() {
			return getRuleContext(NumberContext.class,0);
		}
		public LexpressionPartContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_lexpressionPart; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof GrammarListener ) ((GrammarListener)listener).enterLexpressionPart(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof GrammarListener ) ((GrammarListener)listener).exitLexpressionPart(this);
		}
	}

	public final LexpressionPartContext lexpressionPart() throws RecognitionException {
		LexpressionPartContext _localctx = new LexpressionPartContext(_ctx, getState());
		enterRule(_localctx, 30, RULE_lexpressionPart);
		try {
			setState(255);
			switch (_input.LA(1)) {
			case Identifier:
				enterOuterAlt(_localctx, 1);
				{
				setState(253);
				variable();
				}
				break;
			case Numberid:
				enterOuterAlt(_localctx, 2);
				{
				setState(254);
				number();
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

	public static class TypeContext extends ParserRuleContext {
		public TerminalNode INT() { return getToken(GrammarParser.INT, 0); }
		public TerminalNode FLOAT() { return getToken(GrammarParser.FLOAT, 0); }
		public TerminalNode DOUBLE() { return getToken(GrammarParser.DOUBLE, 0); }
		public TerminalNode CHAR() { return getToken(GrammarParser.CHAR, 0); }
		public TerminalNode BOOL() { return getToken(GrammarParser.BOOL, 0); }
		public TypeContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_type; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof GrammarListener ) ((GrammarListener)listener).enterType(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof GrammarListener ) ((GrammarListener)listener).exitType(this);
		}
	}

	public final TypeContext type() throws RecognitionException {
		TypeContext _localctx = new TypeContext(_ctx, getState());
		enterRule(_localctx, 32, RULE_type);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(257);
			_la = _input.LA(1);
			if ( !((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << INT) | (1L << FLOAT) | (1L << DOUBLE) | (1L << CHAR) | (1L << BOOL))) != 0)) ) {
			_errHandler.recoverInline(this);
			} else {
				consume();
			}
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

	public static class OpContext extends ParserRuleContext {
		public OpContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_op; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof GrammarListener ) ((GrammarListener)listener).enterOp(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof GrammarListener ) ((GrammarListener)listener).exitOp(this);
		}
	}

	public final OpContext op() throws RecognitionException {
		OpContext _localctx = new OpContext(_ctx, getState());
		enterRule(_localctx, 34, RULE_op);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(259);
			_la = _input.LA(1);
			if ( !((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__13) | (1L << T__14) | (1L << T__15) | (1L << T__16) | (1L << T__17))) != 0)) ) {
			_errHandler.recoverInline(this);
			} else {
				consume();
			}
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

	public static class LopContext extends ParserRuleContext {
		public LopContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_lop; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof GrammarListener ) ((GrammarListener)listener).enterLop(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof GrammarListener ) ((GrammarListener)listener).exitLop(this);
		}
	}

	public final LopContext lop() throws RecognitionException {
		LopContext _localctx = new LopContext(_ctx, getState());
		enterRule(_localctx, 36, RULE_lop);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(261);
			_la = _input.LA(1);
			if ( !((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__18) | (1L << T__19) | (1L << T__20) | (1L << T__21) | (1L << T__22) | (1L << T__23))) != 0)) ) {
			_errHandler.recoverInline(this);
			} else {
				consume();
			}
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

	public static class Lop2Context extends ParserRuleContext {
		public Lop2Context(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_lop2; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof GrammarListener ) ((GrammarListener)listener).enterLop2(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof GrammarListener ) ((GrammarListener)listener).exitLop2(this);
		}
	}

	public final Lop2Context lop2() throws RecognitionException {
		Lop2Context _localctx = new Lop2Context(_ctx, getState());
		enterRule(_localctx, 38, RULE_lop2);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(263);
			_la = _input.LA(1);
			if ( !(_la==T__24 || _la==T__25) ) {
			_errHandler.recoverInline(this);
			} else {
				consume();
			}
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

	public static class VariableContext extends ParserRuleContext {
		public TerminalNode Identifier() { return getToken(GrammarParser.Identifier, 0); }
		public VariableContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_variable; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof GrammarListener ) ((GrammarListener)listener).enterVariable(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof GrammarListener ) ((GrammarListener)listener).exitVariable(this);
		}
	}

	public final VariableContext variable() throws RecognitionException {
		VariableContext _localctx = new VariableContext(_ctx, getState());
		enterRule(_localctx, 40, RULE_variable);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(265);
			match(Identifier);
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

	public static class NumberContext extends ParserRuleContext {
		public TerminalNode Numberid() { return getToken(GrammarParser.Numberid, 0); }
		public NumberContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_number; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof GrammarListener ) ((GrammarListener)listener).enterNumber(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof GrammarListener ) ((GrammarListener)listener).exitNumber(this);
		}
	}

	public final NumberContext number() throws RecognitionException {
		NumberContext _localctx = new NumberContext(_ctx, getState());
		enterRule(_localctx, 42, RULE_number);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(267);
			match(Numberid);
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

	public boolean sempred(RuleContext _localctx, int ruleIndex, int predIndex) {
		switch (ruleIndex) {
		case 14:
			return lexpression_sempred((LexpressionContext)_localctx, predIndex);
		}
		return true;
	}
	private boolean lexpression_sempred(LexpressionContext _localctx, int predIndex) {
		switch (predIndex) {
		case 0:
			return precpred(_ctx, 4);
		case 1:
			return precpred(_ctx, 2);
		}
		return true;
	}

	public static final String _serializedATN =
		"\3\u0430\ud6d1\u8206\uad2d\u4417\uaef1\u8d80\uaadd\3,\u0110\4\2\t\2\4"+
		"\3\t\3\4\4\t\4\4\5\t\5\4\6\t\6\4\7\t\7\4\b\t\b\4\t\t\t\4\n\t\n\4\13\t"+
		"\13\4\f\t\f\4\r\t\r\4\16\t\16\4\17\t\17\4\20\t\20\4\21\t\21\4\22\t\22"+
		"\4\23\t\23\4\24\t\24\4\25\t\25\4\26\t\26\4\27\t\27\3\2\3\2\3\2\3\2\3\2"+
		"\3\2\5\2\65\n\2\3\2\3\2\3\3\3\3\3\3\3\3\3\3\3\3\5\3?\n\3\3\4\3\4\3\4\3"+
		"\4\3\5\3\5\6\5G\n\5\r\5\16\5H\3\5\5\5L\n\5\3\5\3\5\3\5\3\5\5\5R\n\5\3"+
		"\5\6\5U\n\5\r\5\16\5V\3\5\5\5Z\n\5\5\5\\\n\5\3\6\3\6\3\6\3\6\3\6\3\7\3"+
		"\7\6\7e\n\7\r\7\16\7f\3\7\3\7\5\7k\n\7\7\7m\n\7\f\7\16\7p\13\7\3\7\6\7"+
		"s\n\7\r\7\16\7t\3\7\5\7x\n\7\3\7\3\7\6\7|\n\7\r\7\16\7}\3\7\3\7\5\7\u0082"+
		"\n\7\7\7\u0084\n\7\f\7\16\7\u0087\13\7\3\7\6\7\u008a\n\7\r\7\16\7\u008b"+
		"\3\7\5\7\u008f\n\7\5\7\u0091\n\7\3\b\3\b\3\b\3\b\5\b\u0097\n\b\3\b\3\b"+
		"\3\b\7\b\u009c\n\b\f\b\16\b\u009f\13\b\3\b\3\b\3\b\3\t\3\t\3\t\3\t\3\t"+
		"\3\t\3\t\3\t\3\t\5\t\u00ad\n\t\3\t\3\t\3\n\3\n\5\n\u00b3\n\n\3\13\3\13"+
		"\3\f\3\f\3\f\3\f\3\f\3\f\3\f\3\f\3\f\3\f\3\f\3\f\3\f\5\f\u00c4\n\f\3\r"+
		"\3\r\3\r\3\r\3\r\3\r\5\r\u00cc\n\r\3\r\3\r\3\16\3\16\3\16\3\16\3\16\3"+
		"\16\5\16\u00d6\n\16\3\16\3\16\5\16\u00da\n\16\3\17\3\17\3\17\5\17\u00df"+
		"\n\17\3\17\3\17\3\20\3\20\3\20\3\20\3\20\3\20\3\20\3\20\3\20\3\20\3\20"+
		"\3\20\3\20\3\20\5\20\u00f1\n\20\3\20\3\20\3\20\3\20\3\20\3\20\3\20\3\20"+
		"\7\20\u00fb\n\20\f\20\16\20\u00fe\13\20\3\21\3\21\5\21\u0102\n\21\3\22"+
		"\3\22\3\23\3\23\3\24\3\24\3\25\3\25\3\26\3\26\3\27\3\27\3\27\4n\u0085"+
		"\3\36\30\2\4\6\b\n\f\16\20\22\24\26\30\32\34\36 \"$&(*,\2\t\3\2\35\36"+
		"\3\2\13\f\3\2\r\17\4\2\35\35%(\3\2\20\24\3\2\25\32\3\2\33\34\u011f\2."+
		"\3\2\2\2\4>\3\2\2\2\6@\3\2\2\2\b[\3\2\2\2\n]\3\2\2\2\f\u0090\3\2\2\2\16"+
		"\u0092\3\2\2\2\20\u00a3\3\2\2\2\22\u00b2\3\2\2\2\24\u00b4\3\2\2\2\26\u00c3"+
		"\3\2\2\2\30\u00c5\3\2\2\2\32\u00cf\3\2\2\2\34\u00db\3\2\2\2\36\u00f0\3"+
		"\2\2\2 \u0101\3\2\2\2\"\u0103\3\2\2\2$\u0105\3\2\2\2&\u0107\3\2\2\2(\u0109"+
		"\3\2\2\2*\u010b\3\2\2\2,\u010d\3\2\2\2./\t\2\2\2/\60\7\37\2\2\60\61\7"+
		"\3\2\2\61\62\7\4\2\2\62\64\7\5\2\2\63\65\5\4\3\2\64\63\3\2\2\2\64\65\3"+
		"\2\2\2\65\66\3\2\2\2\66\67\7\6\2\2\67\3\3\2\2\28?\5\6\4\29?\5\n\6\2:?"+
		"\5\16\b\2;?\5\32\16\2<?\5\20\t\2=?\5\30\r\2>8\3\2\2\2>9\3\2\2\2>:\3\2"+
		"\2\2>;\3\2\2\2><\3\2\2\2>=\3\2\2\2?\5\3\2\2\2@A\5\"\22\2AB\5\b\5\2BC\7"+
		"\7\2\2C\7\3\2\2\2DK\5*\26\2EG\7\b\2\2FE\3\2\2\2GH\3\2\2\2HF\3\2\2\2HI"+
		"\3\2\2\2IJ\3\2\2\2JL\5\b\5\2KF\3\2\2\2KL\3\2\2\2L\\\3\2\2\2MN\5*\26\2"+
		"NQ\7\t\2\2OR\5,\27\2PR\5*\26\2QO\3\2\2\2QP\3\2\2\2RY\3\2\2\2SU\7\b\2\2"+
		"TS\3\2\2\2UV\3\2\2\2VT\3\2\2\2VW\3\2\2\2WX\3\2\2\2XZ\5\b\5\2YT\3\2\2\2"+
		"YZ\3\2\2\2Z\\\3\2\2\2[D\3\2\2\2[M\3\2\2\2\\\t\3\2\2\2]^\5*\26\2^_\7\t"+
		"\2\2_`\5\f\7\2`a\7\7\2\2a\13\3\2\2\2bn\5,\27\2ce\5$\23\2dc\3\2\2\2ef\3"+
		"\2\2\2fd\3\2\2\2fg\3\2\2\2gj\3\2\2\2hk\5*\26\2ik\5,\27\2jh\3\2\2\2ji\3"+
		"\2\2\2km\3\2\2\2ld\3\2\2\2mp\3\2\2\2no\3\2\2\2nl\3\2\2\2ow\3\2\2\2pn\3"+
		"\2\2\2qs\7\b\2\2rq\3\2\2\2st\3\2\2\2tr\3\2\2\2tu\3\2\2\2uv\3\2\2\2vx\5"+
		"\f\7\2wr\3\2\2\2wx\3\2\2\2x\u0091\3\2\2\2y\u0085\5*\26\2z|\5$\23\2{z\3"+
		"\2\2\2|}\3\2\2\2}{\3\2\2\2}~\3\2\2\2~\u0081\3\2\2\2\177\u0082\5*\26\2"+
		"\u0080\u0082\5,\27\2\u0081\177\3\2\2\2\u0081\u0080\3\2\2\2\u0082\u0084"+
		"\3\2\2\2\u0083{\3\2\2\2\u0084\u0087\3\2\2\2\u0085\u0086\3\2\2\2\u0085"+
		"\u0083\3\2\2\2\u0086\u008e\3\2\2\2\u0087\u0085\3\2\2\2\u0088\u008a\7\b"+
		"\2\2\u0089\u0088\3\2\2\2\u008a\u008b\3\2\2\2\u008b\u0089\3\2\2\2\u008b"+
		"\u008c\3\2\2\2\u008c\u008d\3\2\2\2\u008d\u008f\5\f\7\2\u008e\u0089\3\2"+
		"\2\2\u008e\u008f\3\2\2\2\u008f\u0091\3\2\2\2\u0090b\3\2\2\2\u0090y\3\2"+
		"\2\2\u0091\r\3\2\2\2\u0092\u0093\7 \2\2\u0093\u0094\7\3\2\2\u0094\u0096"+
		"\7\n\2\2\u0095\u0097\7+\2\2\u0096\u0095\3\2\2\2\u0096\u0097\3\2\2\2\u0097"+
		"\u0098\3\2\2\2\u0098\u009d\7\n\2\2\u0099\u009a\7\b\2\2\u009a\u009c\5*"+
		"\26\2\u009b\u0099\3\2\2\2\u009c\u009f\3\2\2\2\u009d\u009b\3\2\2\2\u009d"+
		"\u009e\3\2\2\2\u009e\u00a0\3\2\2\2\u009f\u009d\3\2\2\2\u00a0\u00a1\7\4"+
		"\2\2\u00a1\u00a2\7\7\2\2\u00a2\17\3\2\2\2\u00a3\u00a4\7!\2\2\u00a4\u00a5"+
		"\7\3\2\2\u00a5\u00a6\5\22\n\2\u00a6\u00a7\5\24\13\2\u00a7\u00a8\7\7\2"+
		"\2\u00a8\u00a9\5\26\f\2\u00a9\u00aa\7\4\2\2\u00aa\u00ac\7\5\2\2\u00ab"+
		"\u00ad\5\4\3\2\u00ac\u00ab\3\2\2\2\u00ac\u00ad\3\2\2\2\u00ad\u00ae\3\2"+
		"\2\2\u00ae\u00af\7\6\2\2\u00af\21\3\2\2\2\u00b0\u00b3\5\6\4\2\u00b1\u00b3"+
		"\5\n\6\2\u00b2\u00b0\3\2\2\2\u00b2\u00b1\3\2\2\2\u00b3\23\3\2\2\2\u00b4"+
		"\u00b5\5\36\20\2\u00b5\25\3\2\2\2\u00b6\u00b7\5*\26\2\u00b7\u00b8\t\3"+
		"\2\2\u00b8\u00c4\3\2\2\2\u00b9\u00ba\5*\26\2\u00ba\u00bb\t\4\2\2\u00bb"+
		"\u00bc\5,\27\2\u00bc\u00c4\3\2\2\2\u00bd\u00be\5*\26\2\u00be\u00bf\7\t"+
		"\2\2\u00bf\u00c0\5*\26\2\u00c0\u00c1\5$\23\2\u00c1\u00c2\5,\27\2\u00c2"+
		"\u00c4\3\2\2\2\u00c3\u00b6\3\2\2\2\u00c3\u00b9\3\2\2\2\u00c3\u00bd\3\2"+
		"\2\2\u00c4\27\3\2\2\2\u00c5\u00c6\7\"\2\2\u00c6\u00c7\7\3\2\2\u00c7\u00c8"+
		"\5\36\20\2\u00c8\u00c9\7\4\2\2\u00c9\u00cb\7\5\2\2\u00ca\u00cc\5\4\3\2"+
		"\u00cb\u00ca\3\2\2\2\u00cb\u00cc\3\2\2\2\u00cc\u00cd\3\2\2\2\u00cd\u00ce"+
		"\7\6\2\2\u00ce\31\3\2\2\2\u00cf\u00d0\7#\2\2\u00d0\u00d1\7\3\2\2\u00d1"+
		"\u00d2\5\36\20\2\u00d2\u00d3\7\4\2\2\u00d3\u00d5\7\5\2\2\u00d4\u00d6\5"+
		"\4\3\2\u00d5\u00d4\3\2\2\2\u00d5\u00d6\3\2\2\2\u00d6\u00d7\3\2\2\2\u00d7"+
		"\u00d9\7\6\2\2\u00d8\u00da\5\34\17\2\u00d9\u00d8\3\2\2\2\u00d9\u00da\3"+
		"\2\2\2\u00da\33\3\2\2\2\u00db\u00dc\7$\2\2\u00dc\u00de\7\5\2\2\u00dd\u00df"+
		"\5\4\3\2\u00de\u00dd\3\2\2\2\u00de\u00df\3\2\2\2\u00df\u00e0\3\2\2\2\u00e0"+
		"\u00e1\7\6\2\2\u00e1\35\3\2\2\2\u00e2\u00e3\b\20\1\2\u00e3\u00f1\5 \21"+
		"\2\u00e4\u00e5\7\3\2\2\u00e5\u00e6\5\36\20\2\u00e6\u00e7\5&\24\2\u00e7"+
		"\u00e8\5\36\20\2\u00e8\u00e9\7\4\2\2\u00e9\u00f1\3\2\2\2\u00ea\u00eb\7"+
		"\3\2\2\u00eb\u00ec\5\36\20\2\u00ec\u00ed\5(\25\2\u00ed\u00ee\5\36\20\2"+
		"\u00ee\u00ef\7\4\2\2\u00ef\u00f1\3\2\2\2\u00f0\u00e2\3\2\2\2\u00f0\u00e4"+
		"\3\2\2\2\u00f0\u00ea\3\2\2\2\u00f1\u00fc\3\2\2\2\u00f2\u00f3\f\6\2\2\u00f3"+
		"\u00f4\5&\24\2\u00f4\u00f5\5\36\20\7\u00f5\u00fb\3\2\2\2\u00f6\u00f7\f"+
		"\4\2\2\u00f7\u00f8\5(\25\2\u00f8\u00f9\5\36\20\5\u00f9\u00fb\3\2\2\2\u00fa"+
		"\u00f2\3\2\2\2\u00fa\u00f6\3\2\2\2\u00fb\u00fe\3\2\2\2\u00fc\u00fa\3\2"+
		"\2\2\u00fc\u00fd\3\2\2\2\u00fd\37\3\2\2\2\u00fe\u00fc\3\2\2\2\u00ff\u0102"+
		"\5*\26\2\u0100\u0102\5,\27\2\u0101\u00ff\3\2\2\2\u0101\u0100\3\2\2\2\u0102"+
		"!\3\2\2\2\u0103\u0104\t\5\2\2\u0104#\3\2\2\2\u0105\u0106\t\6\2\2\u0106"+
		"%\3\2\2\2\u0107\u0108\t\7\2\2\u0108\'\3\2\2\2\u0109\u010a\t\b\2\2\u010a"+
		")\3\2\2\2\u010b\u010c\7)\2\2\u010c+\3\2\2\2\u010d\u010e\7*\2\2\u010e-"+
		"\3\2\2\2\"\64>HKQVY[fjntw}\u0081\u0085\u008b\u008e\u0090\u0096\u009d\u00ac"+
		"\u00b2\u00c3\u00cb\u00d5\u00d9\u00de\u00f0\u00fa\u00fc\u0101";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}
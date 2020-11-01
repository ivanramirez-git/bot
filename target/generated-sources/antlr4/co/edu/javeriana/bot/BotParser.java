// Generated from co\edu\javeriana\bot\Bot.g4 by ANTLR 4.5.1
package co.edu.javeriana.bot;


	import org.jpavlich.bot.*;
	import org.jpavlich.bot.Bot;
	import co.edu.javeriana.bot.ast.*;
	import java.util.Map;
	import java.util.HashMap;

import org.antlr.v4.runtime.atn.*;
import org.antlr.v4.runtime.dfa.DFA;
import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.misc.*;
import org.antlr.v4.runtime.tree.*;
import java.util.List;
import java.util.Iterator;
import java.util.ArrayList;

@SuppressWarnings({"all", "warnings", "unchecked", "unused", "cast"})
public class BotParser extends Parser {
	static { RuntimeMetaData.checkVersion("4.5.1", RuntimeMetaData.VERSION); }

	protected static final DFA[] _decisionToDFA;
	protected static final PredictionContextCache _sharedContextCache =
		new PredictionContextCache();
	public static final int
		STRING=1, TRUE=2, FALSE=3, NUMBER=4, FLOAT=5, BOOLEAN=6, COMMENT=7, UP=8, 
		LEFT=9, RIGHT=10, DOWN=11, DROP=12, PICK=13, SEMICOLON=14, PLUS=15, SUBTRACTION=16, 
		MULTIPLICATION=17, DIVISION=18, COMMA=19, ASSIGN=20, QUESTION=21, DOLLAR=22, 
		IF=23, ELSE=24, ARROW_RIGHT=25, END=26, AND=27, OR=28, NOT=29, MINOR=30, 
		MAYOR=31, MINOREQ=32, MAYOREQ=33, EQUAL=34, NOTEQUAL=35, PARENTHESIS=36, 
		RIGHTPARENTHESIS=37, DEFINE=38, WHILE=39, BR_OPEN=40, BR_CLOSE=41, VAR=42, 
		ID=43, WS=44;
	public static final int
		RULE_program = 0, RULE_sentence = 1, RULE_if_else_conditional = 2, RULE_while_cicle = 3, 
		RULE_parameters = 4, RULE_function = 5, RULE_up_movement = 6, RULE_left_movement = 7, 
		RULE_right_movement = 8, RULE_down_movement = 9, RULE_pick = 10, RULE_drop = 11, 
		RULE_declaration = 12, RULE_assignment = 13, RULE_both = 14, RULE_output = 15, 
		RULE_expression = 16, RULE_arithmetic = 17, RULE_factor = 18, RULE_term = 19, 
		RULE_dato = 20, RULE_logic = 21, RULE_logic_or = 22, RULE_comparation = 23, 
		RULE_not = 24, RULE_comment = 25;
	public static final String[] ruleNames = {
		"program", "sentence", "if_else_conditional", "while_cicle", "parameters", 
		"function", "up_movement", "left_movement", "right_movement", "down_movement", 
		"pick", "drop", "declaration", "assignment", "both", "output", "expression", 
		"arithmetic", "factor", "term", "dato", "logic", "logic_or", "comparation", 
		"not", "comment"
	};

	private static final String[] _LITERAL_NAMES = {
		null, null, "'@T'", "'@F'", null, null, null, "'#'", "'^'", null, null, 
		"'V'", "'D'", "'P'", "';'", "'+'", "'-'", "'*'", "'/'", "','", "'<-'", 
		"'?'", "'$'", "'if'", "'else'", "'->'", "'end'", "'&'", "'|'", "'!'", 
		null, null, "'<='", "'>='", "'='", "'<>'", "'('", "')'", "'define'", "'while'", 
		"'{'", "'}'", "'''"
	};
	private static final String[] _SYMBOLIC_NAMES = {
		null, "STRING", "TRUE", "FALSE", "NUMBER", "FLOAT", "BOOLEAN", "COMMENT", 
		"UP", "LEFT", "RIGHT", "DOWN", "DROP", "PICK", "SEMICOLON", "PLUS", "SUBTRACTION", 
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

	@Override
	public String getGrammarFileName() { return "Bot.g4"; }

	@Override
	public String[] getRuleNames() { return ruleNames; }

	@Override
	public String getSerializedATN() { return _serializedATN; }

	@Override
	public ATN getATN() { return _ATN; }



		Map<String, Object> symbolTable = new HashMap<String, Object>();
		private Bot bot;
		
		public BotParser(TokenStream input, Bot bot) {
			this(input);
			this.bot = bot;
		}


	public BotParser(TokenStream input) {
		super(input);
		_interp = new ParserATNSimulator(this,_ATN,_decisionToDFA,_sharedContextCache);
	}
	public static class ProgramContext extends ParserRuleContext {
		public SentenceContext sentence;
		public List<SentenceContext> sentence() {
			return getRuleContexts(SentenceContext.class);
		}
		public SentenceContext sentence(int i) {
			return getRuleContext(SentenceContext.class,i);
		}
		public ProgramContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_program; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof BotListener ) ((BotListener)listener).enterProgram(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof BotListener ) ((BotListener)listener).exitProgram(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof BotVisitor ) return ((BotVisitor<? extends T>)visitor).visitProgram(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ProgramContext program() throws RecognitionException {
		ProgramContext _localctx = new ProgramContext(_ctx, getState());
		enterRule(_localctx, 0, RULE_program);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{

					List<ASTNode> body = new ArrayList<ASTNode>();
					Map<String, Object> symbolTable = new HashMap<String, Object>();
				
			setState(58);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << COMMENT) | (1L << UP) | (1L << LEFT) | (1L << RIGHT) | (1L << DOWN) | (1L << DROP) | (1L << PICK) | (1L << DOLLAR) | (1L << IF) | (1L << WHILE) | (1L << VAR) | (1L << ID))) != 0)) {
				{
				{
				setState(53);
				((ProgramContext)_localctx).sentence = sentence();
				body.add(((ProgramContext)_localctx).sentence.node);
				}
				}
				setState(60);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}

					for(ASTNode n: body){
						n.execute(symbolTable);
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

	public static class SentenceContext extends ParserRuleContext {
		public ASTNode node;
		public OutputContext output;
		public If_else_conditionalContext if_else_conditional;
		public While_cicleContext while_cicle;
		public Down_movementContext down_movement;
		public Up_movementContext up_movement;
		public Left_movementContext left_movement;
		public Right_movementContext right_movement;
		public DeclarationContext declaration;
		public AssignmentContext assignment;
		public BothContext both;
		public PickContext pick;
		public DropContext drop;
		public OutputContext output() {
			return getRuleContext(OutputContext.class,0);
		}
		public CommentContext comment() {
			return getRuleContext(CommentContext.class,0);
		}
		public If_else_conditionalContext if_else_conditional() {
			return getRuleContext(If_else_conditionalContext.class,0);
		}
		public While_cicleContext while_cicle() {
			return getRuleContext(While_cicleContext.class,0);
		}
		public Down_movementContext down_movement() {
			return getRuleContext(Down_movementContext.class,0);
		}
		public Up_movementContext up_movement() {
			return getRuleContext(Up_movementContext.class,0);
		}
		public Left_movementContext left_movement() {
			return getRuleContext(Left_movementContext.class,0);
		}
		public Right_movementContext right_movement() {
			return getRuleContext(Right_movementContext.class,0);
		}
		public DeclarationContext declaration() {
			return getRuleContext(DeclarationContext.class,0);
		}
		public AssignmentContext assignment() {
			return getRuleContext(AssignmentContext.class,0);
		}
		public BothContext both() {
			return getRuleContext(BothContext.class,0);
		}
		public PickContext pick() {
			return getRuleContext(PickContext.class,0);
		}
		public DropContext drop() {
			return getRuleContext(DropContext.class,0);
		}
		public SentenceContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_sentence; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof BotListener ) ((BotListener)listener).enterSentence(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof BotListener ) ((BotListener)listener).exitSentence(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof BotVisitor ) return ((BotVisitor<? extends T>)visitor).visitSentence(this);
			else return visitor.visitChildren(this);
		}
	}

	public final SentenceContext sentence() throws RecognitionException {
		SentenceContext _localctx = new SentenceContext(_ctx, getState());
		enterRule(_localctx, 2, RULE_sentence);
		try {
			setState(100);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,1,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(63);
				((SentenceContext)_localctx).output = output();
				((SentenceContext)_localctx).node = ((SentenceContext)_localctx).output.node;
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(66);
				comment();
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(67);
				((SentenceContext)_localctx).if_else_conditional = if_else_conditional();
				((SentenceContext)_localctx).node = ((SentenceContext)_localctx).if_else_conditional.node;
				}
				break;
			case 4:
				enterOuterAlt(_localctx, 4);
				{
				setState(70);
				((SentenceContext)_localctx).while_cicle = while_cicle();
				((SentenceContext)_localctx).node =  ((SentenceContext)_localctx).while_cicle.node;
				}
				break;
			case 5:
				enterOuterAlt(_localctx, 5);
				{
				setState(73);
				((SentenceContext)_localctx).down_movement = down_movement();
				((SentenceContext)_localctx).node = ((SentenceContext)_localctx).down_movement.node;
				}
				break;
			case 6:
				enterOuterAlt(_localctx, 6);
				{
				setState(76);
				((SentenceContext)_localctx).up_movement = up_movement();
				((SentenceContext)_localctx).node = ((SentenceContext)_localctx).up_movement.node;
				}
				break;
			case 7:
				enterOuterAlt(_localctx, 7);
				{
				setState(79);
				((SentenceContext)_localctx).left_movement = left_movement();
				((SentenceContext)_localctx).node = ((SentenceContext)_localctx).left_movement.node;
				}
				break;
			case 8:
				enterOuterAlt(_localctx, 8);
				{
				setState(82);
				((SentenceContext)_localctx).right_movement = right_movement();
				((SentenceContext)_localctx).node = ((SentenceContext)_localctx).right_movement.node;
				}
				break;
			case 9:
				enterOuterAlt(_localctx, 9);
				{
				setState(85);
				((SentenceContext)_localctx).declaration = declaration();
				((SentenceContext)_localctx).node = ((SentenceContext)_localctx).declaration.node;
				}
				break;
			case 10:
				enterOuterAlt(_localctx, 10);
				{
				setState(88);
				((SentenceContext)_localctx).assignment = assignment();
				((SentenceContext)_localctx).node = ((SentenceContext)_localctx).assignment.node;
				}
				break;
			case 11:
				enterOuterAlt(_localctx, 11);
				{
				setState(91);
				((SentenceContext)_localctx).both = both();
				((SentenceContext)_localctx).node = ((SentenceContext)_localctx).both.node;
				}
				break;
			case 12:
				enterOuterAlt(_localctx, 12);
				{
				setState(94);
				((SentenceContext)_localctx).pick = pick();
				((SentenceContext)_localctx).node = ((SentenceContext)_localctx).pick.node;
				}
				break;
			case 13:
				enterOuterAlt(_localctx, 13);
				{
				setState(97);
				((SentenceContext)_localctx).drop = drop();
				((SentenceContext)_localctx).node = ((SentenceContext)_localctx).drop.node;
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

	public static class If_else_conditionalContext extends ParserRuleContext {
		public ASTNode node;
		public LogicContext logic;
		public SentenceContext s1;
		public SentenceContext s2;
		public TerminalNode IF() { return getToken(BotParser.IF, 0); }
		public LogicContext logic() {
			return getRuleContext(LogicContext.class,0);
		}
		public TerminalNode ARROW_RIGHT() { return getToken(BotParser.ARROW_RIGHT, 0); }
		public TerminalNode END() { return getToken(BotParser.END, 0); }
		public TerminalNode SEMICOLON() { return getToken(BotParser.SEMICOLON, 0); }
		public TerminalNode ELSE() { return getToken(BotParser.ELSE, 0); }
		public List<SentenceContext> sentence() {
			return getRuleContexts(SentenceContext.class);
		}
		public SentenceContext sentence(int i) {
			return getRuleContext(SentenceContext.class,i);
		}
		public If_else_conditionalContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_if_else_conditional; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof BotListener ) ((BotListener)listener).enterIf_else_conditional(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof BotListener ) ((BotListener)listener).exitIf_else_conditional(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof BotVisitor ) return ((BotVisitor<? extends T>)visitor).visitIf_else_conditional(this);
			else return visitor.visitChildren(this);
		}
	}

	public final If_else_conditionalContext if_else_conditional() throws RecognitionException {
		If_else_conditionalContext _localctx = new If_else_conditionalContext(_ctx, getState());
		enterRule(_localctx, 4, RULE_if_else_conditional);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(102);
			match(IF);
			setState(103);
			((If_else_conditionalContext)_localctx).logic = logic();
			setState(104);
			match(ARROW_RIGHT);

					List<ASTNode> body = new ArrayList<ASTNode>();
					List<ASTNode> elseBody = new ArrayList<ASTNode>();
				
			setState(111);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << COMMENT) | (1L << UP) | (1L << LEFT) | (1L << RIGHT) | (1L << DOWN) | (1L << DROP) | (1L << PICK) | (1L << DOLLAR) | (1L << IF) | (1L << WHILE) | (1L << VAR) | (1L << ID))) != 0)) {
				{
				{
				setState(106);
				((If_else_conditionalContext)_localctx).s1 = sentence();
				body.add(((If_else_conditionalContext)_localctx).s1.node);
				}
				}
				setState(113);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(123);
			_la = _input.LA(1);
			if (_la==ELSE) {
				{
				setState(114);
				match(ELSE);
				setState(120);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << COMMENT) | (1L << UP) | (1L << LEFT) | (1L << RIGHT) | (1L << DOWN) | (1L << DROP) | (1L << PICK) | (1L << DOLLAR) | (1L << IF) | (1L << WHILE) | (1L << VAR) | (1L << ID))) != 0)) {
					{
					{
					setState(115);
					((If_else_conditionalContext)_localctx).s2 = sentence();
					elseBody.add(((If_else_conditionalContext)_localctx).s2.node);
					}
					}
					setState(122);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				}
			}

			setState(125);
			match(END);
			setState(126);
			match(SEMICOLON);

					((If_else_conditionalContext)_localctx).node =  new If(((If_else_conditionalContext)_localctx).logic.node,body,elseBody);
				
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

	public static class While_cicleContext extends ParserRuleContext {
		public ASTNode node;
		public LogicContext logic;
		public SentenceContext s1;
		public TerminalNode WHILE() { return getToken(BotParser.WHILE, 0); }
		public LogicContext logic() {
			return getRuleContext(LogicContext.class,0);
		}
		public TerminalNode ARROW_RIGHT() { return getToken(BotParser.ARROW_RIGHT, 0); }
		public TerminalNode END() { return getToken(BotParser.END, 0); }
		public TerminalNode SEMICOLON() { return getToken(BotParser.SEMICOLON, 0); }
		public List<SentenceContext> sentence() {
			return getRuleContexts(SentenceContext.class);
		}
		public SentenceContext sentence(int i) {
			return getRuleContext(SentenceContext.class,i);
		}
		public While_cicleContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_while_cicle; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof BotListener ) ((BotListener)listener).enterWhile_cicle(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof BotListener ) ((BotListener)listener).exitWhile_cicle(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof BotVisitor ) return ((BotVisitor<? extends T>)visitor).visitWhile_cicle(this);
			else return visitor.visitChildren(this);
		}
	}

	public final While_cicleContext while_cicle() throws RecognitionException {
		While_cicleContext _localctx = new While_cicleContext(_ctx, getState());
		enterRule(_localctx, 6, RULE_while_cicle);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(129);
			match(WHILE);
			setState(130);
			((While_cicleContext)_localctx).logic = logic();
			setState(131);
			match(ARROW_RIGHT);

					List<ASTNode> body = new ArrayList<ASTNode>();
				
			setState(138);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << COMMENT) | (1L << UP) | (1L << LEFT) | (1L << RIGHT) | (1L << DOWN) | (1L << DROP) | (1L << PICK) | (1L << DOLLAR) | (1L << IF) | (1L << WHILE) | (1L << VAR) | (1L << ID))) != 0)) {
				{
				{
				setState(133);
				((While_cicleContext)_localctx).s1 = sentence();
				body.add(((While_cicleContext)_localctx).s1.node);
				}
				}
				setState(140);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(141);
			match(END);
			setState(142);
			match(SEMICOLON);

					((While_cicleContext)_localctx).node =  new While(((While_cicleContext)_localctx).logic.node,body);
				
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

	public static class ParametersContext extends ParserRuleContext {
		public ASTNode node;
		public TerminalNode VAR() { return getToken(BotParser.VAR, 0); }
		public TerminalNode ID() { return getToken(BotParser.ID, 0); }
		public TerminalNode COMMA() { return getToken(BotParser.COMMA, 0); }
		public ParametersContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_parameters; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof BotListener ) ((BotListener)listener).enterParameters(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof BotListener ) ((BotListener)listener).exitParameters(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof BotVisitor ) return ((BotVisitor<? extends T>)visitor).visitParameters(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ParametersContext parameters() throws RecognitionException {
		ParametersContext _localctx = new ParametersContext(_ctx, getState());
		enterRule(_localctx, 8, RULE_parameters);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(145);
			match(VAR);
			setState(146);
			match(ID);
			setState(148);
			_la = _input.LA(1);
			if (_la==COMMA) {
				{
				setState(147);
				match(COMMA);
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

	public static class FunctionContext extends ParserRuleContext {
		public ASTNode node;
		public TerminalNode DEFINE() { return getToken(BotParser.DEFINE, 0); }
		public TerminalNode ID() { return getToken(BotParser.ID, 0); }
		public TerminalNode PARENTHESIS() { return getToken(BotParser.PARENTHESIS, 0); }
		public TerminalNode RIGHTPARENTHESIS() { return getToken(BotParser.RIGHTPARENTHESIS, 0); }
		public TerminalNode ARROW_RIGHT() { return getToken(BotParser.ARROW_RIGHT, 0); }
		public TerminalNode END() { return getToken(BotParser.END, 0); }
		public TerminalNode SEMICOLON() { return getToken(BotParser.SEMICOLON, 0); }
		public List<ParametersContext> parameters() {
			return getRuleContexts(ParametersContext.class);
		}
		public ParametersContext parameters(int i) {
			return getRuleContext(ParametersContext.class,i);
		}
		public List<SentenceContext> sentence() {
			return getRuleContexts(SentenceContext.class);
		}
		public SentenceContext sentence(int i) {
			return getRuleContext(SentenceContext.class,i);
		}
		public FunctionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_function; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof BotListener ) ((BotListener)listener).enterFunction(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof BotListener ) ((BotListener)listener).exitFunction(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof BotVisitor ) return ((BotVisitor<? extends T>)visitor).visitFunction(this);
			else return visitor.visitChildren(this);
		}
	}

	public final FunctionContext function() throws RecognitionException {
		FunctionContext _localctx = new FunctionContext(_ctx, getState());
		enterRule(_localctx, 10, RULE_function);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(150);
			match(DEFINE);
			setState(151);
			match(ID);
			setState(152);
			match(PARENTHESIS);
			setState(156);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==VAR) {
				{
				{
				setState(153);
				parameters();
				}
				}
				setState(158);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(159);
			match(RIGHTPARENTHESIS);
			setState(160);
			match(ARROW_RIGHT);
			setState(164);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << COMMENT) | (1L << UP) | (1L << LEFT) | (1L << RIGHT) | (1L << DOWN) | (1L << DROP) | (1L << PICK) | (1L << DOLLAR) | (1L << IF) | (1L << WHILE) | (1L << VAR) | (1L << ID))) != 0)) {
				{
				{
				setState(161);
				sentence();
				}
				}
				setState(166);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(167);
			match(END);
			setState(168);
			match(SEMICOLON);
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

	public static class Up_movementContext extends ParserRuleContext {
		public ASTNode node;
		public ExpressionContext expression;
		public TerminalNode UP() { return getToken(BotParser.UP, 0); }
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
		}
		public TerminalNode SEMICOLON() { return getToken(BotParser.SEMICOLON, 0); }
		public Up_movementContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_up_movement; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof BotListener ) ((BotListener)listener).enterUp_movement(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof BotListener ) ((BotListener)listener).exitUp_movement(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof BotVisitor ) return ((BotVisitor<? extends T>)visitor).visitUp_movement(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Up_movementContext up_movement() throws RecognitionException {
		Up_movementContext _localctx = new Up_movementContext(_ctx, getState());
		enterRule(_localctx, 12, RULE_up_movement);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(170);
			match(UP);
			setState(171);
			((Up_movementContext)_localctx).expression = expression();
			setState(172);
			match(SEMICOLON);
			((Up_movementContext)_localctx).node =  new MoveUp(bot,((Up_movementContext)_localctx).expression.node);
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

	public static class Left_movementContext extends ParserRuleContext {
		public ASTNode node;
		public ExpressionContext expression;
		public TerminalNode LEFT() { return getToken(BotParser.LEFT, 0); }
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
		}
		public TerminalNode SEMICOLON() { return getToken(BotParser.SEMICOLON, 0); }
		public Left_movementContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_left_movement; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof BotListener ) ((BotListener)listener).enterLeft_movement(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof BotListener ) ((BotListener)listener).exitLeft_movement(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof BotVisitor ) return ((BotVisitor<? extends T>)visitor).visitLeft_movement(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Left_movementContext left_movement() throws RecognitionException {
		Left_movementContext _localctx = new Left_movementContext(_ctx, getState());
		enterRule(_localctx, 14, RULE_left_movement);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(175);
			match(LEFT);
			setState(176);
			((Left_movementContext)_localctx).expression = expression();
			setState(177);
			match(SEMICOLON);
			((Left_movementContext)_localctx).node =  new MoveLeft(bot,((Left_movementContext)_localctx).expression.node);
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

	public static class Right_movementContext extends ParserRuleContext {
		public ASTNode node;
		public ExpressionContext expression;
		public TerminalNode RIGHT() { return getToken(BotParser.RIGHT, 0); }
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
		}
		public TerminalNode SEMICOLON() { return getToken(BotParser.SEMICOLON, 0); }
		public Right_movementContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_right_movement; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof BotListener ) ((BotListener)listener).enterRight_movement(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof BotListener ) ((BotListener)listener).exitRight_movement(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof BotVisitor ) return ((BotVisitor<? extends T>)visitor).visitRight_movement(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Right_movementContext right_movement() throws RecognitionException {
		Right_movementContext _localctx = new Right_movementContext(_ctx, getState());
		enterRule(_localctx, 16, RULE_right_movement);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(180);
			match(RIGHT);
			setState(181);
			((Right_movementContext)_localctx).expression = expression();
			setState(182);
			match(SEMICOLON);
			((Right_movementContext)_localctx).node =  new MoveRight(bot,((Right_movementContext)_localctx).expression.node);
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

	public static class Down_movementContext extends ParserRuleContext {
		public ASTNode node;
		public ExpressionContext expression;
		public TerminalNode DOWN() { return getToken(BotParser.DOWN, 0); }
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
		}
		public TerminalNode SEMICOLON() { return getToken(BotParser.SEMICOLON, 0); }
		public Down_movementContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_down_movement; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof BotListener ) ((BotListener)listener).enterDown_movement(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof BotListener ) ((BotListener)listener).exitDown_movement(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof BotVisitor ) return ((BotVisitor<? extends T>)visitor).visitDown_movement(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Down_movementContext down_movement() throws RecognitionException {
		Down_movementContext _localctx = new Down_movementContext(_ctx, getState());
		enterRule(_localctx, 18, RULE_down_movement);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(185);
			match(DOWN);
			setState(186);
			((Down_movementContext)_localctx).expression = expression();
			setState(187);
			match(SEMICOLON);
			((Down_movementContext)_localctx).node =  new MoveDown(bot,((Down_movementContext)_localctx).expression.node);
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

	public static class PickContext extends ParserRuleContext {
		public ASTNode node;
		public TerminalNode PICK() { return getToken(BotParser.PICK, 0); }
		public TerminalNode SEMICOLON() { return getToken(BotParser.SEMICOLON, 0); }
		public PickContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_pick; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof BotListener ) ((BotListener)listener).enterPick(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof BotListener ) ((BotListener)listener).exitPick(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof BotVisitor ) return ((BotVisitor<? extends T>)visitor).visitPick(this);
			else return visitor.visitChildren(this);
		}
	}

	public final PickContext pick() throws RecognitionException {
		PickContext _localctx = new PickContext(_ctx, getState());
		enterRule(_localctx, 20, RULE_pick);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(190);
			match(PICK);
			setState(191);
			match(SEMICOLON);
			((PickContext)_localctx).node =  new Pick(bot);
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

	public static class DropContext extends ParserRuleContext {
		public ASTNode node;
		public TerminalNode DROP() { return getToken(BotParser.DROP, 0); }
		public TerminalNode SEMICOLON() { return getToken(BotParser.SEMICOLON, 0); }
		public DropContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_drop; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof BotListener ) ((BotListener)listener).enterDrop(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof BotListener ) ((BotListener)listener).exitDrop(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof BotVisitor ) return ((BotVisitor<? extends T>)visitor).visitDrop(this);
			else return visitor.visitChildren(this);
		}
	}

	public final DropContext drop() throws RecognitionException {
		DropContext _localctx = new DropContext(_ctx, getState());
		enterRule(_localctx, 22, RULE_drop);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(194);
			match(DROP);
			setState(195);
			match(SEMICOLON);
			((DropContext)_localctx).node =  new Drop(bot);
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
		public ASTNode node;
		public Token ID;
		public TerminalNode VAR() { return getToken(BotParser.VAR, 0); }
		public TerminalNode ID() { return getToken(BotParser.ID, 0); }
		public TerminalNode SEMICOLON() { return getToken(BotParser.SEMICOLON, 0); }
		public DeclarationContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_declaration; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof BotListener ) ((BotListener)listener).enterDeclaration(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof BotListener ) ((BotListener)listener).exitDeclaration(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof BotVisitor ) return ((BotVisitor<? extends T>)visitor).visitDeclaration(this);
			else return visitor.visitChildren(this);
		}
	}

	public final DeclarationContext declaration() throws RecognitionException {
		DeclarationContext _localctx = new DeclarationContext(_ctx, getState());
		enterRule(_localctx, 24, RULE_declaration);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(198);
			match(VAR);
			setState(199);
			((DeclarationContext)_localctx).ID = match(ID);
			setState(200);
			match(SEMICOLON);
			((DeclarationContext)_localctx).node =  new  Declaration((((DeclarationContext)_localctx).ID!=null?((DeclarationContext)_localctx).ID.getText():null));
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

	public static class AssignmentContext extends ParserRuleContext {
		public ASTNode node;
		public Token ID;
		public ExpressionContext expression;
		public TerminalNode ID() { return getToken(BotParser.ID, 0); }
		public TerminalNode ASSIGN() { return getToken(BotParser.ASSIGN, 0); }
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
		}
		public TerminalNode SEMICOLON() { return getToken(BotParser.SEMICOLON, 0); }
		public AssignmentContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_assignment; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof BotListener ) ((BotListener)listener).enterAssignment(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof BotListener ) ((BotListener)listener).exitAssignment(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof BotVisitor ) return ((BotVisitor<? extends T>)visitor).visitAssignment(this);
			else return visitor.visitChildren(this);
		}
	}

	public final AssignmentContext assignment() throws RecognitionException {
		AssignmentContext _localctx = new AssignmentContext(_ctx, getState());
		enterRule(_localctx, 26, RULE_assignment);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(203);
			((AssignmentContext)_localctx).ID = match(ID);
			setState(204);
			match(ASSIGN);
			setState(205);
			((AssignmentContext)_localctx).expression = expression();
			setState(206);
			match(SEMICOLON);
			((AssignmentContext)_localctx).node =  new  Assignment((((AssignmentContext)_localctx).ID!=null?((AssignmentContext)_localctx).ID.getText():null), ((AssignmentContext)_localctx).expression.node);
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

	public static class BothContext extends ParserRuleContext {
		public ASTNode node;
		public Token ID;
		public ExpressionContext expression;
		public TerminalNode VAR() { return getToken(BotParser.VAR, 0); }
		public TerminalNode ID() { return getToken(BotParser.ID, 0); }
		public TerminalNode ASSIGN() { return getToken(BotParser.ASSIGN, 0); }
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
		}
		public TerminalNode SEMICOLON() { return getToken(BotParser.SEMICOLON, 0); }
		public BothContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_both; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof BotListener ) ((BotListener)listener).enterBoth(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof BotListener ) ((BotListener)listener).exitBoth(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof BotVisitor ) return ((BotVisitor<? extends T>)visitor).visitBoth(this);
			else return visitor.visitChildren(this);
		}
	}

	public final BothContext both() throws RecognitionException {
		BothContext _localctx = new BothContext(_ctx, getState());
		enterRule(_localctx, 28, RULE_both);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(209);
			match(VAR);
			setState(210);
			((BothContext)_localctx).ID = match(ID);
			setState(211);
			match(ASSIGN);
			setState(212);
			((BothContext)_localctx).expression = expression();
			setState(213);
			match(SEMICOLON);
			((BothContext)_localctx).node =  new  Assignment((((BothContext)_localctx).ID!=null?((BothContext)_localctx).ID.getText():null), ((BothContext)_localctx).expression.node);
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

	public static class OutputContext extends ParserRuleContext {
		public ASTNode node;
		public ExpressionContext expression;
		public TerminalNode DOLLAR() { return getToken(BotParser.DOLLAR, 0); }
		public TerminalNode SEMICOLON() { return getToken(BotParser.SEMICOLON, 0); }
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
		}
		public OutputContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_output; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof BotListener ) ((BotListener)listener).enterOutput(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof BotListener ) ((BotListener)listener).exitOutput(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof BotVisitor ) return ((BotVisitor<? extends T>)visitor).visitOutput(this);
			else return visitor.visitChildren(this);
		}
	}

	public final OutputContext output() throws RecognitionException {
		OutputContext _localctx = new OutputContext(_ctx, getState());
		enterRule(_localctx, 30, RULE_output);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(216);
			match(DOLLAR);
			{
			setState(217);
			((OutputContext)_localctx).expression = expression();
			((OutputContext)_localctx).node =  new Output(((OutputContext)_localctx).expression.node);
			}
			setState(220);
			match(SEMICOLON);
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

	public static class ExpressionContext extends ParserRuleContext {
		public ASTNode node;
		public DatoContext dato;
		public ArithmeticContext arithmetic;
		public Token ID;
		public DatoContext dato() {
			return getRuleContext(DatoContext.class,0);
		}
		public ArithmeticContext arithmetic() {
			return getRuleContext(ArithmeticContext.class,0);
		}
		public TerminalNode ID() { return getToken(BotParser.ID, 0); }
		public ExpressionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_expression; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof BotListener ) ((BotListener)listener).enterExpression(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof BotListener ) ((BotListener)listener).exitExpression(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof BotVisitor ) return ((BotVisitor<? extends T>)visitor).visitExpression(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ExpressionContext expression() throws RecognitionException {
		ExpressionContext _localctx = new ExpressionContext(_ctx, getState());
		enterRule(_localctx, 32, RULE_expression);
		try {
			setState(230);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,9,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(222);
				((ExpressionContext)_localctx).dato = dato();
				((ExpressionContext)_localctx).node =  ((ExpressionContext)_localctx).dato.node;
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(225);
				((ExpressionContext)_localctx).arithmetic = arithmetic();
				((ExpressionContext)_localctx).node =  ((ExpressionContext)_localctx).arithmetic.node;
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(228);
				((ExpressionContext)_localctx).ID = match(ID);
				((ExpressionContext)_localctx).node =  new VarReference((((ExpressionContext)_localctx).ID!=null?((ExpressionContext)_localctx).ID.getText():null));
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

	public static class ArithmeticContext extends ParserRuleContext {
		public ASTNode node;
		public FactorContext t1;
		public FactorContext t2;
		public List<FactorContext> factor() {
			return getRuleContexts(FactorContext.class);
		}
		public FactorContext factor(int i) {
			return getRuleContext(FactorContext.class,i);
		}
		public List<TerminalNode> PLUS() { return getTokens(BotParser.PLUS); }
		public TerminalNode PLUS(int i) {
			return getToken(BotParser.PLUS, i);
		}
		public List<TerminalNode> SUBTRACTION() { return getTokens(BotParser.SUBTRACTION); }
		public TerminalNode SUBTRACTION(int i) {
			return getToken(BotParser.SUBTRACTION, i);
		}
		public ArithmeticContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_arithmetic; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof BotListener ) ((BotListener)listener).enterArithmetic(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof BotListener ) ((BotListener)listener).exitArithmetic(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof BotVisitor ) return ((BotVisitor<? extends T>)visitor).visitArithmetic(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ArithmeticContext arithmetic() throws RecognitionException {
		ArithmeticContext _localctx = new ArithmeticContext(_ctx, getState());
		enterRule(_localctx, 34, RULE_arithmetic);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(232);
			((ArithmeticContext)_localctx).t1 = factor();
			((ArithmeticContext)_localctx).node =  ((ArithmeticContext)_localctx).t1.node;
			setState(244);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==PLUS || _la==SUBTRACTION) {
				{
				setState(242);
				switch (_input.LA(1)) {
				case PLUS:
					{
					setState(234);
					match(PLUS);
					setState(235);
					((ArithmeticContext)_localctx).t2 = factor();
					((ArithmeticContext)_localctx).node =  new Addition(_localctx.node,((ArithmeticContext)_localctx).t2.node);
					}
					break;
				case SUBTRACTION:
					{
					setState(238);
					match(SUBTRACTION);
					setState(239);
					((ArithmeticContext)_localctx).t2 = factor();
					((ArithmeticContext)_localctx).node =  new Substraction(_localctx.node,((ArithmeticContext)_localctx).t2.node);
					}
					break;
				default:
					throw new NoViableAltException(this);
				}
				}
				setState(246);
				_errHandler.sync(this);
				_la = _input.LA(1);
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

	public static class FactorContext extends ParserRuleContext {
		public ASTNode node;
		public TermContext t1;
		public TermContext t2;
		public List<TermContext> term() {
			return getRuleContexts(TermContext.class);
		}
		public TermContext term(int i) {
			return getRuleContext(TermContext.class,i);
		}
		public List<TerminalNode> MULTIPLICATION() { return getTokens(BotParser.MULTIPLICATION); }
		public TerminalNode MULTIPLICATION(int i) {
			return getToken(BotParser.MULTIPLICATION, i);
		}
		public List<TerminalNode> DIVISION() { return getTokens(BotParser.DIVISION); }
		public TerminalNode DIVISION(int i) {
			return getToken(BotParser.DIVISION, i);
		}
		public FactorContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_factor; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof BotListener ) ((BotListener)listener).enterFactor(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof BotListener ) ((BotListener)listener).exitFactor(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof BotVisitor ) return ((BotVisitor<? extends T>)visitor).visitFactor(this);
			else return visitor.visitChildren(this);
		}
	}

	public final FactorContext factor() throws RecognitionException {
		FactorContext _localctx = new FactorContext(_ctx, getState());
		enterRule(_localctx, 36, RULE_factor);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(247);
			((FactorContext)_localctx).t1 = term();
			((FactorContext)_localctx).node =  ((FactorContext)_localctx).t1.node;
			setState(259);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==MULTIPLICATION || _la==DIVISION) {
				{
				setState(257);
				switch (_input.LA(1)) {
				case MULTIPLICATION:
					{
					setState(249);
					match(MULTIPLICATION);
					setState(250);
					((FactorContext)_localctx).t2 = term();
					((FactorContext)_localctx).node =  new Multiplication(_localctx.node,((FactorContext)_localctx).t2.node);
					}
					break;
				case DIVISION:
					{
					setState(253);
					match(DIVISION);
					setState(254);
					((FactorContext)_localctx).t2 = term();
					((FactorContext)_localctx).node =  new Division(_localctx.node,((FactorContext)_localctx).t2.node);
					}
					break;
				default:
					throw new NoViableAltException(this);
				}
				}
				setState(261);
				_errHandler.sync(this);
				_la = _input.LA(1);
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

	public static class TermContext extends ParserRuleContext {
		public ASTNode node;
		public Token NUMBER;
		public Token ID;
		public ArithmeticContext arithmetic;
		public TerminalNode NUMBER() { return getToken(BotParser.NUMBER, 0); }
		public TerminalNode FALSE() { return getToken(BotParser.FALSE, 0); }
		public TerminalNode TRUE() { return getToken(BotParser.TRUE, 0); }
		public TerminalNode ID() { return getToken(BotParser.ID, 0); }
		public TerminalNode PARENTHESIS() { return getToken(BotParser.PARENTHESIS, 0); }
		public ArithmeticContext arithmetic() {
			return getRuleContext(ArithmeticContext.class,0);
		}
		public TerminalNode RIGHTPARENTHESIS() { return getToken(BotParser.RIGHTPARENTHESIS, 0); }
		public TermContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_term; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof BotListener ) ((BotListener)listener).enterTerm(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof BotListener ) ((BotListener)listener).exitTerm(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof BotVisitor ) return ((BotVisitor<? extends T>)visitor).visitTerm(this);
			else return visitor.visitChildren(this);
		}
	}

	public final TermContext term() throws RecognitionException {
		TermContext _localctx = new TermContext(_ctx, getState());
		enterRule(_localctx, 38, RULE_term);
		try {
			setState(275);
			switch (_input.LA(1)) {
			case NUMBER:
				enterOuterAlt(_localctx, 1);
				{
				setState(262);
				((TermContext)_localctx).NUMBER = match(NUMBER);
				((TermContext)_localctx).node =  new Constant(Integer.parseInt((((TermContext)_localctx).NUMBER!=null?((TermContext)_localctx).NUMBER.getText():null)));
				}
				break;
			case FALSE:
				enterOuterAlt(_localctx, 2);
				{
				setState(264);
				match(FALSE);
				((TermContext)_localctx).node =  new Constant(false);
				}
				break;
			case TRUE:
				enterOuterAlt(_localctx, 3);
				{
				setState(266);
				match(TRUE);
				((TermContext)_localctx).node =  new Constant(true);
				}
				break;
			case ID:
				enterOuterAlt(_localctx, 4);
				{
				setState(268);
				((TermContext)_localctx).ID = match(ID);
				((TermContext)_localctx).node =  new VarReference((((TermContext)_localctx).ID!=null?((TermContext)_localctx).ID.getText():null));
				}
				break;
			case PARENTHESIS:
				enterOuterAlt(_localctx, 5);
				{
				setState(270);
				match(PARENTHESIS);
				setState(271);
				((TermContext)_localctx).arithmetic = arithmetic();
				((TermContext)_localctx).node = ((TermContext)_localctx).arithmetic.node;
				setState(273);
				match(RIGHTPARENTHESIS);
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

	public static class DatoContext extends ParserRuleContext {
		public ASTNode node;
		public Token STRING;
		public Token NUMBER;
		public Token FLOAT;
		public TerminalNode STRING() { return getToken(BotParser.STRING, 0); }
		public TerminalNode FALSE() { return getToken(BotParser.FALSE, 0); }
		public TerminalNode TRUE() { return getToken(BotParser.TRUE, 0); }
		public TerminalNode NUMBER() { return getToken(BotParser.NUMBER, 0); }
		public TerminalNode FLOAT() { return getToken(BotParser.FLOAT, 0); }
		public DatoContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_dato; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof BotListener ) ((BotListener)listener).enterDato(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof BotListener ) ((BotListener)listener).exitDato(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof BotVisitor ) return ((BotVisitor<? extends T>)visitor).visitDato(this);
			else return visitor.visitChildren(this);
		}
	}

	public final DatoContext dato() throws RecognitionException {
		DatoContext _localctx = new DatoContext(_ctx, getState());
		enterRule(_localctx, 40, RULE_dato);
		try {
			setState(287);
			switch (_input.LA(1)) {
			case STRING:
				enterOuterAlt(_localctx, 1);
				{
				setState(277);
				((DatoContext)_localctx).STRING = match(STRING);
				((DatoContext)_localctx).node =  new Constant((((DatoContext)_localctx).STRING!=null?((DatoContext)_localctx).STRING.getText():null));
				}
				break;
			case FALSE:
				enterOuterAlt(_localctx, 2);
				{
				setState(279);
				match(FALSE);
				((DatoContext)_localctx).node =  new Constant(false);
				}
				break;
			case TRUE:
				enterOuterAlt(_localctx, 3);
				{
				setState(281);
				match(TRUE);
				((DatoContext)_localctx).node =  new Constant(true);
				}
				break;
			case NUMBER:
				enterOuterAlt(_localctx, 4);
				{
				setState(283);
				((DatoContext)_localctx).NUMBER = match(NUMBER);
				((DatoContext)_localctx).node =  new Constant(Integer.parseInt((((DatoContext)_localctx).NUMBER!=null?((DatoContext)_localctx).NUMBER.getText():null)));
				}
				break;
			case FLOAT:
				enterOuterAlt(_localctx, 5);
				{
				setState(285);
				((DatoContext)_localctx).FLOAT = match(FLOAT);
				((DatoContext)_localctx).node =  new Constant(Float.parseFloat((((DatoContext)_localctx).FLOAT!=null?((DatoContext)_localctx).FLOAT.getText():null)));
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

	public static class LogicContext extends ParserRuleContext {
		public ASTNode node;
		public ComparationContext c1;
		public ComparationContext c2;
		public Logic_orContext logic_or;
		public List<ComparationContext> comparation() {
			return getRuleContexts(ComparationContext.class);
		}
		public ComparationContext comparation(int i) {
			return getRuleContext(ComparationContext.class,i);
		}
		public List<TerminalNode> AND() { return getTokens(BotParser.AND); }
		public TerminalNode AND(int i) {
			return getToken(BotParser.AND, i);
		}
		public List<Logic_orContext> logic_or() {
			return getRuleContexts(Logic_orContext.class);
		}
		public Logic_orContext logic_or(int i) {
			return getRuleContext(Logic_orContext.class,i);
		}
		public LogicContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_logic; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof BotListener ) ((BotListener)listener).enterLogic(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof BotListener ) ((BotListener)listener).exitLogic(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof BotVisitor ) return ((BotVisitor<? extends T>)visitor).visitLogic(this);
			else return visitor.visitChildren(this);
		}
	}

	public final LogicContext logic() throws RecognitionException {
		LogicContext _localctx = new LogicContext(_ctx, getState());
		enterRule(_localctx, 42, RULE_logic);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(289);
			((LogicContext)_localctx).c1 = comparation();
			((LogicContext)_localctx).node = ((LogicContext)_localctx).c1.node;
			setState(300);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==AND || _la==OR) {
				{
				setState(298);
				switch (_input.LA(1)) {
				case AND:
					{
					setState(291);
					match(AND);
					setState(292);
					((LogicContext)_localctx).c2 = comparation();
					((LogicContext)_localctx).node =  new And(_localctx.node,((LogicContext)_localctx).c2.node);
					}
					break;
				case OR:
					{
					setState(295);
					((LogicContext)_localctx).logic_or = logic_or();
					((LogicContext)_localctx).node =  new Or(_localctx.node,((LogicContext)_localctx).logic_or.node);
					}
					break;
				default:
					throw new NoViableAltException(this);
				}
				}
				setState(302);
				_errHandler.sync(this);
				_la = _input.LA(1);
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

	public static class Logic_orContext extends ParserRuleContext {
		public ASTNode node;
		public ComparationContext comparation;
		public TerminalNode OR() { return getToken(BotParser.OR, 0); }
		public ComparationContext comparation() {
			return getRuleContext(ComparationContext.class,0);
		}
		public Logic_orContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_logic_or; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof BotListener ) ((BotListener)listener).enterLogic_or(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof BotListener ) ((BotListener)listener).exitLogic_or(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof BotVisitor ) return ((BotVisitor<? extends T>)visitor).visitLogic_or(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Logic_orContext logic_or() throws RecognitionException {
		Logic_orContext _localctx = new Logic_orContext(_ctx, getState());
		enterRule(_localctx, 44, RULE_logic_or);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(303);
			match(OR);
			setState(304);
			((Logic_orContext)_localctx).comparation = comparation();
			((Logic_orContext)_localctx).node = ((Logic_orContext)_localctx).comparation.node;
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

	public static class ComparationContext extends ParserRuleContext {
		public ASTNode node;
		public ExpressionContext e1;
		public ExpressionContext e2;
		public ExpressionContext e3;
		public ExpressionContext e4;
		public ExpressionContext e5;
		public ExpressionContext e6;
		public ExpressionContext e7;
		public LogicContext logic;
		public NotContext not;
		public TerminalNode PARENTHESIS() { return getToken(BotParser.PARENTHESIS, 0); }
		public LogicContext logic() {
			return getRuleContext(LogicContext.class,0);
		}
		public TerminalNode RIGHTPARENTHESIS() { return getToken(BotParser.RIGHTPARENTHESIS, 0); }
		public List<ExpressionContext> expression() {
			return getRuleContexts(ExpressionContext.class);
		}
		public ExpressionContext expression(int i) {
			return getRuleContext(ExpressionContext.class,i);
		}
		public TerminalNode LEFT() { return getToken(BotParser.LEFT, 0); }
		public TerminalNode RIGHT() { return getToken(BotParser.RIGHT, 0); }
		public TerminalNode MINOREQ() { return getToken(BotParser.MINOREQ, 0); }
		public TerminalNode MAYOREQ() { return getToken(BotParser.MAYOREQ, 0); }
		public TerminalNode EQUAL() { return getToken(BotParser.EQUAL, 0); }
		public TerminalNode NOTEQUAL() { return getToken(BotParser.NOTEQUAL, 0); }
		public NotContext not() {
			return getRuleContext(NotContext.class,0);
		}
		public ComparationContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_comparation; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof BotListener ) ((BotListener)listener).enterComparation(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof BotListener ) ((BotListener)listener).exitComparation(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof BotVisitor ) return ((BotVisitor<? extends T>)visitor).visitComparation(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ComparationContext comparation() throws RecognitionException {
		ComparationContext _localctx = new ComparationContext(_ctx, getState());
		enterRule(_localctx, 46, RULE_comparation);
		try {
			setState(345);
			switch (_input.LA(1)) {
			case STRING:
			case TRUE:
			case FALSE:
			case NUMBER:
			case FLOAT:
			case PARENTHESIS:
			case ID:
				enterOuterAlt(_localctx, 1);
				{
				setState(340);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,19,_ctx) ) {
				case 1:
					{
					setState(307);
					((ComparationContext)_localctx).e1 = expression();
					((ComparationContext)_localctx).node =  ((ComparationContext)_localctx).e1.node;
					setState(333);
					switch (_input.LA(1)) {
					case LEFT:
						{
						setState(309);
						match(LEFT);
						setState(310);
						((ComparationContext)_localctx).e2 = expression();
						((ComparationContext)_localctx).node =  new Minor(((ComparationContext)_localctx).e1.node,((ComparationContext)_localctx).e2.node);
						}
						break;
					case RIGHT:
						{
						setState(313);
						match(RIGHT);
						setState(314);
						((ComparationContext)_localctx).e3 = expression();
						((ComparationContext)_localctx).node =  new Mayor(((ComparationContext)_localctx).e1.node,((ComparationContext)_localctx).e3.node);
						}
						break;
					case MINOREQ:
						{
						setState(317);
						match(MINOREQ);
						setState(318);
						((ComparationContext)_localctx).e4 = expression();
						((ComparationContext)_localctx).node =  new Minoreq(((ComparationContext)_localctx).e1.node,((ComparationContext)_localctx).e4.node);
						}
						break;
					case MAYOREQ:
						{
						setState(321);
						match(MAYOREQ);
						setState(322);
						((ComparationContext)_localctx).e5 = expression();
						((ComparationContext)_localctx).node =  new Mayoreq(((ComparationContext)_localctx).e1.node,((ComparationContext)_localctx).e5.node);
						}
						break;
					case EQUAL:
						{
						setState(325);
						match(EQUAL);
						setState(326);
						((ComparationContext)_localctx).e6 = expression();
						((ComparationContext)_localctx).node =  new Equal(((ComparationContext)_localctx).e1.node,((ComparationContext)_localctx).e6.node);
						}
						break;
					case NOTEQUAL:
						{
						setState(329);
						match(NOTEQUAL);
						setState(330);
						((ComparationContext)_localctx).e7 = expression();
						((ComparationContext)_localctx).node =  new Notequal(((ComparationContext)_localctx).e1.node,((ComparationContext)_localctx).e7.node);
						}
						break;
					case ARROW_RIGHT:
					case AND:
					case OR:
					case RIGHTPARENTHESIS:
						break;
					default:
						throw new NoViableAltException(this);
					}
					}
					break;
				case 2:
					{
					setState(335);
					match(PARENTHESIS);
					setState(336);
					((ComparationContext)_localctx).logic = logic();
					((ComparationContext)_localctx).node = ((ComparationContext)_localctx).logic.node;
					setState(338);
					match(RIGHTPARENTHESIS);
					}
					break;
				}
				}
				break;
			case NOT:
				enterOuterAlt(_localctx, 2);
				{
				setState(342);
				((ComparationContext)_localctx).not = not();
				((ComparationContext)_localctx).node = ((ComparationContext)_localctx).not.node;
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

	public static class NotContext extends ParserRuleContext {
		public ASTNode node;
		public ComparationContext comparation;
		public TerminalNode NOT() { return getToken(BotParser.NOT, 0); }
		public ComparationContext comparation() {
			return getRuleContext(ComparationContext.class,0);
		}
		public NotContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_not; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof BotListener ) ((BotListener)listener).enterNot(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof BotListener ) ((BotListener)listener).exitNot(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof BotVisitor ) return ((BotVisitor<? extends T>)visitor).visitNot(this);
			else return visitor.visitChildren(this);
		}
	}

	public final NotContext not() throws RecognitionException {
		NotContext _localctx = new NotContext(_ctx, getState());
		enterRule(_localctx, 48, RULE_not);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(347);
			match(NOT);
			setState(348);
			((NotContext)_localctx).comparation = comparation();
			((NotContext)_localctx).node =  new Not(((NotContext)_localctx).comparation.node);
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

	public static class CommentContext extends ParserRuleContext {
		public TerminalNode COMMENT() { return getToken(BotParser.COMMENT, 0); }
		public TerminalNode STRING() { return getToken(BotParser.STRING, 0); }
		public CommentContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_comment; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof BotListener ) ((BotListener)listener).enterComment(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof BotListener ) ((BotListener)listener).exitComment(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof BotVisitor ) return ((BotVisitor<? extends T>)visitor).visitComment(this);
			else return visitor.visitChildren(this);
		}
	}

	public final CommentContext comment() throws RecognitionException {
		CommentContext _localctx = new CommentContext(_ctx, getState());
		enterRule(_localctx, 50, RULE_comment);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(351);
			match(COMMENT);
			setState(352);
			match(STRING);
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
		"\3\u0430\ud6d1\u8206\uad2d\u4417\uaef1\u8d80\uaadd\3.\u0165\4\2\t\2\4"+
		"\3\t\3\4\4\t\4\4\5\t\5\4\6\t\6\4\7\t\7\4\b\t\b\4\t\t\t\4\n\t\n\4\13\t"+
		"\13\4\f\t\f\4\r\t\r\4\16\t\16\4\17\t\17\4\20\t\20\4\21\t\21\4\22\t\22"+
		"\4\23\t\23\4\24\t\24\4\25\t\25\4\26\t\26\4\27\t\27\4\30\t\30\4\31\t\31"+
		"\4\32\t\32\4\33\t\33\3\2\3\2\3\2\3\2\7\2;\n\2\f\2\16\2>\13\2\3\2\3\2\3"+
		"\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3"+
		"\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3"+
		"\3\3\3\5\3g\n\3\3\4\3\4\3\4\3\4\3\4\3\4\3\4\7\4p\n\4\f\4\16\4s\13\4\3"+
		"\4\3\4\3\4\3\4\7\4y\n\4\f\4\16\4|\13\4\5\4~\n\4\3\4\3\4\3\4\3\4\3\5\3"+
		"\5\3\5\3\5\3\5\3\5\3\5\7\5\u008b\n\5\f\5\16\5\u008e\13\5\3\5\3\5\3\5\3"+
		"\5\3\6\3\6\3\6\5\6\u0097\n\6\3\7\3\7\3\7\3\7\7\7\u009d\n\7\f\7\16\7\u00a0"+
		"\13\7\3\7\3\7\3\7\7\7\u00a5\n\7\f\7\16\7\u00a8\13\7\3\7\3\7\3\7\3\b\3"+
		"\b\3\b\3\b\3\b\3\t\3\t\3\t\3\t\3\t\3\n\3\n\3\n\3\n\3\n\3\13\3\13\3\13"+
		"\3\13\3\13\3\f\3\f\3\f\3\f\3\r\3\r\3\r\3\r\3\16\3\16\3\16\3\16\3\16\3"+
		"\17\3\17\3\17\3\17\3\17\3\17\3\20\3\20\3\20\3\20\3\20\3\20\3\20\3\21\3"+
		"\21\3\21\3\21\3\21\3\21\3\22\3\22\3\22\3\22\3\22\3\22\3\22\3\22\5\22\u00e9"+
		"\n\22\3\23\3\23\3\23\3\23\3\23\3\23\3\23\3\23\3\23\3\23\7\23\u00f5\n\23"+
		"\f\23\16\23\u00f8\13\23\3\24\3\24\3\24\3\24\3\24\3\24\3\24\3\24\3\24\3"+
		"\24\7\24\u0104\n\24\f\24\16\24\u0107\13\24\3\25\3\25\3\25\3\25\3\25\3"+
		"\25\3\25\3\25\3\25\3\25\3\25\3\25\3\25\5\25\u0116\n\25\3\26\3\26\3\26"+
		"\3\26\3\26\3\26\3\26\3\26\3\26\3\26\5\26\u0122\n\26\3\27\3\27\3\27\3\27"+
		"\3\27\3\27\3\27\3\27\3\27\7\27\u012d\n\27\f\27\16\27\u0130\13\27\3\30"+
		"\3\30\3\30\3\30\3\31\3\31\3\31\3\31\3\31\3\31\3\31\3\31\3\31\3\31\3\31"+
		"\3\31\3\31\3\31\3\31\3\31\3\31\3\31\3\31\3\31\3\31\3\31\3\31\3\31\3\31"+
		"\3\31\5\31\u0150\n\31\3\31\3\31\3\31\3\31\3\31\5\31\u0157\n\31\3\31\3"+
		"\31\3\31\5\31\u015c\n\31\3\32\3\32\3\32\3\32\3\33\3\33\3\33\3\33\2\2\34"+
		"\2\4\6\b\n\f\16\20\22\24\26\30\32\34\36 \"$&(*,.\60\62\64\2\2\u0176\2"+
		"\66\3\2\2\2\4f\3\2\2\2\6h\3\2\2\2\b\u0083\3\2\2\2\n\u0093\3\2\2\2\f\u0098"+
		"\3\2\2\2\16\u00ac\3\2\2\2\20\u00b1\3\2\2\2\22\u00b6\3\2\2\2\24\u00bb\3"+
		"\2\2\2\26\u00c0\3\2\2\2\30\u00c4\3\2\2\2\32\u00c8\3\2\2\2\34\u00cd\3\2"+
		"\2\2\36\u00d3\3\2\2\2 \u00da\3\2\2\2\"\u00e8\3\2\2\2$\u00ea\3\2\2\2&\u00f9"+
		"\3\2\2\2(\u0115\3\2\2\2*\u0121\3\2\2\2,\u0123\3\2\2\2.\u0131\3\2\2\2\60"+
		"\u015b\3\2\2\2\62\u015d\3\2\2\2\64\u0161\3\2\2\2\66<\b\2\1\2\678\5\4\3"+
		"\289\b\2\1\29;\3\2\2\2:\67\3\2\2\2;>\3\2\2\2<:\3\2\2\2<=\3\2\2\2=?\3\2"+
		"\2\2><\3\2\2\2?@\b\2\1\2@\3\3\2\2\2AB\5 \21\2BC\b\3\1\2Cg\3\2\2\2Dg\5"+
		"\64\33\2EF\5\6\4\2FG\b\3\1\2Gg\3\2\2\2HI\5\b\5\2IJ\b\3\1\2Jg\3\2\2\2K"+
		"L\5\24\13\2LM\b\3\1\2Mg\3\2\2\2NO\5\16\b\2OP\b\3\1\2Pg\3\2\2\2QR\5\20"+
		"\t\2RS\b\3\1\2Sg\3\2\2\2TU\5\22\n\2UV\b\3\1\2Vg\3\2\2\2WX\5\32\16\2XY"+
		"\b\3\1\2Yg\3\2\2\2Z[\5\34\17\2[\\\b\3\1\2\\g\3\2\2\2]^\5\36\20\2^_\b\3"+
		"\1\2_g\3\2\2\2`a\5\26\f\2ab\b\3\1\2bg\3\2\2\2cd\5\30\r\2de\b\3\1\2eg\3"+
		"\2\2\2fA\3\2\2\2fD\3\2\2\2fE\3\2\2\2fH\3\2\2\2fK\3\2\2\2fN\3\2\2\2fQ\3"+
		"\2\2\2fT\3\2\2\2fW\3\2\2\2fZ\3\2\2\2f]\3\2\2\2f`\3\2\2\2fc\3\2\2\2g\5"+
		"\3\2\2\2hi\7\31\2\2ij\5,\27\2jk\7\33\2\2kq\b\4\1\2lm\5\4\3\2mn\b\4\1\2"+
		"np\3\2\2\2ol\3\2\2\2ps\3\2\2\2qo\3\2\2\2qr\3\2\2\2r}\3\2\2\2sq\3\2\2\2"+
		"tz\7\32\2\2uv\5\4\3\2vw\b\4\1\2wy\3\2\2\2xu\3\2\2\2y|\3\2\2\2zx\3\2\2"+
		"\2z{\3\2\2\2{~\3\2\2\2|z\3\2\2\2}t\3\2\2\2}~\3\2\2\2~\177\3\2\2\2\177"+
		"\u0080\7\34\2\2\u0080\u0081\7\20\2\2\u0081\u0082\b\4\1\2\u0082\7\3\2\2"+
		"\2\u0083\u0084\7)\2\2\u0084\u0085\5,\27\2\u0085\u0086\7\33\2\2\u0086\u008c"+
		"\b\5\1\2\u0087\u0088\5\4\3\2\u0088\u0089\b\5\1\2\u0089\u008b\3\2\2\2\u008a"+
		"\u0087\3\2\2\2\u008b\u008e\3\2\2\2\u008c\u008a\3\2\2\2\u008c\u008d\3\2"+
		"\2\2\u008d\u008f\3\2\2\2\u008e\u008c\3\2\2\2\u008f\u0090\7\34\2\2\u0090"+
		"\u0091\7\20\2\2\u0091\u0092\b\5\1\2\u0092\t\3\2\2\2\u0093\u0094\7,\2\2"+
		"\u0094\u0096\7-\2\2\u0095\u0097\7\25\2\2\u0096\u0095\3\2\2\2\u0096\u0097"+
		"\3\2\2\2\u0097\13\3\2\2\2\u0098\u0099\7(\2\2\u0099\u009a\7-\2\2\u009a"+
		"\u009e\7&\2\2\u009b\u009d\5\n\6\2\u009c\u009b\3\2\2\2\u009d\u00a0\3\2"+
		"\2\2\u009e\u009c\3\2\2\2\u009e\u009f\3\2\2\2\u009f\u00a1\3\2\2\2\u00a0"+
		"\u009e\3\2\2\2\u00a1\u00a2\7\'\2\2\u00a2\u00a6\7\33\2\2\u00a3\u00a5\5"+
		"\4\3\2\u00a4\u00a3\3\2\2\2\u00a5\u00a8\3\2\2\2\u00a6\u00a4\3\2\2\2\u00a6"+
		"\u00a7\3\2\2\2\u00a7\u00a9\3\2\2\2\u00a8\u00a6\3\2\2\2\u00a9\u00aa\7\34"+
		"\2\2\u00aa\u00ab\7\20\2\2\u00ab\r\3\2\2\2\u00ac\u00ad\7\n\2\2\u00ad\u00ae"+
		"\5\"\22\2\u00ae\u00af\7\20\2\2\u00af\u00b0\b\b\1\2\u00b0\17\3\2\2\2\u00b1"+
		"\u00b2\7\13\2\2\u00b2\u00b3\5\"\22\2\u00b3\u00b4\7\20\2\2\u00b4\u00b5"+
		"\b\t\1\2\u00b5\21\3\2\2\2\u00b6\u00b7\7\f\2\2\u00b7\u00b8\5\"\22\2\u00b8"+
		"\u00b9\7\20\2\2\u00b9\u00ba\b\n\1\2\u00ba\23\3\2\2\2\u00bb\u00bc\7\r\2"+
		"\2\u00bc\u00bd\5\"\22\2\u00bd\u00be\7\20\2\2\u00be\u00bf\b\13\1\2\u00bf"+
		"\25\3\2\2\2\u00c0\u00c1\7\17\2\2\u00c1\u00c2\7\20\2\2\u00c2\u00c3\b\f"+
		"\1\2\u00c3\27\3\2\2\2\u00c4\u00c5\7\16\2\2\u00c5\u00c6\7\20\2\2\u00c6"+
		"\u00c7\b\r\1\2\u00c7\31\3\2\2\2\u00c8\u00c9\7,\2\2\u00c9\u00ca\7-\2\2"+
		"\u00ca\u00cb\7\20\2\2\u00cb\u00cc\b\16\1\2\u00cc\33\3\2\2\2\u00cd\u00ce"+
		"\7-\2\2\u00ce\u00cf\7\26\2\2\u00cf\u00d0\5\"\22\2\u00d0\u00d1\7\20\2\2"+
		"\u00d1\u00d2\b\17\1\2\u00d2\35\3\2\2\2\u00d3\u00d4\7,\2\2\u00d4\u00d5"+
		"\7-\2\2\u00d5\u00d6\7\26\2\2\u00d6\u00d7\5\"\22\2\u00d7\u00d8\7\20\2\2"+
		"\u00d8\u00d9\b\20\1\2\u00d9\37\3\2\2\2\u00da\u00db\7\30\2\2\u00db\u00dc"+
		"\5\"\22\2\u00dc\u00dd\b\21\1\2\u00dd\u00de\3\2\2\2\u00de\u00df\7\20\2"+
		"\2\u00df!\3\2\2\2\u00e0\u00e1\5*\26\2\u00e1\u00e2\b\22\1\2\u00e2\u00e9"+
		"\3\2\2\2\u00e3\u00e4\5$\23\2\u00e4\u00e5\b\22\1\2\u00e5\u00e9\3\2\2\2"+
		"\u00e6\u00e7\7-\2\2\u00e7\u00e9\b\22\1\2\u00e8\u00e0\3\2\2\2\u00e8\u00e3"+
		"\3\2\2\2\u00e8\u00e6\3\2\2\2\u00e9#\3\2\2\2\u00ea\u00eb\5&\24\2\u00eb"+
		"\u00f6\b\23\1\2\u00ec\u00ed\7\21\2\2\u00ed\u00ee\5&\24\2\u00ee\u00ef\b"+
		"\23\1\2\u00ef\u00f5\3\2\2\2\u00f0\u00f1\7\22\2\2\u00f1\u00f2\5&\24\2\u00f2"+
		"\u00f3\b\23\1\2\u00f3\u00f5\3\2\2\2\u00f4\u00ec\3\2\2\2\u00f4\u00f0\3"+
		"\2\2\2\u00f5\u00f8\3\2\2\2\u00f6\u00f4\3\2\2\2\u00f6\u00f7\3\2\2\2\u00f7"+
		"%\3\2\2\2\u00f8\u00f6\3\2\2\2\u00f9\u00fa\5(\25\2\u00fa\u0105\b\24\1\2"+
		"\u00fb\u00fc\7\23\2\2\u00fc\u00fd\5(\25\2\u00fd\u00fe\b\24\1\2\u00fe\u0104"+
		"\3\2\2\2\u00ff\u0100\7\24\2\2\u0100\u0101\5(\25\2\u0101\u0102\b\24\1\2"+
		"\u0102\u0104\3\2\2\2\u0103\u00fb\3\2\2\2\u0103\u00ff\3\2\2\2\u0104\u0107"+
		"\3\2\2\2\u0105\u0103\3\2\2\2\u0105\u0106\3\2\2\2\u0106\'\3\2\2\2\u0107"+
		"\u0105\3\2\2\2\u0108\u0109\7\6\2\2\u0109\u0116\b\25\1\2\u010a\u010b\7"+
		"\5\2\2\u010b\u0116\b\25\1\2\u010c\u010d\7\4\2\2\u010d\u0116\b\25\1\2\u010e"+
		"\u010f\7-\2\2\u010f\u0116\b\25\1\2\u0110\u0111\7&\2\2\u0111\u0112\5$\23"+
		"\2\u0112\u0113\b\25\1\2\u0113\u0114\7\'\2\2\u0114\u0116\3\2\2\2\u0115"+
		"\u0108\3\2\2\2\u0115\u010a\3\2\2\2\u0115\u010c\3\2\2\2\u0115\u010e\3\2"+
		"\2\2\u0115\u0110\3\2\2\2\u0116)\3\2\2\2\u0117\u0118\7\3\2\2\u0118\u0122"+
		"\b\26\1\2\u0119\u011a\7\5\2\2\u011a\u0122\b\26\1\2\u011b\u011c\7\4\2\2"+
		"\u011c\u0122\b\26\1\2\u011d\u011e\7\6\2\2\u011e\u0122\b\26\1\2\u011f\u0120"+
		"\7\7\2\2\u0120\u0122\b\26\1\2\u0121\u0117\3\2\2\2\u0121\u0119\3\2\2\2"+
		"\u0121\u011b\3\2\2\2\u0121\u011d\3\2\2\2\u0121\u011f\3\2\2\2\u0122+\3"+
		"\2\2\2\u0123\u0124\5\60\31\2\u0124\u012e\b\27\1\2\u0125\u0126\7\35\2\2"+
		"\u0126\u0127\5\60\31\2\u0127\u0128\b\27\1\2\u0128\u012d\3\2\2\2\u0129"+
		"\u012a\5.\30\2\u012a\u012b\b\27\1\2\u012b\u012d\3\2\2\2\u012c\u0125\3"+
		"\2\2\2\u012c\u0129\3\2\2\2\u012d\u0130\3\2\2\2\u012e\u012c\3\2\2\2\u012e"+
		"\u012f\3\2\2\2\u012f-\3\2\2\2\u0130\u012e\3\2\2\2\u0131\u0132\7\36\2\2"+
		"\u0132\u0133\5\60\31\2\u0133\u0134\b\30\1\2\u0134/\3\2\2\2\u0135\u0136"+
		"\5\"\22\2\u0136\u014f\b\31\1\2\u0137\u0138\7\13\2\2\u0138\u0139\5\"\22"+
		"\2\u0139\u013a\b\31\1\2\u013a\u0150\3\2\2\2\u013b\u013c\7\f\2\2\u013c"+
		"\u013d\5\"\22\2\u013d\u013e\b\31\1\2\u013e\u0150\3\2\2\2\u013f\u0140\7"+
		"\"\2\2\u0140\u0141\5\"\22\2\u0141\u0142\b\31\1\2\u0142\u0150\3\2\2\2\u0143"+
		"\u0144\7#\2\2\u0144\u0145\5\"\22\2\u0145\u0146\b\31\1\2\u0146\u0150\3"+
		"\2\2\2\u0147\u0148\7$\2\2\u0148\u0149\5\"\22\2\u0149\u014a\b\31\1\2\u014a"+
		"\u0150\3\2\2\2\u014b\u014c\7%\2\2\u014c\u014d\5\"\22\2\u014d\u014e\b\31"+
		"\1\2\u014e\u0150\3\2\2\2\u014f\u0137\3\2\2\2\u014f\u013b\3\2\2\2\u014f"+
		"\u013f\3\2\2\2\u014f\u0143\3\2\2\2\u014f\u0147\3\2\2\2\u014f\u014b\3\2"+
		"\2\2\u014f\u0150\3\2\2\2\u0150\u0157\3\2\2\2\u0151\u0152\7&\2\2\u0152"+
		"\u0153\5,\27\2\u0153\u0154\b\31\1\2\u0154\u0155\7\'\2\2\u0155\u0157\3"+
		"\2\2\2\u0156\u0135\3\2\2\2\u0156\u0151\3\2\2\2\u0157\u015c\3\2\2\2\u0158"+
		"\u0159\5\62\32\2\u0159\u015a\b\31\1\2\u015a\u015c\3\2\2\2\u015b\u0156"+
		"\3\2\2\2\u015b\u0158\3\2\2\2\u015c\61\3\2\2\2\u015d\u015e\7\37\2\2\u015e"+
		"\u015f\5\60\31\2\u015f\u0160\b\32\1\2\u0160\63\3\2\2\2\u0161\u0162\7\t"+
		"\2\2\u0162\u0163\7\3\2\2\u0163\65\3\2\2\2\27<fqz}\u008c\u0096\u009e\u00a6"+
		"\u00e8\u00f4\u00f6\u0103\u0105\u0115\u0121\u012c\u012e\u014f\u0156\u015b";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}
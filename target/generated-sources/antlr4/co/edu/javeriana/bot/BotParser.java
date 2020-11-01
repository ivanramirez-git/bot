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
		RULE_program = 0, RULE_sentence = 1, RULE_if_else_conditional = 2, RULE_parameters = 3, 
		RULE_function = 4, RULE_up_movement = 5, RULE_left_movement = 6, RULE_right_movement = 7, 
		RULE_down_movement = 8, RULE_pick = 9, RULE_drop = 10, RULE_declaration = 11, 
		RULE_assignment = 12, RULE_both = 13, RULE_output = 14, RULE_expression = 15, 
		RULE_arithmetic = 16, RULE_factor = 17, RULE_term = 18, RULE_dato = 19, 
		RULE_logic = 20, RULE_logic_or = 21, RULE_comparation = 22, RULE_not = 23, 
		RULE_comment = 24;
	public static final String[] ruleNames = {
		"program", "sentence", "if_else_conditional", "parameters", "function", 
		"up_movement", "left_movement", "right_movement", "down_movement", "pick", 
		"drop", "declaration", "assignment", "both", "output", "expression", "arithmetic", 
		"factor", "term", "dato", "logic", "logic_or", "comparation", "not", "comment"
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
				
			setState(56);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << COMMENT) | (1L << UP) | (1L << LEFT) | (1L << RIGHT) | (1L << DOWN) | (1L << DROP) | (1L << PICK) | (1L << DOLLAR) | (1L << IF) | (1L << VAR) | (1L << ID))) != 0)) {
				{
				{
				setState(51);
				((ProgramContext)_localctx).sentence = sentence();
				body.add(((ProgramContext)_localctx).sentence.node);
				}
				}
				setState(58);
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
			setState(95);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,1,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(61);
				((SentenceContext)_localctx).output = output();
				((SentenceContext)_localctx).node = ((SentenceContext)_localctx).output.node;
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(64);
				comment();
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(65);
				((SentenceContext)_localctx).if_else_conditional = if_else_conditional();
				((SentenceContext)_localctx).node = ((SentenceContext)_localctx).if_else_conditional.node;
				}
				break;
			case 4:
				enterOuterAlt(_localctx, 4);
				{
				setState(68);
				((SentenceContext)_localctx).down_movement = down_movement();
				((SentenceContext)_localctx).node = ((SentenceContext)_localctx).down_movement.node;
				}
				break;
			case 5:
				enterOuterAlt(_localctx, 5);
				{
				setState(71);
				((SentenceContext)_localctx).up_movement = up_movement();
				((SentenceContext)_localctx).node = ((SentenceContext)_localctx).up_movement.node;
				}
				break;
			case 6:
				enterOuterAlt(_localctx, 6);
				{
				setState(74);
				((SentenceContext)_localctx).left_movement = left_movement();
				((SentenceContext)_localctx).node = ((SentenceContext)_localctx).left_movement.node;
				}
				break;
			case 7:
				enterOuterAlt(_localctx, 7);
				{
				setState(77);
				((SentenceContext)_localctx).right_movement = right_movement();
				((SentenceContext)_localctx).node = ((SentenceContext)_localctx).right_movement.node;
				}
				break;
			case 8:
				enterOuterAlt(_localctx, 8);
				{
				setState(80);
				((SentenceContext)_localctx).declaration = declaration();
				((SentenceContext)_localctx).node = ((SentenceContext)_localctx).declaration.node;
				}
				break;
			case 9:
				enterOuterAlt(_localctx, 9);
				{
				setState(83);
				((SentenceContext)_localctx).assignment = assignment();
				((SentenceContext)_localctx).node = ((SentenceContext)_localctx).assignment.node;
				}
				break;
			case 10:
				enterOuterAlt(_localctx, 10);
				{
				setState(86);
				((SentenceContext)_localctx).both = both();
				((SentenceContext)_localctx).node = ((SentenceContext)_localctx).both.node;
				}
				break;
			case 11:
				enterOuterAlt(_localctx, 11);
				{
				setState(89);
				((SentenceContext)_localctx).pick = pick();
				((SentenceContext)_localctx).node = ((SentenceContext)_localctx).pick.node;
				}
				break;
			case 12:
				enterOuterAlt(_localctx, 12);
				{
				setState(92);
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
			setState(97);
			match(IF);
			setState(98);
			((If_else_conditionalContext)_localctx).logic = logic();
			setState(99);
			match(ARROW_RIGHT);

					List<ASTNode> body = new ArrayList<ASTNode>();
					List<ASTNode> elseBody = new ArrayList<ASTNode>();
				
			setState(106);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << COMMENT) | (1L << UP) | (1L << LEFT) | (1L << RIGHT) | (1L << DOWN) | (1L << DROP) | (1L << PICK) | (1L << DOLLAR) | (1L << IF) | (1L << VAR) | (1L << ID))) != 0)) {
				{
				{
				setState(101);
				((If_else_conditionalContext)_localctx).s1 = sentence();
				body.add(((If_else_conditionalContext)_localctx).s1.node);
				}
				}
				setState(108);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(118);
			_la = _input.LA(1);
			if (_la==ELSE) {
				{
				setState(109);
				match(ELSE);
				setState(115);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << COMMENT) | (1L << UP) | (1L << LEFT) | (1L << RIGHT) | (1L << DOWN) | (1L << DROP) | (1L << PICK) | (1L << DOLLAR) | (1L << IF) | (1L << VAR) | (1L << ID))) != 0)) {
					{
					{
					setState(110);
					((If_else_conditionalContext)_localctx).s2 = sentence();
					elseBody.add(((If_else_conditionalContext)_localctx).s2.node);
					}
					}
					setState(117);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				}
			}

			setState(120);
			match(END);
			setState(121);
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
		enterRule(_localctx, 6, RULE_parameters);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(124);
			match(VAR);
			setState(125);
			match(ID);
			setState(127);
			_la = _input.LA(1);
			if (_la==COMMA) {
				{
				setState(126);
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
		enterRule(_localctx, 8, RULE_function);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(129);
			match(DEFINE);
			setState(130);
			match(ID);
			setState(131);
			match(PARENTHESIS);
			setState(135);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==VAR) {
				{
				{
				setState(132);
				parameters();
				}
				}
				setState(137);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(138);
			match(RIGHTPARENTHESIS);
			setState(139);
			match(ARROW_RIGHT);
			setState(143);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << COMMENT) | (1L << UP) | (1L << LEFT) | (1L << RIGHT) | (1L << DOWN) | (1L << DROP) | (1L << PICK) | (1L << DOLLAR) | (1L << IF) | (1L << VAR) | (1L << ID))) != 0)) {
				{
				{
				setState(140);
				sentence();
				}
				}
				setState(145);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(146);
			match(END);
			setState(147);
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
		enterRule(_localctx, 10, RULE_up_movement);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(149);
			match(UP);
			setState(150);
			((Up_movementContext)_localctx).expression = expression();
			setState(151);
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
		enterRule(_localctx, 12, RULE_left_movement);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(154);
			match(LEFT);
			setState(155);
			((Left_movementContext)_localctx).expression = expression();
			setState(156);
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
		enterRule(_localctx, 14, RULE_right_movement);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(159);
			match(RIGHT);
			setState(160);
			((Right_movementContext)_localctx).expression = expression();
			setState(161);
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
		enterRule(_localctx, 16, RULE_down_movement);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(164);
			match(DOWN);
			setState(165);
			((Down_movementContext)_localctx).expression = expression();
			setState(166);
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
		enterRule(_localctx, 18, RULE_pick);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(169);
			match(PICK);
			setState(170);
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
		enterRule(_localctx, 20, RULE_drop);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(173);
			match(DROP);
			setState(174);
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
		enterRule(_localctx, 22, RULE_declaration);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(177);
			match(VAR);
			setState(178);
			((DeclarationContext)_localctx).ID = match(ID);
			setState(179);
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
		enterRule(_localctx, 24, RULE_assignment);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(182);
			((AssignmentContext)_localctx).ID = match(ID);
			setState(183);
			match(ASSIGN);
			setState(184);
			((AssignmentContext)_localctx).expression = expression();
			setState(185);
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
		enterRule(_localctx, 26, RULE_both);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(188);
			match(VAR);
			setState(189);
			((BothContext)_localctx).ID = match(ID);
			setState(190);
			match(ASSIGN);
			setState(191);
			((BothContext)_localctx).expression = expression();
			setState(192);
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
		enterRule(_localctx, 28, RULE_output);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(195);
			match(DOLLAR);
			{
			setState(196);
			((OutputContext)_localctx).expression = expression();
			((OutputContext)_localctx).node =  new Output(((OutputContext)_localctx).expression.node);
			}
			setState(199);
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
		enterRule(_localctx, 30, RULE_expression);
		try {
			setState(209);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,8,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(201);
				((ExpressionContext)_localctx).dato = dato();
				((ExpressionContext)_localctx).node =  ((ExpressionContext)_localctx).dato.node;
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(204);
				((ExpressionContext)_localctx).arithmetic = arithmetic();
				((ExpressionContext)_localctx).node =  ((ExpressionContext)_localctx).arithmetic.node;
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(207);
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
		enterRule(_localctx, 32, RULE_arithmetic);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(211);
			((ArithmeticContext)_localctx).t1 = factor();
			((ArithmeticContext)_localctx).node =  ((ArithmeticContext)_localctx).t1.node;
			setState(223);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==PLUS || _la==SUBTRACTION) {
				{
				setState(221);
				switch (_input.LA(1)) {
				case PLUS:
					{
					setState(213);
					match(PLUS);
					setState(214);
					((ArithmeticContext)_localctx).t2 = factor();
					((ArithmeticContext)_localctx).node =  new Addition(_localctx.node,((ArithmeticContext)_localctx).t2.node);
					}
					break;
				case SUBTRACTION:
					{
					setState(217);
					match(SUBTRACTION);
					setState(218);
					((ArithmeticContext)_localctx).t2 = factor();
					((ArithmeticContext)_localctx).node =  new Substraction(_localctx.node,((ArithmeticContext)_localctx).t2.node);
					}
					break;
				default:
					throw new NoViableAltException(this);
				}
				}
				setState(225);
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
		enterRule(_localctx, 34, RULE_factor);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(226);
			((FactorContext)_localctx).t1 = term();
			((FactorContext)_localctx).node =  ((FactorContext)_localctx).t1.node;
			setState(238);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==MULTIPLICATION || _la==DIVISION) {
				{
				setState(236);
				switch (_input.LA(1)) {
				case MULTIPLICATION:
					{
					setState(228);
					match(MULTIPLICATION);
					setState(229);
					((FactorContext)_localctx).t2 = term();
					((FactorContext)_localctx).node =  new Multiplication(_localctx.node,((FactorContext)_localctx).t2.node);
					}
					break;
				case DIVISION:
					{
					setState(232);
					match(DIVISION);
					setState(233);
					((FactorContext)_localctx).t2 = term();
					((FactorContext)_localctx).node =  new Division(_localctx.node,((FactorContext)_localctx).t2.node);
					}
					break;
				default:
					throw new NoViableAltException(this);
				}
				}
				setState(240);
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
		enterRule(_localctx, 36, RULE_term);
		try {
			setState(254);
			switch (_input.LA(1)) {
			case NUMBER:
				enterOuterAlt(_localctx, 1);
				{
				setState(241);
				((TermContext)_localctx).NUMBER = match(NUMBER);
				((TermContext)_localctx).node =  new Constant(Integer.parseInt((((TermContext)_localctx).NUMBER!=null?((TermContext)_localctx).NUMBER.getText():null)));
				}
				break;
			case FALSE:
				enterOuterAlt(_localctx, 2);
				{
				setState(243);
				match(FALSE);
				((TermContext)_localctx).node =  new Constant(false);
				}
				break;
			case TRUE:
				enterOuterAlt(_localctx, 3);
				{
				setState(245);
				match(TRUE);
				((TermContext)_localctx).node =  new Constant(true);
				}
				break;
			case ID:
				enterOuterAlt(_localctx, 4);
				{
				setState(247);
				((TermContext)_localctx).ID = match(ID);
				((TermContext)_localctx).node =  new VarReference((((TermContext)_localctx).ID!=null?((TermContext)_localctx).ID.getText():null));
				}
				break;
			case PARENTHESIS:
				enterOuterAlt(_localctx, 5);
				{
				setState(249);
				match(PARENTHESIS);
				setState(250);
				((TermContext)_localctx).arithmetic = arithmetic();
				((TermContext)_localctx).node = ((TermContext)_localctx).arithmetic.node;
				setState(252);
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
		enterRule(_localctx, 38, RULE_dato);
		try {
			setState(266);
			switch (_input.LA(1)) {
			case STRING:
				enterOuterAlt(_localctx, 1);
				{
				setState(256);
				((DatoContext)_localctx).STRING = match(STRING);
				((DatoContext)_localctx).node =  new Constant((((DatoContext)_localctx).STRING!=null?((DatoContext)_localctx).STRING.getText():null));
				}
				break;
			case FALSE:
				enterOuterAlt(_localctx, 2);
				{
				setState(258);
				match(FALSE);
				((DatoContext)_localctx).node =  new Constant(false);
				}
				break;
			case TRUE:
				enterOuterAlt(_localctx, 3);
				{
				setState(260);
				match(TRUE);
				((DatoContext)_localctx).node =  new Constant(true);
				}
				break;
			case NUMBER:
				enterOuterAlt(_localctx, 4);
				{
				setState(262);
				((DatoContext)_localctx).NUMBER = match(NUMBER);
				((DatoContext)_localctx).node =  new Constant(Integer.parseInt((((DatoContext)_localctx).NUMBER!=null?((DatoContext)_localctx).NUMBER.getText():null)));
				}
				break;
			case FLOAT:
				enterOuterAlt(_localctx, 5);
				{
				setState(264);
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
		enterRule(_localctx, 40, RULE_logic);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(268);
			((LogicContext)_localctx).c1 = comparation();
			((LogicContext)_localctx).node = ((LogicContext)_localctx).c1.node;
			setState(279);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==AND || _la==OR) {
				{
				setState(277);
				switch (_input.LA(1)) {
				case AND:
					{
					setState(270);
					match(AND);
					setState(271);
					((LogicContext)_localctx).c2 = comparation();
					((LogicContext)_localctx).node =  new And(_localctx.node,((LogicContext)_localctx).c2.node);
					}
					break;
				case OR:
					{
					setState(274);
					((LogicContext)_localctx).logic_or = logic_or();
					((LogicContext)_localctx).node =  new Or(_localctx.node,((LogicContext)_localctx).logic_or.node);
					}
					break;
				default:
					throw new NoViableAltException(this);
				}
				}
				setState(281);
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
		enterRule(_localctx, 42, RULE_logic_or);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(282);
			match(OR);
			setState(283);
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
		enterRule(_localctx, 44, RULE_comparation);
		try {
			setState(324);
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
				setState(319);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,18,_ctx) ) {
				case 1:
					{
					setState(286);
					((ComparationContext)_localctx).e1 = expression();
					((ComparationContext)_localctx).node =  ((ComparationContext)_localctx).e1.node;
					setState(312);
					switch (_input.LA(1)) {
					case LEFT:
						{
						setState(288);
						match(LEFT);
						setState(289);
						((ComparationContext)_localctx).e2 = expression();
						((ComparationContext)_localctx).node =  new Minor(((ComparationContext)_localctx).e1.node,((ComparationContext)_localctx).e2.node);
						}
						break;
					case RIGHT:
						{
						setState(292);
						match(RIGHT);
						setState(293);
						((ComparationContext)_localctx).e3 = expression();
						((ComparationContext)_localctx).node =  new Mayor(((ComparationContext)_localctx).e1.node,((ComparationContext)_localctx).e3.node);
						}
						break;
					case MINOREQ:
						{
						setState(296);
						match(MINOREQ);
						setState(297);
						((ComparationContext)_localctx).e4 = expression();
						((ComparationContext)_localctx).node =  new Minoreq(((ComparationContext)_localctx).e1.node,((ComparationContext)_localctx).e4.node);
						}
						break;
					case MAYOREQ:
						{
						setState(300);
						match(MAYOREQ);
						setState(301);
						((ComparationContext)_localctx).e5 = expression();
						((ComparationContext)_localctx).node =  new Mayoreq(((ComparationContext)_localctx).e1.node,((ComparationContext)_localctx).e5.node);
						}
						break;
					case EQUAL:
						{
						setState(304);
						match(EQUAL);
						setState(305);
						((ComparationContext)_localctx).e6 = expression();
						((ComparationContext)_localctx).node =  new Equal(((ComparationContext)_localctx).e1.node,((ComparationContext)_localctx).e6.node);
						}
						break;
					case NOTEQUAL:
						{
						setState(308);
						match(NOTEQUAL);
						setState(309);
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
					setState(314);
					match(PARENTHESIS);
					setState(315);
					((ComparationContext)_localctx).logic = logic();
					((ComparationContext)_localctx).node = ((ComparationContext)_localctx).logic.node;
					setState(317);
					match(RIGHTPARENTHESIS);
					}
					break;
				}
				}
				break;
			case NOT:
				enterOuterAlt(_localctx, 2);
				{
				setState(321);
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
		enterRule(_localctx, 46, RULE_not);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(326);
			match(NOT);
			setState(327);
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
		enterRule(_localctx, 48, RULE_comment);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(330);
			match(COMMENT);
			setState(331);
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
		"\3\u0430\ud6d1\u8206\uad2d\u4417\uaef1\u8d80\uaadd\3.\u0150\4\2\t\2\4"+
		"\3\t\3\4\4\t\4\4\5\t\5\4\6\t\6\4\7\t\7\4\b\t\b\4\t\t\t\4\n\t\n\4\13\t"+
		"\13\4\f\t\f\4\r\t\r\4\16\t\16\4\17\t\17\4\20\t\20\4\21\t\21\4\22\t\22"+
		"\4\23\t\23\4\24\t\24\4\25\t\25\4\26\t\26\4\27\t\27\4\30\t\30\4\31\t\31"+
		"\4\32\t\32\3\2\3\2\3\2\3\2\7\29\n\2\f\2\16\2<\13\2\3\2\3\2\3\3\3\3\3\3"+
		"\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3"+
		"\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\5\3b\n\3\3\4\3"+
		"\4\3\4\3\4\3\4\3\4\3\4\7\4k\n\4\f\4\16\4n\13\4\3\4\3\4\3\4\3\4\7\4t\n"+
		"\4\f\4\16\4w\13\4\5\4y\n\4\3\4\3\4\3\4\3\4\3\5\3\5\3\5\5\5\u0082\n\5\3"+
		"\6\3\6\3\6\3\6\7\6\u0088\n\6\f\6\16\6\u008b\13\6\3\6\3\6\3\6\7\6\u0090"+
		"\n\6\f\6\16\6\u0093\13\6\3\6\3\6\3\6\3\7\3\7\3\7\3\7\3\7\3\b\3\b\3\b\3"+
		"\b\3\b\3\t\3\t\3\t\3\t\3\t\3\n\3\n\3\n\3\n\3\n\3\13\3\13\3\13\3\13\3\f"+
		"\3\f\3\f\3\f\3\r\3\r\3\r\3\r\3\r\3\16\3\16\3\16\3\16\3\16\3\16\3\17\3"+
		"\17\3\17\3\17\3\17\3\17\3\17\3\20\3\20\3\20\3\20\3\20\3\20\3\21\3\21\3"+
		"\21\3\21\3\21\3\21\3\21\3\21\5\21\u00d4\n\21\3\22\3\22\3\22\3\22\3\22"+
		"\3\22\3\22\3\22\3\22\3\22\7\22\u00e0\n\22\f\22\16\22\u00e3\13\22\3\23"+
		"\3\23\3\23\3\23\3\23\3\23\3\23\3\23\3\23\3\23\7\23\u00ef\n\23\f\23\16"+
		"\23\u00f2\13\23\3\24\3\24\3\24\3\24\3\24\3\24\3\24\3\24\3\24\3\24\3\24"+
		"\3\24\3\24\5\24\u0101\n\24\3\25\3\25\3\25\3\25\3\25\3\25\3\25\3\25\3\25"+
		"\3\25\5\25\u010d\n\25\3\26\3\26\3\26\3\26\3\26\3\26\3\26\3\26\3\26\7\26"+
		"\u0118\n\26\f\26\16\26\u011b\13\26\3\27\3\27\3\27\3\27\3\30\3\30\3\30"+
		"\3\30\3\30\3\30\3\30\3\30\3\30\3\30\3\30\3\30\3\30\3\30\3\30\3\30\3\30"+
		"\3\30\3\30\3\30\3\30\3\30\3\30\3\30\3\30\3\30\5\30\u013b\n\30\3\30\3\30"+
		"\3\30\3\30\3\30\5\30\u0142\n\30\3\30\3\30\3\30\5\30\u0147\n\30\3\31\3"+
		"\31\3\31\3\31\3\32\3\32\3\32\3\32\2\2\33\2\4\6\b\n\f\16\20\22\24\26\30"+
		"\32\34\36 \"$&(*,.\60\62\2\2\u0160\2\64\3\2\2\2\4a\3\2\2\2\6c\3\2\2\2"+
		"\b~\3\2\2\2\n\u0083\3\2\2\2\f\u0097\3\2\2\2\16\u009c\3\2\2\2\20\u00a1"+
		"\3\2\2\2\22\u00a6\3\2\2\2\24\u00ab\3\2\2\2\26\u00af\3\2\2\2\30\u00b3\3"+
		"\2\2\2\32\u00b8\3\2\2\2\34\u00be\3\2\2\2\36\u00c5\3\2\2\2 \u00d3\3\2\2"+
		"\2\"\u00d5\3\2\2\2$\u00e4\3\2\2\2&\u0100\3\2\2\2(\u010c\3\2\2\2*\u010e"+
		"\3\2\2\2,\u011c\3\2\2\2.\u0146\3\2\2\2\60\u0148\3\2\2\2\62\u014c\3\2\2"+
		"\2\64:\b\2\1\2\65\66\5\4\3\2\66\67\b\2\1\2\679\3\2\2\28\65\3\2\2\29<\3"+
		"\2\2\2:8\3\2\2\2:;\3\2\2\2;=\3\2\2\2<:\3\2\2\2=>\b\2\1\2>\3\3\2\2\2?@"+
		"\5\36\20\2@A\b\3\1\2Ab\3\2\2\2Bb\5\62\32\2CD\5\6\4\2DE\b\3\1\2Eb\3\2\2"+
		"\2FG\5\22\n\2GH\b\3\1\2Hb\3\2\2\2IJ\5\f\7\2JK\b\3\1\2Kb\3\2\2\2LM\5\16"+
		"\b\2MN\b\3\1\2Nb\3\2\2\2OP\5\20\t\2PQ\b\3\1\2Qb\3\2\2\2RS\5\30\r\2ST\b"+
		"\3\1\2Tb\3\2\2\2UV\5\32\16\2VW\b\3\1\2Wb\3\2\2\2XY\5\34\17\2YZ\b\3\1\2"+
		"Zb\3\2\2\2[\\\5\24\13\2\\]\b\3\1\2]b\3\2\2\2^_\5\26\f\2_`\b\3\1\2`b\3"+
		"\2\2\2a?\3\2\2\2aB\3\2\2\2aC\3\2\2\2aF\3\2\2\2aI\3\2\2\2aL\3\2\2\2aO\3"+
		"\2\2\2aR\3\2\2\2aU\3\2\2\2aX\3\2\2\2a[\3\2\2\2a^\3\2\2\2b\5\3\2\2\2cd"+
		"\7\31\2\2de\5*\26\2ef\7\33\2\2fl\b\4\1\2gh\5\4\3\2hi\b\4\1\2ik\3\2\2\2"+
		"jg\3\2\2\2kn\3\2\2\2lj\3\2\2\2lm\3\2\2\2mx\3\2\2\2nl\3\2\2\2ou\7\32\2"+
		"\2pq\5\4\3\2qr\b\4\1\2rt\3\2\2\2sp\3\2\2\2tw\3\2\2\2us\3\2\2\2uv\3\2\2"+
		"\2vy\3\2\2\2wu\3\2\2\2xo\3\2\2\2xy\3\2\2\2yz\3\2\2\2z{\7\34\2\2{|\7\20"+
		"\2\2|}\b\4\1\2}\7\3\2\2\2~\177\7,\2\2\177\u0081\7-\2\2\u0080\u0082\7\25"+
		"\2\2\u0081\u0080\3\2\2\2\u0081\u0082\3\2\2\2\u0082\t\3\2\2\2\u0083\u0084"+
		"\7(\2\2\u0084\u0085\7-\2\2\u0085\u0089\7&\2\2\u0086\u0088\5\b\5\2\u0087"+
		"\u0086\3\2\2\2\u0088\u008b\3\2\2\2\u0089\u0087\3\2\2\2\u0089\u008a\3\2"+
		"\2\2\u008a\u008c\3\2\2\2\u008b\u0089\3\2\2\2\u008c\u008d\7\'\2\2\u008d"+
		"\u0091\7\33\2\2\u008e\u0090\5\4\3\2\u008f\u008e\3\2\2\2\u0090\u0093\3"+
		"\2\2\2\u0091\u008f\3\2\2\2\u0091\u0092\3\2\2\2\u0092\u0094\3\2\2\2\u0093"+
		"\u0091\3\2\2\2\u0094\u0095\7\34\2\2\u0095\u0096\7\20\2\2\u0096\13\3\2"+
		"\2\2\u0097\u0098\7\n\2\2\u0098\u0099\5 \21\2\u0099\u009a\7\20\2\2\u009a"+
		"\u009b\b\7\1\2\u009b\r\3\2\2\2\u009c\u009d\7\13\2\2\u009d\u009e\5 \21"+
		"\2\u009e\u009f\7\20\2\2\u009f\u00a0\b\b\1\2\u00a0\17\3\2\2\2\u00a1\u00a2"+
		"\7\f\2\2\u00a2\u00a3\5 \21\2\u00a3\u00a4\7\20\2\2\u00a4\u00a5\b\t\1\2"+
		"\u00a5\21\3\2\2\2\u00a6\u00a7\7\r\2\2\u00a7\u00a8\5 \21\2\u00a8\u00a9"+
		"\7\20\2\2\u00a9\u00aa\b\n\1\2\u00aa\23\3\2\2\2\u00ab\u00ac\7\17\2\2\u00ac"+
		"\u00ad\7\20\2\2\u00ad\u00ae\b\13\1\2\u00ae\25\3\2\2\2\u00af\u00b0\7\16"+
		"\2\2\u00b0\u00b1\7\20\2\2\u00b1\u00b2\b\f\1\2\u00b2\27\3\2\2\2\u00b3\u00b4"+
		"\7,\2\2\u00b4\u00b5\7-\2\2\u00b5\u00b6\7\20\2\2\u00b6\u00b7\b\r\1\2\u00b7"+
		"\31\3\2\2\2\u00b8\u00b9\7-\2\2\u00b9\u00ba\7\26\2\2\u00ba\u00bb\5 \21"+
		"\2\u00bb\u00bc\7\20\2\2\u00bc\u00bd\b\16\1\2\u00bd\33\3\2\2\2\u00be\u00bf"+
		"\7,\2\2\u00bf\u00c0\7-\2\2\u00c0\u00c1\7\26\2\2\u00c1\u00c2\5 \21\2\u00c2"+
		"\u00c3\7\20\2\2\u00c3\u00c4\b\17\1\2\u00c4\35\3\2\2\2\u00c5\u00c6\7\30"+
		"\2\2\u00c6\u00c7\5 \21\2\u00c7\u00c8\b\20\1\2\u00c8\u00c9\3\2\2\2\u00c9"+
		"\u00ca\7\20\2\2\u00ca\37\3\2\2\2\u00cb\u00cc\5(\25\2\u00cc\u00cd\b\21"+
		"\1\2\u00cd\u00d4\3\2\2\2\u00ce\u00cf\5\"\22\2\u00cf\u00d0\b\21\1\2\u00d0"+
		"\u00d4\3\2\2\2\u00d1\u00d2\7-\2\2\u00d2\u00d4\b\21\1\2\u00d3\u00cb\3\2"+
		"\2\2\u00d3\u00ce\3\2\2\2\u00d3\u00d1\3\2\2\2\u00d4!\3\2\2\2\u00d5\u00d6"+
		"\5$\23\2\u00d6\u00e1\b\22\1\2\u00d7\u00d8\7\21\2\2\u00d8\u00d9\5$\23\2"+
		"\u00d9\u00da\b\22\1\2\u00da\u00e0\3\2\2\2\u00db\u00dc\7\22\2\2\u00dc\u00dd"+
		"\5$\23\2\u00dd\u00de\b\22\1\2\u00de\u00e0\3\2\2\2\u00df\u00d7\3\2\2\2"+
		"\u00df\u00db\3\2\2\2\u00e0\u00e3\3\2\2\2\u00e1\u00df\3\2\2\2\u00e1\u00e2"+
		"\3\2\2\2\u00e2#\3\2\2\2\u00e3\u00e1\3\2\2\2\u00e4\u00e5\5&\24\2\u00e5"+
		"\u00f0\b\23\1\2\u00e6\u00e7\7\23\2\2\u00e7\u00e8\5&\24\2\u00e8\u00e9\b"+
		"\23\1\2\u00e9\u00ef\3\2\2\2\u00ea\u00eb\7\24\2\2\u00eb\u00ec\5&\24\2\u00ec"+
		"\u00ed\b\23\1\2\u00ed\u00ef\3\2\2\2\u00ee\u00e6\3\2\2\2\u00ee\u00ea\3"+
		"\2\2\2\u00ef\u00f2\3\2\2\2\u00f0\u00ee\3\2\2\2\u00f0\u00f1\3\2\2\2\u00f1"+
		"%\3\2\2\2\u00f2\u00f0\3\2\2\2\u00f3\u00f4\7\6\2\2\u00f4\u0101\b\24\1\2"+
		"\u00f5\u00f6\7\5\2\2\u00f6\u0101\b\24\1\2\u00f7\u00f8\7\4\2\2\u00f8\u0101"+
		"\b\24\1\2\u00f9\u00fa\7-\2\2\u00fa\u0101\b\24\1\2\u00fb\u00fc\7&\2\2\u00fc"+
		"\u00fd\5\"\22\2\u00fd\u00fe\b\24\1\2\u00fe\u00ff\7\'\2\2\u00ff\u0101\3"+
		"\2\2\2\u0100\u00f3\3\2\2\2\u0100\u00f5\3\2\2\2\u0100\u00f7\3\2\2\2\u0100"+
		"\u00f9\3\2\2\2\u0100\u00fb\3\2\2\2\u0101\'\3\2\2\2\u0102\u0103\7\3\2\2"+
		"\u0103\u010d\b\25\1\2\u0104\u0105\7\5\2\2\u0105\u010d\b\25\1\2\u0106\u0107"+
		"\7\4\2\2\u0107\u010d\b\25\1\2\u0108\u0109\7\6\2\2\u0109\u010d\b\25\1\2"+
		"\u010a\u010b\7\7\2\2\u010b\u010d\b\25\1\2\u010c\u0102\3\2\2\2\u010c\u0104"+
		"\3\2\2\2\u010c\u0106\3\2\2\2\u010c\u0108\3\2\2\2\u010c\u010a\3\2\2\2\u010d"+
		")\3\2\2\2\u010e\u010f\5.\30\2\u010f\u0119\b\26\1\2\u0110\u0111\7\35\2"+
		"\2\u0111\u0112\5.\30\2\u0112\u0113\b\26\1\2\u0113\u0118\3\2\2\2\u0114"+
		"\u0115\5,\27\2\u0115\u0116\b\26\1\2\u0116\u0118\3\2\2\2\u0117\u0110\3"+
		"\2\2\2\u0117\u0114\3\2\2\2\u0118\u011b\3\2\2\2\u0119\u0117\3\2\2\2\u0119"+
		"\u011a\3\2\2\2\u011a+\3\2\2\2\u011b\u0119\3\2\2\2\u011c\u011d\7\36\2\2"+
		"\u011d\u011e\5.\30\2\u011e\u011f\b\27\1\2\u011f-\3\2\2\2\u0120\u0121\5"+
		" \21\2\u0121\u013a\b\30\1\2\u0122\u0123\7\13\2\2\u0123\u0124\5 \21\2\u0124"+
		"\u0125\b\30\1\2\u0125\u013b\3\2\2\2\u0126\u0127\7\f\2\2\u0127\u0128\5"+
		" \21\2\u0128\u0129\b\30\1\2\u0129\u013b\3\2\2\2\u012a\u012b\7\"\2\2\u012b"+
		"\u012c\5 \21\2\u012c\u012d\b\30\1\2\u012d\u013b\3\2\2\2\u012e\u012f\7"+
		"#\2\2\u012f\u0130\5 \21\2\u0130\u0131\b\30\1\2\u0131\u013b\3\2\2\2\u0132"+
		"\u0133\7$\2\2\u0133\u0134\5 \21\2\u0134\u0135\b\30\1\2\u0135\u013b\3\2"+
		"\2\2\u0136\u0137\7%\2\2\u0137\u0138\5 \21\2\u0138\u0139\b\30\1\2\u0139"+
		"\u013b\3\2\2\2\u013a\u0122\3\2\2\2\u013a\u0126\3\2\2\2\u013a\u012a\3\2"+
		"\2\2\u013a\u012e\3\2\2\2\u013a\u0132\3\2\2\2\u013a\u0136\3\2\2\2\u013a"+
		"\u013b\3\2\2\2\u013b\u0142\3\2\2\2\u013c\u013d\7&\2\2\u013d\u013e\5*\26"+
		"\2\u013e\u013f\b\30\1\2\u013f\u0140\7\'\2\2\u0140\u0142\3\2\2\2\u0141"+
		"\u0120\3\2\2\2\u0141\u013c\3\2\2\2\u0142\u0147\3\2\2\2\u0143\u0144\5\60"+
		"\31\2\u0144\u0145\b\30\1\2\u0145\u0147\3\2\2\2\u0146\u0141\3\2\2\2\u0146"+
		"\u0143\3\2\2\2\u0147/\3\2\2\2\u0148\u0149\7\37\2\2\u0149\u014a\5.\30\2"+
		"\u014a\u014b\b\31\1\2\u014b\61\3\2\2\2\u014c\u014d\7\t\2\2\u014d\u014e"+
		"\7\3\2\2\u014e\63\3\2\2\2\26:alux\u0081\u0089\u0091\u00d3\u00df\u00e1"+
		"\u00ee\u00f0\u0100\u010c\u0117\u0119\u013a\u0141\u0146";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}
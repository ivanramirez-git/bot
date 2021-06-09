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
		STRING=1, TRUE=2, FALSE=3, NUMBER=4, BOOLEAN=5, COMMENT=6, UP=7, LEFT=8, 
		RIGHT=9, DOWN=10, DROP=11, PICK=12, SEMICOLON=13, PLUS=14, SUBTRACTION=15, 
		MULTIPLICATION=16, DIVISION=17, COMMA=18, ASSIGN=19, QUESTION=20, DOLLAR=21, 
		IF=22, ELSE=23, ARROW_RIGHT=24, END=25, AND=26, OR=27, NOT=28, MINOR=29, 
		MAYOR=30, MINOREQ=31, MAYOREQ=32, EQUAL=33, NOTEQUAL=34, PARENTHESIS=35, 
		RIGHTPARENTHESIS=36, DEFINE=37, WHILE=38, BR_OPEN=39, BR_CLOSE=40, VAR=41, 
		ID=42, WS=43;
	public static final int
		RULE_program = 0, RULE_sentence = 1, RULE_if_else_conditional = 2, RULE_while_cicle = 3, 
		RULE_function_declaration = 4, RULE_function_call = 5, RULE_up_movement = 6, 
		RULE_left_movement = 7, RULE_right_movement = 8, RULE_down_movement = 9, 
		RULE_pick = 10, RULE_drop = 11, RULE_declaration = 12, RULE_assignment = 13, 
		RULE_both = 14, RULE_output = 15, RULE_input = 16, RULE_expression = 17, 
		RULE_arithmetic = 18, RULE_factor = 19, RULE_term = 20, RULE_dato = 21, 
		RULE_logic = 22, RULE_logic_or = 23, RULE_comparation = 24, RULE_not = 25, 
		RULE_comment = 26;
	public static final String[] ruleNames = {
		"program", "sentence", "if_else_conditional", "while_cicle", "function_declaration", 
		"function_call", "up_movement", "left_movement", "right_movement", "down_movement", 
		"pick", "drop", "declaration", "assignment", "both", "output", "input", 
		"expression", "arithmetic", "factor", "term", "dato", "logic", "logic_or", 
		"comparation", "not", "comment"
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
					Context context= new Context();
				
			setState(60);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << UP) | (1L << LEFT) | (1L << RIGHT) | (1L << DOWN) | (1L << DROP) | (1L << PICK) | (1L << QUESTION) | (1L << DOLLAR) | (1L << IF) | (1L << DEFINE) | (1L << WHILE) | (1L << VAR) | (1L << ID))) != 0)) {
				{
				{
				setState(55);
				((ProgramContext)_localctx).sentence = sentence();
				body.add(((ProgramContext)_localctx).sentence.node);
				}
				}
				setState(62);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}

					for(ASTNode n: body){
						n.execute(context);
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
		public Function_declarationContext function_declaration;
		public Function_callContext function_call;
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
		public InputContext input;
		public OutputContext output() {
			return getRuleContext(OutputContext.class,0);
		}
		public Function_declarationContext function_declaration() {
			return getRuleContext(Function_declarationContext.class,0);
		}
		public Function_callContext function_call() {
			return getRuleContext(Function_callContext.class,0);
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
		public InputContext input() {
			return getRuleContext(InputContext.class,0);
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
			setState(110);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,1,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(65);
				((SentenceContext)_localctx).output = output();
				((SentenceContext)_localctx).node = ((SentenceContext)_localctx).output.node;
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(68);
				((SentenceContext)_localctx).function_declaration = function_declaration();
				((SentenceContext)_localctx).node =  ((SentenceContext)_localctx).function_declaration.node;
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(71);
				((SentenceContext)_localctx).function_call = function_call();
				((SentenceContext)_localctx).node =  ((SentenceContext)_localctx).function_call.node;
				}
				break;
			case 4:
				enterOuterAlt(_localctx, 4);
				{
				setState(74);
				((SentenceContext)_localctx).if_else_conditional = if_else_conditional();
				((SentenceContext)_localctx).node = ((SentenceContext)_localctx).if_else_conditional.node;
				}
				break;
			case 5:
				enterOuterAlt(_localctx, 5);
				{
				setState(77);
				((SentenceContext)_localctx).while_cicle = while_cicle();
				((SentenceContext)_localctx).node =  ((SentenceContext)_localctx).while_cicle.node;
				}
				break;
			case 6:
				enterOuterAlt(_localctx, 6);
				{
				setState(80);
				((SentenceContext)_localctx).down_movement = down_movement();
				((SentenceContext)_localctx).node = ((SentenceContext)_localctx).down_movement.node;
				}
				break;
			case 7:
				enterOuterAlt(_localctx, 7);
				{
				setState(83);
				((SentenceContext)_localctx).up_movement = up_movement();
				((SentenceContext)_localctx).node = ((SentenceContext)_localctx).up_movement.node;
				}
				break;
			case 8:
				enterOuterAlt(_localctx, 8);
				{
				setState(86);
				((SentenceContext)_localctx).left_movement = left_movement();
				((SentenceContext)_localctx).node = ((SentenceContext)_localctx).left_movement.node;
				}
				break;
			case 9:
				enterOuterAlt(_localctx, 9);
				{
				setState(89);
				((SentenceContext)_localctx).right_movement = right_movement();
				((SentenceContext)_localctx).node = ((SentenceContext)_localctx).right_movement.node;
				}
				break;
			case 10:
				enterOuterAlt(_localctx, 10);
				{
				setState(92);
				((SentenceContext)_localctx).declaration = declaration();
				((SentenceContext)_localctx).node = ((SentenceContext)_localctx).declaration.node;
				}
				break;
			case 11:
				enterOuterAlt(_localctx, 11);
				{
				setState(95);
				((SentenceContext)_localctx).assignment = assignment();
				((SentenceContext)_localctx).node = ((SentenceContext)_localctx).assignment.node;
				}
				break;
			case 12:
				enterOuterAlt(_localctx, 12);
				{
				setState(98);
				((SentenceContext)_localctx).both = both();
				((SentenceContext)_localctx).node = ((SentenceContext)_localctx).both.node;
				}
				break;
			case 13:
				enterOuterAlt(_localctx, 13);
				{
				setState(101);
				((SentenceContext)_localctx).pick = pick();
				((SentenceContext)_localctx).node = ((SentenceContext)_localctx).pick.node;
				}
				break;
			case 14:
				enterOuterAlt(_localctx, 14);
				{
				setState(104);
				((SentenceContext)_localctx).drop = drop();
				((SentenceContext)_localctx).node = ((SentenceContext)_localctx).drop.node;
				}
				break;
			case 15:
				enterOuterAlt(_localctx, 15);
				{
				setState(107);
				((SentenceContext)_localctx).input = input();
				((SentenceContext)_localctx).node = ((SentenceContext)_localctx).input.node;
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
			setState(112);
			match(IF);
			setState(113);
			((If_else_conditionalContext)_localctx).logic = logic();
			setState(114);
			match(ARROW_RIGHT);

					List<ASTNode> body = new ArrayList<ASTNode>();
					List<ASTNode> elseBody = new ArrayList<ASTNode>();
				
			setState(121);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << UP) | (1L << LEFT) | (1L << RIGHT) | (1L << DOWN) | (1L << DROP) | (1L << PICK) | (1L << QUESTION) | (1L << DOLLAR) | (1L << IF) | (1L << DEFINE) | (1L << WHILE) | (1L << VAR) | (1L << ID))) != 0)) {
				{
				{
				setState(116);
				((If_else_conditionalContext)_localctx).s1 = sentence();
				body.add(((If_else_conditionalContext)_localctx).s1.node);
				}
				}
				setState(123);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(133);
			_la = _input.LA(1);
			if (_la==ELSE) {
				{
				setState(124);
				match(ELSE);
				setState(130);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << UP) | (1L << LEFT) | (1L << RIGHT) | (1L << DOWN) | (1L << DROP) | (1L << PICK) | (1L << QUESTION) | (1L << DOLLAR) | (1L << IF) | (1L << DEFINE) | (1L << WHILE) | (1L << VAR) | (1L << ID))) != 0)) {
					{
					{
					setState(125);
					((If_else_conditionalContext)_localctx).s2 = sentence();
					elseBody.add(((If_else_conditionalContext)_localctx).s2.node);
					}
					}
					setState(132);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				}
			}

			setState(135);
			match(END);
			setState(136);
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
			setState(139);
			match(WHILE);
			setState(140);
			((While_cicleContext)_localctx).logic = logic();
			setState(141);
			match(ARROW_RIGHT);

					List<ASTNode> body = new ArrayList<ASTNode>();
				
			setState(148);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << UP) | (1L << LEFT) | (1L << RIGHT) | (1L << DOWN) | (1L << DROP) | (1L << PICK) | (1L << QUESTION) | (1L << DOLLAR) | (1L << IF) | (1L << DEFINE) | (1L << WHILE) | (1L << VAR) | (1L << ID))) != 0)) {
				{
				{
				setState(143);
				((While_cicleContext)_localctx).s1 = sentence();
				body.add(((While_cicleContext)_localctx).s1.node);
				}
				}
				setState(150);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(151);
			match(END);
			setState(152);
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

	public static class Function_declarationContext extends ParserRuleContext {
		public ASTNode node;
		public Token ID;
		public Token i1;
		public SentenceContext s1;
		public TerminalNode DEFINE() { return getToken(BotParser.DEFINE, 0); }
		public List<TerminalNode> ID() { return getTokens(BotParser.ID); }
		public TerminalNode ID(int i) {
			return getToken(BotParser.ID, i);
		}
		public TerminalNode PARENTHESIS() { return getToken(BotParser.PARENTHESIS, 0); }
		public TerminalNode RIGHTPARENTHESIS() { return getToken(BotParser.RIGHTPARENTHESIS, 0); }
		public TerminalNode ARROW_RIGHT() { return getToken(BotParser.ARROW_RIGHT, 0); }
		public TerminalNode END() { return getToken(BotParser.END, 0); }
		public TerminalNode SEMICOLON() { return getToken(BotParser.SEMICOLON, 0); }
		public List<TerminalNode> VAR() { return getTokens(BotParser.VAR); }
		public TerminalNode VAR(int i) {
			return getToken(BotParser.VAR, i);
		}
		public List<SentenceContext> sentence() {
			return getRuleContexts(SentenceContext.class);
		}
		public SentenceContext sentence(int i) {
			return getRuleContext(SentenceContext.class,i);
		}
		public List<TerminalNode> COMMA() { return getTokens(BotParser.COMMA); }
		public TerminalNode COMMA(int i) {
			return getToken(BotParser.COMMA, i);
		}
		public Function_declarationContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_function_declaration; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof BotListener ) ((BotListener)listener).enterFunction_declaration(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof BotListener ) ((BotListener)listener).exitFunction_declaration(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof BotVisitor ) return ((BotVisitor<? extends T>)visitor).visitFunction_declaration(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Function_declarationContext function_declaration() throws RecognitionException {
		Function_declarationContext _localctx = new Function_declarationContext(_ctx, getState());
		enterRule(_localctx, 8, RULE_function_declaration);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{

					List<String> head = new ArrayList<String>();
					List<ASTNode> body = new ArrayList<ASTNode>();
				
			setState(156);
			match(DEFINE);
			setState(157);
			((Function_declarationContext)_localctx).ID = match(ID);
			setState(158);
			match(PARENTHESIS);
			setState(167);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==VAR) {
				{
				{
				setState(159);
				match(VAR);
				setState(160);
				((Function_declarationContext)_localctx).i1 = match(ID);
				head.add((((Function_declarationContext)_localctx).i1!=null?((Function_declarationContext)_localctx).i1.getText():null));
				setState(163);
				_la = _input.LA(1);
				if (_la==COMMA) {
					{
					setState(162);
					match(COMMA);
					}
				}

				}
				}
				setState(169);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(170);
			match(RIGHTPARENTHESIS);
			setState(171);
			match(ARROW_RIGHT);
			setState(177);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << UP) | (1L << LEFT) | (1L << RIGHT) | (1L << DOWN) | (1L << DROP) | (1L << PICK) | (1L << QUESTION) | (1L << DOLLAR) | (1L << IF) | (1L << DEFINE) | (1L << WHILE) | (1L << VAR) | (1L << ID))) != 0)) {
				{
				{
				setState(172);
				((Function_declarationContext)_localctx).s1 = sentence();
				body.add(((Function_declarationContext)_localctx).s1.node);
				}
				}
				setState(179);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			((Function_declarationContext)_localctx).node =  new FunDeclaration((((Function_declarationContext)_localctx).ID!=null?((Function_declarationContext)_localctx).ID.getText():null),head,body);
			setState(181);
			match(END);
			setState(182);
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

	public static class Function_callContext extends ParserRuleContext {
		public ASTNode node;
		public Token ID;
		public ExpressionContext e1;
		public ExpressionContext e2;
		public TerminalNode ID() { return getToken(BotParser.ID, 0); }
		public TerminalNode PARENTHESIS() { return getToken(BotParser.PARENTHESIS, 0); }
		public TerminalNode RIGHTPARENTHESIS() { return getToken(BotParser.RIGHTPARENTHESIS, 0); }
		public TerminalNode SEMICOLON() { return getToken(BotParser.SEMICOLON, 0); }
		public List<ExpressionContext> expression() {
			return getRuleContexts(ExpressionContext.class);
		}
		public ExpressionContext expression(int i) {
			return getRuleContext(ExpressionContext.class,i);
		}
		public List<TerminalNode> COMMA() { return getTokens(BotParser.COMMA); }
		public TerminalNode COMMA(int i) {
			return getToken(BotParser.COMMA, i);
		}
		public Function_callContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_function_call; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof BotListener ) ((BotListener)listener).enterFunction_call(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof BotListener ) ((BotListener)listener).exitFunction_call(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof BotVisitor ) return ((BotVisitor<? extends T>)visitor).visitFunction_call(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Function_callContext function_call() throws RecognitionException {
		Function_callContext _localctx = new Function_callContext(_ctx, getState());
		enterRule(_localctx, 10, RULE_function_call);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(184);
			((Function_callContext)_localctx).ID = match(ID);
			setState(185);
			match(PARENTHESIS);

					List<ASTNode> head = new ArrayList<ASTNode>();	
				
			{
			setState(187);
			((Function_callContext)_localctx).e1 = expression();
			head.add(((Function_callContext)_localctx).e1.node);
			}
			setState(196);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==COMMA) {
				{
				{
				setState(190);
				match(COMMA);
				setState(191);
				((Function_callContext)_localctx).e2 = expression();
				head.add(((Function_callContext)_localctx).e2.node);
				}
				}
				setState(198);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			((Function_callContext)_localctx).node =  new FunCall((((Function_callContext)_localctx).ID!=null?((Function_callContext)_localctx).ID.getText():null),head);
			setState(200);
			match(RIGHTPARENTHESIS);
			setState(201);
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
			setState(203);
			match(UP);
			setState(204);
			((Up_movementContext)_localctx).expression = expression();
			setState(205);
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
			setState(208);
			match(LEFT);
			setState(209);
			((Left_movementContext)_localctx).expression = expression();
			setState(210);
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
			setState(213);
			match(RIGHT);
			setState(214);
			((Right_movementContext)_localctx).expression = expression();
			setState(215);
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
			setState(218);
			match(DOWN);
			setState(219);
			((Down_movementContext)_localctx).expression = expression();
			setState(220);
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
			setState(223);
			match(PICK);
			setState(224);
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
			setState(227);
			match(DROP);
			setState(228);
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
			setState(231);
			match(VAR);
			setState(232);
			((DeclarationContext)_localctx).ID = match(ID);
			setState(233);
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
			setState(236);
			((AssignmentContext)_localctx).ID = match(ID);
			setState(237);
			match(ASSIGN);
			setState(238);
			((AssignmentContext)_localctx).expression = expression();
			setState(239);
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
			setState(242);
			match(VAR);
			setState(243);
			((BothContext)_localctx).ID = match(ID);
			setState(244);
			match(ASSIGN);
			setState(245);
			((BothContext)_localctx).expression = expression();
			setState(246);
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
		public ExpressionContext prin;
		public TerminalNode DOLLAR() { return getToken(BotParser.DOLLAR, 0); }
		public TerminalNode SEMICOLON() { return getToken(BotParser.SEMICOLON, 0); }
		public List<ExpressionContext> expression() {
			return getRuleContexts(ExpressionContext.class);
		}
		public ExpressionContext expression(int i) {
			return getRuleContext(ExpressionContext.class,i);
		}
		public List<TerminalNode> PLUS() { return getTokens(BotParser.PLUS); }
		public TerminalNode PLUS(int i) {
			return getToken(BotParser.PLUS, i);
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
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(249);
			match(DOLLAR);

						List<ASTNode> cu = new ArrayList<ASTNode>();
					
			setState(259);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << STRING) | (1L << TRUE) | (1L << FALSE) | (1L << NUMBER) | (1L << PARENTHESIS) | (1L << ID))) != 0)) {
				{
				{
				{
				setState(251);
				((OutputContext)_localctx).prin = expression();
				cu.add(((OutputContext)_localctx).prin.node);
				}
				setState(255);
				_la = _input.LA(1);
				if (_la==PLUS) {
					{
					setState(254);
					match(PLUS);
					}
				}

				}
				}
				setState(261);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(262);
			match(SEMICOLON);

				 	((OutputContext)_localctx).node =  new Output(cu);
				 
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

	public static class InputContext extends ParserRuleContext {
		public ASTNode node;
		public Token ID;
		public TerminalNode QUESTION() { return getToken(BotParser.QUESTION, 0); }
		public TerminalNode ID() { return getToken(BotParser.ID, 0); }
		public TerminalNode SEMICOLON() { return getToken(BotParser.SEMICOLON, 0); }
		public InputContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_input; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof BotListener ) ((BotListener)listener).enterInput(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof BotListener ) ((BotListener)listener).exitInput(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof BotVisitor ) return ((BotVisitor<? extends T>)visitor).visitInput(this);
			else return visitor.visitChildren(this);
		}
	}

	public final InputContext input() throws RecognitionException {
		InputContext _localctx = new InputContext(_ctx, getState());
		enterRule(_localctx, 32, RULE_input);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(265);
			match(QUESTION);
			setState(266);
			((InputContext)_localctx).ID = match(ID);
			setState(267);
			match(SEMICOLON);

				 	{((InputContext)_localctx).node =  new  Input((((InputContext)_localctx).ID!=null?((InputContext)_localctx).ID.getText():null));};
				 
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
		public ArithmeticContext arithmetic;
		public DatoContext dato;
		public Token ID;
		public ArithmeticContext arithmetic() {
			return getRuleContext(ArithmeticContext.class,0);
		}
		public DatoContext dato() {
			return getRuleContext(DatoContext.class,0);
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
		enterRule(_localctx, 34, RULE_expression);
		try {
			setState(278);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,12,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(270);
				((ExpressionContext)_localctx).arithmetic = arithmetic();
				((ExpressionContext)_localctx).node =  ((ExpressionContext)_localctx).arithmetic.node;
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(273);
				((ExpressionContext)_localctx).dato = dato();
				((ExpressionContext)_localctx).node =  ((ExpressionContext)_localctx).dato.node;
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(276);
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
		enterRule(_localctx, 36, RULE_arithmetic);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(280);
			((ArithmeticContext)_localctx).t1 = factor();
			((ArithmeticContext)_localctx).node =  ((ArithmeticContext)_localctx).t1.node;
			setState(292);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,14,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					{
					setState(290);
					switch (_input.LA(1)) {
					case PLUS:
						{
						setState(282);
						match(PLUS);
						setState(283);
						((ArithmeticContext)_localctx).t2 = factor();
						((ArithmeticContext)_localctx).node =  new Addition(_localctx.node,((ArithmeticContext)_localctx).t2.node);
						}
						break;
					case SUBTRACTION:
						{
						setState(286);
						match(SUBTRACTION);
						setState(287);
						((ArithmeticContext)_localctx).t2 = factor();
						((ArithmeticContext)_localctx).node =  new Substraction(_localctx.node,((ArithmeticContext)_localctx).t2.node);
						}
						break;
					default:
						throw new NoViableAltException(this);
					}
					} 
				}
				setState(294);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,14,_ctx);
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
		enterRule(_localctx, 38, RULE_factor);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(295);
			((FactorContext)_localctx).t1 = term();
			((FactorContext)_localctx).node =  ((FactorContext)_localctx).t1.node;
			setState(307);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==MULTIPLICATION || _la==DIVISION) {
				{
				setState(305);
				switch (_input.LA(1)) {
				case MULTIPLICATION:
					{
					setState(297);
					match(MULTIPLICATION);
					setState(298);
					((FactorContext)_localctx).t2 = term();
					((FactorContext)_localctx).node =  new Multiplication(_localctx.node,((FactorContext)_localctx).t2.node);
					}
					break;
				case DIVISION:
					{
					setState(301);
					match(DIVISION);
					setState(302);
					((FactorContext)_localctx).t2 = term();
					((FactorContext)_localctx).node =  new Division(_localctx.node,((FactorContext)_localctx).t2.node);
					}
					break;
				default:
					throw new NoViableAltException(this);
				}
				}
				setState(309);
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
		enterRule(_localctx, 40, RULE_term);
		try {
			setState(323);
			switch (_input.LA(1)) {
			case NUMBER:
				enterOuterAlt(_localctx, 1);
				{
				setState(310);
				((TermContext)_localctx).NUMBER = match(NUMBER);
				((TermContext)_localctx).node =  new Constant(Double.parseDouble((((TermContext)_localctx).NUMBER!=null?((TermContext)_localctx).NUMBER.getText():null)));
				}
				break;
			case FALSE:
				enterOuterAlt(_localctx, 2);
				{
				setState(312);
				match(FALSE);
				((TermContext)_localctx).node =  new Constant(false);
				}
				break;
			case TRUE:
				enterOuterAlt(_localctx, 3);
				{
				setState(314);
				match(TRUE);
				((TermContext)_localctx).node =  new Constant(true);
				}
				break;
			case ID:
				enterOuterAlt(_localctx, 4);
				{
				setState(316);
				((TermContext)_localctx).ID = match(ID);
				((TermContext)_localctx).node =  new VarReference((((TermContext)_localctx).ID!=null?((TermContext)_localctx).ID.getText():null));
				}
				break;
			case PARENTHESIS:
				enterOuterAlt(_localctx, 5);
				{
				setState(318);
				match(PARENTHESIS);
				setState(319);
				((TermContext)_localctx).arithmetic = arithmetic();
				((TermContext)_localctx).node = ((TermContext)_localctx).arithmetic.node;
				setState(321);
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
		public TerminalNode STRING() { return getToken(BotParser.STRING, 0); }
		public TerminalNode FALSE() { return getToken(BotParser.FALSE, 0); }
		public TerminalNode TRUE() { return getToken(BotParser.TRUE, 0); }
		public TerminalNode NUMBER() { return getToken(BotParser.NUMBER, 0); }
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
		enterRule(_localctx, 42, RULE_dato);
		try {
			setState(333);
			switch (_input.LA(1)) {
			case STRING:
				enterOuterAlt(_localctx, 1);
				{
				setState(325);
				((DatoContext)_localctx).STRING = match(STRING);
				((DatoContext)_localctx).node =  new Constant((((DatoContext)_localctx).STRING!=null?((DatoContext)_localctx).STRING.getText():null));
				}
				break;
			case FALSE:
				enterOuterAlt(_localctx, 2);
				{
				setState(327);
				match(FALSE);
				((DatoContext)_localctx).node =  new Constant(false);
				}
				break;
			case TRUE:
				enterOuterAlt(_localctx, 3);
				{
				setState(329);
				match(TRUE);
				((DatoContext)_localctx).node =  new Constant(true);
				}
				break;
			case NUMBER:
				enterOuterAlt(_localctx, 4);
				{
				setState(331);
				((DatoContext)_localctx).NUMBER = match(NUMBER);
				((DatoContext)_localctx).node =  new Constant(Double.parseDouble((((DatoContext)_localctx).NUMBER!=null?((DatoContext)_localctx).NUMBER.getText():null)));
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
		enterRule(_localctx, 44, RULE_logic);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(335);
			((LogicContext)_localctx).c1 = comparation();
			((LogicContext)_localctx).node = ((LogicContext)_localctx).c1.node;
			setState(346);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==AND || _la==OR) {
				{
				setState(344);
				switch (_input.LA(1)) {
				case AND:
					{
					setState(337);
					match(AND);
					setState(338);
					((LogicContext)_localctx).c2 = comparation();
					((LogicContext)_localctx).node =  new And(_localctx.node,((LogicContext)_localctx).c2.node);
					}
					break;
				case OR:
					{
					setState(341);
					((LogicContext)_localctx).logic_or = logic_or();
					((LogicContext)_localctx).node =  new Or(_localctx.node,((LogicContext)_localctx).logic_or.node);
					}
					break;
				default:
					throw new NoViableAltException(this);
				}
				}
				setState(348);
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
		enterRule(_localctx, 46, RULE_logic_or);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(349);
			match(OR);
			setState(350);
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
		enterRule(_localctx, 48, RULE_comparation);
		try {
			setState(391);
			switch (_input.LA(1)) {
			case STRING:
			case TRUE:
			case FALSE:
			case NUMBER:
			case PARENTHESIS:
			case ID:
				enterOuterAlt(_localctx, 1);
				{
				setState(386);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,22,_ctx) ) {
				case 1:
					{
					setState(353);
					((ComparationContext)_localctx).e1 = expression();
					((ComparationContext)_localctx).node =  ((ComparationContext)_localctx).e1.node;
					setState(379);
					switch (_input.LA(1)) {
					case LEFT:
						{
						setState(355);
						match(LEFT);
						setState(356);
						((ComparationContext)_localctx).e2 = expression();
						((ComparationContext)_localctx).node =  new Minor(((ComparationContext)_localctx).e1.node,((ComparationContext)_localctx).e2.node);
						}
						break;
					case RIGHT:
						{
						setState(359);
						match(RIGHT);
						setState(360);
						((ComparationContext)_localctx).e3 = expression();
						((ComparationContext)_localctx).node =  new Mayor(((ComparationContext)_localctx).e1.node,((ComparationContext)_localctx).e3.node);
						}
						break;
					case MINOREQ:
						{
						setState(363);
						match(MINOREQ);
						setState(364);
						((ComparationContext)_localctx).e4 = expression();
						((ComparationContext)_localctx).node =  new Minoreq(((ComparationContext)_localctx).e1.node,((ComparationContext)_localctx).e4.node);
						}
						break;
					case MAYOREQ:
						{
						setState(367);
						match(MAYOREQ);
						setState(368);
						((ComparationContext)_localctx).e5 = expression();
						((ComparationContext)_localctx).node =  new Mayoreq(((ComparationContext)_localctx).e1.node,((ComparationContext)_localctx).e5.node);
						}
						break;
					case EQUAL:
						{
						setState(371);
						match(EQUAL);
						setState(372);
						((ComparationContext)_localctx).e6 = expression();
						((ComparationContext)_localctx).node =  new Equal(((ComparationContext)_localctx).e1.node,((ComparationContext)_localctx).e6.node);
						}
						break;
					case NOTEQUAL:
						{
						setState(375);
						match(NOTEQUAL);
						setState(376);
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
					setState(381);
					match(PARENTHESIS);
					setState(382);
					((ComparationContext)_localctx).logic = logic();
					((ComparationContext)_localctx).node = ((ComparationContext)_localctx).logic.node;
					setState(384);
					match(RIGHTPARENTHESIS);
					}
					break;
				}
				}
				break;
			case NOT:
				enterOuterAlt(_localctx, 2);
				{
				setState(388);
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
		enterRule(_localctx, 50, RULE_not);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(393);
			match(NOT);
			setState(394);
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
		enterRule(_localctx, 52, RULE_comment);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(397);
			match(COMMENT);
			setState(398);
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
		"\3\u0430\ud6d1\u8206\uad2d\u4417\uaef1\u8d80\uaadd\3-\u0193\4\2\t\2\4"+
		"\3\t\3\4\4\t\4\4\5\t\5\4\6\t\6\4\7\t\7\4\b\t\b\4\t\t\t\4\n\t\n\4\13\t"+
		"\13\4\f\t\f\4\r\t\r\4\16\t\16\4\17\t\17\4\20\t\20\4\21\t\21\4\22\t\22"+
		"\4\23\t\23\4\24\t\24\4\25\t\25\4\26\t\26\4\27\t\27\4\30\t\30\4\31\t\31"+
		"\4\32\t\32\4\33\t\33\4\34\t\34\3\2\3\2\3\2\3\2\7\2=\n\2\f\2\16\2@\13\2"+
		"\3\2\3\2\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3"+
		"\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3"+
		"\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\5\3q\n\3\3\4\3\4\3\4"+
		"\3\4\3\4\3\4\3\4\7\4z\n\4\f\4\16\4}\13\4\3\4\3\4\3\4\3\4\7\4\u0083\n\4"+
		"\f\4\16\4\u0086\13\4\5\4\u0088\n\4\3\4\3\4\3\4\3\4\3\5\3\5\3\5\3\5\3\5"+
		"\3\5\3\5\7\5\u0095\n\5\f\5\16\5\u0098\13\5\3\5\3\5\3\5\3\5\3\6\3\6\3\6"+
		"\3\6\3\6\3\6\3\6\3\6\5\6\u00a6\n\6\7\6\u00a8\n\6\f\6\16\6\u00ab\13\6\3"+
		"\6\3\6\3\6\3\6\3\6\7\6\u00b2\n\6\f\6\16\6\u00b5\13\6\3\6\3\6\3\6\3\6\3"+
		"\7\3\7\3\7\3\7\3\7\3\7\3\7\3\7\3\7\3\7\7\7\u00c5\n\7\f\7\16\7\u00c8\13"+
		"\7\3\7\3\7\3\7\3\7\3\b\3\b\3\b\3\b\3\b\3\t\3\t\3\t\3\t\3\t\3\n\3\n\3\n"+
		"\3\n\3\n\3\13\3\13\3\13\3\13\3\13\3\f\3\f\3\f\3\f\3\r\3\r\3\r\3\r\3\16"+
		"\3\16\3\16\3\16\3\16\3\17\3\17\3\17\3\17\3\17\3\17\3\20\3\20\3\20\3\20"+
		"\3\20\3\20\3\20\3\21\3\21\3\21\3\21\3\21\3\21\5\21\u0102\n\21\7\21\u0104"+
		"\n\21\f\21\16\21\u0107\13\21\3\21\3\21\3\21\3\22\3\22\3\22\3\22\3\22\3"+
		"\23\3\23\3\23\3\23\3\23\3\23\3\23\3\23\5\23\u0119\n\23\3\24\3\24\3\24"+
		"\3\24\3\24\3\24\3\24\3\24\3\24\3\24\7\24\u0125\n\24\f\24\16\24\u0128\13"+
		"\24\3\25\3\25\3\25\3\25\3\25\3\25\3\25\3\25\3\25\3\25\7\25\u0134\n\25"+
		"\f\25\16\25\u0137\13\25\3\26\3\26\3\26\3\26\3\26\3\26\3\26\3\26\3\26\3"+
		"\26\3\26\3\26\3\26\5\26\u0146\n\26\3\27\3\27\3\27\3\27\3\27\3\27\3\27"+
		"\3\27\5\27\u0150\n\27\3\30\3\30\3\30\3\30\3\30\3\30\3\30\3\30\3\30\7\30"+
		"\u015b\n\30\f\30\16\30\u015e\13\30\3\31\3\31\3\31\3\31\3\32\3\32\3\32"+
		"\3\32\3\32\3\32\3\32\3\32\3\32\3\32\3\32\3\32\3\32\3\32\3\32\3\32\3\32"+
		"\3\32\3\32\3\32\3\32\3\32\3\32\3\32\3\32\3\32\5\32\u017e\n\32\3\32\3\32"+
		"\3\32\3\32\3\32\5\32\u0185\n\32\3\32\3\32\3\32\5\32\u018a\n\32\3\33\3"+
		"\33\3\33\3\33\3\34\3\34\3\34\3\34\2\2\35\2\4\6\b\n\f\16\20\22\24\26\30"+
		"\32\34\36 \"$&(*,.\60\62\64\66\2\2\u01a7\28\3\2\2\2\4p\3\2\2\2\6r\3\2"+
		"\2\2\b\u008d\3\2\2\2\n\u009d\3\2\2\2\f\u00ba\3\2\2\2\16\u00cd\3\2\2\2"+
		"\20\u00d2\3\2\2\2\22\u00d7\3\2\2\2\24\u00dc\3\2\2\2\26\u00e1\3\2\2\2\30"+
		"\u00e5\3\2\2\2\32\u00e9\3\2\2\2\34\u00ee\3\2\2\2\36\u00f4\3\2\2\2 \u00fb"+
		"\3\2\2\2\"\u010b\3\2\2\2$\u0118\3\2\2\2&\u011a\3\2\2\2(\u0129\3\2\2\2"+
		"*\u0145\3\2\2\2,\u014f\3\2\2\2.\u0151\3\2\2\2\60\u015f\3\2\2\2\62\u0189"+
		"\3\2\2\2\64\u018b\3\2\2\2\66\u018f\3\2\2\28>\b\2\1\29:\5\4\3\2:;\b\2\1"+
		"\2;=\3\2\2\2<9\3\2\2\2=@\3\2\2\2><\3\2\2\2>?\3\2\2\2?A\3\2\2\2@>\3\2\2"+
		"\2AB\b\2\1\2B\3\3\2\2\2CD\5 \21\2DE\b\3\1\2Eq\3\2\2\2FG\5\n\6\2GH\b\3"+
		"\1\2Hq\3\2\2\2IJ\5\f\7\2JK\b\3\1\2Kq\3\2\2\2LM\5\6\4\2MN\b\3\1\2Nq\3\2"+
		"\2\2OP\5\b\5\2PQ\b\3\1\2Qq\3\2\2\2RS\5\24\13\2ST\b\3\1\2Tq\3\2\2\2UV\5"+
		"\16\b\2VW\b\3\1\2Wq\3\2\2\2XY\5\20\t\2YZ\b\3\1\2Zq\3\2\2\2[\\\5\22\n\2"+
		"\\]\b\3\1\2]q\3\2\2\2^_\5\32\16\2_`\b\3\1\2`q\3\2\2\2ab\5\34\17\2bc\b"+
		"\3\1\2cq\3\2\2\2de\5\36\20\2ef\b\3\1\2fq\3\2\2\2gh\5\26\f\2hi\b\3\1\2"+
		"iq\3\2\2\2jk\5\30\r\2kl\b\3\1\2lq\3\2\2\2mn\5\"\22\2no\b\3\1\2oq\3\2\2"+
		"\2pC\3\2\2\2pF\3\2\2\2pI\3\2\2\2pL\3\2\2\2pO\3\2\2\2pR\3\2\2\2pU\3\2\2"+
		"\2pX\3\2\2\2p[\3\2\2\2p^\3\2\2\2pa\3\2\2\2pd\3\2\2\2pg\3\2\2\2pj\3\2\2"+
		"\2pm\3\2\2\2q\5\3\2\2\2rs\7\30\2\2st\5.\30\2tu\7\32\2\2u{\b\4\1\2vw\5"+
		"\4\3\2wx\b\4\1\2xz\3\2\2\2yv\3\2\2\2z}\3\2\2\2{y\3\2\2\2{|\3\2\2\2|\u0087"+
		"\3\2\2\2}{\3\2\2\2~\u0084\7\31\2\2\177\u0080\5\4\3\2\u0080\u0081\b\4\1"+
		"\2\u0081\u0083\3\2\2\2\u0082\177\3\2\2\2\u0083\u0086\3\2\2\2\u0084\u0082"+
		"\3\2\2\2\u0084\u0085\3\2\2\2\u0085\u0088\3\2\2\2\u0086\u0084\3\2\2\2\u0087"+
		"~\3\2\2\2\u0087\u0088\3\2\2\2\u0088\u0089\3\2\2\2\u0089\u008a\7\33\2\2"+
		"\u008a\u008b\7\17\2\2\u008b\u008c\b\4\1\2\u008c\7\3\2\2\2\u008d\u008e"+
		"\7(\2\2\u008e\u008f\5.\30\2\u008f\u0090\7\32\2\2\u0090\u0096\b\5\1\2\u0091"+
		"\u0092\5\4\3\2\u0092\u0093\b\5\1\2\u0093\u0095\3\2\2\2\u0094\u0091\3\2"+
		"\2\2\u0095\u0098\3\2\2\2\u0096\u0094\3\2\2\2\u0096\u0097\3\2\2\2\u0097"+
		"\u0099\3\2\2\2\u0098\u0096\3\2\2\2\u0099\u009a\7\33\2\2\u009a\u009b\7"+
		"\17\2\2\u009b\u009c\b\5\1\2\u009c\t\3\2\2\2\u009d\u009e\b\6\1\2\u009e"+
		"\u009f\7\'\2\2\u009f\u00a0\7,\2\2\u00a0\u00a9\7%\2\2\u00a1\u00a2\7+\2"+
		"\2\u00a2\u00a3\7,\2\2\u00a3\u00a5\b\6\1\2\u00a4\u00a6\7\24\2\2\u00a5\u00a4"+
		"\3\2\2\2\u00a5\u00a6\3\2\2\2\u00a6\u00a8\3\2\2\2\u00a7\u00a1\3\2\2\2\u00a8"+
		"\u00ab\3\2\2\2\u00a9\u00a7\3\2\2\2\u00a9\u00aa\3\2\2\2\u00aa\u00ac\3\2"+
		"\2\2\u00ab\u00a9\3\2\2\2\u00ac\u00ad\7&\2\2\u00ad\u00b3\7\32\2\2\u00ae"+
		"\u00af\5\4\3\2\u00af\u00b0\b\6\1\2\u00b0\u00b2\3\2\2\2\u00b1\u00ae\3\2"+
		"\2\2\u00b2\u00b5\3\2\2\2\u00b3\u00b1\3\2\2\2\u00b3\u00b4\3\2\2\2\u00b4"+
		"\u00b6\3\2\2\2\u00b5\u00b3\3\2\2\2\u00b6\u00b7\b\6\1\2\u00b7\u00b8\7\33"+
		"\2\2\u00b8\u00b9\7\17\2\2\u00b9\13\3\2\2\2\u00ba\u00bb\7,\2\2\u00bb\u00bc"+
		"\7%\2\2\u00bc\u00bd\b\7\1\2\u00bd\u00be\5$\23\2\u00be\u00bf\b\7\1\2\u00bf"+
		"\u00c6\3\2\2\2\u00c0\u00c1\7\24\2\2\u00c1\u00c2\5$\23\2\u00c2\u00c3\b"+
		"\7\1\2\u00c3\u00c5\3\2\2\2\u00c4\u00c0\3\2\2\2\u00c5\u00c8\3\2\2\2\u00c6"+
		"\u00c4\3\2\2\2\u00c6\u00c7\3\2\2\2\u00c7\u00c9\3\2\2\2\u00c8\u00c6\3\2"+
		"\2\2\u00c9\u00ca\b\7\1\2\u00ca\u00cb\7&\2\2\u00cb\u00cc\7\17\2\2\u00cc"+
		"\r\3\2\2\2\u00cd\u00ce\7\t\2\2\u00ce\u00cf\5$\23\2\u00cf\u00d0\7\17\2"+
		"\2\u00d0\u00d1\b\b\1\2\u00d1\17\3\2\2\2\u00d2\u00d3\7\n\2\2\u00d3\u00d4"+
		"\5$\23\2\u00d4\u00d5\7\17\2\2\u00d5\u00d6\b\t\1\2\u00d6\21\3\2\2\2\u00d7"+
		"\u00d8\7\13\2\2\u00d8\u00d9\5$\23\2\u00d9\u00da\7\17\2\2\u00da\u00db\b"+
		"\n\1\2\u00db\23\3\2\2\2\u00dc\u00dd\7\f\2\2\u00dd\u00de\5$\23\2\u00de"+
		"\u00df\7\17\2\2\u00df\u00e0\b\13\1\2\u00e0\25\3\2\2\2\u00e1\u00e2\7\16"+
		"\2\2\u00e2\u00e3\7\17\2\2\u00e3\u00e4\b\f\1\2\u00e4\27\3\2\2\2\u00e5\u00e6"+
		"\7\r\2\2\u00e6\u00e7\7\17\2\2\u00e7\u00e8\b\r\1\2\u00e8\31\3\2\2\2\u00e9"+
		"\u00ea\7+\2\2\u00ea\u00eb\7,\2\2\u00eb\u00ec\7\17\2\2\u00ec\u00ed\b\16"+
		"\1\2\u00ed\33\3\2\2\2\u00ee\u00ef\7,\2\2\u00ef\u00f0\7\25\2\2\u00f0\u00f1"+
		"\5$\23\2\u00f1\u00f2\7\17\2\2\u00f2\u00f3\b\17\1\2\u00f3\35\3\2\2\2\u00f4"+
		"\u00f5\7+\2\2\u00f5\u00f6\7,\2\2\u00f6\u00f7\7\25\2\2\u00f7\u00f8\5$\23"+
		"\2\u00f8\u00f9\7\17\2\2\u00f9\u00fa\b\20\1\2\u00fa\37\3\2\2\2\u00fb\u00fc"+
		"\7\27\2\2\u00fc\u0105\b\21\1\2\u00fd\u00fe\5$\23\2\u00fe\u00ff\b\21\1"+
		"\2\u00ff\u0101\3\2\2\2\u0100\u0102\7\20\2\2\u0101\u0100\3\2\2\2\u0101"+
		"\u0102\3\2\2\2\u0102\u0104\3\2\2\2\u0103\u00fd\3\2\2\2\u0104\u0107\3\2"+
		"\2\2\u0105\u0103\3\2\2\2\u0105\u0106\3\2\2\2\u0106\u0108\3\2\2\2\u0107"+
		"\u0105\3\2\2\2\u0108\u0109\7\17\2\2\u0109\u010a\b\21\1\2\u010a!\3\2\2"+
		"\2\u010b\u010c\7\26\2\2\u010c\u010d\7,\2\2\u010d\u010e\7\17\2\2\u010e"+
		"\u010f\b\22\1\2\u010f#\3\2\2\2\u0110\u0111\5&\24\2\u0111\u0112\b\23\1"+
		"\2\u0112\u0119\3\2\2\2\u0113\u0114\5,\27\2\u0114\u0115\b\23\1\2\u0115"+
		"\u0119\3\2\2\2\u0116\u0117\7,\2\2\u0117\u0119\b\23\1\2\u0118\u0110\3\2"+
		"\2\2\u0118\u0113\3\2\2\2\u0118\u0116\3\2\2\2\u0119%\3\2\2\2\u011a\u011b"+
		"\5(\25\2\u011b\u0126\b\24\1\2\u011c\u011d\7\20\2\2\u011d\u011e\5(\25\2"+
		"\u011e\u011f\b\24\1\2\u011f\u0125\3\2\2\2\u0120\u0121\7\21\2\2\u0121\u0122"+
		"\5(\25\2\u0122\u0123\b\24\1\2\u0123\u0125\3\2\2\2\u0124\u011c\3\2\2\2"+
		"\u0124\u0120\3\2\2\2\u0125\u0128\3\2\2\2\u0126\u0124\3\2\2\2\u0126\u0127"+
		"\3\2\2\2\u0127\'\3\2\2\2\u0128\u0126\3\2\2\2\u0129\u012a\5*\26\2\u012a"+
		"\u0135\b\25\1\2\u012b\u012c\7\22\2\2\u012c\u012d\5*\26\2\u012d\u012e\b"+
		"\25\1\2\u012e\u0134\3\2\2\2\u012f\u0130\7\23\2\2\u0130\u0131\5*\26\2\u0131"+
		"\u0132\b\25\1\2\u0132\u0134\3\2\2\2\u0133\u012b\3\2\2\2\u0133\u012f\3"+
		"\2\2\2\u0134\u0137\3\2\2\2\u0135\u0133\3\2\2\2\u0135\u0136\3\2\2\2\u0136"+
		")\3\2\2\2\u0137\u0135\3\2\2\2\u0138\u0139\7\6\2\2\u0139\u0146\b\26\1\2"+
		"\u013a\u013b\7\5\2\2\u013b\u0146\b\26\1\2\u013c\u013d\7\4\2\2\u013d\u0146"+
		"\b\26\1\2\u013e\u013f\7,\2\2\u013f\u0146\b\26\1\2\u0140\u0141\7%\2\2\u0141"+
		"\u0142\5&\24\2\u0142\u0143\b\26\1\2\u0143\u0144\7&\2\2\u0144\u0146\3\2"+
		"\2\2\u0145\u0138\3\2\2\2\u0145\u013a\3\2\2\2\u0145\u013c\3\2\2\2\u0145"+
		"\u013e\3\2\2\2\u0145\u0140\3\2\2\2\u0146+\3\2\2\2\u0147\u0148\7\3\2\2"+
		"\u0148\u0150\b\27\1\2\u0149\u014a\7\5\2\2\u014a\u0150\b\27\1\2\u014b\u014c"+
		"\7\4\2\2\u014c\u0150\b\27\1\2\u014d\u014e\7\6\2\2\u014e\u0150\b\27\1\2"+
		"\u014f\u0147\3\2\2\2\u014f\u0149\3\2\2\2\u014f\u014b\3\2\2\2\u014f\u014d"+
		"\3\2\2\2\u0150-\3\2\2\2\u0151\u0152\5\62\32\2\u0152\u015c\b\30\1\2\u0153"+
		"\u0154\7\34\2\2\u0154\u0155\5\62\32\2\u0155\u0156\b\30\1\2\u0156\u015b"+
		"\3\2\2\2\u0157\u0158\5\60\31\2\u0158\u0159\b\30\1\2\u0159\u015b\3\2\2"+
		"\2\u015a\u0153\3\2\2\2\u015a\u0157\3\2\2\2\u015b\u015e\3\2\2\2\u015c\u015a"+
		"\3\2\2\2\u015c\u015d\3\2\2\2\u015d/\3\2\2\2\u015e\u015c\3\2\2\2\u015f"+
		"\u0160\7\35\2\2\u0160\u0161\5\62\32\2\u0161\u0162\b\31\1\2\u0162\61\3"+
		"\2\2\2\u0163\u0164\5$\23\2\u0164\u017d\b\32\1\2\u0165\u0166\7\n\2\2\u0166"+
		"\u0167\5$\23\2\u0167\u0168\b\32\1\2\u0168\u017e\3\2\2\2\u0169\u016a\7"+
		"\13\2\2\u016a\u016b\5$\23\2\u016b\u016c\b\32\1\2\u016c\u017e\3\2\2\2\u016d"+
		"\u016e\7!\2\2\u016e\u016f\5$\23\2\u016f\u0170\b\32\1\2\u0170\u017e\3\2"+
		"\2\2\u0171\u0172\7\"\2\2\u0172\u0173\5$\23\2\u0173\u0174\b\32\1\2\u0174"+
		"\u017e\3\2\2\2\u0175\u0176\7#\2\2\u0176\u0177\5$\23\2\u0177\u0178\b\32"+
		"\1\2\u0178\u017e\3\2\2\2\u0179\u017a\7$\2\2\u017a\u017b\5$\23\2\u017b"+
		"\u017c\b\32\1\2\u017c\u017e\3\2\2\2\u017d\u0165\3\2\2\2\u017d\u0169\3"+
		"\2\2\2\u017d\u016d\3\2\2\2\u017d\u0171\3\2\2\2\u017d\u0175\3\2\2\2\u017d"+
		"\u0179\3\2\2\2\u017d\u017e\3\2\2\2\u017e\u0185\3\2\2\2\u017f\u0180\7%"+
		"\2\2\u0180\u0181\5.\30\2\u0181\u0182\b\32\1\2\u0182\u0183\7&\2\2\u0183"+
		"\u0185\3\2\2\2\u0184\u0163\3\2\2\2\u0184\u017f\3\2\2\2\u0185\u018a\3\2"+
		"\2\2\u0186\u0187\5\64\33\2\u0187\u0188\b\32\1\2\u0188\u018a\3\2\2\2\u0189"+
		"\u0184\3\2\2\2\u0189\u0186\3\2\2\2\u018a\63\3\2\2\2\u018b\u018c\7\36\2"+
		"\2\u018c\u018d\5\62\32\2\u018d\u018e\b\33\1\2\u018e\65\3\2\2\2\u018f\u0190"+
		"\7\b\2\2\u0190\u0191\7\3\2\2\u0191\67\3\2\2\2\32>p{\u0084\u0087\u0096"+
		"\u00a5\u00a9\u00b3\u00c6\u0101\u0105\u0118\u0124\u0126\u0133\u0135\u0145"+
		"\u014f\u015a\u015c\u017d\u0184\u0189";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}
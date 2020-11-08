// Generated from Bot.g4 by ANTLR 4.4
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
	static { RuntimeMetaData.checkVersion("4.4", RuntimeMetaData.VERSION); }

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
	public static final String[] tokenNames = {
		"<INVALID>", "STRING", "'@T'", "'@F'", "NUMBER", "BOOLEAN", "'#'", "'^'", 
		"LEFT", "RIGHT", "'V'", "'D'", "'P'", "';'", "'+'", "'-'", "'*'", "'/'", 
		"','", "'<-'", "'?'", "'$'", "'if'", "'else'", "'->'", "'end'", "'&'", 
		"'|'", "'!'", "MINOR", "MAYOR", "'<='", "'>='", "'='", "'<>'", "'('", 
		"')'", "'define'", "'while'", "'{'", "'}'", "'''", "ID", "WS"
	};
	public static final int
		RULE_program = 0, RULE_sentence = 1, RULE_if_else_conditional = 2, RULE_while_cicle = 3, 
		RULE_function_declaration = 4, RULE_function_call = 5, RULE_up_movement = 6, 
		RULE_left_movement = 7, RULE_right_movement = 8, RULE_down_movement = 9, 
		RULE_pick = 10, RULE_drop = 11, RULE_declaration = 12, RULE_assignment = 13, 
		RULE_both = 14, RULE_output = 15, RULE_expression = 16, RULE_arithmetic = 17, 
		RULE_factor = 18, RULE_term = 19, RULE_dato = 20, RULE_logic = 21, RULE_logic_or = 22, 
		RULE_comparation = 23, RULE_not = 24, RULE_comment = 25;
	public static final String[] ruleNames = {
		"program", "sentence", "if_else_conditional", "while_cicle", "function_declaration", 
		"function_call", "up_movement", "left_movement", "right_movement", "down_movement", 
		"pick", "drop", "declaration", "assignment", "both", "output", "expression", 
		"arithmetic", "factor", "term", "dato", "logic", "logic_or", "comparation", 
		"not", "comment"
	};

	@Override
	public String getGrammarFileName() { return "Bot.g4"; }

	@Override
	public String[] getTokenNames() { return tokenNames; }

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
		public SentenceContext sentence(int i) {
			return getRuleContext(SentenceContext.class,i);
		}
		public List<SentenceContext> sentence() {
			return getRuleContexts(SentenceContext.class);
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
				
			setState(58);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << UP) | (1L << LEFT) | (1L << RIGHT) | (1L << DOWN) | (1L << DROP) | (1L << PICK) | (1L << DOLLAR) | (1L << IF) | (1L << DEFINE) | (1L << WHILE) | (1L << VAR) | (1L << ID))) != 0)) {
				{
				{
				setState(53); ((ProgramContext)_localctx).sentence = sentence();
				body.add(((ProgramContext)_localctx).sentence.node);
				}
				}
				setState(60);
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
		public While_cicleContext while_cicle() {
			return getRuleContext(While_cicleContext.class,0);
		}
		public Function_callContext function_call() {
			return getRuleContext(Function_callContext.class,0);
		}
		public AssignmentContext assignment() {
			return getRuleContext(AssignmentContext.class,0);
		}
		public Left_movementContext left_movement() {
			return getRuleContext(Left_movementContext.class,0);
		}
		public Right_movementContext right_movement() {
			return getRuleContext(Right_movementContext.class,0);
		}
		public OutputContext output() {
			return getRuleContext(OutputContext.class,0);
		}
		public PickContext pick() {
			return getRuleContext(PickContext.class,0);
		}
		public BothContext both() {
			return getRuleContext(BothContext.class,0);
		}
		public Function_declarationContext function_declaration() {
			return getRuleContext(Function_declarationContext.class,0);
		}
		public If_else_conditionalContext if_else_conditional() {
			return getRuleContext(If_else_conditionalContext.class,0);
		}
		public Down_movementContext down_movement() {
			return getRuleContext(Down_movementContext.class,0);
		}
		public DeclarationContext declaration() {
			return getRuleContext(DeclarationContext.class,0);
		}
		public Up_movementContext up_movement() {
			return getRuleContext(Up_movementContext.class,0);
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
	}

	public final SentenceContext sentence() throws RecognitionException {
		SentenceContext _localctx = new SentenceContext(_ctx, getState());
		enterRule(_localctx, 2, RULE_sentence);
		try {
			setState(105);
			switch ( getInterpreter().adaptivePredict(_input,1,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(63); ((SentenceContext)_localctx).output = output();
				((SentenceContext)_localctx).node = ((SentenceContext)_localctx).output.node;
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(66); ((SentenceContext)_localctx).function_declaration = function_declaration();
				((SentenceContext)_localctx).node =  ((SentenceContext)_localctx).function_declaration.node;
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(69); ((SentenceContext)_localctx).function_call = function_call();
				((SentenceContext)_localctx).node =  ((SentenceContext)_localctx).function_call.node;
				}
				break;
			case 4:
				enterOuterAlt(_localctx, 4);
				{
				setState(72); ((SentenceContext)_localctx).if_else_conditional = if_else_conditional();
				((SentenceContext)_localctx).node = ((SentenceContext)_localctx).if_else_conditional.node;
				}
				break;
			case 5:
				enterOuterAlt(_localctx, 5);
				{
				setState(75); ((SentenceContext)_localctx).while_cicle = while_cicle();
				((SentenceContext)_localctx).node =  ((SentenceContext)_localctx).while_cicle.node;
				}
				break;
			case 6:
				enterOuterAlt(_localctx, 6);
				{
				setState(78); ((SentenceContext)_localctx).down_movement = down_movement();
				((SentenceContext)_localctx).node = ((SentenceContext)_localctx).down_movement.node;
				}
				break;
			case 7:
				enterOuterAlt(_localctx, 7);
				{
				setState(81); ((SentenceContext)_localctx).up_movement = up_movement();
				((SentenceContext)_localctx).node = ((SentenceContext)_localctx).up_movement.node;
				}
				break;
			case 8:
				enterOuterAlt(_localctx, 8);
				{
				setState(84); ((SentenceContext)_localctx).left_movement = left_movement();
				((SentenceContext)_localctx).node = ((SentenceContext)_localctx).left_movement.node;
				}
				break;
			case 9:
				enterOuterAlt(_localctx, 9);
				{
				setState(87); ((SentenceContext)_localctx).right_movement = right_movement();
				((SentenceContext)_localctx).node = ((SentenceContext)_localctx).right_movement.node;
				}
				break;
			case 10:
				enterOuterAlt(_localctx, 10);
				{
				setState(90); ((SentenceContext)_localctx).declaration = declaration();
				((SentenceContext)_localctx).node = ((SentenceContext)_localctx).declaration.node;
				}
				break;
			case 11:
				enterOuterAlt(_localctx, 11);
				{
				setState(93); ((SentenceContext)_localctx).assignment = assignment();
				((SentenceContext)_localctx).node = ((SentenceContext)_localctx).assignment.node;
				}
				break;
			case 12:
				enterOuterAlt(_localctx, 12);
				{
				setState(96); ((SentenceContext)_localctx).both = both();
				((SentenceContext)_localctx).node = ((SentenceContext)_localctx).both.node;
				}
				break;
			case 13:
				enterOuterAlt(_localctx, 13);
				{
				setState(99); ((SentenceContext)_localctx).pick = pick();
				((SentenceContext)_localctx).node = ((SentenceContext)_localctx).pick.node;
				}
				break;
			case 14:
				enterOuterAlt(_localctx, 14);
				{
				setState(102); ((SentenceContext)_localctx).drop = drop();
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
		public TerminalNode SEMICOLON() { return getToken(BotParser.SEMICOLON, 0); }
		public TerminalNode ELSE() { return getToken(BotParser.ELSE, 0); }
		public TerminalNode IF() { return getToken(BotParser.IF, 0); }
		public TerminalNode ARROW_RIGHT() { return getToken(BotParser.ARROW_RIGHT, 0); }
		public LogicContext logic() {
			return getRuleContext(LogicContext.class,0);
		}
		public SentenceContext sentence(int i) {
			return getRuleContext(SentenceContext.class,i);
		}
		public TerminalNode END() { return getToken(BotParser.END, 0); }
		public List<SentenceContext> sentence() {
			return getRuleContexts(SentenceContext.class);
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
	}

	public final If_else_conditionalContext if_else_conditional() throws RecognitionException {
		If_else_conditionalContext _localctx = new If_else_conditionalContext(_ctx, getState());
		enterRule(_localctx, 4, RULE_if_else_conditional);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(107); match(IF);
			setState(108); ((If_else_conditionalContext)_localctx).logic = logic();
			setState(109); match(ARROW_RIGHT);

					List<ASTNode> body = new ArrayList<ASTNode>();
					List<ASTNode> elseBody = new ArrayList<ASTNode>();
				
			setState(116);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << UP) | (1L << LEFT) | (1L << RIGHT) | (1L << DOWN) | (1L << DROP) | (1L << PICK) | (1L << DOLLAR) | (1L << IF) | (1L << DEFINE) | (1L << WHILE) | (1L << VAR) | (1L << ID))) != 0)) {
				{
				{
				setState(111); ((If_else_conditionalContext)_localctx).s1 = sentence();
				body.add(((If_else_conditionalContext)_localctx).s1.node);
				}
				}
				setState(118);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(128);
			_la = _input.LA(1);
			if (_la==ELSE) {
				{
				setState(119); match(ELSE);
				setState(125);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << UP) | (1L << LEFT) | (1L << RIGHT) | (1L << DOWN) | (1L << DROP) | (1L << PICK) | (1L << DOLLAR) | (1L << IF) | (1L << DEFINE) | (1L << WHILE) | (1L << VAR) | (1L << ID))) != 0)) {
					{
					{
					setState(120); ((If_else_conditionalContext)_localctx).s2 = sentence();
					elseBody.add(((If_else_conditionalContext)_localctx).s2.node);
					}
					}
					setState(127);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				}
			}

			setState(130); match(END);
			setState(131); match(SEMICOLON);

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
		public TerminalNode SEMICOLON() { return getToken(BotParser.SEMICOLON, 0); }
		public TerminalNode ARROW_RIGHT() { return getToken(BotParser.ARROW_RIGHT, 0); }
		public LogicContext logic() {
			return getRuleContext(LogicContext.class,0);
		}
		public SentenceContext sentence(int i) {
			return getRuleContext(SentenceContext.class,i);
		}
		public TerminalNode END() { return getToken(BotParser.END, 0); }
		public TerminalNode WHILE() { return getToken(BotParser.WHILE, 0); }
		public List<SentenceContext> sentence() {
			return getRuleContexts(SentenceContext.class);
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
	}

	public final While_cicleContext while_cicle() throws RecognitionException {
		While_cicleContext _localctx = new While_cicleContext(_ctx, getState());
		enterRule(_localctx, 6, RULE_while_cicle);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(134); match(WHILE);
			setState(135); ((While_cicleContext)_localctx).logic = logic();
			setState(136); match(ARROW_RIGHT);

					List<ASTNode> body = new ArrayList<ASTNode>();
				
			setState(143);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << UP) | (1L << LEFT) | (1L << RIGHT) | (1L << DOWN) | (1L << DROP) | (1L << PICK) | (1L << DOLLAR) | (1L << IF) | (1L << DEFINE) | (1L << WHILE) | (1L << VAR) | (1L << ID))) != 0)) {
				{
				{
				setState(138); ((While_cicleContext)_localctx).s1 = sentence();
				body.add(((While_cicleContext)_localctx).s1.node);
				}
				}
				setState(145);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(146); match(END);
			setState(147); match(SEMICOLON);

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
		public TerminalNode SEMICOLON() { return getToken(BotParser.SEMICOLON, 0); }
		public TerminalNode PARENTHESIS() { return getToken(BotParser.PARENTHESIS, 0); }
		public TerminalNode RIGHTPARENTHESIS() { return getToken(BotParser.RIGHTPARENTHESIS, 0); }
		public TerminalNode VAR(int i) {
			return getToken(BotParser.VAR, i);
		}
		public TerminalNode ID(int i) {
			return getToken(BotParser.ID, i);
		}
		public TerminalNode COMMA(int i) {
			return getToken(BotParser.COMMA, i);
		}
		public List<TerminalNode> ID() { return getTokens(BotParser.ID); }
		public TerminalNode DEFINE() { return getToken(BotParser.DEFINE, 0); }
		public List<TerminalNode> VAR() { return getTokens(BotParser.VAR); }
		public TerminalNode ARROW_RIGHT() { return getToken(BotParser.ARROW_RIGHT, 0); }
		public List<TerminalNode> COMMA() { return getTokens(BotParser.COMMA); }
		public SentenceContext sentence(int i) {
			return getRuleContext(SentenceContext.class,i);
		}
		public TerminalNode END() { return getToken(BotParser.END, 0); }
		public List<SentenceContext> sentence() {
			return getRuleContexts(SentenceContext.class);
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
				
			setState(151); match(DEFINE);
			setState(152); ((Function_declarationContext)_localctx).ID = match(ID);
			setState(153); match(PARENTHESIS);
			setState(162);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==VAR) {
				{
				{
				setState(154); match(VAR);
				setState(155); ((Function_declarationContext)_localctx).i1 = match(ID);
				head.add((((Function_declarationContext)_localctx).i1!=null?((Function_declarationContext)_localctx).i1.getText():null));
				setState(158);
				_la = _input.LA(1);
				if (_la==COMMA) {
					{
					setState(157); match(COMMA);
					}
				}

				}
				}
				setState(164);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(165); match(RIGHTPARENTHESIS);
			setState(166); match(ARROW_RIGHT);
			setState(172);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << UP) | (1L << LEFT) | (1L << RIGHT) | (1L << DOWN) | (1L << DROP) | (1L << PICK) | (1L << DOLLAR) | (1L << IF) | (1L << DEFINE) | (1L << WHILE) | (1L << VAR) | (1L << ID))) != 0)) {
				{
				{
				setState(167); ((Function_declarationContext)_localctx).s1 = sentence();
				body.add(((Function_declarationContext)_localctx).s1.node);
				}
				}
				setState(174);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			((Function_declarationContext)_localctx).node =  new FunDeclaration((((Function_declarationContext)_localctx).ID!=null?((Function_declarationContext)_localctx).ID.getText():null),head,body);
			setState(176); match(END);
			setState(177); match(SEMICOLON);
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
		public TerminalNode SEMICOLON() { return getToken(BotParser.SEMICOLON, 0); }
		public TerminalNode PARENTHESIS() { return getToken(BotParser.PARENTHESIS, 0); }
		public TerminalNode RIGHTPARENTHESIS() { return getToken(BotParser.RIGHTPARENTHESIS, 0); }
		public List<TerminalNode> COMMA() { return getTokens(BotParser.COMMA); }
		public ExpressionContext expression(int i) {
			return getRuleContext(ExpressionContext.class,i);
		}
		public List<ExpressionContext> expression() {
			return getRuleContexts(ExpressionContext.class);
		}
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
	}

	public final Function_callContext function_call() throws RecognitionException {
		Function_callContext _localctx = new Function_callContext(_ctx, getState());
		enterRule(_localctx, 10, RULE_function_call);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(179); ((Function_callContext)_localctx).ID = match(ID);
			setState(180); match(PARENTHESIS);

					List<ASTNode> head = new ArrayList<ASTNode>();	
				
			{
			setState(182); ((Function_callContext)_localctx).e1 = expression();
			head.add(((Function_callContext)_localctx).e1.node);
			}
			setState(191);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==COMMA) {
				{
				{
				setState(185); match(COMMA);
				setState(186); ((Function_callContext)_localctx).e2 = expression();
				head.add(((Function_callContext)_localctx).e2.node);
				}
				}
				setState(193);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			((Function_callContext)_localctx).node =  new FunCall((((Function_callContext)_localctx).ID!=null?((Function_callContext)_localctx).ID.getText():null),head);
			setState(195); match(RIGHTPARENTHESIS);
			setState(196); match(SEMICOLON);
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
		public TerminalNode SEMICOLON() { return getToken(BotParser.SEMICOLON, 0); }
		public TerminalNode UP() { return getToken(BotParser.UP, 0); }
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
		}
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
	}

	public final Up_movementContext up_movement() throws RecognitionException {
		Up_movementContext _localctx = new Up_movementContext(_ctx, getState());
		enterRule(_localctx, 12, RULE_up_movement);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(198); match(UP);
			setState(199); ((Up_movementContext)_localctx).expression = expression();
			setState(200); match(SEMICOLON);
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
		public TerminalNode SEMICOLON() { return getToken(BotParser.SEMICOLON, 0); }
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
		}
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
	}

	public final Left_movementContext left_movement() throws RecognitionException {
		Left_movementContext _localctx = new Left_movementContext(_ctx, getState());
		enterRule(_localctx, 14, RULE_left_movement);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(203); match(LEFT);
			setState(204); ((Left_movementContext)_localctx).expression = expression();
			setState(205); match(SEMICOLON);
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
		public TerminalNode SEMICOLON() { return getToken(BotParser.SEMICOLON, 0); }
		public TerminalNode RIGHT() { return getToken(BotParser.RIGHT, 0); }
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
		}
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
	}

	public final Right_movementContext right_movement() throws RecognitionException {
		Right_movementContext _localctx = new Right_movementContext(_ctx, getState());
		enterRule(_localctx, 16, RULE_right_movement);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(208); match(RIGHT);
			setState(209); ((Right_movementContext)_localctx).expression = expression();
			setState(210); match(SEMICOLON);
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
		public TerminalNode SEMICOLON() { return getToken(BotParser.SEMICOLON, 0); }
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
		}
		public TerminalNode DOWN() { return getToken(BotParser.DOWN, 0); }
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
	}

	public final Down_movementContext down_movement() throws RecognitionException {
		Down_movementContext _localctx = new Down_movementContext(_ctx, getState());
		enterRule(_localctx, 18, RULE_down_movement);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(213); match(DOWN);
			setState(214); ((Down_movementContext)_localctx).expression = expression();
			setState(215); match(SEMICOLON);
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
	}

	public final PickContext pick() throws RecognitionException {
		PickContext _localctx = new PickContext(_ctx, getState());
		enterRule(_localctx, 20, RULE_pick);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(218); match(PICK);
			setState(219); match(SEMICOLON);
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
		public TerminalNode SEMICOLON() { return getToken(BotParser.SEMICOLON, 0); }
		public TerminalNode DROP() { return getToken(BotParser.DROP, 0); }
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
	}

	public final DropContext drop() throws RecognitionException {
		DropContext _localctx = new DropContext(_ctx, getState());
		enterRule(_localctx, 22, RULE_drop);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(222); match(DROP);
			setState(223); match(SEMICOLON);
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
		public TerminalNode ID() { return getToken(BotParser.ID, 0); }
		public TerminalNode SEMICOLON() { return getToken(BotParser.SEMICOLON, 0); }
		public TerminalNode VAR() { return getToken(BotParser.VAR, 0); }
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
	}

	public final DeclarationContext declaration() throws RecognitionException {
		DeclarationContext _localctx = new DeclarationContext(_ctx, getState());
		enterRule(_localctx, 24, RULE_declaration);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(226); match(VAR);
			setState(227); ((DeclarationContext)_localctx).ID = match(ID);
			setState(228); match(SEMICOLON);
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
		public TerminalNode SEMICOLON() { return getToken(BotParser.SEMICOLON, 0); }
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
		}
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
	}

	public final AssignmentContext assignment() throws RecognitionException {
		AssignmentContext _localctx = new AssignmentContext(_ctx, getState());
		enterRule(_localctx, 26, RULE_assignment);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(231); ((AssignmentContext)_localctx).ID = match(ID);
			setState(232); match(ASSIGN);
			setState(233); ((AssignmentContext)_localctx).expression = expression();
			setState(234); match(SEMICOLON);
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
		public TerminalNode ID() { return getToken(BotParser.ID, 0); }
		public TerminalNode ASSIGN() { return getToken(BotParser.ASSIGN, 0); }
		public TerminalNode SEMICOLON() { return getToken(BotParser.SEMICOLON, 0); }
		public TerminalNode VAR() { return getToken(BotParser.VAR, 0); }
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
		}
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
	}

	public final BothContext both() throws RecognitionException {
		BothContext _localctx = new BothContext(_ctx, getState());
		enterRule(_localctx, 28, RULE_both);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(237); match(VAR);
			setState(238); ((BothContext)_localctx).ID = match(ID);
			setState(239); match(ASSIGN);
			setState(240); ((BothContext)_localctx).expression = expression();
			setState(241); match(SEMICOLON);
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
		public TerminalNode SEMICOLON() { return getToken(BotParser.SEMICOLON, 0); }
		public TerminalNode DOLLAR() { return getToken(BotParser.DOLLAR, 0); }
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
	}

	public final OutputContext output() throws RecognitionException {
		OutputContext _localctx = new OutputContext(_ctx, getState());
		enterRule(_localctx, 30, RULE_output);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(244); match(DOLLAR);
			{
			setState(245); ((OutputContext)_localctx).expression = expression();
			((OutputContext)_localctx).node =  new Output(((OutputContext)_localctx).expression.node);
			}
			setState(248); match(SEMICOLON);
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
		public TerminalNode ID() { return getToken(BotParser.ID, 0); }
		public DatoContext dato() {
			return getRuleContext(DatoContext.class,0);
		}
		public ArithmeticContext arithmetic() {
			return getRuleContext(ArithmeticContext.class,0);
		}
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
	}

	public final ExpressionContext expression() throws RecognitionException {
		ExpressionContext _localctx = new ExpressionContext(_ctx, getState());
		enterRule(_localctx, 32, RULE_expression);
		try {
			setState(258);
			switch ( getInterpreter().adaptivePredict(_input,10,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(250); ((ExpressionContext)_localctx).dato = dato();
				((ExpressionContext)_localctx).node =  ((ExpressionContext)_localctx).dato.node;
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(253); ((ExpressionContext)_localctx).arithmetic = arithmetic();
				((ExpressionContext)_localctx).node =  ((ExpressionContext)_localctx).arithmetic.node;
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(256); ((ExpressionContext)_localctx).ID = match(ID);
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
		public TerminalNode SUBTRACTION(int i) {
			return getToken(BotParser.SUBTRACTION, i);
		}
		public List<FactorContext> factor() {
			return getRuleContexts(FactorContext.class);
		}
		public FactorContext factor(int i) {
			return getRuleContext(FactorContext.class,i);
		}
		public List<TerminalNode> SUBTRACTION() { return getTokens(BotParser.SUBTRACTION); }
		public List<TerminalNode> PLUS() { return getTokens(BotParser.PLUS); }
		public TerminalNode PLUS(int i) {
			return getToken(BotParser.PLUS, i);
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
	}

	public final ArithmeticContext arithmetic() throws RecognitionException {
		ArithmeticContext _localctx = new ArithmeticContext(_ctx, getState());
		enterRule(_localctx, 34, RULE_arithmetic);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(260); ((ArithmeticContext)_localctx).t1 = factor();
			((ArithmeticContext)_localctx).node =  ((ArithmeticContext)_localctx).t1.node;
			setState(272);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==PLUS || _la==SUBTRACTION) {
				{
				setState(270);
				switch (_input.LA(1)) {
				case PLUS:
					{
					setState(262); match(PLUS);
					setState(263); ((ArithmeticContext)_localctx).t2 = factor();
					((ArithmeticContext)_localctx).node =  new Addition(_localctx.node,((ArithmeticContext)_localctx).t2.node);
					}
					break;
				case SUBTRACTION:
					{
					setState(266); match(SUBTRACTION);
					setState(267); ((ArithmeticContext)_localctx).t2 = factor();
					((ArithmeticContext)_localctx).node =  new Substraction(_localctx.node,((ArithmeticContext)_localctx).t2.node);
					}
					break;
				default:
					throw new NoViableAltException(this);
				}
				}
				setState(274);
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
		public List<TerminalNode> DIVISION() { return getTokens(BotParser.DIVISION); }
		public TerminalNode DIVISION(int i) {
			return getToken(BotParser.DIVISION, i);
		}
		public List<TermContext> term() {
			return getRuleContexts(TermContext.class);
		}
		public TermContext term(int i) {
			return getRuleContext(TermContext.class,i);
		}
		public TerminalNode MULTIPLICATION(int i) {
			return getToken(BotParser.MULTIPLICATION, i);
		}
		public List<TerminalNode> MULTIPLICATION() { return getTokens(BotParser.MULTIPLICATION); }
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
	}

	public final FactorContext factor() throws RecognitionException {
		FactorContext _localctx = new FactorContext(_ctx, getState());
		enterRule(_localctx, 36, RULE_factor);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(275); ((FactorContext)_localctx).t1 = term();
			((FactorContext)_localctx).node =  ((FactorContext)_localctx).t1.node;
			setState(287);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==MULTIPLICATION || _la==DIVISION) {
				{
				setState(285);
				switch (_input.LA(1)) {
				case MULTIPLICATION:
					{
					setState(277); match(MULTIPLICATION);
					setState(278); ((FactorContext)_localctx).t2 = term();
					((FactorContext)_localctx).node =  new Multiplication(_localctx.node,((FactorContext)_localctx).t2.node);
					}
					break;
				case DIVISION:
					{
					setState(281); match(DIVISION);
					setState(282); ((FactorContext)_localctx).t2 = term();
					((FactorContext)_localctx).node =  new Division(_localctx.node,((FactorContext)_localctx).t2.node);
					}
					break;
				default:
					throw new NoViableAltException(this);
				}
				}
				setState(289);
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
		public TerminalNode ID() { return getToken(BotParser.ID, 0); }
		public TerminalNode FALSE() { return getToken(BotParser.FALSE, 0); }
		public TerminalNode PARENTHESIS() { return getToken(BotParser.PARENTHESIS, 0); }
		public TerminalNode TRUE() { return getToken(BotParser.TRUE, 0); }
		public TerminalNode RIGHTPARENTHESIS() { return getToken(BotParser.RIGHTPARENTHESIS, 0); }
		public TerminalNode NUMBER() { return getToken(BotParser.NUMBER, 0); }
		public ArithmeticContext arithmetic() {
			return getRuleContext(ArithmeticContext.class,0);
		}
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
	}

	public final TermContext term() throws RecognitionException {
		TermContext _localctx = new TermContext(_ctx, getState());
		enterRule(_localctx, 38, RULE_term);
		try {
			setState(303);
			switch (_input.LA(1)) {
			case NUMBER:
				enterOuterAlt(_localctx, 1);
				{
				setState(290); ((TermContext)_localctx).NUMBER = match(NUMBER);
				((TermContext)_localctx).node =  new Constant(Double.parseDouble((((TermContext)_localctx).NUMBER!=null?((TermContext)_localctx).NUMBER.getText():null)));
				}
				break;
			case FALSE:
				enterOuterAlt(_localctx, 2);
				{
				setState(292); match(FALSE);
				((TermContext)_localctx).node =  new Constant(false);
				}
				break;
			case TRUE:
				enterOuterAlt(_localctx, 3);
				{
				setState(294); match(TRUE);
				((TermContext)_localctx).node =  new Constant(true);
				}
				break;
			case ID:
				enterOuterAlt(_localctx, 4);
				{
				setState(296); ((TermContext)_localctx).ID = match(ID);
				((TermContext)_localctx).node =  new VarReference((((TermContext)_localctx).ID!=null?((TermContext)_localctx).ID.getText():null));
				}
				break;
			case PARENTHESIS:
				enterOuterAlt(_localctx, 5);
				{
				setState(298); match(PARENTHESIS);
				setState(299); ((TermContext)_localctx).arithmetic = arithmetic();
				((TermContext)_localctx).node = ((TermContext)_localctx).arithmetic.node;
				setState(301); match(RIGHTPARENTHESIS);
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
		public TerminalNode FALSE() { return getToken(BotParser.FALSE, 0); }
		public TerminalNode TRUE() { return getToken(BotParser.TRUE, 0); }
		public TerminalNode STRING() { return getToken(BotParser.STRING, 0); }
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
	}

	public final DatoContext dato() throws RecognitionException {
		DatoContext _localctx = new DatoContext(_ctx, getState());
		enterRule(_localctx, 40, RULE_dato);
		try {
			setState(313);
			switch (_input.LA(1)) {
			case STRING:
				enterOuterAlt(_localctx, 1);
				{
				setState(305); ((DatoContext)_localctx).STRING = match(STRING);
				((DatoContext)_localctx).node =  new Constant((((DatoContext)_localctx).STRING!=null?((DatoContext)_localctx).STRING.getText():null));
				}
				break;
			case FALSE:
				enterOuterAlt(_localctx, 2);
				{
				setState(307); match(FALSE);
				((DatoContext)_localctx).node =  new Constant(false);
				}
				break;
			case TRUE:
				enterOuterAlt(_localctx, 3);
				{
				setState(309); match(TRUE);
				((DatoContext)_localctx).node =  new Constant(true);
				}
				break;
			case NUMBER:
				enterOuterAlt(_localctx, 4);
				{
				setState(311); ((DatoContext)_localctx).NUMBER = match(NUMBER);
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
		public ComparationContext comparation(int i) {
			return getRuleContext(ComparationContext.class,i);
		}
		public TerminalNode AND(int i) {
			return getToken(BotParser.AND, i);
		}
		public List<Logic_orContext> logic_or() {
			return getRuleContexts(Logic_orContext.class);
		}
		public List<TerminalNode> AND() { return getTokens(BotParser.AND); }
		public List<ComparationContext> comparation() {
			return getRuleContexts(ComparationContext.class);
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
	}

	public final LogicContext logic() throws RecognitionException {
		LogicContext _localctx = new LogicContext(_ctx, getState());
		enterRule(_localctx, 42, RULE_logic);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(315); ((LogicContext)_localctx).c1 = comparation();
			((LogicContext)_localctx).node = ((LogicContext)_localctx).c1.node;
			setState(326);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==AND || _la==OR) {
				{
				setState(324);
				switch (_input.LA(1)) {
				case AND:
					{
					setState(317); match(AND);
					setState(318); ((LogicContext)_localctx).c2 = comparation();
					((LogicContext)_localctx).node =  new And(_localctx.node,((LogicContext)_localctx).c2.node);
					}
					break;
				case OR:
					{
					setState(321); ((LogicContext)_localctx).logic_or = logic_or();
					((LogicContext)_localctx).node =  new Or(_localctx.node,((LogicContext)_localctx).logic_or.node);
					}
					break;
				default:
					throw new NoViableAltException(this);
				}
				}
				setState(328);
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
		public ComparationContext comparation() {
			return getRuleContext(ComparationContext.class,0);
		}
		public TerminalNode OR() { return getToken(BotParser.OR, 0); }
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
	}

	public final Logic_orContext logic_or() throws RecognitionException {
		Logic_orContext _localctx = new Logic_orContext(_ctx, getState());
		enterRule(_localctx, 44, RULE_logic_or);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(329); match(OR);
			setState(330); ((Logic_orContext)_localctx).comparation = comparation();
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
		public TerminalNode LEFT() { return getToken(BotParser.LEFT, 0); }
		public TerminalNode EQUAL() { return getToken(BotParser.EQUAL, 0); }
		public TerminalNode PARENTHESIS() { return getToken(BotParser.PARENTHESIS, 0); }
		public TerminalNode RIGHTPARENTHESIS() { return getToken(BotParser.RIGHTPARENTHESIS, 0); }
		public LogicContext logic() {
			return getRuleContext(LogicContext.class,0);
		}
		public ExpressionContext expression(int i) {
			return getRuleContext(ExpressionContext.class,i);
		}
		public TerminalNode MINOREQ() { return getToken(BotParser.MINOREQ, 0); }
		public NotContext not() {
			return getRuleContext(NotContext.class,0);
		}
		public TerminalNode MAYOREQ() { return getToken(BotParser.MAYOREQ, 0); }
		public TerminalNode NOTEQUAL() { return getToken(BotParser.NOTEQUAL, 0); }
		public List<ExpressionContext> expression() {
			return getRuleContexts(ExpressionContext.class);
		}
		public TerminalNode RIGHT() { return getToken(BotParser.RIGHT, 0); }
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
	}

	public final ComparationContext comparation() throws RecognitionException {
		ComparationContext _localctx = new ComparationContext(_ctx, getState());
		enterRule(_localctx, 46, RULE_comparation);
		try {
			setState(371);
			switch (_input.LA(1)) {
			case STRING:
			case TRUE:
			case FALSE:
			case NUMBER:
			case PARENTHESIS:
			case ID:
				enterOuterAlt(_localctx, 1);
				{
				setState(366);
				switch ( getInterpreter().adaptivePredict(_input,20,_ctx) ) {
				case 1:
					{
					setState(333); ((ComparationContext)_localctx).e1 = expression();
					((ComparationContext)_localctx).node =  ((ComparationContext)_localctx).e1.node;
					setState(359);
					switch (_input.LA(1)) {
					case LEFT:
						{
						setState(335); match(LEFT);
						setState(336); ((ComparationContext)_localctx).e2 = expression();
						((ComparationContext)_localctx).node =  new Minor(((ComparationContext)_localctx).e1.node,((ComparationContext)_localctx).e2.node);
						}
						break;
					case RIGHT:
						{
						setState(339); match(RIGHT);
						setState(340); ((ComparationContext)_localctx).e3 = expression();
						((ComparationContext)_localctx).node =  new Mayor(((ComparationContext)_localctx).e1.node,((ComparationContext)_localctx).e3.node);
						}
						break;
					case MINOREQ:
						{
						setState(343); match(MINOREQ);
						setState(344); ((ComparationContext)_localctx).e4 = expression();
						((ComparationContext)_localctx).node =  new Minoreq(((ComparationContext)_localctx).e1.node,((ComparationContext)_localctx).e4.node);
						}
						break;
					case MAYOREQ:
						{
						setState(347); match(MAYOREQ);
						setState(348); ((ComparationContext)_localctx).e5 = expression();
						((ComparationContext)_localctx).node =  new Mayoreq(((ComparationContext)_localctx).e1.node,((ComparationContext)_localctx).e5.node);
						}
						break;
					case EQUAL:
						{
						setState(351); match(EQUAL);
						setState(352); ((ComparationContext)_localctx).e6 = expression();
						((ComparationContext)_localctx).node =  new Equal(((ComparationContext)_localctx).e1.node,((ComparationContext)_localctx).e6.node);
						}
						break;
					case NOTEQUAL:
						{
						setState(355); match(NOTEQUAL);
						setState(356); ((ComparationContext)_localctx).e7 = expression();
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
					setState(361); match(PARENTHESIS);
					setState(362); ((ComparationContext)_localctx).logic = logic();
					((ComparationContext)_localctx).node = ((ComparationContext)_localctx).logic.node;
					setState(364); match(RIGHTPARENTHESIS);
					}
					break;
				}
				}
				break;
			case NOT:
				enterOuterAlt(_localctx, 2);
				{
				setState(368); ((ComparationContext)_localctx).not = not();
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
	}

	public final NotContext not() throws RecognitionException {
		NotContext _localctx = new NotContext(_ctx, getState());
		enterRule(_localctx, 48, RULE_not);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(373); match(NOT);
			setState(374); ((NotContext)_localctx).comparation = comparation();
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
	}

	public final CommentContext comment() throws RecognitionException {
		CommentContext _localctx = new CommentContext(_ctx, getState());
		enterRule(_localctx, 50, RULE_comment);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(377); match(COMMENT);
			setState(378); match(STRING);
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
		"\3\u0430\ud6d1\u8206\uad2d\u4417\uaef1\u8d80\uaadd\3-\u017f\4\2\t\2\4"+
		"\3\t\3\4\4\t\4\4\5\t\5\4\6\t\6\4\7\t\7\4\b\t\b\4\t\t\t\4\n\t\n\4\13\t"+
		"\13\4\f\t\f\4\r\t\r\4\16\t\16\4\17\t\17\4\20\t\20\4\21\t\21\4\22\t\22"+
		"\4\23\t\23\4\24\t\24\4\25\t\25\4\26\t\26\4\27\t\27\4\30\t\30\4\31\t\31"+
		"\4\32\t\32\4\33\t\33\3\2\3\2\3\2\3\2\7\2;\n\2\f\2\16\2>\13\2\3\2\3\2\3"+
		"\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3"+
		"\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3"+
		"\3\3\3\3\3\3\3\3\3\3\3\3\3\5\3l\n\3\3\4\3\4\3\4\3\4\3\4\3\4\3\4\7\4u\n"+
		"\4\f\4\16\4x\13\4\3\4\3\4\3\4\3\4\7\4~\n\4\f\4\16\4\u0081\13\4\5\4\u0083"+
		"\n\4\3\4\3\4\3\4\3\4\3\5\3\5\3\5\3\5\3\5\3\5\3\5\7\5\u0090\n\5\f\5\16"+
		"\5\u0093\13\5\3\5\3\5\3\5\3\5\3\6\3\6\3\6\3\6\3\6\3\6\3\6\3\6\5\6\u00a1"+
		"\n\6\7\6\u00a3\n\6\f\6\16\6\u00a6\13\6\3\6\3\6\3\6\3\6\3\6\7\6\u00ad\n"+
		"\6\f\6\16\6\u00b0\13\6\3\6\3\6\3\6\3\6\3\7\3\7\3\7\3\7\3\7\3\7\3\7\3\7"+
		"\3\7\3\7\7\7\u00c0\n\7\f\7\16\7\u00c3\13\7\3\7\3\7\3\7\3\7\3\b\3\b\3\b"+
		"\3\b\3\b\3\t\3\t\3\t\3\t\3\t\3\n\3\n\3\n\3\n\3\n\3\13\3\13\3\13\3\13\3"+
		"\13\3\f\3\f\3\f\3\f\3\r\3\r\3\r\3\r\3\16\3\16\3\16\3\16\3\16\3\17\3\17"+
		"\3\17\3\17\3\17\3\17\3\20\3\20\3\20\3\20\3\20\3\20\3\20\3\21\3\21\3\21"+
		"\3\21\3\21\3\21\3\22\3\22\3\22\3\22\3\22\3\22\3\22\3\22\5\22\u0105\n\22"+
		"\3\23\3\23\3\23\3\23\3\23\3\23\3\23\3\23\3\23\3\23\7\23\u0111\n\23\f\23"+
		"\16\23\u0114\13\23\3\24\3\24\3\24\3\24\3\24\3\24\3\24\3\24\3\24\3\24\7"+
		"\24\u0120\n\24\f\24\16\24\u0123\13\24\3\25\3\25\3\25\3\25\3\25\3\25\3"+
		"\25\3\25\3\25\3\25\3\25\3\25\3\25\5\25\u0132\n\25\3\26\3\26\3\26\3\26"+
		"\3\26\3\26\3\26\3\26\5\26\u013c\n\26\3\27\3\27\3\27\3\27\3\27\3\27\3\27"+
		"\3\27\3\27\7\27\u0147\n\27\f\27\16\27\u014a\13\27\3\30\3\30\3\30\3\30"+
		"\3\31\3\31\3\31\3\31\3\31\3\31\3\31\3\31\3\31\3\31\3\31\3\31\3\31\3\31"+
		"\3\31\3\31\3\31\3\31\3\31\3\31\3\31\3\31\3\31\3\31\3\31\3\31\5\31\u016a"+
		"\n\31\3\31\3\31\3\31\3\31\3\31\5\31\u0171\n\31\3\31\3\31\3\31\5\31\u0176"+
		"\n\31\3\32\3\32\3\32\3\32\3\33\3\33\3\33\3\33\2\2\34\2\4\6\b\n\f\16\20"+
		"\22\24\26\30\32\34\36 \"$&(*,.\60\62\64\2\2\u0191\2\66\3\2\2\2\4k\3\2"+
		"\2\2\6m\3\2\2\2\b\u0088\3\2\2\2\n\u0098\3\2\2\2\f\u00b5\3\2\2\2\16\u00c8"+
		"\3\2\2\2\20\u00cd\3\2\2\2\22\u00d2\3\2\2\2\24\u00d7\3\2\2\2\26\u00dc\3"+
		"\2\2\2\30\u00e0\3\2\2\2\32\u00e4\3\2\2\2\34\u00e9\3\2\2\2\36\u00ef\3\2"+
		"\2\2 \u00f6\3\2\2\2\"\u0104\3\2\2\2$\u0106\3\2\2\2&\u0115\3\2\2\2(\u0131"+
		"\3\2\2\2*\u013b\3\2\2\2,\u013d\3\2\2\2.\u014b\3\2\2\2\60\u0175\3\2\2\2"+
		"\62\u0177\3\2\2\2\64\u017b\3\2\2\2\66<\b\2\1\2\678\5\4\3\289\b\2\1\29"+
		";\3\2\2\2:\67\3\2\2\2;>\3\2\2\2<:\3\2\2\2<=\3\2\2\2=?\3\2\2\2><\3\2\2"+
		"\2?@\b\2\1\2@\3\3\2\2\2AB\5 \21\2BC\b\3\1\2Cl\3\2\2\2DE\5\n\6\2EF\b\3"+
		"\1\2Fl\3\2\2\2GH\5\f\7\2HI\b\3\1\2Il\3\2\2\2JK\5\6\4\2KL\b\3\1\2Ll\3\2"+
		"\2\2MN\5\b\5\2NO\b\3\1\2Ol\3\2\2\2PQ\5\24\13\2QR\b\3\1\2Rl\3\2\2\2ST\5"+
		"\16\b\2TU\b\3\1\2Ul\3\2\2\2VW\5\20\t\2WX\b\3\1\2Xl\3\2\2\2YZ\5\22\n\2"+
		"Z[\b\3\1\2[l\3\2\2\2\\]\5\32\16\2]^\b\3\1\2^l\3\2\2\2_`\5\34\17\2`a\b"+
		"\3\1\2al\3\2\2\2bc\5\36\20\2cd\b\3\1\2dl\3\2\2\2ef\5\26\f\2fg\b\3\1\2"+
		"gl\3\2\2\2hi\5\30\r\2ij\b\3\1\2jl\3\2\2\2kA\3\2\2\2kD\3\2\2\2kG\3\2\2"+
		"\2kJ\3\2\2\2kM\3\2\2\2kP\3\2\2\2kS\3\2\2\2kV\3\2\2\2kY\3\2\2\2k\\\3\2"+
		"\2\2k_\3\2\2\2kb\3\2\2\2ke\3\2\2\2kh\3\2\2\2l\5\3\2\2\2mn\7\30\2\2no\5"+
		",\27\2op\7\32\2\2pv\b\4\1\2qr\5\4\3\2rs\b\4\1\2su\3\2\2\2tq\3\2\2\2ux"+
		"\3\2\2\2vt\3\2\2\2vw\3\2\2\2w\u0082\3\2\2\2xv\3\2\2\2y\177\7\31\2\2z{"+
		"\5\4\3\2{|\b\4\1\2|~\3\2\2\2}z\3\2\2\2~\u0081\3\2\2\2\177}\3\2\2\2\177"+
		"\u0080\3\2\2\2\u0080\u0083\3\2\2\2\u0081\177\3\2\2\2\u0082y\3\2\2\2\u0082"+
		"\u0083\3\2\2\2\u0083\u0084\3\2\2\2\u0084\u0085\7\33\2\2\u0085\u0086\7"+
		"\17\2\2\u0086\u0087\b\4\1\2\u0087\7\3\2\2\2\u0088\u0089\7(\2\2\u0089\u008a"+
		"\5,\27\2\u008a\u008b\7\32\2\2\u008b\u0091\b\5\1\2\u008c\u008d\5\4\3\2"+
		"\u008d\u008e\b\5\1\2\u008e\u0090\3\2\2\2\u008f\u008c\3\2\2\2\u0090\u0093"+
		"\3\2\2\2\u0091\u008f\3\2\2\2\u0091\u0092\3\2\2\2\u0092\u0094\3\2\2\2\u0093"+
		"\u0091\3\2\2\2\u0094\u0095\7\33\2\2\u0095\u0096\7\17\2\2\u0096\u0097\b"+
		"\5\1\2\u0097\t\3\2\2\2\u0098\u0099\b\6\1\2\u0099\u009a\7\'\2\2\u009a\u009b"+
		"\7,\2\2\u009b\u00a4\7%\2\2\u009c\u009d\7+\2\2\u009d\u009e\7,\2\2\u009e"+
		"\u00a0\b\6\1\2\u009f\u00a1\7\24\2\2\u00a0\u009f\3\2\2\2\u00a0\u00a1\3"+
		"\2\2\2\u00a1\u00a3\3\2\2\2\u00a2\u009c\3\2\2\2\u00a3\u00a6\3\2\2\2\u00a4"+
		"\u00a2\3\2\2\2\u00a4\u00a5\3\2\2\2\u00a5\u00a7\3\2\2\2\u00a6\u00a4\3\2"+
		"\2\2\u00a7\u00a8\7&\2\2\u00a8\u00ae\7\32\2\2\u00a9\u00aa\5\4\3\2\u00aa"+
		"\u00ab\b\6\1\2\u00ab\u00ad\3\2\2\2\u00ac\u00a9\3\2\2\2\u00ad\u00b0\3\2"+
		"\2\2\u00ae\u00ac\3\2\2\2\u00ae\u00af\3\2\2\2\u00af\u00b1\3\2\2\2\u00b0"+
		"\u00ae\3\2\2\2\u00b1\u00b2\b\6\1\2\u00b2\u00b3\7\33\2\2\u00b3\u00b4\7"+
		"\17\2\2\u00b4\13\3\2\2\2\u00b5\u00b6\7,\2\2\u00b6\u00b7\7%\2\2\u00b7\u00b8"+
		"\b\7\1\2\u00b8\u00b9\5\"\22\2\u00b9\u00ba\b\7\1\2\u00ba\u00c1\3\2\2\2"+
		"\u00bb\u00bc\7\24\2\2\u00bc\u00bd\5\"\22\2\u00bd\u00be\b\7\1\2\u00be\u00c0"+
		"\3\2\2\2\u00bf\u00bb\3\2\2\2\u00c0\u00c3\3\2\2\2\u00c1\u00bf\3\2\2\2\u00c1"+
		"\u00c2\3\2\2\2\u00c2\u00c4\3\2\2\2\u00c3\u00c1\3\2\2\2\u00c4\u00c5\b\7"+
		"\1\2\u00c5\u00c6\7&\2\2\u00c6\u00c7\7\17\2\2\u00c7\r\3\2\2\2\u00c8\u00c9"+
		"\7\t\2\2\u00c9\u00ca\5\"\22\2\u00ca\u00cb\7\17\2\2\u00cb\u00cc\b\b\1\2"+
		"\u00cc\17\3\2\2\2\u00cd\u00ce\7\n\2\2\u00ce\u00cf\5\"\22\2\u00cf\u00d0"+
		"\7\17\2\2\u00d0\u00d1\b\t\1\2\u00d1\21\3\2\2\2\u00d2\u00d3\7\13\2\2\u00d3"+
		"\u00d4\5\"\22\2\u00d4\u00d5\7\17\2\2\u00d5\u00d6\b\n\1\2\u00d6\23\3\2"+
		"\2\2\u00d7\u00d8\7\f\2\2\u00d8\u00d9\5\"\22\2\u00d9\u00da\7\17\2\2\u00da"+
		"\u00db\b\13\1\2\u00db\25\3\2\2\2\u00dc\u00dd\7\16\2\2\u00dd\u00de\7\17"+
		"\2\2\u00de\u00df\b\f\1\2\u00df\27\3\2\2\2\u00e0\u00e1\7\r\2\2\u00e1\u00e2"+
		"\7\17\2\2\u00e2\u00e3\b\r\1\2\u00e3\31\3\2\2\2\u00e4\u00e5\7+\2\2\u00e5"+
		"\u00e6\7,\2\2\u00e6\u00e7\7\17\2\2\u00e7\u00e8\b\16\1\2\u00e8\33\3\2\2"+
		"\2\u00e9\u00ea\7,\2\2\u00ea\u00eb\7\25\2\2\u00eb\u00ec\5\"\22\2\u00ec"+
		"\u00ed\7\17\2\2\u00ed\u00ee\b\17\1\2\u00ee\35\3\2\2\2\u00ef\u00f0\7+\2"+
		"\2\u00f0\u00f1\7,\2\2\u00f1\u00f2\7\25\2\2\u00f2\u00f3\5\"\22\2\u00f3"+
		"\u00f4\7\17\2\2\u00f4\u00f5\b\20\1\2\u00f5\37\3\2\2\2\u00f6\u00f7\7\27"+
		"\2\2\u00f7\u00f8\5\"\22\2\u00f8\u00f9\b\21\1\2\u00f9\u00fa\3\2\2\2\u00fa"+
		"\u00fb\7\17\2\2\u00fb!\3\2\2\2\u00fc\u00fd\5*\26\2\u00fd\u00fe\b\22\1"+
		"\2\u00fe\u0105\3\2\2\2\u00ff\u0100\5$\23\2\u0100\u0101\b\22\1\2\u0101"+
		"\u0105\3\2\2\2\u0102\u0103\7,\2\2\u0103\u0105\b\22\1\2\u0104\u00fc\3\2"+
		"\2\2\u0104\u00ff\3\2\2\2\u0104\u0102\3\2\2\2\u0105#\3\2\2\2\u0106\u0107"+
		"\5&\24\2\u0107\u0112\b\23\1\2\u0108\u0109\7\20\2\2\u0109\u010a\5&\24\2"+
		"\u010a\u010b\b\23\1\2\u010b\u0111\3\2\2\2\u010c\u010d\7\21\2\2\u010d\u010e"+
		"\5&\24\2\u010e\u010f\b\23\1\2\u010f\u0111\3\2\2\2\u0110\u0108\3\2\2\2"+
		"\u0110\u010c\3\2\2\2\u0111\u0114\3\2\2\2\u0112\u0110\3\2\2\2\u0112\u0113"+
		"\3\2\2\2\u0113%\3\2\2\2\u0114\u0112\3\2\2\2\u0115\u0116\5(\25\2\u0116"+
		"\u0121\b\24\1\2\u0117\u0118\7\22\2\2\u0118\u0119\5(\25\2\u0119\u011a\b"+
		"\24\1\2\u011a\u0120\3\2\2\2\u011b\u011c\7\23\2\2\u011c\u011d\5(\25\2\u011d"+
		"\u011e\b\24\1\2\u011e\u0120\3\2\2\2\u011f\u0117\3\2\2\2\u011f\u011b\3"+
		"\2\2\2\u0120\u0123\3\2\2\2\u0121\u011f\3\2\2\2\u0121\u0122\3\2\2\2\u0122"+
		"\'\3\2\2\2\u0123\u0121\3\2\2\2\u0124\u0125\7\6\2\2\u0125\u0132\b\25\1"+
		"\2\u0126\u0127\7\5\2\2\u0127\u0132\b\25\1\2\u0128\u0129\7\4\2\2\u0129"+
		"\u0132\b\25\1\2\u012a\u012b\7,\2\2\u012b\u0132\b\25\1\2\u012c\u012d\7"+
		"%\2\2\u012d\u012e\5$\23\2\u012e\u012f\b\25\1\2\u012f\u0130\7&\2\2\u0130"+
		"\u0132\3\2\2\2\u0131\u0124\3\2\2\2\u0131\u0126\3\2\2\2\u0131\u0128\3\2"+
		"\2\2\u0131\u012a\3\2\2\2\u0131\u012c\3\2\2\2\u0132)\3\2\2\2\u0133\u0134"+
		"\7\3\2\2\u0134\u013c\b\26\1\2\u0135\u0136\7\5\2\2\u0136\u013c\b\26\1\2"+
		"\u0137\u0138\7\4\2\2\u0138\u013c\b\26\1\2\u0139\u013a\7\6\2\2\u013a\u013c"+
		"\b\26\1\2\u013b\u0133\3\2\2\2\u013b\u0135\3\2\2\2\u013b\u0137\3\2\2\2"+
		"\u013b\u0139\3\2\2\2\u013c+\3\2\2\2\u013d\u013e\5\60\31\2\u013e\u0148"+
		"\b\27\1\2\u013f\u0140\7\34\2\2\u0140\u0141\5\60\31\2\u0141\u0142\b\27"+
		"\1\2\u0142\u0147\3\2\2\2\u0143\u0144\5.\30\2\u0144\u0145\b\27\1\2\u0145"+
		"\u0147\3\2\2\2\u0146\u013f\3\2\2\2\u0146\u0143\3\2\2\2\u0147\u014a\3\2"+
		"\2\2\u0148\u0146\3\2\2\2\u0148\u0149\3\2\2\2\u0149-\3\2\2\2\u014a\u0148"+
		"\3\2\2\2\u014b\u014c\7\35\2\2\u014c\u014d\5\60\31\2\u014d\u014e\b\30\1"+
		"\2\u014e/\3\2\2\2\u014f\u0150\5\"\22\2\u0150\u0169\b\31\1\2\u0151\u0152"+
		"\7\n\2\2\u0152\u0153\5\"\22\2\u0153\u0154\b\31\1\2\u0154\u016a\3\2\2\2"+
		"\u0155\u0156\7\13\2\2\u0156\u0157\5\"\22\2\u0157\u0158\b\31\1\2\u0158"+
		"\u016a\3\2\2\2\u0159\u015a\7!\2\2\u015a\u015b\5\"\22\2\u015b\u015c\b\31"+
		"\1\2\u015c\u016a\3\2\2\2\u015d\u015e\7\"\2\2\u015e\u015f\5\"\22\2\u015f"+
		"\u0160\b\31\1\2\u0160\u016a\3\2\2\2\u0161\u0162\7#\2\2\u0162\u0163\5\""+
		"\22\2\u0163\u0164\b\31\1\2\u0164\u016a\3\2\2\2\u0165\u0166\7$\2\2\u0166"+
		"\u0167\5\"\22\2\u0167\u0168\b\31\1\2\u0168\u016a\3\2\2\2\u0169\u0151\3"+
		"\2\2\2\u0169\u0155\3\2\2\2\u0169\u0159\3\2\2\2\u0169\u015d\3\2\2\2\u0169"+
		"\u0161\3\2\2\2\u0169\u0165\3\2\2\2\u0169\u016a\3\2\2\2\u016a\u0171\3\2"+
		"\2\2\u016b\u016c\7%\2\2\u016c\u016d\5,\27\2\u016d\u016e\b\31\1\2\u016e"+
		"\u016f\7&\2\2\u016f\u0171\3\2\2\2\u0170\u014f\3\2\2\2\u0170\u016b\3\2"+
		"\2\2\u0171\u0176\3\2\2\2\u0172\u0173\5\62\32\2\u0173\u0174\b\31\1\2\u0174"+
		"\u0176\3\2\2\2\u0175\u0170\3\2\2\2\u0175\u0172\3\2\2\2\u0176\61\3\2\2"+
		"\2\u0177\u0178\7\36\2\2\u0178\u0179\5\60\31\2\u0179\u017a\b\32\1\2\u017a"+
		"\63\3\2\2\2\u017b\u017c\7\b\2\2\u017c\u017d\7\3\2\2\u017d\65\3\2\2\2\30"+
		"<kv\177\u0082\u0091\u00a0\u00a4\u00ae\u00c1\u0104\u0110\u0112\u011f\u0121"+
		"\u0131\u013b\u0146\u0148\u0169\u0170\u0175";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}
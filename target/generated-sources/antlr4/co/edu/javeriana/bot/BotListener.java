// Generated from co\edu\javeriana\bot\Bot.g4 by ANTLR 4.5.1
package co.edu.javeriana.bot;


	import org.jpavlich.bot.*;
	import org.jpavlich.bot.Bot;
	import co.edu.javeriana.bot.ast.*;
	import java.util.Map;
	import java.util.HashMap;

import org.antlr.v4.runtime.tree.ParseTreeListener;

/**
 * This interface defines a complete listener for a parse tree produced by
 * {@link BotParser}.
 */
public interface BotListener extends ParseTreeListener {
	/**
	 * Enter a parse tree produced by {@link BotParser#program}.
	 * @param ctx the parse tree
	 */
	void enterProgram(BotParser.ProgramContext ctx);
	/**
	 * Exit a parse tree produced by {@link BotParser#program}.
	 * @param ctx the parse tree
	 */
	void exitProgram(BotParser.ProgramContext ctx);
	/**
	 * Enter a parse tree produced by {@link BotParser#sentence}.
	 * @param ctx the parse tree
	 */
	void enterSentence(BotParser.SentenceContext ctx);
	/**
	 * Exit a parse tree produced by {@link BotParser#sentence}.
	 * @param ctx the parse tree
	 */
	void exitSentence(BotParser.SentenceContext ctx);
	/**
	 * Enter a parse tree produced by {@link BotParser#if_else_conditional}.
	 * @param ctx the parse tree
	 */
	void enterIf_else_conditional(BotParser.If_else_conditionalContext ctx);
	/**
	 * Exit a parse tree produced by {@link BotParser#if_else_conditional}.
	 * @param ctx the parse tree
	 */
	void exitIf_else_conditional(BotParser.If_else_conditionalContext ctx);
	/**
	 * Enter a parse tree produced by {@link BotParser#parameters}.
	 * @param ctx the parse tree
	 */
	void enterParameters(BotParser.ParametersContext ctx);
	/**
	 * Exit a parse tree produced by {@link BotParser#parameters}.
	 * @param ctx the parse tree
	 */
	void exitParameters(BotParser.ParametersContext ctx);
	/**
	 * Enter a parse tree produced by {@link BotParser#function}.
	 * @param ctx the parse tree
	 */
	void enterFunction(BotParser.FunctionContext ctx);
	/**
	 * Exit a parse tree produced by {@link BotParser#function}.
	 * @param ctx the parse tree
	 */
	void exitFunction(BotParser.FunctionContext ctx);
	/**
	 * Enter a parse tree produced by {@link BotParser#up_movement}.
	 * @param ctx the parse tree
	 */
	void enterUp_movement(BotParser.Up_movementContext ctx);
	/**
	 * Exit a parse tree produced by {@link BotParser#up_movement}.
	 * @param ctx the parse tree
	 */
	void exitUp_movement(BotParser.Up_movementContext ctx);
	/**
	 * Enter a parse tree produced by {@link BotParser#left_movement}.
	 * @param ctx the parse tree
	 */
	void enterLeft_movement(BotParser.Left_movementContext ctx);
	/**
	 * Exit a parse tree produced by {@link BotParser#left_movement}.
	 * @param ctx the parse tree
	 */
	void exitLeft_movement(BotParser.Left_movementContext ctx);
	/**
	 * Enter a parse tree produced by {@link BotParser#right_movement}.
	 * @param ctx the parse tree
	 */
	void enterRight_movement(BotParser.Right_movementContext ctx);
	/**
	 * Exit a parse tree produced by {@link BotParser#right_movement}.
	 * @param ctx the parse tree
	 */
	void exitRight_movement(BotParser.Right_movementContext ctx);
	/**
	 * Enter a parse tree produced by {@link BotParser#down_movement}.
	 * @param ctx the parse tree
	 */
	void enterDown_movement(BotParser.Down_movementContext ctx);
	/**
	 * Exit a parse tree produced by {@link BotParser#down_movement}.
	 * @param ctx the parse tree
	 */
	void exitDown_movement(BotParser.Down_movementContext ctx);
	/**
	 * Enter a parse tree produced by {@link BotParser#pick}.
	 * @param ctx the parse tree
	 */
	void enterPick(BotParser.PickContext ctx);
	/**
	 * Exit a parse tree produced by {@link BotParser#pick}.
	 * @param ctx the parse tree
	 */
	void exitPick(BotParser.PickContext ctx);
	/**
	 * Enter a parse tree produced by {@link BotParser#drop}.
	 * @param ctx the parse tree
	 */
	void enterDrop(BotParser.DropContext ctx);
	/**
	 * Exit a parse tree produced by {@link BotParser#drop}.
	 * @param ctx the parse tree
	 */
	void exitDrop(BotParser.DropContext ctx);
	/**
	 * Enter a parse tree produced by {@link BotParser#declaration}.
	 * @param ctx the parse tree
	 */
	void enterDeclaration(BotParser.DeclarationContext ctx);
	/**
	 * Exit a parse tree produced by {@link BotParser#declaration}.
	 * @param ctx the parse tree
	 */
	void exitDeclaration(BotParser.DeclarationContext ctx);
	/**
	 * Enter a parse tree produced by {@link BotParser#assignment}.
	 * @param ctx the parse tree
	 */
	void enterAssignment(BotParser.AssignmentContext ctx);
	/**
	 * Exit a parse tree produced by {@link BotParser#assignment}.
	 * @param ctx the parse tree
	 */
	void exitAssignment(BotParser.AssignmentContext ctx);
	/**
	 * Enter a parse tree produced by {@link BotParser#both}.
	 * @param ctx the parse tree
	 */
	void enterBoth(BotParser.BothContext ctx);
	/**
	 * Exit a parse tree produced by {@link BotParser#both}.
	 * @param ctx the parse tree
	 */
	void exitBoth(BotParser.BothContext ctx);
	/**
	 * Enter a parse tree produced by {@link BotParser#output}.
	 * @param ctx the parse tree
	 */
	void enterOutput(BotParser.OutputContext ctx);
	/**
	 * Exit a parse tree produced by {@link BotParser#output}.
	 * @param ctx the parse tree
	 */
	void exitOutput(BotParser.OutputContext ctx);
	/**
	 * Enter a parse tree produced by {@link BotParser#expression}.
	 * @param ctx the parse tree
	 */
	void enterExpression(BotParser.ExpressionContext ctx);
	/**
	 * Exit a parse tree produced by {@link BotParser#expression}.
	 * @param ctx the parse tree
	 */
	void exitExpression(BotParser.ExpressionContext ctx);
	/**
	 * Enter a parse tree produced by {@link BotParser#arithmetic}.
	 * @param ctx the parse tree
	 */
	void enterArithmetic(BotParser.ArithmeticContext ctx);
	/**
	 * Exit a parse tree produced by {@link BotParser#arithmetic}.
	 * @param ctx the parse tree
	 */
	void exitArithmetic(BotParser.ArithmeticContext ctx);
	/**
	 * Enter a parse tree produced by {@link BotParser#factor}.
	 * @param ctx the parse tree
	 */
	void enterFactor(BotParser.FactorContext ctx);
	/**
	 * Exit a parse tree produced by {@link BotParser#factor}.
	 * @param ctx the parse tree
	 */
	void exitFactor(BotParser.FactorContext ctx);
	/**
	 * Enter a parse tree produced by {@link BotParser#term}.
	 * @param ctx the parse tree
	 */
	void enterTerm(BotParser.TermContext ctx);
	/**
	 * Exit a parse tree produced by {@link BotParser#term}.
	 * @param ctx the parse tree
	 */
	void exitTerm(BotParser.TermContext ctx);
	/**
	 * Enter a parse tree produced by {@link BotParser#dato}.
	 * @param ctx the parse tree
	 */
	void enterDato(BotParser.DatoContext ctx);
	/**
	 * Exit a parse tree produced by {@link BotParser#dato}.
	 * @param ctx the parse tree
	 */
	void exitDato(BotParser.DatoContext ctx);
	/**
	 * Enter a parse tree produced by {@link BotParser#logic}.
	 * @param ctx the parse tree
	 */
	void enterLogic(BotParser.LogicContext ctx);
	/**
	 * Exit a parse tree produced by {@link BotParser#logic}.
	 * @param ctx the parse tree
	 */
	void exitLogic(BotParser.LogicContext ctx);
	/**
	 * Enter a parse tree produced by {@link BotParser#logic_or}.
	 * @param ctx the parse tree
	 */
	void enterLogic_or(BotParser.Logic_orContext ctx);
	/**
	 * Exit a parse tree produced by {@link BotParser#logic_or}.
	 * @param ctx the parse tree
	 */
	void exitLogic_or(BotParser.Logic_orContext ctx);
	/**
	 * Enter a parse tree produced by {@link BotParser#comparation}.
	 * @param ctx the parse tree
	 */
	void enterComparation(BotParser.ComparationContext ctx);
	/**
	 * Exit a parse tree produced by {@link BotParser#comparation}.
	 * @param ctx the parse tree
	 */
	void exitComparation(BotParser.ComparationContext ctx);
	/**
	 * Enter a parse tree produced by {@link BotParser#not}.
	 * @param ctx the parse tree
	 */
	void enterNot(BotParser.NotContext ctx);
	/**
	 * Exit a parse tree produced by {@link BotParser#not}.
	 * @param ctx the parse tree
	 */
	void exitNot(BotParser.NotContext ctx);
	/**
	 * Enter a parse tree produced by {@link BotParser#comment}.
	 * @param ctx the parse tree
	 */
	void enterComment(BotParser.CommentContext ctx);
	/**
	 * Exit a parse tree produced by {@link BotParser#comment}.
	 * @param ctx the parse tree
	 */
	void exitComment(BotParser.CommentContext ctx);
}
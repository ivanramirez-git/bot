// Generated from co\edu\javeriana\bot\Bot.g4 by ANTLR 4.5.1
package co.edu.javeriana.bot;

	import org.jpavlich.bot.*;
	import org.jpavlich.bot.Bot;
	import co.edu.javeriana.bot.ast.*;
	import java.util.Map;
	import java.util.HashMap;

import org.antlr.v4.runtime.tree.ParseTreeVisitor;

/**
 * This interface defines a complete generic visitor for a parse tree produced
 * by {@link BotParser}.
 *
 * @param <T> The return type of the visit operation. Use {@link Void} for
 * operations with no return type.
 */
public interface BotVisitor<T> extends ParseTreeVisitor<T> {
	/**
	 * Visit a parse tree produced by {@link BotParser#program}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitProgram(BotParser.ProgramContext ctx);
	/**
	 * Visit a parse tree produced by {@link BotParser#sentence}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitSentence(BotParser.SentenceContext ctx);
	/**
	 * Visit a parse tree produced by {@link BotParser#if_else_conditional}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitIf_else_conditional(BotParser.If_else_conditionalContext ctx);
	/**
	 * Visit a parse tree produced by {@link BotParser#while_cicle}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitWhile_cicle(BotParser.While_cicleContext ctx);
	/**
	 * Visit a parse tree produced by {@link BotParser#function_declaration}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitFunction_declaration(BotParser.Function_declarationContext ctx);
	/**
	 * Visit a parse tree produced by {@link BotParser#function_call}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitFunction_call(BotParser.Function_callContext ctx);
	/**
	 * Visit a parse tree produced by {@link BotParser#up_movement}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitUp_movement(BotParser.Up_movementContext ctx);
	/**
	 * Visit a parse tree produced by {@link BotParser#left_movement}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitLeft_movement(BotParser.Left_movementContext ctx);
	/**
	 * Visit a parse tree produced by {@link BotParser#right_movement}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitRight_movement(BotParser.Right_movementContext ctx);
	/**
	 * Visit a parse tree produced by {@link BotParser#down_movement}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitDown_movement(BotParser.Down_movementContext ctx);
	/**
	 * Visit a parse tree produced by {@link BotParser#pick}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitPick(BotParser.PickContext ctx);
	/**
	 * Visit a parse tree produced by {@link BotParser#drop}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitDrop(BotParser.DropContext ctx);
	/**
	 * Visit a parse tree produced by {@link BotParser#declaration}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitDeclaration(BotParser.DeclarationContext ctx);
	/**
	 * Visit a parse tree produced by {@link BotParser#assignment}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitAssignment(BotParser.AssignmentContext ctx);
	/**
	 * Visit a parse tree produced by {@link BotParser#both}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitBoth(BotParser.BothContext ctx);
	/**
	 * Visit a parse tree produced by {@link BotParser#output}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitOutput(BotParser.OutputContext ctx);
	/**
	 * Visit a parse tree produced by {@link BotParser#expression}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitExpression(BotParser.ExpressionContext ctx);
	/**
	 * Visit a parse tree produced by {@link BotParser#arithmetic}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitArithmetic(BotParser.ArithmeticContext ctx);
	/**
	 * Visit a parse tree produced by {@link BotParser#factor}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitFactor(BotParser.FactorContext ctx);
	/**
	 * Visit a parse tree produced by {@link BotParser#term}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitTerm(BotParser.TermContext ctx);
	/**
	 * Visit a parse tree produced by {@link BotParser#dato}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitDato(BotParser.DatoContext ctx);
	/**
	 * Visit a parse tree produced by {@link BotParser#logic}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitLogic(BotParser.LogicContext ctx);
	/**
	 * Visit a parse tree produced by {@link BotParser#logic_or}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitLogic_or(BotParser.Logic_orContext ctx);
	/**
	 * Visit a parse tree produced by {@link BotParser#comparation}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitComparation(BotParser.ComparationContext ctx);
	/**
	 * Visit a parse tree produced by {@link BotParser#not}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitNot(BotParser.NotContext ctx);
	/**
	 * Visit a parse tree produced by {@link BotParser#comment}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitComment(BotParser.CommentContext ctx);
}
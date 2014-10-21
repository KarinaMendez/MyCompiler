// Generated from parser/DecafParser.g by ANTLR 4.4

  package compiler.parser;
  import java.util.*;

import org.antlr.v4.runtime.misc.NotNull;
import org.antlr.v4.runtime.tree.ParseTreeVisitor;

/**
 * This interface defines a complete generic visitor for a parse tree produced
 * by {@link DecafParser}.
 *
 * @param <T> The return type of the visit operation. Use {@link Void} for
 * operations with no return type.
 */
public interface DecafParserVisitor<T> extends ParseTreeVisitor<T> {
	/**
	 * Visit a parse tree produced by the {@code arithOp}
	 * labeled alternative in {@link DecafParser#arith_op}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitArithOp(@NotNull DecafParser.ArithOpContext ctx);
	/**
	 * Visit a parse tree produced by the {@code binOp}
	 * labeled alternative in {@link DecafParser#bin_op}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitBinOp(@NotNull DecafParser.BinOpContext ctx);
	/**
	 * Visit a parse tree produced by the {@code calloutDec}
	 * labeled alternative in {@link DecafParser#callout_decl}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitCalloutDec(@NotNull DecafParser.CalloutDecContext ctx);
	/**
	 * Visit a parse tree produced by the {@code assign}
	 * labeled alternative in {@link DecafParser#assign_op}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitAssign(@NotNull DecafParser.AssignContext ctx);
	/**
	 * Visit a parse tree produced by the {@code methodDec}
	 * labeled alternative in {@link DecafParser#method_decl}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitMethodDec(@NotNull DecafParser.MethodDecContext ctx);
	/**
	 * Visit a parse tree produced by the {@code decimalLit}
	 * labeled alternative in {@link DecafParser#decimal_literal}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitDecimalLit(@NotNull DecafParser.DecimalLitContext ctx);
	/**
	 * Visit a parse tree produced by the {@code methodCall}
	 * labeled alternative in {@link DecafParser#statement}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitMethodCall(@NotNull DecafParser.MethodCallContext ctx);
	/**
	 * Visit a parse tree produced by the {@code for}
	 * labeled alternative in {@link DecafParser#statement}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitFor(@NotNull DecafParser.ForContext ctx);
	/**
	 * Visit a parse tree produced by the {@code locationExp1}
	 * labeled alternative in {@link DecafParser#expr}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitLocationExp1(@NotNull DecafParser.LocationExp1Context ctx);
	/**
	 * Visit a parse tree produced by the {@code locationExp2}
	 * labeled alternative in {@link DecafParser#expleft}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitLocationExp2(@NotNull DecafParser.LocationExp2Context ctx);
	/**
	 * Visit a parse tree produced by the {@code literalExp1}
	 * labeled alternative in {@link DecafParser#expr}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitLiteralExp1(@NotNull DecafParser.LiteralExp1Context ctx);
	/**
	 * Visit a parse tree produced by the {@code literalExp2}
	 * labeled alternative in {@link DecafParser#expleft}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitLiteralExp2(@NotNull DecafParser.LiteralExp2Context ctx);
	/**
	 * Visit a parse tree produced by the {@code exp2}
	 * labeled alternative in {@link DecafParser#expleft}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitExp2(@NotNull DecafParser.Exp2Context ctx);
	/**
	 * Visit a parse tree produced by the {@code while}
	 * labeled alternative in {@link DecafParser#statement}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitWhile(@NotNull DecafParser.WhileContext ctx);
	/**
	 * Visit a parse tree produced by the {@code exp1}
	 * labeled alternative in {@link DecafParser#expr}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitExp1(@NotNull DecafParser.Exp1Context ctx);
	/**
	 * Visit a parse tree produced by the {@code break}
	 * labeled alternative in {@link DecafParser#statement}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitBreak(@NotNull DecafParser.BreakContext ctx);
	/**
	 * Visit a parse tree produced by the {@code fieldDec1}
	 * labeled alternative in {@link DecafParser#field_decl}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitFieldDec1(@NotNull DecafParser.FieldDec1Context ctx);
	/**
	 * Visit a parse tree produced by the {@code recursiveExp}
	 * labeled alternative in {@link DecafParser#expr}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitRecursiveExp(@NotNull DecafParser.RecursiveExpContext ctx);
	/**
	 * Visit a parse tree produced by {@link DecafParser#mult_div}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitMult_div(@NotNull DecafParser.Mult_divContext ctx);
	/**
	 * Visit a parse tree produced by the {@code if}
	 * labeled alternative in {@link DecafParser#statement}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitIf(@NotNull DecafParser.IfContext ctx);
	/**
	 * Visit a parse tree produced by the {@code negativeExp2}
	 * labeled alternative in {@link DecafParser#expleft}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitNegativeExp2(@NotNull DecafParser.NegativeExp2Context ctx);
	/**
	 * Visit a parse tree produced by the {@code negativeExp1}
	 * labeled alternative in {@link DecafParser#expr}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitNegativeExp1(@NotNull DecafParser.NegativeExp1Context ctx);
	/**
	 * Visit a parse tree produced by the {@code lit}
	 * labeled alternative in {@link DecafParser#literal}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitLit(@NotNull DecafParser.LitContext ctx);
	/**
	 * Visit a parse tree produced by the {@code methodC2}
	 * labeled alternative in {@link DecafParser#method_call}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitMethodC2(@NotNull DecafParser.MethodC2Context ctx);
	/**
	 * Visit a parse tree produced by the {@code block1}
	 * labeled alternative in {@link DecafParser#block}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitBlock1(@NotNull DecafParser.Block1Context ctx);
	/**
	 * Visit a parse tree produced by the {@code relOp}
	 * labeled alternative in {@link DecafParser#rel_op}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitRelOp(@NotNull DecafParser.RelOpContext ctx);
	/**
	 * Visit a parse tree produced by the {@code return}
	 * labeled alternative in {@link DecafParser#statement}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitReturn(@NotNull DecafParser.ReturnContext ctx);
	/**
	 * Visit a parse tree produced by the {@code locationParent}
	 * labeled alternative in {@link DecafParser#location}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitLocationParent(@NotNull DecafParser.LocationParentContext ctx);
	/**
	 * Visit a parse tree produced by the {@code intLit}
	 * labeled alternative in {@link DecafParser#int_literal}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitIntLit(@NotNull DecafParser.IntLitContext ctx);
	/**
	 * Visit a parse tree produced by the {@code eqOp}
	 * labeled alternative in {@link DecafParser#eq_op}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitEqOp(@NotNull DecafParser.EqOpContext ctx);
	/**
	 * Visit a parse tree produced by {@link DecafParser#start}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitStart(@NotNull DecafParser.StartContext ctx);
	/**
	 * Visit a parse tree produced by {@link DecafParser#program}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitProgram(@NotNull DecafParser.ProgramContext ctx);
	/**
	 * Visit a parse tree produced by the {@code continue}
	 * labeled alternative in {@link DecafParser#statement}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitContinue(@NotNull DecafParser.ContinueContext ctx);
	/**
	 * Visit a parse tree produced by the {@code methodCallExp2}
	 * labeled alternative in {@link DecafParser#expleft}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitMethodCallExp2(@NotNull DecafParser.MethodCallExp2Context ctx);
	/**
	 * Visit a parse tree produced by {@link DecafParser#add_sub}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitAdd_sub(@NotNull DecafParser.Add_subContext ctx);
	/**
	 * Visit a parse tree produced by the {@code locationSon}
	 * labeled alternative in {@link DecafParser#statement}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitLocationSon(@NotNull DecafParser.LocationSonContext ctx);
	/**
	 * Visit a parse tree produced by the {@code methodC1}
	 * labeled alternative in {@link DecafParser#method_call}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitMethodC1(@NotNull DecafParser.MethodC1Context ctx);
	/**
	 * Visit a parse tree produced by the {@code condOp}
	 * labeled alternative in {@link DecafParser#cond_op}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitCondOp(@NotNull DecafParser.CondOpContext ctx);
	/**
	 * Visit a parse tree produced by the {@code calloutArg}
	 * labeled alternative in {@link DecafParser#callout_arg}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitCalloutArg(@NotNull DecafParser.CalloutArgContext ctx);
	/**
	 * Visit a parse tree produced by the {@code methodCallExp1}
	 * labeled alternative in {@link DecafParser#expr}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitMethodCallExp1(@NotNull DecafParser.MethodCallExp1Context ctx);
}
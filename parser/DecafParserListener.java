// Generated from parser/DecafParser.g by ANTLR 4.4

  package compiler.parser;
  import java.util.*;

import org.antlr.v4.runtime.misc.NotNull;
import org.antlr.v4.runtime.tree.ParseTreeListener;

/**
 * This interface defines a complete listener for a parse tree produced by
 * {@link DecafParser}.
 */
public interface DecafParserListener extends ParseTreeListener {
	/**
	 * Enter a parse tree produced by the {@code arithOp}
	 * labeled alternative in {@link DecafParser#arith_op}.
	 * @param ctx the parse tree
	 */
	void enterArithOp(@NotNull DecafParser.ArithOpContext ctx);
	/**
	 * Exit a parse tree produced by the {@code arithOp}
	 * labeled alternative in {@link DecafParser#arith_op}.
	 * @param ctx the parse tree
	 */
	void exitArithOp(@NotNull DecafParser.ArithOpContext ctx);
	/**
	 * Enter a parse tree produced by the {@code binOp}
	 * labeled alternative in {@link DecafParser#bin_op}.
	 * @param ctx the parse tree
	 */
	void enterBinOp(@NotNull DecafParser.BinOpContext ctx);
	/**
	 * Exit a parse tree produced by the {@code binOp}
	 * labeled alternative in {@link DecafParser#bin_op}.
	 * @param ctx the parse tree
	 */
	void exitBinOp(@NotNull DecafParser.BinOpContext ctx);
	/**
	 * Enter a parse tree produced by the {@code calloutDec}
	 * labeled alternative in {@link DecafParser#callout_decl}.
	 * @param ctx the parse tree
	 */
	void enterCalloutDec(@NotNull DecafParser.CalloutDecContext ctx);
	/**
	 * Exit a parse tree produced by the {@code calloutDec}
	 * labeled alternative in {@link DecafParser#callout_decl}.
	 * @param ctx the parse tree
	 */
	void exitCalloutDec(@NotNull DecafParser.CalloutDecContext ctx);
	/**
	 * Enter a parse tree produced by the {@code assign}
	 * labeled alternative in {@link DecafParser#assign_op}.
	 * @param ctx the parse tree
	 */
	void enterAssign(@NotNull DecafParser.AssignContext ctx);
	/**
	 * Exit a parse tree produced by the {@code assign}
	 * labeled alternative in {@link DecafParser#assign_op}.
	 * @param ctx the parse tree
	 */
	void exitAssign(@NotNull DecafParser.AssignContext ctx);
	/**
	 * Enter a parse tree produced by the {@code methodDec}
	 * labeled alternative in {@link DecafParser#method_decl}.
	 * @param ctx the parse tree
	 */
	void enterMethodDec(@NotNull DecafParser.MethodDecContext ctx);
	/**
	 * Exit a parse tree produced by the {@code methodDec}
	 * labeled alternative in {@link DecafParser#method_decl}.
	 * @param ctx the parse tree
	 */
	void exitMethodDec(@NotNull DecafParser.MethodDecContext ctx);
	/**
	 * Enter a parse tree produced by the {@code decimalLit}
	 * labeled alternative in {@link DecafParser#decimal_literal}.
	 * @param ctx the parse tree
	 */
	void enterDecimalLit(@NotNull DecafParser.DecimalLitContext ctx);
	/**
	 * Exit a parse tree produced by the {@code decimalLit}
	 * labeled alternative in {@link DecafParser#decimal_literal}.
	 * @param ctx the parse tree
	 */
	void exitDecimalLit(@NotNull DecafParser.DecimalLitContext ctx);
	/**
	 * Enter a parse tree produced by the {@code methodCall}
	 * labeled alternative in {@link DecafParser#statement}.
	 * @param ctx the parse tree
	 */
	void enterMethodCall(@NotNull DecafParser.MethodCallContext ctx);
	/**
	 * Exit a parse tree produced by the {@code methodCall}
	 * labeled alternative in {@link DecafParser#statement}.
	 * @param ctx the parse tree
	 */
	void exitMethodCall(@NotNull DecafParser.MethodCallContext ctx);
	/**
	 * Enter a parse tree produced by the {@code for}
	 * labeled alternative in {@link DecafParser#statement}.
	 * @param ctx the parse tree
	 */
	void enterFor(@NotNull DecafParser.ForContext ctx);
	/**
	 * Exit a parse tree produced by the {@code for}
	 * labeled alternative in {@link DecafParser#statement}.
	 * @param ctx the parse tree
	 */
	void exitFor(@NotNull DecafParser.ForContext ctx);
	/**
	 * Enter a parse tree produced by the {@code locationExp1}
	 * labeled alternative in {@link DecafParser#expr}.
	 * @param ctx the parse tree
	 */
	void enterLocationExp1(@NotNull DecafParser.LocationExp1Context ctx);
	/**
	 * Exit a parse tree produced by the {@code locationExp1}
	 * labeled alternative in {@link DecafParser#expr}.
	 * @param ctx the parse tree
	 */
	void exitLocationExp1(@NotNull DecafParser.LocationExp1Context ctx);
	/**
	 * Enter a parse tree produced by the {@code locationExp2}
	 * labeled alternative in {@link DecafParser#expleft}.
	 * @param ctx the parse tree
	 */
	void enterLocationExp2(@NotNull DecafParser.LocationExp2Context ctx);
	/**
	 * Exit a parse tree produced by the {@code locationExp2}
	 * labeled alternative in {@link DecafParser#expleft}.
	 * @param ctx the parse tree
	 */
	void exitLocationExp2(@NotNull DecafParser.LocationExp2Context ctx);
	/**
	 * Enter a parse tree produced by the {@code literalExp1}
	 * labeled alternative in {@link DecafParser#expr}.
	 * @param ctx the parse tree
	 */
	void enterLiteralExp1(@NotNull DecafParser.LiteralExp1Context ctx);
	/**
	 * Exit a parse tree produced by the {@code literalExp1}
	 * labeled alternative in {@link DecafParser#expr}.
	 * @param ctx the parse tree
	 */
	void exitLiteralExp1(@NotNull DecafParser.LiteralExp1Context ctx);
	/**
	 * Enter a parse tree produced by the {@code literalExp2}
	 * labeled alternative in {@link DecafParser#expleft}.
	 * @param ctx the parse tree
	 */
	void enterLiteralExp2(@NotNull DecafParser.LiteralExp2Context ctx);
	/**
	 * Exit a parse tree produced by the {@code literalExp2}
	 * labeled alternative in {@link DecafParser#expleft}.
	 * @param ctx the parse tree
	 */
	void exitLiteralExp2(@NotNull DecafParser.LiteralExp2Context ctx);
	/**
	 * Enter a parse tree produced by the {@code exp2}
	 * labeled alternative in {@link DecafParser#expleft}.
	 * @param ctx the parse tree
	 */
	void enterExp2(@NotNull DecafParser.Exp2Context ctx);
	/**
	 * Exit a parse tree produced by the {@code exp2}
	 * labeled alternative in {@link DecafParser#expleft}.
	 * @param ctx the parse tree
	 */
	void exitExp2(@NotNull DecafParser.Exp2Context ctx);
	/**
	 * Enter a parse tree produced by the {@code exp1}
	 * labeled alternative in {@link DecafParser#expr}.
	 * @param ctx the parse tree
	 */
	void enterExp1(@NotNull DecafParser.Exp1Context ctx);
	/**
	 * Exit a parse tree produced by the {@code exp1}
	 * labeled alternative in {@link DecafParser#expr}.
	 * @param ctx the parse tree
	 */
	void exitExp1(@NotNull DecafParser.Exp1Context ctx);
	/**
	 * Enter a parse tree produced by the {@code while}
	 * labeled alternative in {@link DecafParser#statement}.
	 * @param ctx the parse tree
	 */
	void enterWhile(@NotNull DecafParser.WhileContext ctx);
	/**
	 * Exit a parse tree produced by the {@code while}
	 * labeled alternative in {@link DecafParser#statement}.
	 * @param ctx the parse tree
	 */
	void exitWhile(@NotNull DecafParser.WhileContext ctx);
	/**
	 * Enter a parse tree produced by the {@code break}
	 * labeled alternative in {@link DecafParser#statement}.
	 * @param ctx the parse tree
	 */
	void enterBreak(@NotNull DecafParser.BreakContext ctx);
	/**
	 * Exit a parse tree produced by the {@code break}
	 * labeled alternative in {@link DecafParser#statement}.
	 * @param ctx the parse tree
	 */
	void exitBreak(@NotNull DecafParser.BreakContext ctx);
	/**
	 * Enter a parse tree produced by {@link DecafParser#cual}.
	 * @param ctx the parse tree
	 */
	void enterCual(@NotNull DecafParser.CualContext ctx);
	/**
	 * Exit a parse tree produced by {@link DecafParser#cual}.
	 * @param ctx the parse tree
	 */
	void exitCual(@NotNull DecafParser.CualContext ctx);
	/**
	 * Enter a parse tree produced by the {@code fieldDec1}
	 * labeled alternative in {@link DecafParser#field_decl}.
	 * @param ctx the parse tree
	 */
	void enterFieldDec1(@NotNull DecafParser.FieldDec1Context ctx);
	/**
	 * Exit a parse tree produced by the {@code fieldDec1}
	 * labeled alternative in {@link DecafParser#field_decl}.
	 * @param ctx the parse tree
	 */
	void exitFieldDec1(@NotNull DecafParser.FieldDec1Context ctx);
	/**
	 * Enter a parse tree produced by the {@code recursiveExp}
	 * labeled alternative in {@link DecafParser#expr}.
	 * @param ctx the parse tree
	 */
	void enterRecursiveExp(@NotNull DecafParser.RecursiveExpContext ctx);
	/**
	 * Exit a parse tree produced by the {@code recursiveExp}
	 * labeled alternative in {@link DecafParser#expr}.
	 * @param ctx the parse tree
	 */
	void exitRecursiveExp(@NotNull DecafParser.RecursiveExpContext ctx);
	/**
	 * Enter a parse tree produced by {@link DecafParser#mult_div}.
	 * @param ctx the parse tree
	 */
	void enterMult_div(@NotNull DecafParser.Mult_divContext ctx);
	/**
	 * Exit a parse tree produced by {@link DecafParser#mult_div}.
	 * @param ctx the parse tree
	 */
	void exitMult_div(@NotNull DecafParser.Mult_divContext ctx);
	/**
	 * Enter a parse tree produced by the {@code if}
	 * labeled alternative in {@link DecafParser#statement}.
	 * @param ctx the parse tree
	 */
	void enterIf(@NotNull DecafParser.IfContext ctx);
	/**
	 * Exit a parse tree produced by the {@code if}
	 * labeled alternative in {@link DecafParser#statement}.
	 * @param ctx the parse tree
	 */
	void exitIf(@NotNull DecafParser.IfContext ctx);
	/**
	 * Enter a parse tree produced by the {@code negativeExp2}
	 * labeled alternative in {@link DecafParser#expleft}.
	 * @param ctx the parse tree
	 */
	void enterNegativeExp2(@NotNull DecafParser.NegativeExp2Context ctx);
	/**
	 * Exit a parse tree produced by the {@code negativeExp2}
	 * labeled alternative in {@link DecafParser#expleft}.
	 * @param ctx the parse tree
	 */
	void exitNegativeExp2(@NotNull DecafParser.NegativeExp2Context ctx);
	/**
	 * Enter a parse tree produced by the {@code negativeExp1}
	 * labeled alternative in {@link DecafParser#expr}.
	 * @param ctx the parse tree
	 */
	void enterNegativeExp1(@NotNull DecafParser.NegativeExp1Context ctx);
	/**
	 * Exit a parse tree produced by the {@code negativeExp1}
	 * labeled alternative in {@link DecafParser#expr}.
	 * @param ctx the parse tree
	 */
	void exitNegativeExp1(@NotNull DecafParser.NegativeExp1Context ctx);
	/**
	 * Enter a parse tree produced by the {@code lit}
	 * labeled alternative in {@link DecafParser#literal}.
	 * @param ctx the parse tree
	 */
	void enterLit(@NotNull DecafParser.LitContext ctx);
	/**
	 * Exit a parse tree produced by the {@code lit}
	 * labeled alternative in {@link DecafParser#literal}.
	 * @param ctx the parse tree
	 */
	void exitLit(@NotNull DecafParser.LitContext ctx);
	/**
	 * Enter a parse tree produced by the {@code methodC2}
	 * labeled alternative in {@link DecafParser#method_call}.
	 * @param ctx the parse tree
	 */
	void enterMethodC2(@NotNull DecafParser.MethodC2Context ctx);
	/**
	 * Exit a parse tree produced by the {@code methodC2}
	 * labeled alternative in {@link DecafParser#method_call}.
	 * @param ctx the parse tree
	 */
	void exitMethodC2(@NotNull DecafParser.MethodC2Context ctx);
	/**
	 * Enter a parse tree produced by the {@code block1}
	 * labeled alternative in {@link DecafParser#block}.
	 * @param ctx the parse tree
	 */
	void enterBlock1(@NotNull DecafParser.Block1Context ctx);
	/**
	 * Exit a parse tree produced by the {@code block1}
	 * labeled alternative in {@link DecafParser#block}.
	 * @param ctx the parse tree
	 */
	void exitBlock1(@NotNull DecafParser.Block1Context ctx);
	/**
	 * Enter a parse tree produced by the {@code relOp}
	 * labeled alternative in {@link DecafParser#rel_op}.
	 * @param ctx the parse tree
	 */
	void enterRelOp(@NotNull DecafParser.RelOpContext ctx);
	/**
	 * Exit a parse tree produced by the {@code relOp}
	 * labeled alternative in {@link DecafParser#rel_op}.
	 * @param ctx the parse tree
	 */
	void exitRelOp(@NotNull DecafParser.RelOpContext ctx);
	/**
	 * Enter a parse tree produced by the {@code return}
	 * labeled alternative in {@link DecafParser#statement}.
	 * @param ctx the parse tree
	 */
	void enterReturn(@NotNull DecafParser.ReturnContext ctx);
	/**
	 * Exit a parse tree produced by the {@code return}
	 * labeled alternative in {@link DecafParser#statement}.
	 * @param ctx the parse tree
	 */
	void exitReturn(@NotNull DecafParser.ReturnContext ctx);
	/**
	 * Enter a parse tree produced by the {@code locationParent}
	 * labeled alternative in {@link DecafParser#location}.
	 * @param ctx the parse tree
	 */
	void enterLocationParent(@NotNull DecafParser.LocationParentContext ctx);
	/**
	 * Exit a parse tree produced by the {@code locationParent}
	 * labeled alternative in {@link DecafParser#location}.
	 * @param ctx the parse tree
	 */
	void exitLocationParent(@NotNull DecafParser.LocationParentContext ctx);
	/**
	 * Enter a parse tree produced by the {@code intLit}
	 * labeled alternative in {@link DecafParser#int_literal}.
	 * @param ctx the parse tree
	 */
	void enterIntLit(@NotNull DecafParser.IntLitContext ctx);
	/**
	 * Exit a parse tree produced by the {@code intLit}
	 * labeled alternative in {@link DecafParser#int_literal}.
	 * @param ctx the parse tree
	 */
	void exitIntLit(@NotNull DecafParser.IntLitContext ctx);
	/**
	 * Enter a parse tree produced by the {@code eqOp}
	 * labeled alternative in {@link DecafParser#eq_op}.
	 * @param ctx the parse tree
	 */
	void enterEqOp(@NotNull DecafParser.EqOpContext ctx);
	/**
	 * Exit a parse tree produced by the {@code eqOp}
	 * labeled alternative in {@link DecafParser#eq_op}.
	 * @param ctx the parse tree
	 */
	void exitEqOp(@NotNull DecafParser.EqOpContext ctx);
	/**
	 * Enter a parse tree produced by {@link DecafParser#start}.
	 * @param ctx the parse tree
	 */
	void enterStart(@NotNull DecafParser.StartContext ctx);
	/**
	 * Exit a parse tree produced by {@link DecafParser#start}.
	 * @param ctx the parse tree
	 */
	void exitStart(@NotNull DecafParser.StartContext ctx);
	/**
	 * Enter a parse tree produced by {@link DecafParser#program}.
	 * @param ctx the parse tree
	 */
	void enterProgram(@NotNull DecafParser.ProgramContext ctx);
	/**
	 * Exit a parse tree produced by {@link DecafParser#program}.
	 * @param ctx the parse tree
	 */
	void exitProgram(@NotNull DecafParser.ProgramContext ctx);
	/**
	 * Enter a parse tree produced by the {@code continue}
	 * labeled alternative in {@link DecafParser#statement}.
	 * @param ctx the parse tree
	 */
	void enterContinue(@NotNull DecafParser.ContinueContext ctx);
	/**
	 * Exit a parse tree produced by the {@code continue}
	 * labeled alternative in {@link DecafParser#statement}.
	 * @param ctx the parse tree
	 */
	void exitContinue(@NotNull DecafParser.ContinueContext ctx);
	/**
	 * Enter a parse tree produced by the {@code methodCallExp2}
	 * labeled alternative in {@link DecafParser#expleft}.
	 * @param ctx the parse tree
	 */
	void enterMethodCallExp2(@NotNull DecafParser.MethodCallExp2Context ctx);
	/**
	 * Exit a parse tree produced by the {@code methodCallExp2}
	 * labeled alternative in {@link DecafParser#expleft}.
	 * @param ctx the parse tree
	 */
	void exitMethodCallExp2(@NotNull DecafParser.MethodCallExp2Context ctx);
	/**
	 * Enter a parse tree produced by {@link DecafParser#add_sub}.
	 * @param ctx the parse tree
	 */
	void enterAdd_sub(@NotNull DecafParser.Add_subContext ctx);
	/**
	 * Exit a parse tree produced by {@link DecafParser#add_sub}.
	 * @param ctx the parse tree
	 */
	void exitAdd_sub(@NotNull DecafParser.Add_subContext ctx);
	/**
	 * Enter a parse tree produced by the {@code locationSon}
	 * labeled alternative in {@link DecafParser#statement}.
	 * @param ctx the parse tree
	 */
	void enterLocationSon(@NotNull DecafParser.LocationSonContext ctx);
	/**
	 * Exit a parse tree produced by the {@code locationSon}
	 * labeled alternative in {@link DecafParser#statement}.
	 * @param ctx the parse tree
	 */
	void exitLocationSon(@NotNull DecafParser.LocationSonContext ctx);
	/**
	 * Enter a parse tree produced by the {@code methodC1}
	 * labeled alternative in {@link DecafParser#method_call}.
	 * @param ctx the parse tree
	 */
	void enterMethodC1(@NotNull DecafParser.MethodC1Context ctx);
	/**
	 * Exit a parse tree produced by the {@code methodC1}
	 * labeled alternative in {@link DecafParser#method_call}.
	 * @param ctx the parse tree
	 */
	void exitMethodC1(@NotNull DecafParser.MethodC1Context ctx);
	/**
	 * Enter a parse tree produced by the {@code condOp}
	 * labeled alternative in {@link DecafParser#cond_op}.
	 * @param ctx the parse tree
	 */
	void enterCondOp(@NotNull DecafParser.CondOpContext ctx);
	/**
	 * Exit a parse tree produced by the {@code condOp}
	 * labeled alternative in {@link DecafParser#cond_op}.
	 * @param ctx the parse tree
	 */
	void exitCondOp(@NotNull DecafParser.CondOpContext ctx);
	/**
	 * Enter a parse tree produced by the {@code calloutArg}
	 * labeled alternative in {@link DecafParser#callout_arg}.
	 * @param ctx the parse tree
	 */
	void enterCalloutArg(@NotNull DecafParser.CalloutArgContext ctx);
	/**
	 * Exit a parse tree produced by the {@code calloutArg}
	 * labeled alternative in {@link DecafParser#callout_arg}.
	 * @param ctx the parse tree
	 */
	void exitCalloutArg(@NotNull DecafParser.CalloutArgContext ctx);
	/**
	 * Enter a parse tree produced by the {@code methodCallExp1}
	 * labeled alternative in {@link DecafParser#expr}.
	 * @param ctx the parse tree
	 */
	void enterMethodCallExp1(@NotNull DecafParser.MethodCallExp1Context ctx);
	/**
	 * Exit a parse tree produced by the {@code methodCallExp1}
	 * labeled alternative in {@link DecafParser#expr}.
	 * @param ctx the parse tree
	 */
	void exitMethodCallExp1(@NotNull DecafParser.MethodCallExp1Context ctx);
}
/*Ast.java*/
package compiler.ast;
import java.util.*;
import java.util.List;
import org.antlr.v4.runtime.tree.TerminalNode;
import compiler.parser.DecafParser;
import compiler.parser.DecafParserBaseVisitor;
import java.io.*;
import compiler.lib.Printer;
import compiler.parser.CC4Parser;

public class Ast extends DecafParserBaseVisitor<Node>{
	CC4Parser c;
	public Ast(Printer out,String filename)throws Exception{
		this.c = new CC4Parser(out,filename);
		out.print("stage: CC4Parser \n");
	}

	@Override
	public Node visitProgram(DecafParser.ProgramContext ctx){
		Root root = new Root();
		//lista con todas las expresiones, callout_decl()
		List<DecafParser.Callout_declContext> list = ctx.callout_decl();

		//lista con todas las expresiones, field_decl()		
		List<DecafParser.Field_declContext> list2 = ctx.field_decl();

		//lista con todas las expresiones, method_decl()
		List<DecafParser.Method_declContext> list3 = ctx.method_decl();

		if(list != null){
			for(DecafParser.Callout_declContext e : list){
				root.add(visit(e));							//visitar cada expresion
			}
		}

		if(list2 != null){
			for(DecafParser.Field_declContext e : list2){
				root.add(visit(e));							//visitar cada expresion
			}
		}

		if(list3 != null){
			for(DecafParser.Method_declContext e : list3){
				root.add(visit(e));							//visitar cada expresion
			}
		}

		return root;
	}


	@Override
	public Node visitCalloutDec(DecafParser.CalloutDecContext ctx){
		TerminalNode call = ctx.CALLOUT(); 									//crea nodo terminal
		TerminalNode id = ctx.ID();											//crea nodo terminal
		return new CalloutDec(call.getText(), id.getText());				//crea nodo para callout expr.
	}

	/*LITERALS*/

	@Override
	public Node visitDecimalLit(DecafParser.DecimalLitContext ctx){
		//TerminalNode enteros = ctx.ENTEROS();
		LinkedList<String> aux = new LinkedList<String>();
		List<TerminalNode> entList = ctx.ENTEROS();
		for(int i = 0; i < entList.size(); i++){
			aux.add(entList.get(i).getSymbol().getText());
			System.out.println(entList.get(i).getSymbol().getText());
		}

		//se crea el nodo decimal literal recibiendo de parametro la lista de elemento de tipo decimal literal 
		return new Literal("decimal", aux);
	}

	@Override
	public Node visitIntLit(DecafParser.IntLitContext ctx){

		// se encarga de la parte de decimal literal
		if(ctx.decimal_literal() != null){
			return new Literal("int_literal ", ctx.decimal_literal().getText());
			//visit(ctx.decimal_literal());
		}
		// se encarga de la parte de hex literal
		if(ctx.HEX() != null){
			return new Literal("hex ", ctx.HEX().getText());
		}
		return null;
	}

	@Override
	public Node visitLit(DecafParser.LitContext ctx){
		String literal = ctx.int_literal().getText();
		TerminalNode lit;

		//determina si es char o boolean
		if(ctx.CHAR() != null){
			lit = ctx.CHAR();
			return new Literal("char ", lit.getText());
		}
		if(ctx.BOOLEANS() != null){
			lit = ctx.BOOLEANS();
			return new Literal("booleans ", lit.getText());
		}
		return null;
	}

	/*-----------------------------*/

	/*OPERACIONES BINARIAS*/


	@Override 
	public Node visitCondOp(DecafParser.CondOpContext ctx){
		TerminalNode op = ctx.ANDD() == null ? ctx.ORR() : ctx.ANDD();
		return null;
	}

	@Override
	public Node visitEqOp(DecafParser.EqOpContext ctx){
		TerminalNode op = ctx.EQQ() == null ? ctx.NOEQ() : ctx.EQQ();
		return null;
	}

	@Override
	public Node visitRelOp(DecafParser.RelOpContext ctx){
		TerminalNode op;
		if((ctx.MEN() == null) && (ctx.MAY() == null) && (ctx.MEEQ() == null)){
			op = ctx.MAEQ();

		}else if((ctx.MEN() == null) && (ctx.MAY() == null) && (ctx.MAEQ() == null)){
			op = ctx.MEEQ();

		}else if((ctx.MAY() == null) && (ctx.MEEQ() == null) && (ctx.MAEQ() == null)){
			op = ctx.MEN();

		}else if((ctx.MEN() == null) && (ctx.MAEQ() == null) && (ctx.MEEQ() == null)){
			op = ctx.MAY();
		}

		return null;
	}

	@Override
	public Node visitArithOp(DecafParser.ArithOpContext ctx){
		Node op = null;

		if(ctx.mult_div() == null){
			op = visit(ctx.add_sub());
		}else if(ctx.add_sub() == null){
			op = visit(ctx.mult_div());
		}

		return op;
	}	

	@Override
	public Node visitBinOp(DecafParser.BinOpContext ctx){
		Node op = null;

		if((ctx.arith_op() == null) && (ctx.rel_op() == null) && (ctx.eq_op() == null)){
			op = visit(ctx.cond_op());

		}else if((ctx.arith_op() == null) && (ctx.rel_op() == null) && (ctx.cond_op() == null)){
			op = visit(ctx.eq_op());

		}else if((ctx.arith_op() == null) && (ctx.eq_op() == null) && (ctx.cond_op() == null)){
			op = visit(ctx.rel_op()); 

		}else if((ctx.eq_op() == null) && (ctx.rel_op() == null) && (ctx.cond_op() == null)){
			op = visit(ctx.arith_op());
		}

		return op;
	}

	/*-----------------------*/ 

	@Override
	public Node visitMethodDec(DecafParser.MethodDecContext ctx){
		TerminalNode type;													//verifica el nodo terminal correcto
		if((ctx.BOO(0) == null) && (ctx.INT(0) == null)){
			type = ctx.VOID();
		}else if((ctx.BOO(0) == null) && (ctx.VOID() == null)){
			type = ctx.INT(0);
		}else{
			type = ctx.BOO(0);
		}
		return null;
	}
}
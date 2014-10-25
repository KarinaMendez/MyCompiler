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
				if (e == null) System.out.println("\t\t\tasdf");
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
	public Node visitCalloutArg(DecafParser.CalloutArgContext ctx){
		Node exp = null;
		String str = null;
		if(ctx.expr() != null){
			exp = visit(ctx.expr());
			return new CalloutDec(exp);

		}else if(ctx.STRING() != null){
			str = ctx.STRING().getText();
			return new CalloutDec(str);
		}
		return null;
	}

	/*-----------------------*/

	//location	
	@Override
	public Node visitLocationParent(DecafParser.LocationParentContext ctx){
		TerminalNode id = ctx.ID();
		if(ctx.expr() != null){
			return new Location(id.getText(), visit(ctx.expr()));
		}else{
			return new Location(id.getText());
		}
	}

	/*-----------------------*/
	//FIELD DECLARATIONS

	@Override
	public Node visitFieldDec1(DecafParser.FieldDec1Context ctx){
		TerminalNode type;
		if((ctx.INT() == null) && (ctx.BOO() == null)){
			type = ctx.VOD();
		}else if((ctx.VOD() == null) && (ctx.BOO() == null)){
			type = ctx.INT();
		}else{
			type = ctx.BOO();
		}
		
		//Solo un ID
		if(ctx.ID().size() == 1 && ctx.int_literal().size() == 0){
			TerminalNode id = ctx.ID(0);
			return new FieldDec(type.getText(), id.getText());

		//Varios ID's, no arreglos
		}else if(ctx.ID().size() > 1 && ctx.int_literal().size() == 0){

			LinkedList<String> aux = new LinkedList<String>();
			List<TerminalNode> ids = ctx.ID();

			for (int i = 0; i < ids.size(); i++) {
				aux.add(ids.get(i).getText());				
			}

			return new FieldDec(type.getText(), aux);

		//Arreglos
		}else if (ctx.ID().size() == 1 && ctx.int_literal().size() == 1){
			TerminalNode id = ctx.ID(0);
			DecafParser.Int_literalContext lit = ctx.int_literal(0);
			return new FieldDec(type.getText(), id.getText(), lit.getText());

		//Arreglos y Id's
		}else if (ctx.ID().size() > 1 && ctx.int_literal().size() > 1){
			LinkedList<String> aux = new LinkedList<String>();
			List<TerminalNode> ids = ctx.ID();

			for (int i = 0; i < ids.size(); i++) {
				aux.add(ids.get(i).getText());				
			}

			LinkedList<String> l = new LinkedList<String>();
			List<DecafParser.Int_literalContext> lits = ctx.int_literal();
			for (int i = 0; i < lits.size(); i++) {
				l.add(lits.get(i).getText());				
			}
			return new FieldDec(type.getText(), aux, l);
		}
		return null;
	}


	/*-----------------------*/
	//METHOD DECLARATIONS

	//method_decl: (INT | BOO | VOD) ID PARENTESIS (cual ID  (COMA cual ID)*)* PARENTESIS2 block 

	@Override
	public Node visitMethodDec(DecafParser.MethodDecContext ctx){
		TerminalNode type = null;
		TerminalNode id = null;
		LinkedList<String> t = new LinkedList<String>();
		LinkedList<String> n = new LinkedList<String>();
		List<DecafParser.CualContext> typ;
		boolean conIDs = false;												//verifica el nodo terminal correcto

		if((ctx.BOO() == null) && (ctx.VOD() == null)){
			type = ctx.INT();
		}else if((ctx.INT() == null) && (ctx.VOD() == null)){
			type = ctx.BOO();
		} else {
			type = ctx.VOD();
		}

		//nombre del metodo
		if(ctx.ID().size() == 1){
			id = ctx.ID(0);
		}else if((ctx.ID().size() > 1) && (ctx.cual().size() == (ctx.ID().size() - 1))){
			id = ctx.ID(0);
			typ = ctx.cual();
			conIDs = true;

			//ingreso a una lista de strings los tipos de datos que iran de parametros
			for (int i = 0; i < typ.size(); i++) {
				t.add(typ.get(i).getText());				
			}

			//convierto a una lista de strings los nodos terminales de la lista ID a partir de la segunda posicion
			for (int j = 1; j < ctx.ID().size(); j++) {
				n.add(ctx.ID().get(j).getText());
			}
		}
		

		Node blockit; //= visit(ctx.block());
		//System.out.println(visit(ctx.block()));

		
		if((visit(ctx.block()) == null) && conIDs){
			return new MethodDec(type.getText(), id.getText(), t, n);
		}else if((visit(ctx.block()) == null) && (conIDs = false)){
			System.out.println("sin ids");
			return new MethodDec(type.getText(), id.getText());
		}else{
			System.out.println("Error ");
			blockit = visit(ctx.block());						
			return new MethodDec(type.getText(), id.getText(), t, n, blockit);
		}
		//return null;
	}

	/*-------------------------*/
		//assign_op: (EQ | PLEQ | MIEQ)
	@Override
	public Node visitAssign(DecafParser.AssignContext ctx){
		TerminalNode op;
		if((ctx.EQ() == null) && (ctx.PLEQ() == null)){
			op = ctx.MIEQ();
		}else if((ctx.PLEQ() == null) && (ctx.MIEQ() == null)){
			op = ctx.EQ();
		}else{
			op = ctx.PLEQ();
		}
		return null;
	}


	/*-------------------------*/

	//statement: (location assign_op expr SEMICOLON) 																	# locationSon
	//| (method_call SEMICOLON) 																						# methodCall
	//| (IF PARENTESIS expr PARENTESIS2 block (ELSE (block))*)														# if
	//| (FOR PARENTESIS* ID EQ expr COMA expr PARENTESIS2* block)  													# for
	//| (WHILE PARENTESIS expr PARENTESIS block) 																		# while 
	//| (RETURN expr SEMICOLON) 																						# return
	//| (BREAK SEMICOLON)																								# break
	//| (CONTINUE SEMICOLON)

	@Override
	public Node visitLocationSon(DecafParser.LocationSonContext ctx){
		Node loc = visit(ctx.location());
		String asop = ctx.assign_op().getText();
		Node expr = visit(ctx.expr());
		return new Statement(loc, asop, expr);
	}

	@Override
	public Node visitMethodCall(DecafParser.MethodCallContext ctx){
		//DecafParser.MethodCallContext met = ctx.method_call();
		Node met = visit(ctx.method_call());

		return new Statement("method_call" , met);
	}

	/*@Override
	public Node visitIf(DecafParser.IfContext ctx){
		TerminalNode iff = ctx.IF();
		Node exp = visit(ctx.expr());
		Node block = visit(ctx.block());

		List<TerminalNode> els = ctx.ELSE();
		List<DecafParser.BlockContext> bloc = ctx.block();

		//if((els.size() == 1) && (bloc.size() == 1)){
		//	return new Statement()
		//}
	}


	/*-------------------------*/

	@Override
	public Node visitBlock1(DecafParser.Block1Context ctx){
		List<DecafParser.StatementContext> sta = null;
		List<DecafParser.Field_declContext> fiel = null;

		System.out.println("no funciona");

		if((fiel.size() == 0) && (sta.size() == 0)){
			return null;
		}else if((fiel.size() > 0) && (sta.size() == 0)){
			fiel = ctx.field_decl();
			for (int i = 0; i < fiel.size(); i ++) {
				visitFieldDec1(fiel.get(i));

				//Decamdk.FieldDec1Context
				//Decafkhg.Feild_declContext
			}


		}else if((fiel.size() == 0) && (sta.size() > 0)){
			sta = ctx.statement();
			for (int i = 0; i < fiel.size(); i ++) {
				visitFieldDec1(sta.get(i));
			}

		}else if((fiel.size() > 0) && (sta.size() > 0)){
			fiel = ctx.field_decl();
			sta = ctx.statement();
		}
		return null;
	}

	/*-------------------------*/
}
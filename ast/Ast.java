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
		} else if(ctx.BOOLEANS() != null){
			lit = ctx.BOOLEANS();
			return new Literal("booleans ", lit.getText());
		}else{
			return new Literal("int", literal);
		}
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
		

		//DecafParser.BlockContext blockit = ctx.block();
		//System.out.println(blockit);
		Node blockit = visitBlock1((DecafParser.Block1Context)ctx.block());
		
		if((blockit == null) && conIDs){

			System.out.println("blockit null");
			return new MethodDec(type.getText(), id.getText(), t, n);
		}else if((blockit == null) && (conIDs = false)){

			System.out.println("sin ids");
			return new MethodDec(type.getText(), id.getText());
		}else{
			//System.out.println("con los dos ");

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

		Node loc = visitLocationParent((DecafParser.LocationParentContext)ctx.location());

		String asop = ctx.assign_op().getText();

		Node expr = visit(ctx.expr());

		return new Statement(loc, asop, expr);
	}

	@Override
	public Node visitMethodCall(DecafParser.MethodCallContext ctx){
		System.out.println("method_call");
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
		List<DecafParser.StatementContext> sta = ctx.statement();
		List<DecafParser.Field_declContext> fiel = ctx.field_decl();

		//System.out.println("si entra a Block1");

		if((fiel.size() == 0) && (sta.size() == 0)){
			System.out.println("aqui entra");
			//return null;
		}else if((fiel.size() > 0) && (sta.size() == 0)){
			System.out.println("entra a fiel");
			


		}else if((fiel.size() == 0) && (sta.size() > 0)){
			DecafParser.StatementContext aux;
			//done statement: (location assign_op expr SEMICOLON) 																	# locationSon
			//done | (method_call SEMICOLON) 																						# methodCall
			//| (IF PARENTESIS expr PARENTESIS2 block (ELSE (block))*)															# if
			//| (FOR PARENTESIS* ID EQ expr COMA expr PARENTESIS2* block)  														# for
			//| (WHILE PARENTESIS expr PARENTESIS block) 																		# while 
			//| (RETURN expr SEMICOLON) 																						# return
			//| (BREAK SEMICOLON)																								# break
			//| (CONTINUE SEMICOLON)																							# continue
			

			for (int i = 0; i < sta.size(); i++) {
				aux = sta.get(i);
				if(aux instanceof DecafParser.LocationSonContext){
					return visitLocationSon((DecafParser.LocationSonContext)aux);

				}else if(aux instanceof DecafParser.MethodCallContext){
					if(aux instanceof DecafParser.MethodC1Context){
						return visitMethodC1((DecafParser.MethodC1Context)aux);
					}else if(aux instanceof DecafParser.MethodC2Context){
						return visitMethodC2((DecafParser.MethodC2Context)aux);
					}
				}
			}

		}else if((fiel.size() > 0) && (sta.size() > 0)){
			System.out.println("both");
		}else{
			return null;
		}
		return null;
	}

	/*-------------------------*/
		//EXPRESIONES

//expr: ((SUB | NO) expr)   																						# negativeExp1
//	| (PARENTESIS expr PARENTESIS)																					# exp1															
//	| (expleft bin_op expr)  																						# recursiveExp																						
//	| literal  																										# literalExp1
//	| location  																								    # locationExp1
//	| method_call /*) {list.add("expr");}*/																			# methodCallExp1;																		

	public Node MyExp(DecafParser.ExprContext aux){
		Node x;

		if(aux instanceof DecafParser.NegativeExp1Context){
			x = visitNegativeExp1((DecafParser.NegativeExp1Context)aux);

		}else if(aux instanceof DecafParser.Exp1Context){
			x = visitExp1((DecafParser.Exp1Context)aux);

		}else if(aux instanceof DecafParser.RecursiveExpContext){
			x = visitRecursiveExp((DecafParser.RecursiveExpContext)aux);
				
		}else if(aux instanceof DecafParser.LiteralExp1Context){
			x = visitLiteralExp1((DecafParser.LiteralExp1Context));
				
		}else if(aux instanceof DecafParser.LocationExp1Context){
			x = visitLocationExp1((DecafParser.LocationExp1Context)aux);
				
		}else if(aux instanceof DecafParser.MethodCallExp1Context){
			x = visitMethodCallExp1((DecafParser.MethodCallExp1Context)aux);
		}

		return x;
	}

	@Override
	public Node visitNegativeExp1(DecafParser.NegativeExp1Context ctx){
		TerminalNode op = ctx.SUB() == null ? ctx.NO() : ctx.SUB();
		Node ep = MyExp(ctx.expr());
		return new EXP(op, ep);
	}

	@Override
	public Node visitExp1(DecafParser.Exp1Context ctx){
		Node ep = MyExp(ctx.expr());
		return new EXP(ep);
	}

	@Override
	public Node visitRecursiveExp(DecafParser.RecursiveExpContext ctx){
		Node ep = visitEx(ctx.expr());
		//toca ExpLeft
		return new EXP(ep);
	}

	@Override
	public Node visitLiteralExp1(DecafParser.LiteralExp1Context ctx){
		return visitLit((DecafParser.LitContext) ctx.literal());
	}

	/*-------------------------*/
	
	@Override
	public Node visitMethodC1(DecafParser.MethodC1Context ctx){
		TerminalNode id = ctx.ID();
		List<DecafParser.ExprContext> expresiones = ctx.expr();
		List<DecafParser.Callout_argContext> callouts = ctx.callout_arg();
		DecafParser.ExprContext aux;

		if(expresiones.size() > 0){
			//verifica el parent de cada elemento para visitar nodos ya creados 
			for (int i = 0; i<expresiones.size; i++) {
				aux = expresiones.get(i);
				if(aux instanceof DecafParser.NegativeExp1Context){
					visitNegativeExp1((DecafParser.NegativeExp1Context)aux);

				}else if(aux instanceof DecafParser.Exp1Context){
					visitExp1((DecafParser.Exp1Context)aux);

				}else if(aux instanceof DecafParser.RecursiveExpContext){
					visitRecursiveExp((DecafParser.RecursiveExpContext)aux);
				
				}else if(aux instanceof DecafParser.LiteralExp1Context){
					visitLiteralExp1((DecafParser.LiteralExp1Context));
				
				}else if(aux instanceof DecafParser.LocationExp1Context){
					visitLocationExp1((DecafParser.LocationExp1Context)aux);
				
				}else if(aux instanceof DecafParser.MethodCallExp1Context){
					visitMethodCallExp1((DecafParser.MethodCallExp1Context)aux);
				}
			}
		}
	}

	@Override
	public Node visitMethodC2(DecafParser.MethodC2Context ctx){
		//verifica el parent de cada elemento para visitar nodos ya creados 
		TerminalNode id = ctx.ID();
		List<DecafParser.Callout_argContext> callouts = ctx.callout_arg();
		DecafParser.ExprContext aux;
		if(callouts.size() > 0){
			for (int i = 0; i<callouts.size(); i++) {
				aux = callouts.get(i);
				if(aux instanceof DecafParser.CalloutArgContext){
					visitCalloutArg((DecafParser.CalloutArgContext)aux)
				}
			}
		}
	}

	/*-------------------------*/
}
/*Semantic.java*/
package compiler.semantic;
import java.io.*;
import compiler.lib.Printer;
import compiler.ast.*;

import org.antlr.runtime.tree.*;
import java.util.*;


public class Semantic{

	Hashtable<String,String> tabla;
	LinkedList<String> errors;


	Ast a;
	public Semantic(Printer out,String filename)throws Exception{
		this.a = new Ast(out,filename);
		out.print("stage: Ast \n");
		tabla = new Hashtable<String, String>();
		errors = new LinkedList<String>();
	}

	public Semantic(){
		tabla = new Hashtable<String, String>();
		errors = new LinkedList<String>();
	}

    public boolean check(Root t) {
			buildTable(t);
			checkTypes(t);
			return errors.isEmpty();
	}

		public void buildTable(Root root) {
			LinkedList<Node> listNode = root.getChildren();
			for (Node n : listNode ) {
				if(n instanceof FieldDec) {
					FieldDec d = (FieldDec)n;

					String type = d.getType();
					LinkedList<String> listIds = d.getIds();

					System.out.println("Lista: " + listIds.toString());
					System.out.println(listIds.size());
					int x = 1;

				//while(x<3){
				//	System.out.println("here");
					for (String id : listIds ) {
						if(id != null) {


							//System.out.println("enters");
							if(tabla.get(id) == null) {
								tabla.put(id, type);
							} else {
								System.out.println("The variable '%s' is already defined");
								String msg = "The variable '%s' is already defined";
								errors.add( String.format(msg, id));
							}
						}
					}
				//	x++;
				//}

				} else if ( n instanceof Location) {
					Location v = (Location)n;
					String name = v.getId();
					if ( tabla.get(name) == null ) {
						System.out.println("The variable '%s' is not defined");
						String msg = "The variable '%s' is not defined";
						errors.add( String.format(msg, name));
					}

				} else if( n instanceof Statement) {
					Statement asign = (Statement)n;
					String varName = asign.getName();
					if ( tabla.get(varName) == null ) {
						String msg = "The variable '%s' is not defined";
						errors.add( String.format(msg, varName));
					}else{
						tabla.put(varName, asign.getVal().toString());
						tabla.toString();
					}
				}
				
			}
		}



		public void checkTypes(Root t){
			LinkedList<Node> listNode = t.getChildren();
			for (Node n : listNode ) {
				checkType(n);
			}

		}

		public String checkType(Node n){
			if(n instanceof Location){
				Location v = (Location)n;
				return tabla.get(v.getId());

				//tipe de literal
			} else if ( n instanceof Literal) {
				Literal l = (Literal)n;
				return l.getType();

				//tipo de expresion
			} else if ( n instanceof EXP ) {
				EXP b = (EXP)n;
				String left = checkType(b.left);
				String right = checkType(b.right);
				if( b.signo.equals("&") || b.signo.equals("|")){
					if (left.equals("error") ||  right.equals("error")) {
						return "error";
					} else if( left.equals("boolean") && right.equals("boolean") ){
						return "boolean";
					} else {
						errors.add("Error en operacion");
						return "error";
					}
				} else {
					if (left.equals("error") ||  right.equals("error")) {
						return "error";
					} else if( (left.equals("int") || left.equals("float")) && (right.equals("int") || right.equals("float")) ){
						return "int";

					} else {
						errors.add("Error en operacion");
						return "error";
					}
				}

			} else if ( n instanceof Statement ) {
				Statement a = (Statement)n;
				String var = tabla.get(a.getName());
				String node = checkType(a.getVal());
				if (var.equals("error") || node.equals("error")) {
					return "error";
				}else if(var.equals(node)) {
					return var;
				} else {
					errors.add("Error en Asignacion");
					return "error";
				}

			}
			return "error";
		}



		public LinkedList<String> geterrors() {
			return errors;
		}


		public String getErrorAsString(String padding){
			String errorsStr = "";
			for ( String e : errors  ) {
				errorsStr += padding +  e + "\n";
			}
			return errorsStr;
		}

	public String getTable() {
		String tablaStr = "";
		Object[] vars = tabla.keySet().toArray();
		for (Object var : vars ) {
			tablaStr += tabla.get(var) + "\t\t" + var + "\n";
		}
		return tablaStr;
	}
}
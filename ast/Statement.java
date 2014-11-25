package compiler.ast;
import java.util.*;

public class Statement extends Node{
	Node location, exp, call, block1, block2;
	String op, id;
	List<Node> listaN;
	boolean loc1 = false, metCall = false, iff = false, ifff = false, forr = false; 

	public Statement(Node loc, String op, Node exp){
		this.location = loc;
		this.op = op;
		this.exp = exp;
		loc1 = true;
	}

	public Statement(String m, Node call){
		this.op = m;
		this.call = call;
		metCall = true;
	}

	public Statement(Node expr, Node block1){
		this.exp = expr;
		this.block1 = block1;
		iff = true;
	}

	public Statement(Node expr, Node block1, Node block2){
		this.exp = expr;
		this.block1 = block1;
		this.block2 = block2;
		ifff = true;
	}

	public Statement(String id, LinkedList<Node> exprs, Node block1){
		this.id = id;
		this.block1 = block1;
		this.listaN = exprs;
		forr = true;
	}



	public void print(String padding){
		

		if(loc1){
			//System.out.println("{ ");
			location.print(" ");
			System.out.print(op + " ");
			exp.print(padding + "\t");
			//System.out.println(" }");

		}else if(metCall){
			System.out.print(padding + op);
			call.print(padding + "\t");

		}else if(iff){
			//System.out.println("Statement: ");

			System.out.print(padding + "if\t");
			exp.print(" ");
			System.out.print("\t\t");
			block1.print(" ");
			System.out.println("");

		}else if(ifff){
			System.out.print(padding + "if ");
			exp.print("\t");
			//System.out.print("{ ");
			block1.print("\t ");
			System.out.print("\telse ");
			block2.print("\t");

		}else if(forr){
			System.out.println(padding + "for ");
			System.out.println(padding + id);
			for (int i = 0; i<listaN.size(); i++) {
				listaN.get(i).print("\t ");
			}
			block1.print("\t ");
		}
	}

	public String getName(){
		if(loc1 && (op == "=")) return location.toString();
		else return null;
	}

	public Node getVal(){
		if(loc1 && (op == "=")) return exp;
		else return null;
	}	
}
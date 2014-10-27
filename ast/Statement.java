package compiler.ast;

public class Statement extends Node{
	Node location, exp, call;
	String op;
	boolean loc1 = false, metCall = false;

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

	public void print(String padding){
		if(loc1){
			System.out.print(padding + "{ ");
			location.print(" ");
			System.out.print(op + " ");
			exp.print(" ");
			System.out.println(" }");
		}else if(metCall){
			System.out.print(padding + op);
			call.print(padding + "\t");
		}
	}
}
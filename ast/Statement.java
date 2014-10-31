package compiler.ast;

public class Statement extends Node{
	Node location, exp, call, block1, block2;
	String op;
	boolean loc1 = false, metCall = false, iff = false, ifff = false; 

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
		}else if(iff){
			System.out.print(padding + "if ");
			exp.print("\t");
			System.out.print("{ ");
			block1.print("\t}");
		}else if(ifff){
			System.out.print(padding + "if ");
			exp.print("\t");
			System.out.print("{ ");
			block1.print("\t} ");
			System.out.print("\telse {");
			block2.print("\t");
		}
	}
}
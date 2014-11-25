package compiler.ast;

public class Block extends Node{
	String location;
	String op;
	String exp;
	boolean b1 = false;

	public Block(String loc, String op, String exp){
		this.location = loc;
		this.op = op;
		this.exp = exp;
		b1 = true;
	}

	public void print(String padding){
		if(b1) {
			//System.out.println("printing this");

			System.out.println(padding + "{" + location + " " + op + " " + exp + "}");
		}
	}
}
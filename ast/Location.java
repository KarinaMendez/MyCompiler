package compiler.ast;

public class Location extends Node{
	public Node exp;
	public String s;
	public boolean nod = false;
	public boolean ss = false;

	public Location(String id, Node ex){
		this.s = id;
		this.exp = ex;
	}

	public Location(String id){
		this.s = id;
	}

	public void print(String padding){
		if(nod){
			System.out.print(padding + s + " ");
			exp.print(padding + "\t");
		}else if(ss){
			System.out.println(padding + s);
		}
	}
}
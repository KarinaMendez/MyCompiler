package compiler.ast;

public class Location extends Node{
	public Node exp;
	public String s;
	public boolean nod = false;
	public boolean ss = false;

	public Location(String id, Node ex){
		this.s = id;
		this.exp = ex;
		nod = true;
	}

	public Location(String id){
		this.s = id;
		ss = true;
	}

	public void print(String padding){
		if(nod){
			System.out.print(s + " ");
			exp.print("\t");
		}else if(ss){
			System.out.print(s + " ");
		}
	}

	public String getId(){
		return s;
	}
}
package compiler.ast;


import java.util.*;

public class FieldDec extends Node{
	String type;
	String id;
	String literal;
	LinkedList<String> ids;
	LinkedList<String> lits;
	public boolean b = false;
	public boolean s = false;
	public boolean a = false;
	public boolean n = false;

	public FieldDec(String t, String i){
		this.type = t;
		this.id = i; 
		this.s = true;
	}

	public FieldDec(String t, String i, String n){
		this.type = t;
		this.id = i; 
		this.literal = n;
		this.n = true;
	}

	public FieldDec(String type, LinkedList<String> ids){
		this.type = type;
		this.ids = ids;
		this.b = true;
	}

	public FieldDec(String type, LinkedList<String> ids, LinkedList<String> lit){
		this.type = type;
		this.ids = ids;
		this.lits = lit;
		this.a = true;
	}


	public void print(String padding){
		System.out.println(padding + "field_Dec " + "\t");
		if(b){
			System.out.println(padding + type + " ");
			for (int i = 0; i < ids.size(); i++) {
				System.out.print(padding + " " + ids.get(i));
			}
			System.out.println(" ");
		}else if(s){
			System.out.println(padding + type + " " + id);
		}else if(a){
			System.out.print(padding + type + " ");
			for (int i = 0; i < lits.size(); i++) {
				System.out.print(padding + " " + ids.get(i) + "[" + lits.get(i) + "]");
			}
			System.out.println(" ");
		}else if(n){
			System.out.println(padding + type + " " + id + " " + "[" + literal + "]");
		}
	}
}
package compiler.ast;

import java.util.*;

public class MethodDec extends Node{
	Node block;
	String type, id;
	public boolean no = false, yes = false , both = false, noNode = false;
	Node blocki;
	LinkedList<String> types, ids; 

	public MethodDec(String t, String i, Node b){
		this.type = t;
		this.id = i;
		this.block = b;
		yes = true;
	}

	public MethodDec(String t, String i, LinkedList<String> types, LinkedList<String> ids, Node b){
		this.type = t;
		this.id = i;
		this.types = types;
		this.ids = ids;
		this.block = b;
		both = true;
	}

	public MethodDec(String t, String i, LinkedList<String> types, LinkedList<String> ids){
		this.type = t;
		this.id = i;
		this.types = types;
		this.ids = ids;
		noNode = true;
	}

	public MethodDec(String t, String i){
		this.type = t;
		this.id = i;
		no = true;
	}

	public void print(String padding){
		System.out.print(padding + "Method_Dec " + "\t");
		if(no){

			System.out.println(padding + type + " " + id + " ()");
		}else if(yes){

			System.out.print(padding + type + " " + id + " ()" );
			block.print(padding + "\t");
		}else if(both){

			System.out.print(padding + type + " " + id + "( ");
			for (int i = 0; i < types.size(); i++) {

				System.out.print(types.get(i) + " " + ids.get(i) + " ");
			}

			System.out.println(" )");
			
			block.print(padding + "\t");

		}else if(noNode){
			System.out.print(padding + type + " " + id + "( ");
			for (int i = 0; i < types.size(); i++) {
				System.out.print(types.get(i) + " " + ids.get(i) + " ");
			}
			System.out.println(" )");
		}
	}
}
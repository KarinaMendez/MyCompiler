package compiler.ast;

import java.util.*;

public class Literal extends Node{

	public LinkedList<String> deci;

	public String type;
	public String num;

	public Literal(String t, LinkedList<String> dec){
		this.type = t;
		this.deci = dec;
	}

	public Literal(String t, String d){
		this.type = t;
		this.num = d;
	}

	public void print(String padding){
		/*
			imprimir el contenido de cada uno de los nodos 
		*/
		switch(type){
			case "decimal":
				System.out.print(padding + "decimal_literal ");

				for (int i = 0; i< deci.size() ; i++ ) {
					System.out.print(deci.get(i));
				}
				
				break;
			default:
				System.out.println(padding + num);
				break;
		}
		// System.out.println(padding + left.print("") + " " + op + " " + right.print("") );
	}

	public String getType(){
		return type;
	}
}
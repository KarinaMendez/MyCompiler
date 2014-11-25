package compiler.ast;

import java.util.List;
import java.util.LinkedList;

public class Root extends Node{
	/*
		estructura de datos que contenga objetos node
		segun la gramatica puede haber cualquier cantidad de hijos
	*/
	private LinkedList<Node> list;

	public Root(){
		list = new LinkedList<Node>();
		/*
			instanciar estructura
		*/
	}
	
	public void add(Node node){
		list.add(node);
		/*
			agregar objeto a estructura
		*/
	}
	
	public void print(String padding){
		System.out.println("Root");
		//if(n != null){
			for(Node n : list){
				if(n != null){
					n.print("\t");
				}
			}
		//}
		/*
			imprimir nodo y todos sus hijos
			darle formato, usar padding para pasar la alineacion
			
			root
				hijo1
					nieto1-1
				hijo2
					nieto2-1
					nieto2-2
		*/
	}
	
	public Node getChild(int i){
		return list.get(i);
	}

	public LinkedList<Node> getChildren() {
		return list;
	}

	public int getChildCount() {
		return list.size();
	}

	public LinkedList<Node> getList(){
		return this.list;
	}
	
	public void print(){
		print(" ");
	}
} 
 
 

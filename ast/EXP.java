package compiler.ast;

import java.util.*;
import org.antlr.v4.runtime.tree.TerminalNode;

public class EXP extends Node{
	/*
		BinOp tiene una cantidad definida de nodos hijos
		BinOp puede tener distintos signos
	*/
	public LinkedList<Node> nodes;
	public String signo; 
	public Node left;
	public Node op;
	public TerminalNode operation;
	public Node right;
	public boolean e1 = false, e2 = false, e3 = false, e4 = false, e5 = false;


	
	public EXP(Node left, String ope, Node right){
		
		/*
			incluir argumentos con el signo y los hijos
		*/

		this.left = left;
		this.signo = ope;
		this.right = right;
		e3 = true;
	}

	public EXP(String op, LinkedList<Node> nodes){
		
		/*
			incluir argumentos con el signo y los hijos
		*/
		this.signo = op;
		this.nodes = nodes;
		e1 = true;
	}

	public EXP(Node exp){
		this.left = exp;
		e2 = true;
	}

	public EXP(String op, Node exp){
		this.left = exp;
		e4 = true;
	}

	public EXP(String op){
		System.out.println("entro aqui");
		this.signo = op;
		e5 = true;
	}
	
	public void print(String padding){
		/*
			imprimir tanto el signo como los hijos
		*/
			if(e1){
				System.out.println(padding + op);
				for (int i = 0; i<nodes.size(); i++) {
					nodes.get(i).print(padding + "\t");	
				}

			}else if(e3){

				left.print(padding + "\t");
				System.out.print(padding + signo + "\t");
				right.print(padding + "\t");
				System.out.print("\t");

			}else if(e2){
				left.print(padding + "\t");

			}else if(e4){
				System.out.println(padding + op);
				left.print(padding + "\t");

			}else if(e5){
				System.out.println(padding + signo + " ()");
			}
		// System.out.println(padding + left.print("") + " " + op + " " + right.print("") );
	}
} 

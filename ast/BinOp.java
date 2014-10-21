package compiler.ast;

public class BinOp extends Node{
	/*
		BinOp tiene una cantidad definida de nodos hijos
		BinOp puede tener distintos signos
	*/

	public Node left;
	public String op;
	public Node right;
	
	public BinOp(String op, Node left, Node right){
		
		/*
			incluir argumentos con el signo y los hijos
		*/

		this.left = left;
		this.op = op;
		this.right = right;
	}
	
	public void print(String padding){
		/*
			imprimir tanto el signo como los hijos
		*/
			System.out.println(padding + op);
			left.print(padding + "\t");
			right.print(padding + "\t");
		// System.out.println(padding + left.print("") + " " + op + " " + right.print("") );
	}
} 

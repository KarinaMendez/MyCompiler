package compiler.ast;

public class EXP extends Node{
	/*
		BinOp tiene una cantidad definida de nodos hijos
		BinOp puede tener distintos signos
	*/

	public String signo; 
	public Node left;
	public String op;
	public Node right;
	public boolean e1 = false, e2 = false, e3 = false;


	
	public EXP(String op, Node left, Node right){
		
		/*
			incluir argumentos con el signo y los hijos
		*/

		this.left = left;
		this.op = op;
		this.right = right;
	}

	public EXP(String op, Node right){
		
		/*
			incluir argumentos con el signo y los hijos
		*/

		this.op = op;
		this.right = right;
	}
	
	public void print(String padding){
		/*
			imprimir tanto el signo como los hijos
		*/
			if(e1){
				System.out.println(padding + op);
				right.print(padding + "\t");
			}else if(e2){
				System.out.println(padding + op);
				left.print(padding + "\t");
				right.print(padding + "\t");
			}
		// System.out.println(padding + left.print("") + " " + op + " " + right.print("") );
	}
} 

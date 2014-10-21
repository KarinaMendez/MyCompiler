package compiler.ast;

public class CalloutDec extends Node{
	public String callout;
	public String id;

	public CalloutDec(String call, String id){
		this.callout = call;
		this.id = id;
	}

	public void print(String padding){
		/*
			imprimir el contenido de los nodos terminales 
		*/
			System.out.println(padding + callout);
			System.out.println(padding + id);
			//left.print(padding + "\t");
			//right.print(padding + "\t");
		// System.out.println(padding + left.print("") + " " + op + " " + right.print("") );
	}
}
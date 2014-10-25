package compiler.ast;

public class CalloutDec extends Node{
	public String callout;
	public String id;
	public Node exp;
	public boolean dec = false;
	public boolean arg = false;
	public boolean nod = false;

	public CalloutDec(String call, String id){
		this.callout = call;
		this.id = id;
		dec = true;
	}

	public CalloutDec(Node n){
		this.exp = n;
		nod = true;
	}

	public CalloutDec(String s){
		this.id = s;
		arg = true;
	}

	public void print(String padding){
		/*
			imprimir el contenido de los nodos terminales 
		*/
			if(dec){
				System.out.println(padding + callout + " " + id);
			}else if(arg){
				exp.print(padding + "\t");
			}else if(arg){
				System.out.println(padding + callout);
			}
			
			//left.print(padding + "\t");
			//right.print(padding + "\t");
		// System.out.println(padding + left.print("") + " " + op + " " + right.print("") );
	}
}
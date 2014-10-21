/*Scanner.java*/

package compiler.scanner;
import org.antlr.v4.runtime.*;
import java.io.*;
import compiler.lib.Printer;

import compiler.scanner.DecafScanner;


public class Scanner{
	private DecafScanner scann;
	public Scanner(Printer out,String filename)throws Exception{
		out.print("\nstage: Scanning \n");
		try{
		    this.scann = new DecafScanner(new ANTLRFileStream(filename));
		    Token t;
		    while ((t = scann.nextToken()).getType() != Token.EOF) out.print(DecafScanner.ruleNames[t.getType()-1]+"\n");
		    System.out.print("\n");
		}catch(ArrayIndexOutOfBoundsException aiobe){
		    System.err.println("Must provide a valid path to the filename with the tokens");
		    System.exit(1);
		}catch(Exception e){
		    System.err.println("Must provide a valid path to the filename with the tokens");
		    System.exit(1);
		}
		//out.close();
	}
	public DecafScanner getScanner(){
		return this.scann;
	}
}
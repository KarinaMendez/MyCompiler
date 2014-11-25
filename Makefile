make: scanner/DecafScanner.java  scanner/Scanner.class parser/CC4Parser.java \
	parser/CC4Parser.class Compiler.class ast/Ast.class ast/Node.class ast/Root.java \
	ast/CalloutDec.java ast/Literal.java ast/Location.java ast/MethodDec.java \
	ast/Statement.java ast/Block.java codegen/Codegen.class ast/EXP.java \
	irt/Irt.class lib/ErrorHandler.class lib/Printer.class semantic/Semantic.java



Compiler.class: Compiler.java
	javac Compiler.java

lib/ErrorHandler.class: lib/ErrorHandler.java
	javac lib/ErrorHandler.java

lib/Printer.class: lib/Printer.java
	javac lib/Printer.java

parser/CC4Parser.class: parser/CC4Parser.java
	javac parser/CC4Parser.java

parser/CC4Parser.java: parser/DecafParser.g
	java org.antlr.v4.Tool -lib scanner -visitor parser/DecafParser.g

scanner/Scanner.class: scanner/Scanner.java
	javac scanner/Scanner.java

scanner/DecafScanner.java: scanner/DecafScanner.g
	java org.antlr.v4.Tool scanner/DecafScanner.g
	javac scanner/DecafScanner.java

ast/Ast.class: ast/Ast.java
	javac ast/Ast.java

ast/Node.class: ast/Node.java
	javac ast/Node.java

ast/Root.class: ast/Root.java
	javac ast/Root.java

ast/CalloutDec.class: ast/CalloutDec.java
	javac ast/CalloutDec.java

ast/Literal.class: ast/Literal.java
	javac ast/Literal.java

ast/Location.class: ast/Location.java
	javac ast/Location.java

ast/MethodDec.class: ast/MethodDec.java
	javac ast/MethodDec.java

ast/Statement.class: ast/Statement.java
	javac ast/Statement.java

ast/Block.class: ast/Block.java
	javac ast/Block.java

ast/EXP.class: ast/EXP.java
	javac ast/EXP.java

semantic/Semantic.class: semantic/Semantic.java
	javac semantic/Semantic.java

codegen/Codegen.class: codegen/Codegen.java
	javac codegen/Codegen.java

irt/Irt.class: irt/Irt.java
	javac irt/Irt.java

clean:
	rm Copy*
	rm *.class 
	rm scanner/*.class
	rm scanner/*.tokens
	rm scanner/DecafScanner.java
	rm parser/*.class
	rm parser/*.tokens
	rm ast/*.class
	rm semantic/*.class
	rm codegen/*.class
	rm irt/*.class
	rm lib/*.class
	


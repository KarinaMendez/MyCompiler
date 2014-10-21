parser grammar DecafParser;

options {
    tokenVocab=DecafScanner;
}

@parser::header{
  package compiler.parser;
  import java.util.*;
}

@parser::members{
	public LinkedList<String> list = new LinkedList<String>();

  	public LinkedList<String> getlist(){
  		return list;
  	}  	 

}





/*-----------------------------------------------------------------
 * PARSER RULES
 *------------------------------------------------------------------*/


start: program {list.add("start");};

program: (callout_decl* field_decl* method_decl*){list.add("program");};											 

//ready
callout_decl: (CALLOUT (ID) SEMICOLON){list.add("callout_decl");}													 # calloutDec; 
  
field_decl: ((INT | BOO | VOID) (((ID) 
				   | ((ID) (BRAKET (int_literal) BRAKET2)) COMA*)+ 
				   | ((ID) (BRAKET (int_literal) BRAKET2))) SEMICOLON){list.add("field_decl");} 					 #fieldDec1;


method_decl: ((INT | BOO | VOID) ID PARENTESIS (INT | BOO ID  (COMA INT | BOO ID)*)? PARENTESIS2 block){list.add("method_decl");} 	 # methodDec;

block: BRACE (field_decl)* (statement)* BRACE2{list.add("block");}													# block1; 

statement: (location assign_op expr SEMICOLON) 																	    # locationSon
	| (method_call SEMICOLON) 																						# methodCall
	| (IF PARENTESIS expr PARENTESIS2 block (ELSE (block))*)														# if
	| (FOR PARENTESIS* ID EQ expr COMA expr PARENTESIS2* block)  													# for
	| (WHILE PARENTESIS expr PARENTESIS block) 																		# while 
	| (RETURN expr SEMICOLON) 																						# return
	| (BREAK SEMICOLON)																								# break
	| (CONTINUE SEMICOLON)/*){list.add("statement");}*/ 					    									# continue;

assign_op: (EQ | PLEQ | MIEQ){list.add("assign_op");}																# assign;

method_call: (ID PARENTESIS expr* (COMA expr)* PARENTESIS2) 														# methodC1
	| (ID PARENTESIS ((callout_arg)* COMA) PARENTESIS2)/*){list.add("method_call");}*/								# methodC2;

location: (ID | (ID PARENTESIS expr PARENTESIS2) | (ID BRAKET expr BRAKET2)){list.add("location");}					# locationParent;

expr: ((SUB | NO) expr)   																							# negativeExp1
	| (PARENTESIS expr PARENTESIS)																					# exp1															
	| (expleft bin_op expr)  																						# recursiveExp																						
	| literal  																										# literalExp1
	| location  																								    # locationExp1
	| method_call /*) {list.add("expr");}*/																			# methodCallExp1;																		

expleft: 
	location 																										# locationExp2
	| method_call 																									# methodCallExp2
	| literal 																										# literalExp2
	| ((SUB | NO) expr)  																							# negativeExp2
	| (PARENTESIS expr PARENTESIS)/*){list.add("expleft");}*/														# exp2;

callout_arg: (expr | STRING){list.add("callout_arg");}																# calloutArg;

bin_op: (arith_op | rel_op | eq_op | cond_op){list.add("bin_op");}  												# binOp;

add_sub: (PLUS | SUB);

mult_div: (MULT | DIV);

//ready
arith_op: (mult_div | add_sub){list.add("arith_op");} 																# arithOp;

//ready
rel_op: (MEN | MAY | MEEQ | MAEQ){list.add("rel_op");}	 															# relOp;

//ready
eq_op: (EQQ | NOEQ){list.add("eq_op");} 																			# eqOp;

//ready
cond_op: (ANDD | ORR){list.add("cond_op");} 																		# condOp;

//ready
literal: (int_literal | CHAR | BOOLEANS){list.add("literal");}	 													# lit;

//ready
int_literal: (decimal_literal | HEX){list.add("int_literal");}	 													# intLit;

//ready
decimal_literal: (ENTEROS (ENTEROS)*){list.add("decimal_literal");} 												# decimalLit;







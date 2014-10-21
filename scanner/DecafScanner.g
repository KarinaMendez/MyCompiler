lexer grammar DecafScanner;

@lexer::header{
	package compiler.scanner;
}

PERIOD: ('.');
FF: ('');
QUEST: ('?');
WSS : 	('\' \'');
NLS : ('\'\\n\'');
TABS : ('\'\\t\'');
RETS : ('\'\\r\'');
DIAGS: ('\\');
COSIMPLE: ('\'');
CODOBLE : ('\'\\\"\'');

WS 	: 	(' ') -> skip;
NL : ('\n') -> skip;
TAB : ('\t') -> skip;
RET : ('\r') -> skip;

STRING: '"'~('"')*'"';

//OPERATIONS 
PLUS : '+';
MULT : '*';
DIV:   '/';
SUB:   '-';
AND:   '&';
OR:	   '|';
EQ:    '=';
PER:   '%';
MAY:   '>';
MEN:   '<';
MAEQ:  '>=';
MEEQ:  '<=';
EQQ:   '==';
NOEQ:  '!=';
ANDD:  '&&';
ORR:   '||';
EXP:   '^';
PLEQ:   '+=';
MIEQ: 	'-=';
NO: 	'!';

//PALABRAS RESERVADAS
INT: 'int';
BOO: 'boolean';
FLOAT: 'float';
IF: 'if';
FOR: 'for';
WHILE: 'while';
RETURN: 'return';
BREAK: 'break';
VOID: 'void';
CALLOUT: 'callout';
CONTINUE: 'continue';
ELSE: 'else';

//COMENTARIOS
COMMENT: (('//'~('\n')*'\n') | (('/*') ~('\n')* ('*/'))) ->skip;

//AF: [a-fA-F];
COMA: ',';
COLON: ':';
SEMICOLON: ';';
BRACE: '{';
BRACE2: '}';
BRAKET: '[';
BRAKET2: ']';
PARENTESIS: '(';
PARENTESIS2: ')';
ENTEROS: ('0'..'9')+;
FLOTANTES: ('0'..'9')+'.'('0'..'9')+;
HEX: '0x'([0-9a-fA-F]+);
HEXDIGIT: ('0'..'9')[a-zA-Z];
CHAR:  '\''.'\'';
BOOLEANS: ('true'|'false');
ID: ([a-zA-Z]|('_')*) ([a-zA-Z] | [0-9] | '_')*;

ErrorCharacter : . ;


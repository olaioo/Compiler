grammar Grammar;

source
	: ('int'|'void') 'main' '(' ')' '{' statement '}'
	; 

statement
	: declaration
	| attribution
    | print
	| conditional
	| loopFor
	| loopWhile
	;

declaration
    : type declarationPart ';'
    ;

declarationPart
    : variable (','+declarationPart)?
    | variable '=' number (','+declarationPart)?
    ; 

attribution
    : variable '=' attributionPart ';'
    ; 

attributionPart
    : number (op+(variable | number))*? (','+attributionPart)?
    | variable (op+(variable | number))*? (','+attributionPart)?
    ;

print
	: 'printf' '(' '"' printPart '"' (',' variable)* ')' ';'
	;

printPart
	: PrintText
	;

loopFor
	: 'for' '(' loopForPart loopForPart2 ';' loopForPart3 ')' '{' statement '}'
	;

loopForPart
	: declaration
	| attribution
	;

loopForPart2
	: lexpression
	;

loopForPart3
	: variable ('++'|'--')
	| variable ('+='|'*='|'/=') number
	| variable '=' variable op number
	;

loopWhile
    : 'while' '(' lexpression ')' '{' statement '}'
    ;

conditional
	: 'if' '(' lexpression ')' '{' statement '}' conditionalElse?
	;

conditionalElse
	: 'else' '{' statement '}'
	;

lexpression
	: lexpressionPart
	| lexpression lop lexpression
	| '(' lexpression lop lexpression ')'
	| lexpression lop2 lexpression
	| '(' lexpression lop2 lexpression ')'
	;

lexpressionPart
	: variable
	| number
	;

type
    : 'int'
    | 'float'
    | 'double'
    | 'char'
    | 'bool'
    ;

op
    : '+'
    | '-'
    | '*'
    | '/'
    | '%'
    ;

lop
    : '<'
    | '>'
	| '>='
	| '<='
	| '=='
	| '!='
	;

lop2
	: '&&'
	| '||'
	;

variable
    : Identifier
    ;

Identifier
    : Nondigit (Nondigit | Digit)*
    ;

number
    : Numid
    ;

Numid
    : Digit (Digit)*
    | Digit+'.'+Digit (Digit)*
    ;

PrintText
    : Strliteral (Strliteral)*
    ;

fragment
Nondigit
    : [a-zA-Z_]
    ;

fragment
Digit
    : [0-9]
    ;

fragment
Strliteral
	: [a-zA-Z0-9_%\\]
	;

WS
    : [ \t\r\n]+ -> skip ; // skip spaces, tabs, newlines

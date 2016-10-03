grammar Grammar;

source
	: (INT | VOID) MAIN '(' ')' '{' statement '}'
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
	: PRINTF '(' '"' printPart '"' (',' variable)* ')' ';'
	;

printPart
	: PrintText
	;

loopFor
	: FOR '(' loopForPart loopForPart2 ';' loopForPart3 ')' '{' statement '}'
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
    : WHILE '(' lexpression ')' '{' statement '}'
    ;

conditional
	: IF '(' lexpression ')' '{' statement '}' conditionalElse?
	;

conditionalElse
	: ELSE '{' statement '}'
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
    : INT
    | FLOAT
    | DOUBLE
    | CHAR
    | BOOL
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

INT : 'int';
VOID : 'void';
MAIN : 'main';
PRINTF : 'printf';
FOR : 'for';
WHILE : 'while';
IF : 'if';
ELSE : 'else';
FLOAT : 'float';
DOUBLE : 'double';
CHAR : 'char';
BOOL : 'bool';

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

grammar Grammar;

source
	: (INT | VOID) MAIN '(' ')' '{' statement? '}'
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
    | variable '=' (number | variable ) (','+declarationPart)?
    ; 

attribution
    : variable '=' attributionPart ';'
    ; 

attributionPart
    : number (op+(variable | number))*? (','+attributionPart)?
    | variable (op+(variable | number))*? (','+attributionPart)?
    ;

print
	: PRINTF '(' StringLiteral (',' variable)* ')' ';'
	;

loopFor
	: FOR '(' loopForPart loopForPart2 ';' loopForPart3 ')' '{' statement? '}'
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
    : WHILE '(' lexpression ')' '{' statement? '}'
    ;

conditional
	: IF '(' lexpression ')' '{' statement? '}' conditionalElse?
	;

conditionalElse
	: ELSE '{' statement? '}'
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
    : (LOWERCASE | UPPERCASE | UNDERLINE) ( LOWERCASE | UPPERCASE | UNDERLINE | DIGIT)*
    ;

number
    : Numberid
    ;

Numberid
    : DIGIT (DIGIT)*
    ;

StringLiteral
    :   '"' SCharSequence? '"'
    ;

fragment
SCharSequence
    :   SChar+
    ;

fragment
SChar
    :   ~["\\\r\n]
    |   '\\\n'   // Added line
    |   '\\\r\n' // Added line
    ;

fragment
LOWERCASE
    : [a-z]+
    ;

fragment
UPPERCASE
    : [A-Z]+
    ;

fragment
DIGIT
    : [0-9]+
    ;

fragment
UNDERLINE
    : [_]+
    ;

fragment
SPECIALCHAR
    : [%\\]+
    ;

WS
    : [ \t\r\n]+ -> skip ; // skip spaces, tabs, newlines

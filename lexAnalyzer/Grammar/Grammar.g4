grammar Grammar;

source:
	: ('int'|'void') 'main' '(' ')' '{' statement '}'
	; 

print
	: 'printf' '(' '"' printPart* '"' (',' variable)* ')' ';'
	;

printPart
	: (PrintText | printPart2)
	;

PrintText
	: [a-Z0-9]
	;

printPart2
	: '%d'
	| '%f'
	| '%c'
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


statement
	: declaration
	| attribution
	| conditional
	| loopFor
	| loopWhile
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

WS
    : [ \t\r\n]+ -> skip ; // skip spaces, tabs, newlines

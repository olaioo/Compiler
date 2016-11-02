header {package decaf;}

options
{
	mangleLiteralPrefix = "TK_";
	language="Java";
}

class DecafParser extends Parser;
options
{
	importVocab=DecafScanner;
	k=3;
	buildAST=true;
}

program
	: TK_main OPEN CLOSE LCURLY (statement)* RCURLY EOF
	; 

statement
	: declaration 
	| attribution
	;

declaration
    : type declarationPart ENDSTAT
    ;

declarationPart
    : ID (COLON declarationPart)?
    | ID ASSIGN expr (COLON declarationPart)?
    ; 

attribution
    : ID ASSIGN expr (COLON Attribution)? ENDSTAT
    ;

expr
    : term (addop expr)?
    ;

term
    : num (mulop term)?
    ;

num
    : (DIGIT | ID)
    | OPEN expr CLOSE
    ;

type
	: TK_int
	| TK_float
	;

addop
    : ADD
    | SUB
    ;

mulop
    : MULT
    | DIV
    ;

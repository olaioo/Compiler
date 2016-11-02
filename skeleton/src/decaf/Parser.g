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
	: type TK_main OPEN CLOSE LCURLY (statement)* RCURLY EOF
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
	: term
    | expr addop term
    ;

term
    : num
    | term mulop num
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

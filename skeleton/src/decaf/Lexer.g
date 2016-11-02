header {package decaf;}

options 
{
	mangleLiteralPrefix = "TK_";
	language="Java";
}

class DecafScanner extends Lexer;
options 
{
	k=2;
}

tokens
{
	"int";
	"float";
	"main";
}

LCURLY options { paraphrase = "{"; } : "{";
RCURLY options { paraphrase = "}"; } : "}";

ID options { paraphrase = "a variable"; }
	: ('a'..'z' | 'A'..'Z' | '_')+
	;

DIGIT options { paraphrase = "a number"; }
    : ('0'..'9')+ ('.' ('0'..'9')+ )?
    ;

ADD options { paraphrase = "+"; } : "+" ;
SUB options { paraphrase = "-"; } : "-" ;
MULT options { paraphrase = "*"; } : "*" ;
DIV options { paraphrase = "/"; } : "/" ;

COLON options { paraphrase = ","; } : "," ;
ENDSTAT options { paraphrase = ";"; } : ";" ;
ASSIGN options { paraphrase = "="; } : "=" ;
OPEN options { paraphrase = "("; } : "(" ;
CLOSE options { paraphrase = ")"; } : ")" ;

WS_ : (' ' | '\n' | '\t' {newline();}) {_ttype = Token.SKIP; };

SL_COMMENT : "//" (~'\n')* '\n' {_ttype = Token.SKIP; newline (); };

protected
ESC :  '\\' ('n'|'"');

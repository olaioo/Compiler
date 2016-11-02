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

WS_ : (' ' | '\n' {newline();}) {_ttype = Token.SKIP; };

SL_COMMENT : "//" (~'\n')* '\n' {_ttype = Token.SKIP; newline (); };

protected
ESC :  '\\' ('n'|'"');

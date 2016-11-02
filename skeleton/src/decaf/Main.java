package decaf;

import java.io.*;
import antlr.Token;
import java6035.tools.CLI.*;

class Main {
    public static void main(String[] args) {
        try {
        	CLI.parse (args, new String[0]);
        	
        	InputStream inputStream = args.length == 0 ?
                    System.in : new java.io.FileInputStream(CLI.infile);

        	if (CLI.target == CLI.SCAN)
        	{
        		DecafScanner lexer = new DecafScanner(new DataInputStream(inputStream));
        		Token token;
        		boolean done = false;
        		while (!done)
        		{
        			try
        			{
		        		for (token=lexer.nextToken(); token.getType()!=DecafParserTokenTypes.EOF; token=lexer.nextToken())
		        		{
		        			String type = "";
		        			String text = token.getText();
		
		        			switch (token.getType())
		        			{
				    			case DecafScannerTokenTypes.ID:
				    				type = " IDENTIFIER";
				    				break;
								case DecafScannerTokenTypes.TK_int:
				    				type = " INTTYPE";
				    				break;
								case DecafScannerTokenTypes.TK_float:
				    				type = " FLOATTYPE";
				    				break;
								case DecafScannerTokenTypes.TK_main:
				    				type = " MAINMETHOD";
				    				break;
								case DecafScannerTokenTypes.DIGIT:
				    				type = " INTLITERAL";
				    				break;
								case DecafScannerTokenTypes.LCURLY:
				    				type = " OPENCURLY";
				    				break;
								case DecafScannerTokenTypes.RCURLY:
				    				type = " CLOSECURLY";
				    				break;
								case DecafScannerTokenTypes.ADD:
				    				type = " ADDOP";
				    				break;
								case DecafScannerTokenTypes.SUB:
				    				type = " SUBOP";
				    				break;
								case DecafScannerTokenTypes.MULT:
				    				type = " MULOP";
				    				break;
								case DecafScannerTokenTypes.DIV:
				    				type = " DIVOP";
				    				break;
								case DecafScannerTokenTypes.COLON:
				    				type = " COLON";
				    				break;
								case DecafScannerTokenTypes.ENDSTAT:
				    				type = " SEMICOLON";
				    				break;
								case DecafScannerTokenTypes.ASSIGN:
				    				type = " EQUAL";
				    				break;
								case DecafScannerTokenTypes.OPEN:
				    				type = " OPENPAREN";
				    				break;
								case DecafScannerTokenTypes.CLOSE:
				    				type = " CLOSEPAREN";
				    				break;
		        			}
		        			System.out.println (token.getLine() + type + " " + text);
		        		}
		        		done = true;
        			} catch(Exception e) {
        	        	// print the error:
        	            System.out.println(CLI.infile+" "+e);
        	            lexer.consume ();
        	        }
        		}
        	}
        	else if (CLI.target == CLI.PARSE || CLI.target == CLI.DEFAULT)
        	{
        		DecafScanner lexer = new DecafScanner(new DataInputStream(inputStream));
        		DecafParser parser = new DecafParser (lexer);
                parser.program();
        	}
        	
        } catch(Exception e) {
        	// print the error:
            System.out.println(CLI.infile+" "+e);
        }
    }
}


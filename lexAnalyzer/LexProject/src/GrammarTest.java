
import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

import org.antlr.v4.runtime.ANTLRInputStream;
import org.antlr.v4.runtime.CommonTokenStream;
import org.antlr.v4.runtime.RuleContext;

public class GrammarTest {

	public static void main(String[] args) {

		//args=new String[]{"--str","int main() {for(int i=0;i<4;i++){if(a==b&&b==c){a=b;}else{printf(\"%d-\",a);}}}"};

		try {
			if (args[0].equals("--help")) {
				help();
			} else if (args[0].equals("--str")) {
				printTree(args[1]);
			} else if (args[0].equals("--dir")) {
				Scanner in = new Scanner(new File(args[1]), "UTF-8");
				String s = "";
				while (in.hasNext()) {
					s += in.nextLine();
				}
				printTree(s);
			} else {
				System.out.println("Invalid command!");
				help();
			}
		} catch (ArrayIndexOutOfBoundsException er) {
			help();
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			System.out.println("File not found!");
		}
	
	}

	static void help() {
		System.out
				.printf("*******************HELP*******************\n"
						+ "\t--str \"string\"\n"
						+ "\t--dir \"directory\"\n"
						+ "\t--help for help.\n");
	}
	
	static void printTree(String s){
		ANTLRInputStream input = new ANTLRInputStream(s);
		GrammarLexer lexer = new GrammarLexer(input);
		CommonTokenStream tokens = new CommonTokenStream(lexer);
		// Print tokens BEFORE filteri
		
		GrammarParser parser = new GrammarParser(tokens);
		parser.setBuildParseTree(true);
		RuleContext tree = parser.source();
		//tree.save(parser, "/tmp/R.ps"); // Generate postscript
		System.out.println(tree.toStringTree(parser));
	}
}

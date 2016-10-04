
import java.io.File;
import java.io.IOException;
import java.util.Arrays;

import javax.swing.JFileChooser;
import javax.swing.JFrame;
import javax.swing.JPanel;

import org.antlr.v4.gui.TreeViewer;
import org.antlr.v4.runtime.ANTLRInputStream;
import org.antlr.v4.runtime.CommonTokenStream;
import org.antlr.v4.runtime.RuleContext;

import java.nio.file.Paths;
import java.nio.file.Files;

public class GrammarTest {

	public static String arqExplorer(){
		String text = null;
		JFileChooser chooser = new JFileChooser();
		chooser.showOpenDialog(null);
		File f=chooser.getSelectedFile();
		if(f != null)
		{
			try {
				text = String.join("\n", Files.readAllLines(Paths.get(f.getAbsolutePath())));
			} catch (IOException e) {
				System.err.println("Arquivo inválido!");
			}
		}
		return text;
	}
	
	public static void printTree(String s) {
		ANTLRInputStream input = new ANTLRInputStream(s);
		GrammarLexer lexer = new GrammarLexer(input);
		CommonTokenStream tokens = new CommonTokenStream(lexer);
		// Print tokens BEFORE filtering
		
		GrammarParser parser = new GrammarParser(tokens);
		parser.setBuildParseTree(true);
		RuleContext tree = parser.source();
		
        JFrame frame = new JFrame("Parser Tree GUI");
        JPanel panel = new JPanel();
        TreeViewer view = new TreeViewer(Arrays.asList(
                parser.getRuleNames()),tree);
        panel.add(view);
        frame.add(panel);
        frame.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
        frame.setSize(600,400);
        frame.setLocationRelativeTo(null);
        frame.setVisible(true);
	}
}

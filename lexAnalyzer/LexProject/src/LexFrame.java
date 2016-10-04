import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import java.awt.BorderLayout;
import javax.swing.SpringLayout;
import javax.swing.JTextArea;
import javax.swing.JButton;

import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import javax.swing.JMenuBar;
import javax.swing.JMenu;
import javax.swing.JMenuItem;
import javax.swing.JOptionPane;
import javax.swing.JLabel;

public class LexFrame {

	private JFrame frmLexicalAnalyser;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					LexFrame window = new LexFrame();
					window.frmLexicalAnalyser.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the application.
	 */
	public LexFrame() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frmLexicalAnalyser = new JFrame();
		frmLexicalAnalyser.setTitle("Lexical Analyzer");
		frmLexicalAnalyser.setBounds(0, 0, 640, 480);
		frmLexicalAnalyser.setLocationRelativeTo(null);
		frmLexicalAnalyser.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frmLexicalAnalyser.setResizable(false);
		
		JPanel panel = new JPanel();
		frmLexicalAnalyser.getContentPane().add(panel, BorderLayout.CENTER);
		SpringLayout sl_panel = new SpringLayout();
		panel.setLayout(sl_panel);
		
		final JTextArea txtrAbc = new JTextArea();
		sl_panel.putConstraint(SpringLayout.WEST, txtrAbc, 10, SpringLayout.WEST, panel);
		sl_panel.putConstraint(SpringLayout.SOUTH, txtrAbc, -72, SpringLayout.SOUTH, panel);
		sl_panel.putConstraint(SpringLayout.EAST, txtrAbc, -10, SpringLayout.EAST, panel);
		panel.add(txtrAbc);
		
		JButton btnOpenFile = new JButton("Load file");
		sl_panel.putConstraint(SpringLayout.NORTH, btnOpenFile, 16, SpringLayout.SOUTH, txtrAbc);
		sl_panel.putConstraint(SpringLayout.EAST, btnOpenFile, -339, SpringLayout.EAST, panel);
		btnOpenFile.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				txtrAbc.setText(GrammarTest.arqExplorer());
			}
		});
		panel.add(btnOpenFile);
		
		JMenuBar menuBar = new JMenuBar();
		sl_panel.putConstraint(SpringLayout.NORTH, menuBar, 0, SpringLayout.NORTH, panel);
		sl_panel.putConstraint(SpringLayout.WEST, menuBar, 0, SpringLayout.WEST, panel);
		sl_panel.putConstraint(SpringLayout.EAST, menuBar, 632, SpringLayout.WEST, panel);
		panel.add(menuBar);
		
		JMenu mnNewMenu = new JMenu("File");
		menuBar.add(mnNewMenu);
		
		JMenuItem mntmOpenNewFile = new JMenuItem("Load file");
		mntmOpenNewFile.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				txtrAbc.setText(GrammarTest.arqExplorer());
			}
		});
		mnNewMenu.add(mntmOpenNewFile);
		
		JMenuItem mntmExit = new JMenuItem("Exit");
		mntmExit.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				System.exit(0);
			}
		});
		mnNewMenu.add(mntmExit);
		
		JMenu mnNewMenu_1 = new JMenu("Help");
		menuBar.add(mnNewMenu_1);
		
		JMenuItem mntmAbout = new JMenuItem("About");
		mntmAbout.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				JOptionPane.showMessageDialog(frmLexicalAnalyser,"Lexical Analyzer v1.0");
			}
		});
		mnNewMenu_1.add(mntmAbout);
		
		JLabel lblNewLabel = new JLabel("Write the code to be tested or load the file:");
		sl_panel.putConstraint(SpringLayout.SOUTH, lblNewLabel, -398, SpringLayout.SOUTH, panel);
		sl_panel.putConstraint(SpringLayout.NORTH, txtrAbc, 6, SpringLayout.SOUTH, lblNewLabel);
		sl_panel.putConstraint(SpringLayout.WEST, lblNewLabel, 10, SpringLayout.WEST, panel);
		panel.add(lblNewLabel);
		
		JButton btnShowParseTree = new JButton("Show Parse Tree");
		sl_panel.putConstraint(SpringLayout.WEST, btnShowParseTree, 18, SpringLayout.EAST, btnOpenFile);
		sl_panel.putConstraint(SpringLayout.SOUTH, btnShowParseTree, -31, SpringLayout.SOUTH, panel);
		sl_panel.putConstraint(SpringLayout.EAST, btnShowParseTree, -174, SpringLayout.EAST, panel);
		btnShowParseTree.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				GrammarTest.printTree(txtrAbc.getText());
			}
		});
		sl_panel.putConstraint(SpringLayout.NORTH, btnShowParseTree, 0, SpringLayout.NORTH, btnOpenFile);
		panel.add(btnShowParseTree);
	}
	
}

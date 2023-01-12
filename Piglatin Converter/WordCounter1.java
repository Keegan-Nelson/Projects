package piglatin;

import java.awt.*; 
import java.awt.event.*;
import java.util.StringTokenizer;

import javax.swing.*; 


public class WordCounter1 extends JFrame {

	private JTextArea text; 
	private JButton count; 
	private JLabel result; 
	
	private class DoCount implements ActionListener{
		public void actionPerformed(ActionEvent arg0) {
			String allTheText = text.getText();
			StringTokenizer tokenizer = new StringTokenizer(allTheText); 
			
			
			int count = 0; 
			
			String PigOut ="";
			while( tokenizer.hasMoreTokens() ) {
				String word = tokenizer.nextToken();
				String PigWord = PigLatin.convertWord(word); 
				
				count++; 
				
				PigOut = PigOut + " "+PigWord; 						 
			}
			
			result.setText("The number words = "+count);
			text.append("\n\n\n"+PigOut);
	}
}	    
	
	public WordCounter1() {
		super();
		Container ctPane = getContentPane(); 
	
		text = new JTextArea(); 
		text.setLineWrap(true); 											 
		JScrollPane Scroll = new JScrollPane(text);
		ctPane.add(Scroll, BorderLayout.CENTER);
	
		count = new JButton("Convert");
		result = new JLabel("The Number of words = ???"); 
		JPanel bottomPanel = new JPanel(); 
		bottomPanel.add(count); 							
		bottomPanel.add(result);
		ctPane.add(bottomPanel,BorderLayout.SOUTH);
		
		count.addActionListener(new DoCount());
	}
	public WordCounter1(String title) {
		this();
		setTitle(title); 
	}
	public static void main(String[]  args) {
		WordCounter1 frame = new WordCounter1();
		frame.setSize(380,280);
		frame.setLocation(200,100);
		frame.setVisible(true);
		frame.setDefaultCloseOperation(WindowConstants.DISPOSE_ON_CLOSE);
	}
	
}
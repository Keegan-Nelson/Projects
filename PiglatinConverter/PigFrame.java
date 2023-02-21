package PiglatinConverter;
import java.awt.*; 
import java.awt.event.*;
import javax.swing.*; 


public class PigFrame extends JFrame {

	private JTextField text; 
	private JButton convertButton; 
	/*
	private class DoConvert implements ActionListener { 
		public void actionPerformed(ActionEvent e) {
			text.setText(PigLatin.convertWord(text.getText())  );
		}
	}
	*/
public PigFrame() { 
	super(); 
	Container ctPane = getContentPane();               // Need to have lines of code to collect the text 
	ctPane.setLayout(new FlowLayout()); 				// Then use the string tokenizzer to split up the text. By default it wont recognize spaces as a way of noticing there are different strings
														// Then have have pig translate each word and store them 
	text = new JTextField(25); 	
	text.addActionListener(new ActionListener() {
		public void actionPerformed(ActionEvent e) {
			text.setText(PigLatin.convertWord(text.getText()));
		}
	} );
	convertButton = new JButton("Convert to Pig Latin"); //pig		pig = pig + " " + pigwor
	//convertButton.addActionListener(new DoConvert());   // Output the translate words to piglatin 
	convertButton.addActionListener( new ActionListener()  {
		public void actionPerformed(ActionEvent e) {
			text.setText(PigLatin.convertWord(text.getText()));
		}
	} ); 
	ctPane.add(convertButton);
	ctPane.add(text); 
	
}
public PigFrame(String title) { 
	this(); 
	setTitle(title); 	
}
public static void main(java.lang.String[]  args) {
/*	
	PigFrame frame = new PigFrame("English to Pig Latin Translator");
	frame.setSize(380,300);
	frame.setLocation(200,200);
	frame.setVisible(true); 
	frame.setDefaultCloseOperation(WindowConstants.DISPOSE_ON_CLOSE);
	*/
}



}

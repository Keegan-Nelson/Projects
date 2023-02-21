package PiglatinConverter;
import java.awt.*; 
import java.awt.event.*;
import javax.swing.*; 


public class PigFrame extends JFrame {

	private JTextField text; 
	private JButton convertButton; 
public PigFrame() { 
	super(); 
	Container ctPane = getContentPane();               
	ctPane.setLayout(new FlowLayout()); 				
												
	text = new JTextField(25); 	
	text.addActionListener(new ActionListener() {
		public void actionPerformed(ActionEvent e) {
			text.setText(PigLatin.convertWord(text.getText()));
		}
	} );
	convertButton = new JButton("Convert to Pig Latin"); 
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
}



}

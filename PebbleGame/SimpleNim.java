package simplenim;

import java.awt.*; 
import java.awt.event.*; 
import java.util.Random;
import javax.swing.*;



public class SimpleNim extends JFrame {
	    // this will allow the range to be from 9 to 50    randint 42 will create a int between 0 and 41
		 
	private JButton pebbleTaker ; 
	private JTextArea pebbleRemaining; 
	private JTextArea pebbleAI;
	private JTextField pebbleHUMAN; 
	private JButton Restart;
	private NIM taker;
	public static int peb = randint(42) + 9; 
	
	 
	
public static int randint(int i) {          // GETTER AND SETTER FOR THE PEBBLES //METHOD FOR TAKING STUFF    //JPANEL 
	return 0; 
}													// Action Listener for the Restart Button 
		 
public SimpleNim() {
super();   
	
	Container ctPane = getContentPane(); 

	
	pebbleTaker = new JButton("Take Pebbles");
	pebbleTaker.addActionListener(new ButtonPress());
	pebbleRemaining = new JTextArea(); 
	pebbleAI = new JTextArea();
	pebbleHUMAN = new JTextField();
	
	ctPane.add(pebbleTaker,BorderLayout.SOUTH); 
	ctPane.add(pebbleRemaining,BorderLayout.NORTH);
	ctPane.add(pebbleAI,BorderLayout.NORTH);
	ctPane.add(pebbleHUMAN,BorderLayout.CENTER);
	
}

private class ButtonPress implements ActionListener {
	public void actionPerformed(ActionEvent arg0) {   /// THIS NEEDS TO TAKE AWAY PEBBLES input minus 
		String c = pebbleHUMAN.getText(); 
		double cout = Double.parseDouble(c); 
	}
	
/*	
	private class ButtonPressC implements ActionListener {    // convert from C to F 
		public void actionPerformed(ActionEvent arg0) { 
			String c = CTextField.getText(); 
			double cout = Double.parseDouble(c); 
			converter.setInputC(cout);
			converter.convertT();
			double outF = converter.getOutputF(); 
			FTextField.setText(""+outF);
	*/
}
		 
public static void main(String[] args) {   //Need to allow the human to have a turn to pick a certain amount of pebbles 
		  
										//Need to have a gui with text areas from the player to input area
 if( peb > 31 )	{
								    
 }
 else if(peb == 31) {
	 
 }
 else if(31 > peb && peb > 15) {      // how to use the and operator 
	
 }
 else if(peb == 15) { 
	 
 }
 else if(15 > peb && peb > 7) {
	
 }                                             // have a method to take 1, _, _   the computer will take a certain amount based on how many pebbles are left 
 else if(peb == 7) {
	 
 }
 else if(7 > peb && peb > 3) {
	
 }
 else if(peb ==3) {
	 
 }
 else if(3 > peb && peb > 1) {
	 
 }
 else if(peb == 1) {
	 System.out.println("You Have Won!");
 }
 else if(peb == 0) {
	 System.out.println("AI Has Won");
 }
 
 SimpleNim frame = new SimpleNim();
	frame.setTitle("Simple NIM"); 
	frame.setSize(400, 300);
	frame.setVisible(true);
	frame.setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
	frame.setLocation(300, 300);
	
}		
	
}

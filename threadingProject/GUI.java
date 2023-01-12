package threadingProject;

import java.awt.BorderLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextArea;
import javax.swing.JTextField;

public class GUI implements ActionListener {
	
	private JTextField enterThreads; 
	private JTextArea displayThreads;
	private JButton stop; 
	public GUI()  { 

		JFrame frame = new JFrame("My First GUI"); 
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.setSize(300,300); 
		//frame.getContentPane().add(start); 
		 
		
		JPanel centralPanel = new JPanel(); 
		JPanel northPanel = new JPanel(); 
		displayThreads = new JTextArea(0,5); 
		enterThreads = new JTextField(10); 
		JLabel titleStatement = new JLabel("Enter Amount of Threads Below:");
		JLabel displayStatement = new JLabel("Total Amount of Threads Running:");
		JButton start = new JButton("Start Threading");
		start.addActionListener(this);
		stop = new JButton("STOP Threading");
		//stop.addActionListener(stopFunction);
		northPanel.add(BorderLayout.NORTH, displayStatement);
		northPanel.add(displayThreads);
		centralPanel.add(BorderLayout.NORTH, titleStatement);
		centralPanel.add(enterThreads); 
		centralPanel.add(start);
		frame.getContentPane().add(BorderLayout.CENTER, centralPanel); 
		frame.getContentPane().add(BorderLayout.NORTH, northPanel);
		frame.setVisible(true);
	}
	// ACTION LISTENER FOR STOPPING PROGRAM
	public GUI(ActionListener stopFunction) {
		stop.addActionListener(stopFunction);
		System.exit(1); 
	}
	//ACTION LISTENER FOR CREATING THE THREADS AFTER GETTING THE NUMBER FROM THE TEXTFIELD THAT THE USER HAS INPUT
	public void actionPerformed(ActionEvent e) { 
		String stringOfThreads = enterThreads.getText(); 
		int numberOfThreads = Integer.parseInt(stringOfThreads);
		for(int i=0; i<=numberOfThreads; i++) {
			runnableThread rt = new runnableThread(i); 
			rt.start(); /// WILL NEED THIS TO CREATE THE THREADS 
		}
		displayThreads.setText(stringOfThreads);   /// NEED THIS TO KEEP UPDATING THE DISPLAY OF ACTIVE THREADS 
	//	String stringOfThreads = enterThreads.getText(); 
		//int numberOfThreads = Integer.parseInt(stringOfThreads);
	}
// GETTING AN ERROR HERE ????????????????????????????????????????????
	
	
	
//	public int getAmountOfThreads() {
//	    return numberOfThreads;
//	  }
//	public void setColor(int t) {
//	    this.numberOfThreads = t;
//	  }
	  
}
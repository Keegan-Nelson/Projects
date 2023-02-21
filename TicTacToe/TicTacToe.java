package TicTacToe;

	import javax.swing.JFrame;
	import javax.swing.JPanel;
	import java.awt.*;
	import java.awt.BorderLayout;
	import java.awt.event.ActionEvent;
	import java.awt.event.ActionListener;
	import javax.swing.JButton;
	import javax.swing.JFrame;
	import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
	import javax.swing.JTextArea;
	import javax.swing.JTextField;

public class TicTacToe extends JFrame{

						
	JButton button0; 
	JButton button1;
	JButton button2;
	JButton button3;
	JButton button4;
	JButton button5;
	JButton button6;
	JButton button7;
	JButton button8;
	
	public TicTacToe() { 
		
		JFrame frame = new JFrame("TicTacToe"); 
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.setSize(250,150); 
			 
			
		JPanel topPanel = new JPanel(); 
		JPanel middlePanel = new JPanel(); 
		JPanel bottomPanel = new JPanel();
		
		
		
		button0 = new JButton("[1]");
		button1 = new JButton("[2]");
		button2 = new JButton("[3]");
		button3 = new JButton("[4]");
		button4 = new JButton("[5]");
		button5 = new JButton("[6]");
		button6 = new JButton("[7]");
		button7 = new JButton("[8]");
		button8 = new JButton("[9]");
		
		topPanel.add(button0);
		topPanel.add(button1);
		topPanel.add(button2);
		middlePanel.add(button3);
		middlePanel.add(button4);
		middlePanel.add(button5);
		bottomPanel.add(button6);
		bottomPanel.add(button7);
		bottomPanel.add(button8);
		button0.addActionListener(new buttonListener0());
		button1.addActionListener(new buttonListener1());
		button2.addActionListener(new buttonListener2());
		button3.addActionListener(new buttonListener3());
		button4.addActionListener(new buttonListener4());
		button5.addActionListener(new buttonListener5());
		button6.addActionListener(new buttonListener6());
		button7.addActionListener(new buttonListener7());
		button8.addActionListener(new buttonListener8());
		
		frame.getContentPane().add(BorderLayout.NORTH, topPanel); 
		frame.getContentPane().add(BorderLayout.CENTER, middlePanel);
		frame.getContentPane().add(BorderLayout.SOUTH, bottomPanel);
		frame.setVisible(true);
		
	
	}
	
	int counter = 2; 
	
	private class buttonListener0 implements ActionListener {

		@Override
		public void actionPerformed(ActionEvent e) {
			// TODO Auto-generated method stub
			
			//JButton button0 buttonClicked = (JButton)e.getSource();
			if(counter%2 == 0) button0.setText("X"); // This will check to see if the counter is odd or even to check a turn 
			else button0.setText("0");
			if(checkIfWon() == true) {
				JOptionPane.showConfirmDialog(null, "Game Over.");
				clearBoard();
			}
			counter++; // Iterate the counter each time someone takes a turn 
		}
	}
	private class buttonListener1 implements ActionListener {

		@Override
		public void actionPerformed(ActionEvent e) {
			// TODO Auto-generated method stub
			
			//JButton button0 buttonClicked = (JButton)e.getSource();
			if(counter%2 == 0) button1.setText("X"); // This will check to see if the counter is odd or even to check a turn 
			else button1.setText("0");
			if(checkIfWon() == true) {
				JOptionPane.showConfirmDialog(null, "THE GAME IS OVER");
				clearBoard();
			}
			counter++; // Iterate the counter each time someone takes a turn 
		}
	}
	private class buttonListener2 implements ActionListener {

		@Override
		public void actionPerformed(ActionEvent e) {
			// TODO Auto-generated method stub
			
			//JButton button0 buttonClicked = (JButton)e.getSource();
			if(counter%2 == 0) button2.setText("X"); // This will check to see if the counter is odd or even to check a turn 
			else button2.setText("0");
			if(checkIfWon() == true) {
				JOptionPane.showConfirmDialog(null, "Game Over.");
				clearBoard();
			} 
			counter++; // Iterate the counter each time someone takes a turn 
		}
	}
	private class buttonListener3 implements ActionListener {

		@Override
		public void actionPerformed(ActionEvent e) {
			// TODO Auto-generated method stub
			
			//JButton button0 buttonClicked = (JButton)e.getSource();
			if(counter%2 == 0) button3.setText("X"); // This will check to see if the counter is odd or even to check a turn 
			else button3.setText("0");
			if(checkIfWon() == true) {
				JOptionPane.showConfirmDialog(null, "Game Over.");
				clearBoard();
			} 
			counter++; // Iterate the counter each time someone takes a turn 
		}
	}
	private class buttonListener4 implements ActionListener {

		@Override
		public void actionPerformed(ActionEvent e) {
			// TODO Auto-generated method stub
			
			//JButton button0 buttonClicked = (JButton)e.getSource();
			if(counter%2 == 0) button4.setText("X"); // This will check to see if the counter is odd or even to check a turn 
			else button4.setText("0");
			if(checkIfWon() == true) {
				JOptionPane.showConfirmDialog(null, "Game Over.");
				clearBoard();
			} 
			counter++; // Iterate the counter each time someone takes a turn 
		}
	}
	private class buttonListener5 implements ActionListener {

		@Override
		public void actionPerformed(ActionEvent e) {
			// TODO Auto-generated method stub
			
			//JButton button0 buttonClicked = (JButton)e.getSource();
			if(counter%2 == 0) button5.setText("X"); // This will check to see if the counter is odd or even to check a turn 
			else button5.setText("0");
			if(checkIfWon() == true) {
				JOptionPane.showConfirmDialog(null, "Game Over.");
				clearBoard();
			} 
			counter++; // Iterate the counter each time someone takes a turn 
		}
	}
	private class buttonListener6 implements ActionListener {

		@Override
		public void actionPerformed(ActionEvent e) {
			// TODO Auto-generated method stub
			
			//JButton button0 buttonClicked = (JButton)e.getSource();
			if(counter%2 == 0) button6.setText("X"); // This will check to see if the counter is odd or even to check a turn 
			else button6.setText("0");
			if(checkIfWon() == true) {
				JOptionPane.showConfirmDialog(null, "Game Over.");
				clearBoard();
			} 
			counter++; // Iterate the counter each time someone takes a turn 
		}
	}
	private class buttonListener7 implements ActionListener {

		@Override
		public void actionPerformed(ActionEvent e) {
			// TODO Auto-generated method stub
			
			//JButton button0 buttonClicked = (JButton)e.getSource();
			if(counter%2 == 0) button7.setText("X"); // This will check to see if the counter is odd or even to check a turn 
			else button7.setText("0");
			if(checkIfWon() == true) {
				JOptionPane.showConfirmDialog(null, "Game Over.");
				clearBoard();
			} 
			counter++; // Iterate the counter each time someone takes a turn 
		}
	}
	private class buttonListener8 implements ActionListener {

		@Override
		public void actionPerformed(ActionEvent e) {
			// TODO Auto-generated method stub
			
			//JButton button0 buttonClicked = (JButton)e.getSource();
			if(counter%2 == 0) button8.setText("X"); // This will check to see if the counter is odd or even to check a turn 
			else button8.setText("0");
			if(checkIfWon() == true) {
				JOptionPane.showConfirmDialog(null, "Game Over.");
				clearBoard();
			} 
			counter++; // Iterate the counter each time someone takes a turn 
		}
	}
	
	public void clearBoard() {
		button0.setText("[1]"); 
		button1.setText("[2]");
		button2.setText("[3]");
		button3.setText("[4]");
		button4.setText("[5]");
		button5.setText("[6]");
		button6.setText("[7]");
		button7.setText("[8]");
		button8.setText("[9]");
	}
	//displayBoard 
	// it will look like this 
//	[0 1 2]
//	[3 4 5]
//	[6 7 8]

	
	public boolean checkIfWon() {
		if(checkRows() == true) return true; 
		else if(checkDiagnols() == true) return true;
		else if(checkColumns() == true) return true; 
		else return false; 
	}
	public static void checkIfTie() { 
		TicTacToe TTT = new TicTacToe(); 
		if(TTT.checkIfWon() == false) { 
			System.out.println("Tie Game");
		}
	}
	public boolean checkRows() {
		if(checkButtons(button0, button1, button2)) return true;
		else if(checkButtons(button3, button4, button5)) return true; 
		else if(checkButtons(button6, button7, button8)) return true; 
		else return false;
	}
	public boolean checkDiagnols() {
		if(checkButtons(button0, button4, button8)) return true; 
		else if(checkButtons(button2, button4, button6)) return true;
		else return false;
	}
	public boolean checkColumns() {
		if(checkButtons(button0, button3, button6)) return true; 
		else if(checkButtons(button1, button4, button7)) return true;
		else if(checkButtons(button2, button5, button8)) return true; 
		else return false;
	}
	public boolean checkButtons(JButton x, JButton y, JButton z) { /////????????????
		if(x.getText().equals(y.getText()) && y.getText().equals(z.getText())) return true; 
		else return false;
	}
	public static void main(String[] args) {
		TicTacToe game = new TicTacToe(); 
		game.checkIfTie();
		//game.displayBoard(); 
	}
}

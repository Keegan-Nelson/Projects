package ronaldoRunnerGame;
import java.awt.*; 
import java.awt.event.*; 
import javax.swing.*; 

public class MyFrame extends JFrame {
	

	MyFrame(){
		
		MyPanel panel = new MyPanel(); 
		this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE); 
		panel.addKeyListener(panel);
		panel.setFocusable(true);
		this.add(panel); 
		this.pack(); 
		this.setLocationRelativeTo(null); 
		this.setVisible(true);
		
	}

}

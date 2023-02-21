package GameOfLife;
import java.awt.*;
import java.awt.event.*;
import java.util.Random;

import javax.swing.*; 

public class DotFrame extends JFrame {
	private DotComponent dotDisplay; 
	private Timer timer; 
	private Random gen; 
	
	private JButton step; 
	private JButton go; 
	private JButton stop; 
	
	private class doTwinkleONCE implements ActionListener{ 
		public void actionPerformed(ActionEvent ae) { //a
			dotDisplay.nextGen(); 
		}
	}
	private class doTwinkle implements ActionListener{ 
		public void actionPerformed(ActionEvent ae) { 
			// need code to only do TWINKLE ONCE 
			
			timer = new Timer(10,new doTwinkleONCE()); 
			timer.start(); 
		}
		
	}
	private class stopGM implements ActionListener{ 
		public void actionPerformed(ActionEvent ae) {
			
			//timer = new Timer(10,new doTwinkleONCE()); 
			timer.stop();
		}
	}
	
	
	private class PutDot implements MouseListener{ 
		public void mouseClicked(MouseEvent arg0) { 
			double clickX = arg0.getX(); 
			double clickY = arg0.getY(); 
			
			dotDisplay.setDot(clickX,clickY); 
		}
		
		public void mouseEntered(MouseEvent arg0) {}
		public void mouseExited(MouseEvent arg0) {} 
		public void mousePressed(MouseEvent arg0) {} 
		public void mouseReleased(MouseEvent arg0) {} 
	}
	
	
	public DotFrame() { 
		super(); 
		//gen = new Random(); 
		Container ctPane = getContentPane(); 
		dotDisplay = new DotComponent(); 
		dotDisplay.addMouseListener(new PutDot());
		ctPane.add(dotDisplay, "Center");
		step = new JButton("Step"); 
		step.addActionListener(new doTwinkleONCE());           // AcAAction listener that goes through the next gen once 
		go = new JButton("Play");
		go.addActionListener(new doTwinkle());
		stop = new JButton("Stop"); 
		stop.addActionListener(new stopGM()); 
		
		JPanel bottomPanel = new JPanel(); 
		bottomPanel.add(stop); 
		bottomPanel.add(go); 
		bottomPanel.add(step); 
		ctPane.add(bottomPanel,BorderLayout.SOUTH);
		//timer = new Timer(10,new doTwinkle()); 
		//timer.start(); 
	
	}
	
	public DotFrame( String title) { 
		this(); 
		setTitle(title); 
		
	}
	
	public static void main(String[] args) { 
		DotFrame frame = new DotFrame("Game of Life"); 
		frame.setSize(500,500); 
		frame.setLocation(200,100);
		frame.setVisible(true); 
		frame.setDefaultCloseOperation(WindowConstants.DISPOSE_ON_CLOSE);
	}
}

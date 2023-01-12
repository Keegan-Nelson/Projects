package simpleTag;

import java.awt.geom.Ellipse2D;
import java.awt.*;
import java.awt.event.*;                         
import javax.swing.*;
import javax.swing.border.EmptyBorder;



import java.util.Timer;
import java.util.TimerTask; 
public class simpleTag extends JFrame implements KeyListener{    /// needs to implement the ACtion listener so that I can use it later for keeping track of the iot moivement 
	

	
	
//////////////////////////////////////////////////////////////////////////////////
	// Initialization of the NotIt class
	public class notIt { 
		
		// Creation of the notIt variables
		private int xNotNew; 
		private int yNotNew; 
		
		//Constructor for Initialization the variables
		public notIt(int xnotIt,int ynotIt) { 
			this.xNotNew = xnotIt; 
			this.yNotNew = ynotIt; 
		}
		//Getters for finding out where the It player is on the screen
		public int getX() {     
			return xNot; 
		}
		public int getY() {
			return yNot; 
		}
		
		
		
		
	}
//////////////////////////////////////////////////////////////////////////////////
	
	
//////////////////////////////////////////////////////////////////////////////////
	// Initialization of the It class
	public class It{  
		
		private int xItNew; 
		private int yItNew; 
		
		// Creation of the It variables 
		
		
		//Constructor for Initialization the variables
		public It(int xIt, int yIt) {
			this.xItNew = xIt; 
			this.yItNew = yIt; 
		}
		//Getters for finding out where the It player is on the screen
		public int getX() {     
			return xItNew; 
		}
		public int getY() {
			return yItNew; 
		}
	
	}
//////////////////////////////////////////////////////////////////////////////////	
	
	
	
	
	
//////////////////////////////////////////////////////////////////////////////////	
	
	// Variables for the class simpleTag
	private static final int displayWidth = 600;
	private static final int displayHeight = 500;

	
	private static final int startXIt = 50; 
	private static final int startYIt = 50; 
	
	private static final int startXNot = 100;
	private static final int startYNot = 100;
	private static final int moveIncrements = 10;


	private static int xIt = startXIt; 
	private static int yIt = startYIt; 
	private static int xNot = startXNot;
	private static int yNot = startYNot; 
	
	
	// Radius from the not it player  (Filled circle)  DIDN"T NEED
	//private static int radiusRight = xNot + 2; 
	//private static int radiusLeft = xNot -2; 
	//private static int radiusUp = yNot +2; 
	//private static int radiusDown = yNot -2;

	//Variables for Counter 
	int i; 
	int score = 1;
	
	// JFRAME Variables
	private  JTextField scoreboard;
	private JPanel panel;
	private JButton tagged; 
	private JTextField game; 
	
	public simpleTag() { 
		 
	}
	
	public simpleTag( String title) { 
		this(); 
		setTitle(title); 
		
	}
	
	// Gui that creates the frame and then the panel. The panel is added to the frame to display the game. Within the panel there is a 
	// scoreboard textfield that holds the score of the game. There is also a button that allows the user to keep track of the score using an action listener getTagged.
	// Once the button is pressed it will change the score by 1 all the way up to 5. The last field is game which shows how many players need to be to play the game. 
	public void gui() { 
		JFrame frame = new JFrame("SCOREBOARD"); 
		frame.setVisible(true);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.setSize(400,150);
		panel = new JPanel(); 
		frame.add(panel);
		panel.setLayout(new BoxLayout(panel, BoxLayout.X_AXIS));
		scoreboard = new JTextField("Times Tagged: "); 
		panel.add(scoreboard);
		game = new JTextField("Two Player Game");
	
		panel.add(game);
		tagged = new JButton("Tagged");
		tagged.addActionListener(new getTagged());
		panel.add(tagged);
	
	
	}
	//This is the main function that allows the shapes to be put onto the display. Within the display are keylistners to move the shapes. The rules of the game are also
	// stated in the console. 
	public static void main (String[] args) {
		
		System.out.println("The it player must tag the notIt player." + "\n" + "Once the player is tagged then press the" + "\n" + "button to keep track of score. If tagger gets" + "\n" + "5 tags then they win");
		SwingUtilities.invokeLater(new Runnable() { 
			public void run() { 
				simpleTag simpletag = new simpleTag("Simple Tag        OpenCircle=It(ASWD keys) ClosedCirlce=notIt(Arrow Keys)"); 
				simpletag.gui();
				simpletag.setVisible(true);
				simpletag.addKeyListener(simpletag);
				simpletag.setSize(displayWidth,displayHeight);

			}
		});
		
	}
	
	// Key Listener for the two objects open and closed circles. It and notIt players. The It player will use the ASWD keys while the notIt
	// player uses the arrow keys for movement. Each time a key is pressed the shape will move in a direction 10 pixels. This is stated by the value of 
	// moveIncrements in the varaibles above. 
	public void keyPressed(KeyEvent e)                 
	{
	    int keyCode = e.getKeyCode();
	    if (keyCode == KeyEvent.VK_LEFT)  
	    {
	        xNot = xNot - moveIncrements; 
	    }
	    else if (keyCode == KeyEvent.VK_A)
	    {
	    	xIt = xIt - moveIncrements;
	    }
	    else if (keyCode == KeyEvent.VK_RIGHT)
	    {
	    	xNot = xNot + moveIncrements;
	    }
	    else if (keyCode == KeyEvent.VK_D)
	    {
	    	xIt = xIt + moveIncrements;  
	    }
	    else if (keyCode == KeyEvent.VK_UP)
	    {
	    	yNot = yNot - moveIncrements;
	    }
	    else if (keyCode == KeyEvent.VK_W)
	    {
	    	yIt = yIt - moveIncrements; 
	    }
	    else if (keyCode == KeyEvent.VK_DOWN)
	    {
	    	yNot = yNot + moveIncrements;
	    }
	    else if (keyCode == KeyEvent.VK_S)
	    {
	    	yIt = yIt + moveIncrements; 
	    }
	    
	    // This controls where the objects are able to move on the screen. It sets a boundary so that the objects stay on the screen and 
	    // dont travel off the screen. Repaint() will be called after every keypress so that the shape can be repainted in the correct x and y values. 
	    xNot = Math.max(0, xNot);
	    xNot = Math.min(545, xNot); 
	    yNot = Math.max(30, yNot);
	    yNot = Math.min(445, yNot);
	    
	    xIt = Math.max(0, xIt);
	    xIt = Math.min(545, xIt);
	    yIt = Math.max(30, yIt);
	    yIt = Math.min(445, yIt);
	    repaint();
	}
	public void keyTyped(KeyEvent e)                   
	{
	}

	
	public void keyReleased(KeyEvent e)               
	{
	}
	
	// This is the action listner which is responsible for changing the score of the game after the notIt player has been tagged each time. 
	// It will start at and go all the way to 5 and stop.
	private class getTagged implements ActionListener { 
		public void actionPerformed(ActionEvent arg0) {
			String x = scoreboard.getText(); 
			while(i<5) {
				i++;
				score = score + i;
				scoreboard.setText("Times Tagged: " + i);
				break;
			}
		}
	}		

	// This is where the objects and the backround is created which is displayed in the main frame. 
	// The not filled circle is the It player while the notIt player is represented by the filled circle 
	   public void paint(Graphics g)
	    {
		   
		   
		    Graphics2D g2D = (Graphics2D) g;
		 
		    g2D.setBackground(Color.black);
		    
			g2D.clearRect(0, 0, getWidth(),getHeight()); 
			g2D.setColor(Color.green);
			
			
			Shape Circle1 = new Ellipse2D.Double(xIt,yIt,25,25); 
			Shape Circle2 = new Ellipse2D.Double(xNot,yNot,25,25);
			
			g2D.draw(Circle1);
			g2D.fill(Circle2);
			
	
	    
	    }
	   
//////////////////////////////////////////////////////////////////////////////////	  
	   
}

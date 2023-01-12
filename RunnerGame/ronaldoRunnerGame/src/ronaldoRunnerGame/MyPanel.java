package ronaldoRunnerGame;

import java.awt.*; 
import java.awt.event.*; 
import javax.swing.*; 

public class MyPanel extends JPanel implements ActionListener, KeyListener {

	//Variable Initializations 
	final int myPanel_wdith = 600; 
    final int myPanel_height = 600;
   
    Image enemy1;
    Image enemy2; 
    Image enemy3; 
    Image enemy4; 
    Image enemy5; 
    Image enemy6; 
    Image enemy7; 
    Image enemy8; 
    Image enemy9;
    Image player; 
    Image gameOver; 
    Image win; 
    Image playerRonaldo; 
    Image backgroundImage; 
    Timer timer; 
    
    // 1st Speed 
    int xVelocity_1 = 3; 
    int yVelocity_1 = 3; 
    // 2nd Speed 
    int xVelocity_2 = 3; 
    int yVelocity_2 = 3; 
    // 3rd Speed 
    int xVelocity_3 = 3; 
    int yVelocity_3 = 3; 
    // 4th Speed 
    int xVelocity_4 =  3; 
    int yVelocity_4 =  3; 
    // 5th Speed 
    int xVelocity_5 =  3; 
    int yVelocity_5 =  3;
    // 6th Speed 
    int xVelocity_6 =  3; 
    int yVelocity_6 =  3;
    // 7th Speed 
    int xVelocity_7 =  3; 
    int yVelocity_7 =  3;
    // 8th Speed 
    int xVelocity_8 =  3; 
    int yVelocity_8 =  3;
    // 9th Speed 
    int xVelocity_9 =  3; 
    int yVelocity_9 =  3;
    
    
    //enemy 1
    int x1 = 393; 
    int y1 = 0; 
    //enemy 2 
    int x2 = 177; 
    int y2 = 51; 
    //enemy 3
    int x3 = 477; 
    int y3 = 93; 
    //enemy 4
    int x4 = 243; 
    int y4 = 141; 
  //enemy 5
    int x5 = 36; 
    int y5 = 195;
    //enemy 6
    int x6 = 201; 
    int y6 = 237;
    //enemy 7
    int x7 = 15; 
    int y7 = 279;
    //enemy 8
    int x8 = 507; 
    int y8 = 312;
    //enemy 9
    int x9 = 126; //
    int y9 = 351;
    //player (Ronaldo) 
    int x = 282; 
    int y = 501; 
    
  //PANEL Initiator
    MyPanel(){ 

        this.setPreferredSize(new Dimension(myPanel_wdith, myPanel_height));
        this.setBackground(Color.BLACK);
        
       enemy1 = new ImageIcon("Messi.jpg").getImage().getScaledInstance(35, 35, Image.SCALE_DEFAULT); 
       enemy2 = new ImageIcon("Messi.jpg").getImage().getScaledInstance(35, 35, Image.SCALE_DEFAULT);
       enemy3 = new ImageIcon("Messi.jpg").getImage().getScaledInstance(35, 35, Image.SCALE_DEFAULT);
       enemy4 = new ImageIcon("Messi.jpg").getImage().getScaledInstance(35, 35, Image.SCALE_DEFAULT);
       enemy5 = new ImageIcon("Messi.jpg").getImage().getScaledInstance(35, 35, Image.SCALE_DEFAULT);
       enemy6 = new ImageIcon("Messi.jpg").getImage().getScaledInstance(35, 35, Image.SCALE_DEFAULT);
       enemy7 = new ImageIcon("Messi.jpg").getImage().getScaledInstance(35, 35, Image.SCALE_DEFAULT);
       enemy8 = new ImageIcon("Messi.jpg").getImage().getScaledInstance(35, 35, Image.SCALE_DEFAULT);
       enemy9 = new ImageIcon("Messi.jpg").getImage().getScaledInstance(35, 35, Image.SCALE_DEFAULT);
       
       player = new ImageIcon("Ronaldo.png").getImage().getScaledInstance(35, 35, Image.SCALE_DEFAULT);
       gameOver = new ImageIcon("GameOver.jpg").getImage().getScaledInstance(600, 600, Image.SCALE_DEFAULT);
       win = new ImageIcon("Win.jpg").getImage().getScaledInstance(600, 600, Image.SCALE_DEFAULT);
       
        backgroundImage = new ImageIcon("SoccerField.jpg").getImage().getScaledInstance(600, 600, Image.SCALE_DEFAULT); 
        timer = new Timer(1, this); 
        timer.start(); 
        
    }

    // paint function to draw graphics/images
    public void paint(Graphics g) { 
		super.paint(g);
        Graphics2D g2D = (Graphics2D) g; 
        
        g2D.drawImage(backgroundImage, 0, 0, null);
        g2D.drawImage(enemy1, x1, y1, null);
        g2D.drawImage(enemy2, x2, y2, null);
        g2D.drawImage(enemy3, x3, y3, null);
        g2D.drawImage(enemy4, x4, y4, null);
        g2D.drawImage(enemy5, x5, y5, null);
        g2D.drawImage(enemy6, x6, y6, null);
        g2D.drawImage(enemy7, x7, y7, null);
        g2D.drawImage(enemy8, x8, y8, null);
        g2D.drawImage(enemy9, x9, y9, null);
        g2D.drawImage(player, x, y, null);
        
        
        
        //Conditions to draw win or game over pictures
        if(checkIfWon() == true) { 
        	g2D.drawImage(win, 0, 0, null);
        }
        
        if(checkCollision1() == true ) {
        	g2D.drawImage(gameOver, 0, 0, null);
    
        }
        if(checkCollision2() == true ) {
        	g2D.drawImage(gameOver, 0, 0, null);
 
        }
        if(checkCollision3() == true ) {
        	g2D.drawImage(gameOver, 0, 0, null);
   
        }
        if(checkCollision4() == true ) {
        	g2D.drawImage(gameOver, 0, 0, null);
        
        }
        if(checkCollision5() == true ) {
        	g2D.drawImage(gameOver, 0, 0, null);
        
        }
        if(checkCollision6() == true ) {
        	g2D.drawImage(gameOver, 0, 0, null);
        
        }
        if(checkCollision7() == true ) {
        	g2D.drawImage(gameOver, 0, 0, null);
        	
        }
        if(checkCollision8() == true ) {
        	g2D.drawImage(gameOver, 0, 0, null);
        
        }
        if(checkCollision9() == true ) {
        	g2D.drawImage(gameOver, 0, 0, null);
        
        }
    }


public void actionPerformed(ActionEvent e) {
	// TODO Auto-generated method stub\
	
	    //enemy 1
    	if(x1>= myPanel_wdith-enemy1.getWidth(null) || x1<0 ) { 
    		xVelocity_1 = xVelocity_1 * -1; 
    	}
    	x1 = x1 + xVelocity_1; 
    	
    	//enemy 2
    	if(x2>= myPanel_wdith-enemy2.getWidth(null) || x2<0 ) { 
    		xVelocity_2 = xVelocity_2 * -1; 
    	}
    	x2 = x2 + xVelocity_2; 
    	
    	//enemy 3
    	if(x3>= myPanel_wdith-enemy3.getWidth(null) || x3<0 ) { 
    		xVelocity_3 = xVelocity_3 * -1; 
    	}
    	x3 = x3 + xVelocity_3;
    	
    	//enemy 4
    	if(x4>= myPanel_wdith-enemy4.getWidth(null) || x4<0 ) { 
    		xVelocity_4 = xVelocity_4 * -1; 
    	}
    	x4 = x4 + xVelocity_4;
    	//enemy 5
    	if(x5>= myPanel_wdith-enemy5.getWidth(null) || x5<0 ) { 
    		xVelocity_5 = xVelocity_5 * -1; 
    	}
    	x5 = x5 + xVelocity_5;
    	//enemy 6
    	if(x6>= myPanel_wdith-enemy6.getWidth(null) || x6<0 ) { 
    		xVelocity_6 = xVelocity_6 * -1; 
    	}
    	x6 = x6 + xVelocity_6;
    	//enemy 7
    	if(x7>= myPanel_wdith-enemy7.getWidth(null) || x7<0 ) { 
    		xVelocity_7 = xVelocity_7 * -1; 
    	}
    	x7 = x7 + xVelocity_7;
    	//enemy 8
    	if(x8>= myPanel_wdith-enemy8.getWidth(null) || x8<0 ) { 
    		xVelocity_8 = xVelocity_8 * -1; 
    	}
    	x8 = x8 + xVelocity_8;
    	//enemy 9
    	if(x9>= myPanel_wdith-enemy9.getWidth(null) || x9<0 ) { 
    		xVelocity_9 = xVelocity_9 * -1; 
    	}
    	x9 = x9 + xVelocity_9;
    	//System.out.println("This is x5" + " " + x5);
    	
    	repaint();
    	
}
 
	
	// Check if won function
	public boolean checkIfWon() { 
		if(y <= -35) {
			return true; 
		}
		return false;
	}
	

	// Checking collision with enemies 1-9 with player
	
	boolean GameOver1 = false;
	
	public boolean checkCollision1() { 
		if((x1 == x && (y > -35 && y < 35))) {
			GameOver1 = true;
			System.out.print(x1 + "This is x1 \n");
			System.out.print(y1 + "This is y1 \n");
			return GameOver1;
		}
		return GameOver1; 
	}
	public boolean checkCollision2() { 
		if((x2 == x && (y > 16 && y < 86))) {
			GameOver1 = true;
			System.out.print(x2 + "This is x2 \n");
			System.out.print(y2 + "This is y2 \n");
			return GameOver1;
		}
		return GameOver1; 
	}
	public boolean checkCollision3() { 
		if((x3 == x && (y > 58 && y < 128))) {
			GameOver1 = true;
			System.out.print(x3 + "This is x3 \n");
			System.out.print(y3 + "This is y3 \n");
			return GameOver1;
		}
		return GameOver1; 
	}
	public boolean checkCollision4() { 
		if((x4 == x && (y > 106 && y < 176))) {
			GameOver1 = true;
			System.out.print(x4 + "This is x4 \n");
			System.out.print(y4 + "This is y4 \n");
			return GameOver1;
		}
		return GameOver1; 
	}
	public boolean checkCollision5() { 
		if((x5 == x && (y > 160 && y < 230))) {
			GameOver1 = true;
			System.out.print(x5 + "This is x5 \n");
			System.out.print(y5 + "This is y5 \n");
			return GameOver1;
		}
		return GameOver1; 
	}
	public boolean checkCollision6() { 
		if((x6 == x && (y > 202 && y < 272))) {
			GameOver1 = true;
			System.out.print(x6 + "This is x6 \n");
			System.out.print(y6 + "This is y6 \n");
			return GameOver1;
		}
		return GameOver1; 
	}
	public boolean checkCollision7() { 
		if((x7 == x && (y > 244 && y < 314))) {
			GameOver1 = true;
			System.out.print(x7 + "This is x7 \n");
			System.out.print(y7 + "This is y7 \n");
			return GameOver1;
		}
		return GameOver1; 
	}
	public boolean checkCollision8() { 
		if((x8 == x && (y > 277 && y < 347))) {
			GameOver1 = true;
			System.out.print(x8 + "This is x8 \n");
			System.out.print(y8 + "This is y8 \n");
			return GameOver1;
		}
		return GameOver1; 
	}
	public boolean checkCollision9() { 
		if((x9 == x && (y > 316 && y < 386))) {
			GameOver1 = true;
			System.out.print(x9 + "This is x9 \n");
			System.out.print(y9 + "This is y9 \n");
			return GameOver1;
		}
		return GameOver1; 
	}

	
	//Key Listener for player 
	public void keyTyped(KeyEvent e) {
		// TODO Auto-generated method stub
		switch(e.getKeyChar()) { 
		case 'a': x = x - 3;
		System.out.print(x + "x\n");
		break; 
		case 'w': y = y - 3; 
		System.out.print(y + "y\n");
		break;
		case 's': y = y + 3; 
		System.out.print(y + "y\n");
		break; 
		case 'd': x = x + 3;
		System.out.print(x + "x\n");
		break;
		}
	}
	public void keyPressed(KeyEvent e) {
		// TODO Auto-generated method stub
		
	}

	public void keyReleased(KeyEvent e) {
		// TODO Auto-generated method stub
	}
	
}


package GameOfLife;
import java.awt.Color;
import java.awt.Graphics;
import java.awt.Graphics2D;
import java.util.*;
import java.awt.geom.*;
import java.awt.geom.Ellipse2D.Double;
import java.awt.event.*;
import javax.swing.*;

public class DotComponent extends JComponent {

		private boolean[][] dots; 
		private final int gridSize; 
		private Random gen; 
		private Color color = Color.black; 
		
		
		public DotComponent() { 
			super(); 
			gridSize = 50; 
			dots = new boolean[gridSize][gridSize];
			gen = new Random(); 
		}
		
		public void nextGen() { 
			boolean[][] newdots = new boolean[gridSize][gridSize];
			for( int row = 0; row<gridSize ; row++ ) { 
				for( int col = 0; col<gridSize; col++) { 
					int count = 0;
					if( row-1 >=0 && col-1 >=0) {  							
						if(dots[row-1][col-1]) {   //top left 
							count++; 
						}	
					}
					if( row-1>=0 && dots[row-1][col]) {     //top middle
						count++;												
					}
					if( row-1>=0 && col+1 < gridSize && dots[row-1][col+1]) {	//top right 
						count++;   	
					}
					if( col-1>=0 && dots[row][col-1]) {	// middle left
						count++; 
					}
					if( col+1 < gridSize && dots[row][col+1]) { //middle right  	// all of these comments refer to which colum the if statement is pointing at
						count++; 	
					}			
					if( row+1 < gridSize && col-1>=0 && dots[row+1][col-1]) {	//bottom left
						count++; 
					}
					if( row+1 < gridSize && dots[row+1][col]) {  //bottom middle
						count++;
					}
					if( row+1 < gridSize && col+1 < gridSize && dots[row+1][col+1]) {   // bottom right 
						count++;
					}
					
					if( count == 3) {newdots[row][col]= true;}
					else if(count ==2) {newdots[row][col]=dots[row][col];} 
					else {newdots[row][col]=false;} 
					
					
				}
			}
		
			dots = newdots; 
			repaint();
		}
		
		
		public void setDot(double x, double y) { 
			double squareWidth = getWidth() / (double) gridSize; 
			double squareHeight = getHeight() / (double) gridSize; 
			
			int col = (int) (x /squareWidth); 
			int row = (int) (y /squareHeight); 
			
			if( dots [row][col]) {
				dots[row][col] = false; 
			}
			else { 
				dots[row][col] = true; 
			}
			repaint(); 
		}
		public void paintComponent(Graphics g) { 
			super.paintComponent(getGraphics());
			Graphics2D g2D = (Graphics2D)g; 
			
			double squareWidth = getWidth() / (double) gridSize; 
			double squareHeight = getHeight() / (double) gridSize; 
			
			for(int row=0; row < gridSize; row++) { 
				for(int col=0;col<gridSize; col++) { 
					
					if(dots[row][col]) {
						
						double x = col * squareWidth; 
						double y = row * squareHeight; 
						g2D.fill(new Ellipse2D.Double(x,y,squareWidth,squareHeight));
					}
				}
			}
		}
}

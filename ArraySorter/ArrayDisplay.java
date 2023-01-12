package ArraySorter;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.*; 


public class ArrayDisplay extends JComponent {

	
	int[] dispArray; 
	
	public void setDispArray(int[] dispArray) { 
		this.dispArray = dispArray; 
	}
	//private class reset implements ActionListener { 
	//	public void actionPerformed(ActionEvent ae) { 
//			dispArray.clearArray();
//		}
//	}
		

	protected void paintComponent(Graphics g) { 
		super.paintComponent(g);
		Graphics2D g2D = (Graphics2D)g; 
		g2D.setRenderingHint(RenderingHints.KEY_ANTIALIASING, RenderingHints.VALUE_ANTIALIAS_ON); 
		g2D.setStroke(new BasicStroke(3)); 
		g2D.setColor(Color.red);
		g2D.setBackground(Color.white);
		g2D.clearRect(0, 0, getWidth(), getHeight());
		
		if(dispArray == null)return; 
		
		int height = getHeight(); 
		double actualHeight = 0; 
		
		double deltaX = getWidth()/(0.0+dispArray.length);
		for(int i = 0; i < dispArray.length; i++) {
			actualHeight = dispArray[i]/100.0 *height; 
			int x = 0; 
			
			x = (int)(i *deltaX) + 10; 
			g2D.drawLine(x,height,x,(int)(height - actualHeight));
		}
	
		
	}
}

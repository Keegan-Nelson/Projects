package LightsOut;


import java.awt.*;
import java.awt.event.*;
import javax.swing.*;


public class LightsOut extends JFrame {
	
	
	private JCheckBox box11;
	private JCheckBox box12;          
	private JCheckBox box13;
	private JCheckBox box14;
	private JCheckBox box21;
	private JCheckBox box22;
	private JCheckBox box23;  
	private JCheckBox box24;								/// NEED 4x4 
	private JCheckBox box31;
	private JCheckBox box32;					// 4x4 is easier than the 3x3
	private JCheckBox box33;
	private JCheckBox box34; 
	private JCheckBox box41; 
	private JCheckBox box42; 
	private JCheckBox box43; 
	private JCheckBox box44;       //  erase all the // when 4x4 is ready to start
									 
	
public LightsOut() { 
	
	super();
	
	Container ctPane = getContentPane(); 
	ctPane.setLayout(new GridLayout(4,4));
	
	box11 = new JCheckBox(); box11.setSelected(false);
	box12 = new JCheckBox(); box12.setSelected(false);
	box13 = new JCheckBox(); box13.setSelected(false);
	box14 = new JCheckBox(); box14.setSelected(false);
	box21 = new JCheckBox(); box21.setSelected(false);
	box22 = new JCheckBox(); box22.setSelected(false);
	box23 = new JCheckBox(); box23.setSelected(false);
	box24 = new JCheckBox(); box24.setSelected(false);
	box31 = new JCheckBox(); box31.setSelected(false);
	box32 = new JCheckBox(); box32.setSelected(false);
	box33 = new JCheckBox(); box33.setSelected(false);
	box34 = new JCheckBox(); box34.setSelected(false);
	box41 = new JCheckBox(); box41.setSelected(false);
	box42 = new JCheckBox(); box42.setSelected(false);
	box43 = new JCheckBox(); box43.setSelected(false);
	box44 = new JCheckBox(); box44.setSelected(false);
	
	
	ctPane.add(box11); ctPane.add(box12); ctPane.add(box13); ctPane.add(box14);
	ctPane.add(box21); ctPane.add(box22); ctPane.add(box23); ctPane.add(box24);
	ctPane.add(box31); ctPane.add(box32); ctPane.add(box33); ctPane.add(box34);
	ctPane.add(box41); ctPane.add(box42); ctPane.add(box43); ctPane.add(box44);
	
	ActionListener theLightsDoer = new DoLights(); 
	box11.addActionListener(theLightsDoer);
		box12.addActionListener(theLightsDoer); 
			box13.addActionListener(theLightsDoer); 
				box14.addActionListener(theLightsDoer); 
	box21.addActionListener(theLightsDoer); 
		box22.addActionListener(theLightsDoer); 
			box23.addActionListener(theLightsDoer); 
				box24.addActionListener(theLightsDoer); 
	box31.addActionListener(theLightsDoer); 
		box32.addActionListener(theLightsDoer); 
			box33.addActionListener(theLightsDoer); 
				box34.addActionListener(theLightsDoer); 
	box41.addActionListener(theLightsDoer); 
		box42.addActionListener(theLightsDoer); 
			box43.addActionListener(theLightsDoer); 
				box44.addActionListener(theLightsDoer); 
		
}

private class DoLights implements ActionListener { 
	public void actionPerformed( ActionEvent e) { 
		Object source = e.getSource();
		
		if(source == box11) {
			if( box12.isSelected()) { box12.setSelected(false);}
			else					{ box12.setSelected(true); }
			if( box21.isSelected()) { box21.setSelected(false);}  // CHECKMARK 
			else					{ box21.setSelected(true); }
		}
		else if(source == box12) {
			if( box11.isSelected()) { box11.setSelected(false);}
			else					{ box11.setSelected(true); }
			if( box22.isSelected()) { box22.setSelected(false);}
			else					{ box22.setSelected(true); }     //CHECKMARK
			if( box13.isSelected()) { box13.setSelected(false);}
			else					{ box13.setSelected(true); }
		}
		else if(source == box13) {
			if( box12.isSelected()) { box12.setSelected(false);}
			else					{ box12.setSelected(true); }   //CHECKMARK 
			if( box23.isSelected()) { box23.setSelected(false);}
			else					{ box23.setSelected(true); } 
			if( box14.isSelected()) { box14.setSelected(false);}
			else 					{ box14.setSelected(true); }
		}
		else if(source == box14) {
			if( box13.isSelected()) { box13.setSelected(false);}
			else 					{ box13.setSelected(true); }
			if( box24.isSelected()) { box24.setSelected(false);}
			else 					{ box24.setSelected(true); }      //CHECKMARK																							// need to add box 14, 24, 34, 41,42,43,44
		}
		else if(source == box21) {
			if( box11.isSelected()) { box11.setSelected(false);}
			else					{ box11.setSelected(true); }
			if( box22.isSelected()) { box22.setSelected(false);} 	//CHECKMARK 
			else					{ box22.setSelected(true); }       					 //When the box is clicked it will put an x or turn off an x in this sort of pattern 
			if( box31.isSelected()) { box31.setSelected(false);}       		 				// 			   x
			else					{ box31.setSelected(true); }       						 //       x  click  x
		}																					// 			   x
		else if(source == box22) {														//     The x's are the places where the light will either be turned off or turned on 
			if( box12.isSelected()) { box12.setSelected(false);}
			else					{ box12.setSelected(true); }
			if( box21.isSelected()) { box21.setSelected(false);}
			else					{ box21.setSelected(true); }
			if( box23.isSelected()) { box23.setSelected(false);}   //CHECKMARK
			else					{ box23.setSelected(true); }
			if( box32.isSelected()) { box32.setSelected(false);}
			else					{ box32.setSelected(true); }
		}
		else if(source == box23) {
			if( box13.isSelected()) { box13.setSelected(false);}
			else					{ box13.setSelected(true); }
			if( box22.isSelected()) { box22.setSelected(false);}   //CHECKMARK
			else					{ box22.setSelected(true); }
			if( box33.isSelected()) { box33.setSelected(false);}
			else					{ box33.setSelected(true); }
			if( box24.isSelected()) { box24.setSelected(false);}
			else 					{ box24.setSelected(true); }
		}
		else if(source == box24) {
			if( box14.isSelected()) { box14.setSelected(false);}
			else 					{ box14.setSelected(true); }
			if( box23.isSelected()) { box23.setSelected(false);}
			else 					{ box23.setSelected(true); } 
			if( box34.isSelected()) { box34.setSelected(false);}
			else 					{ box34.setSelected(true); }         //CHECKBOX
		}
		else if(source == box31) {
			if( box21.isSelected()) { box21.setSelected(false);}
			else					{ box21.setSelected(true); }
			if( box32.isSelected()) { box32.setSelected(false);}   //CHECKMARK
			else					{ box32.setSelected(true); }
			if( box41.isSelected()) { box41.setSelected(false);}
			else 					{ box41.setSelected(true); }
		}
		else if(source == box32) {
			if( box31.isSelected()) { box31.setSelected(false);}
			else					{ box31.setSelected(true); }  //CHECKBOX
			if( box22.isSelected()) { box22.setSelected(false);}
			else					{ box22.setSelected(true); }
			if( box33.isSelected()) { box33.setSelected(false);}
			else					{ box33.setSelected(true); }
			if( box42.isSelected()) { box42.setSelected(false);}
			else					{ box42.setSelected(true); }
		}																// To Display if they have have won the game you need to have a if														
		else if(source == box33) {										// statement if all boxes are true than system.out.print "they win" 
			if( box23.isSelected()) { box23.setSelected(false);}
			else					{ box23.setSelected(true); }   //CHECKMARK 
			if( box32.isSelected()) { box32.setSelected(false);}
			else					{ box32.setSelected(true); }
			if( box34.isSelected()) { box34.setSelected(false);}
			else 					{ box34.setSelected(true); }
			if( box43.isSelected()) { box43.setSelected(false);}
			else 					{ box43.setSelected(true); }
		}
		else if(source == box34) {									//CHECKMARK
			if( box24.isSelected()) { box24.setSelected(false);}
			else 					{ box24.setSelected(true); }
			if( box33.isSelected()) { box33.setSelected(false);}
			else 					{ box33.setSelected(true); }
			if( box44.isSelected()) { box44.setSelected(false);}
			else					{ box44.setSelected(true); }
 		}
		else if(source == box41) {
			if( box31.isSelected()) { box31.setSelected(false);}
			else 					{ box31.setSelected(true); }
			if( box42.isSelected()) { box42.setSelected(false);}
			else 					{ box42.setSelected(true); }         //CHECKMARK
		}
		else if(source == box42) {
			if( box41.isSelected()) { box41.setSelected(false);}
			else 					{ box41.setSelected(true); }
			if( box32.isSelected()) { box32.setSelected(false);}
			else 					{ box32.setSelected(true); }       
			if( box43.isSelected()) { box43.setSelected(false);}
			else 					{ box43.setSelected(true); }         //CHECKMARK
		}
		else if(source == box43) {
			if( box42.isSelected()) { box42.setSelected(false);}
			else 					{ box42.setSelected(true); }
			if( box33.isSelected()) { box33.setSelected(false);}
			else 					{ box33.setSelected(true); }       
			if( box44.isSelected()) { box44.setSelected(false);}
			else 					{ box44.setSelected(true); }				//CHECKMARK
		}
		else if(source == box44) {
			if( box43.isSelected()) { box43.setSelected(false);}
			else 					{ box43.setSelected(true); }
			if( box34.isSelected()) { box34.setSelected(false);}
			else                    { box34.setSelected(true); } //CHECKMARK     //WHEN ALL BOXES HAVE AN X THROUGHJ IT THEN THE PROGRAM WILL 
		}     
		if(box11.isSelected() && box12.isSelected() && box13.isSelected() && box14.isSelected() &&
		   box21.isSelected() && box22.isSelected() && box23.isSelected() && box24.isSelected() && 
		   box31.isSelected() && box32.isSelected() && box33.isSelected() && box34.isSelected() &&
		   box41.isSelected() && box42.isSelected() && box43.isSelected() && box44.isSelected() ){
			System.out.println("YOU WIN");
		}
	}
		
		
	}    // also need to let the player know when they have won the game

public static void main(String[] args) { 
	
	LightsOut frame = new LightsOut();
	frame.setTitle("LIGHTS OUT (Check Console To See If You Have WON!)"); 
	frame.setSize(500, 300);
	frame.setVisible(true);
	frame.setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
	frame.setLocation(300, 300);
	

}

}

package ArraySorter;

import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.*;

import javax.swing.*;
import javax.swing.Timer;  


public class ArrayFrame extends JFrame {
	
	private ArrayDisplay display1; 
	private ArrayDisplay display2; 
	private int[] array1 = new int[40];   // normally 40; 
	private Random gen = new Random();		
	private int[] array2 = new int[40];   // normally 40; 
												//create two displays and fills  then need to have a button which sorts the second one
	private JButton stop; 
	private JButton reset; 
	private Timer timer; 
	private JButton playSort; 
	private JTextField bubbleSort;
	private JTextField selectionSort; 
	private boolean sorted = false; 
	
	
	public void fillArray() {
		for(int i = 0; i < array1.length; i++) {
			array1[i] = gen.nextInt(100);
			array2[i] = gen.nextInt(100);
		}
			 
	} 
	
	public void selectionSort(int[] intArray){
		int leftToSort = intArray.length;
		//int maxIndex = 0;
		boolean sorted = false; 
		if(!sorted) {
			sorted = true; 
			while(leftToSort > 0){
				int maxIndex = 0;
				for(int i=1; i < leftToSort ; i++){
					if(((Comparable)intArray[i]).compareTo(intArray[maxIndex])>0){
						maxIndex = i;
						sorted = false; 
					}
				}
				leftToSort--;
				int temp = intArray[maxIndex];
				intArray[maxIndex] =  intArray[leftToSort];
				intArray[leftToSort] = temp;
			
			}
			repaint();
			}
		}
	public void bubbleSort(int[] intArray){
		boolean sorted = false;
		int oneLessLength = intArray.length - 1;
		int temp;
		
		if(!sorted){
			sorted = true;
			for(int i =0; i < oneLessLength; i++){
				if( ((Comparable)intArray[i]).compareTo(intArray[i+1])>0 ){
					temp = intArray[i];
					intArray[i] = intArray[i+1];
					intArray[i+1] = temp;
					sorted = false;
				}
			}
		}
		repaint(); 
	}
	
	private class sortOnce implements ActionListener { 
		public void actionPerformed(ActionEvent ae) {
			bubbleSort(array1);
			selectionSort(array2);						// FIGURE OUT WHY selectionSort is sorting immediately and not showing steps
			
			//display2.selectionSort(); 
		}
	}
	private class infiniteSort implements ActionListener { 
		public void actionPerformed(ActionEvent ae) {
			timer = new Timer(500,new sortOnce());
			timer.start(); 
		}
	}
	public void clearArray() { 
		for(int i = 0; i < array1.length; i++) {
			array1[i] = gen.nextInt(100);
			array2[i] = gen.nextInt(100);
		}
	}
	private class reset implements ActionListener { 
		public void actionPerformed(ActionEvent ae) { 
			clearArray(); 
		}
	}
	public ArrayFrame() {
		super(); 
		Container ctPane = getContentPane(); 
		display1 = new ArrayDisplay(); 
		display1.setDispArray(array1);
		display2 = new ArrayDisplay(); 
		fillArray();
		display2.setDispArray(array2); 

		JPanel displayPanel = new JPanel(); 
		displayPanel.setLayout(new GridLayout(2,1));
		displayPanel.add(display1); 
		displayPanel.add(display2); 
		
		ctPane.add(displayPanel,BorderLayout.CENTER);
		
		
		JPanel bottomButtonPanel = new JPanel(); 
		
		bubbleSort = new JTextField("Bubble Sort On Top");
		selectionSort = new JTextField("Selection Sort On Bottom");
		playSort  = new JButton("Start Sorting"); 
		playSort.addActionListener(new infiniteSort());
		reset = new JButton("Reset"); 
		reset.addActionListener(new reset());
		bottomButtonPanel.add(bubbleSort);
		bottomButtonPanel.add(playSort); 
		bottomButtonPanel.add(reset);
		//bottomButtonPanel.add(stop);
		bottomButtonPanel.add(selectionSort); 
		ctPane.add(bottomButtonPanel,BorderLayout.SOUTH);
		}
	
	

	public ArrayFrame(String title) {
		this(); 
		setTitle(title); 
	}
	
	public static void main(String[] args) { 
		ArrayFrame frame = new ArrayFrame(); 
		frame.setSize(400,400);
		frame.setLocation(400,200);
		frame.setVisible(true); 
		frame.setDefaultCloseOperation(WindowConstants.DISPOSE_ON_CLOSE);
	}
	

}

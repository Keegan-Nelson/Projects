package ThreadingProject;

import java.util.Random;
import java.util.Timer;

public class runnableThread extends Thread  { // can also implement the Runnable interface 
	
	private int threadNumber; 
	public runnableThread(int threadNumber) {
		this.threadNumber = threadNumber; 
	}
	
	Random random = new Random();
	int lowBound = 500;
	int highBound = 5000;
	int result = random.nextInt(highBound-lowBound) + lowBound;
	
	// This run function is registering and unregistering the objects based on a random time between .5seconds and 5 seconds
	// CHECK IF THIS IS RIGHT 
	Queue queueObject = new Queue(); 
	@Override
	public void run() { 
		try {
			register();
			Thread.sleep((long)(Math.random()*result));     //NEED HELP MAKING THIS RANDOM BETWEEN .5 seconds(500 milli) and 5 seconds(5000 milli) 
			{queueObject.deQueue();} 
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
		public synchronized void register() {
			try {
				queueObject.enQueue(threadNumber);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
}
package threadingProject;


public class Queue {
	// I've Created an object from the GUI class that contains the getter to get the input from the textField 
	// The input being the amount of threads the user wants to create. 
	GUI threads = new GUI(); 
	
		private int SIZE = threads.getAmountOfThreads();
		private int[] items = new int[SIZE]; 
		private int front, rear; 
		private boolean busy = false; 
		// This Queue contains all the methods in order to enQueue and also deQueue (register and unregister objects from the Queue) 
		public Queue() { 
			front = -1; 
			rear = -1; 
		}
		public boolean isFull() { 
			if(front == 0 && rear == SIZE - 1) { 
				return true;
			}
			return false;
		}
		public boolean isEmpty() { 
			if(front == -1) { 
				return true; 
			}
			else { 
				return false; 
			}
		}
		// ?????????????????
		// NEED TO MESS WITH THIS CODE FOR REGISTERING THE THREADS TO THIS QUEUE 
		// SYNCHRONIZED MAKES IT SO THAT ONLY ONE THREAD CAN ADD ITSELF TO THE QUEUE AT A GIVEN TIME AND ONCE ITS DOWN IT NEEDS TO 
		// notifyAll(); 
		public synchronized void enQueue(int element) throws InterruptedException { 
			while(busy) wait(); 
			if(isFull()) { 
				System.out.print("Queue is full"); 
				System.exit(1);
			}
			else { 
					if(front == -1 ) {
						front = 0; 
					}
					rear++;
					items[rear] = element; 
					System.out.println("Insert " + element);
				}
			notifyAll(); 
		}
		//NEED TO MESS WITH THIS CODE FOR REGISTERING THE THREADS TO THIS QUEUE 
		// SYNCHRONIZED MAKES IT SO THAT ONLY ONE THREAD CAN ADD ITSELF TO THE QUEUE AT A GIVEN TIME AND ONCE ITS DOWN IT NEEDS TO 
		// notifyAll();
		public synchronized int deQueue() throws InterruptedException {
			while(busy) wait(); 
			int element = 0; 
			if(isEmpty()) { 
				System.out.println("Queue is empty");
				System.exit(1);
			}
			else {
				element = items[front];
				if(front >= rear) { 
					front = -1; 
					rear = -1; 
				}
					else { 
						front++; 
					}
			System.out.println(element + "Deleted");
			return(element);
			}
			System.out.println(element + "Deleted");
			return(element);
			//notifyAll(); // WHY THIS ISNT WORKING 
		}
		
			public void display() {
			    for (int i = 0; i < SIZE; i++) {
			        System.out.println(items[(front + i) % SIZE]);
			    }
			}
}

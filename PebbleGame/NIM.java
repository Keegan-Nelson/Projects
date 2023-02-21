package PebbleGame;



public class NIM {
	
	private double humanInput; 

	private double humanOutput;
	
	public static int randint(int i) {				 
		return 0; 									
	}
	
	public int peb = randint(42) + 9; 
	
	public double getOutputHUMAN() { 
		return humanOutput; 
	}
	
	public void sethumanInput(double input) {
		humanInput = input; 
	}
	
	
	public double humanTaker() { 
		return humanOutput = (peb - humanInput); 
	}
}

import java.util.Scanner;

public class App {
    public static void main(String[] args) throws Exception {

        try (Scanner myScanner = new Scanner (System.in)) {
            String decision;
            boolean YorN = false;
            System.out.println("Would you like to play Blackjack?");

            while(YorN) {
                decision = myScanner.nextLine();
            
                while(YorN) { 
                    System.out.println("You are now playing Blackjack");
                }
                System.exit(0);

                switch(decision)
                {
                    // Yes Cases
                    case "yes":
                    YorN = true;
                        break;
                    case "y": 
                    YorN = true; 
                        break;
            
                    // No Cases
                    case "no":
                    YorN = false;
                    case "n":
                    YorN = false;
                        break;
                    
                    
                     default:
                        //System.out.println("please enter again ");
                        boolean repeat = true;
            
                        while (repeat)
                        {
                            System.out.println("Would you like to play again?");
                            decision = myScanner.nextLine();
            
                            switch (decision)
                            {
                                // Yes Cases
                                case "yes":
                                YorN = true;
                                    repeat = false;
                                    break;
                                    case "y": 
                                YorN = true; 
                                    repeat = false;
                                    break;

                                // No Cases
                                case "no":
                                YorN = repeat = false;
                                    break;
                                default:
                                    repeat = true;
                            }
                        }
                        break;
                }

                
    }
} 
  

import java.util.Scanner;

public class App {
    public static void main(String[] args) throws Exception {
        try (Scanner myScanner = new Scanner (System.in)) {
            String decision;
            boolean YorN = true;
            
            while(YorN) {
                System.out.println("Would you like to play Blackjack?");
                System.out.println("enter another name : yes or no");
                decision = myScanner.nextLine();
            
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
                        System.out.println("please enter again ");
                        boolean repeat = true;
            
                        while (repeat)
                        {
                            System.out.println("enter another name : yes or no");
                            decision = myScanner.nextLine();
            
                            switch (decision)
                            {
                                case "yes":
                                YorN = true;
                                    repeat = false;
                                    break;
            
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
    }
}

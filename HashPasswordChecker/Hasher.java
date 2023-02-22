import java.util.ArrayList;  
import java.util.Arrays;
import java.util.List;
import java.math.BigInteger;
import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;
import java.nio.charset.StandardCharsets;
import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;
import java.util.Scanner;


public class Hasher {


    public static String encryptThisString(String input)
    {
        try {
            // getInstance() method is called with algorithm SHA-512
            MessageDigest md = MessageDigest.getInstance("SHA-512");
  
            // digest() method is called
            // to calculate message digest of the input string
            // returned as array of byte
            byte[] messageDigest = md.digest(input.getBytes());
  
            // Convert byte array into signum representation
            BigInteger no = new BigInteger(1, messageDigest);
  
            // Convert message digest into hex value
            String hashtext = no.toString(16);
  
            // Add preceding 0s to make it 32 bit
            while (hashtext.length() < 32) {
                hashtext = "0" + hashtext;
            }
            return hashtext;
        }
        // For specifying wrong message digest algorithms
        catch (NoSuchAlgorithmException e) {
            throw new RuntimeException(e);
        }
    }

    static ArrayList<String> hashedPasswords = new ArrayList<String>();

    public static void addTolist(String input) { 
		PasswordInput PS = new PasswordInput(); 
		PS.hashedPasswords.add(input);
	}


    public static void main(String[] args) {
        // TODO Auto-generated method stub
        Scanner firstScan = new Scanner(System.in); 
        System.out.println("Please Enter A Password: ");
        String passwordInput = firstScan.nextLine(); 
        encryptThisString(passwordInput); 
        System.out.println("Do you want encrypted password? ");
        Scanner secondScan = new Scanner(System.in);
        String questionAnswer = secondScan.nextLine();
        if(questionAnswer = "Yes") { 
            System.out.println("Program Ending");
        }
        System.out.println(hashedPasswords);

        //secondScan.toString(); 

        // PasswordInput.addTolist(passwordInput); 
        // 
        // System.out.println("Please Enter Previous Password To See If It Matches System: ");
        // String passwordInput2 = secondScan.nextLine(); 
        // encryptThisString(passwordInput2); 
        // compareHashes(passwordInput2); 
    }
}

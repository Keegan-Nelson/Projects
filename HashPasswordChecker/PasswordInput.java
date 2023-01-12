package hashpassword;

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
public class PasswordInput {

	static ArrayList<String> hashedPasswords = new ArrayList<String>(); 
	
	//String[] hashedPasswords = new String[10]; 
	//ArrayList<String> hashedList = new ArrayList<String>(Arrays.asList(hashedPasswords));
	//List hashedList = new ArrayList( Arrays.asList(hashedPasswords));
	//String p1 = "Hello";
	//h.add(hello);

	//ArrayList<String> hashedPasswords = new ArrayList<String>();
	//hashedPasswords.add(p1);
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner firstScan = new Scanner(System.in); 
		System.out.println("Please Enter A Password: ");
		String passwordInput = firstScan.nextLine(); 
		encryptThisString(passwordInput); 
		PasswordInput.addTolist(passwordInput); 
		Scanner secondScan = new Scanner(System.in);
		System.out.println("Please Enter Previous Password To See If It Matches System: ");
		String passwordInput2 = secondScan.nextLine(); 
		encryptThisString(passwordInput2); 
		compareHashes(passwordInput2); 
	}
	public static void addTolist(String input) { 
		PasswordInput PS = new PasswordInput(); 
		PS.hashedPasswords.add(input);
	//	String p1 = "Hello123";
		//String p2 = "Password123"; 
		//String p3 = "COMPSCI123";
		//encryptThisString(p1);
		//encryptThisString(p2);
		//encryptThisString(p3);
		//ArrayList<String> hashedPasswords = new ArrayList<String>();
		//hashedPasswords.add(p1);
		//.add(p2);
		//hashedPasswords.add(p3); 
		//System.out.println(hashedPasswords);
		
	}
	public static void compareHashes(String userEntry) { 
		PasswordInput PS = new PasswordInput(); 
		if(userEntry.equals(PS.hashedPasswords.get(0))) { //Make the arrayList a global variable so all these other methods can use it. 
			System.out.println("True");
		}
		else System.out.println("False");
	}
	public static void encryptThisString(String input)
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
  
            // return the HashText
            //return hashtext;
           // PasswordInput PS = new PasswordInput();
            //PS.addTolist(hashtext);
           // System.out.println(hashtext);
            
        }
        // For specifying wrong message digest algorithms
        catch (NoSuchAlgorithmException e) {
            throw new RuntimeException(e);
        }
    }
  
public String get_SHA_512_SecurePassword(String passwordToHash, String salt){
    String generatedPassword = null;
    try {
        MessageDigest md = MessageDigest.getInstance("SHA-512");
        md.update(salt.getBytes(StandardCharsets.UTF_8));
        byte[] bytes = md.digest(passwordToHash.getBytes(StandardCharsets.UTF_8));
        StringBuilder sb = new StringBuilder();
        for(int i=0; i< bytes.length ;i++){
            sb.append(Integer.toString((bytes[i] & 0xff) + 0x100, 16).substring(1));
        }
        generatedPassword = sb.toString();
    } catch (NoSuchAlgorithmException e) {
        e.printStackTrace();
    }
    return generatedPassword;
}

}
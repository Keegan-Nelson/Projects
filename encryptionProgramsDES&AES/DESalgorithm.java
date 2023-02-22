package des;

import java.security.InvalidKeyException;
import java.security.NoSuchAlgorithmException;

import javax.crypto.BadPaddingException;
import javax.crypto.Cipher;
import javax.crypto.IllegalBlockSizeException;
import javax.crypto.KeyGenerator;
import javax.crypto.NoSuchPaddingException;
import javax.crypto.SecretKey;

public class DESalgorithm {

	public static void main(String[] args) throws NoSuchAlgorithmException, NoSuchPaddingException, InvalidKeyException, IllegalBlockSizeException, BadPaddingException {
		// TODO Auto-generated method stub
	
		    KeyGenerator keygenerator = null;
			try {
				keygenerator = KeyGenerator.getInstance("DES");
			} catch (NoSuchAlgorithmException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		    SecretKey secretKey = keygenerator.generateKey();
		    
		    Cipher cipherText;
		    cipherText = Cipher.getInstance("DES/ECB/PKCS5Padding");
		    cipherText.init(Cipher.ENCRYPT_MODE, secretKey);

		   
		    byte[] text = "This is CSCI 240 Cyber Security class".getBytes();
		    System.out.println("Text--> " + new String(text));
		   
		   
		    byte[] encryptedText = cipherText.doFinal(text);
		    System.out.println("Encrypted Text--> " + encryptedText);
		    
		    cipherText.init(Cipher.DECRYPT_MODE, secretKey);
		    byte[] decryptedText = cipherText.doFinal(encryptedText);
		    System.out.println("Decrypted Text--> " + new String(decryptedText));

	}
}

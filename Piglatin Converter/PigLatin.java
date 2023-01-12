  package piglatin;

public class PigLatin {
	public static String convertWord(String word) { 
		
		word = word.toLowerCase();
		
		int firstvowel=-1;							// maybe want it at negative 1   (-1) 
		for(int i=0; i<word.length(); i++) {
			char letter = word.charAt(i);        // This will go through the word and then find out what the first vowel is. 									
			
			if(		letter =='a' || letter =='e' || letter =='i' || 
					letter =='o' || letter =='u'				)
				{
					firstvowel = i; 
					break;
				}
			if(letter =='y' && i!= 0) {				// this is a different set of code of the word doesnt't have a vowel like Rhythm
				firstvowel = i;
				break;
			}
		}
		
		String consonants = word.substring(0,firstvowel);
		
		String restOfWord = word.substring(firstvowel); 
		
		String Pigword = "";
		
		if(firstvowel==0) {
			Pigword = word + "-pay";
		}																// this is the part of repalcing the beginning of the word with pay or ay at the end of the word
		else {
			Pigword = restOfWord +"-"+consonants+"ay"; 
		}
		
		return Pigword; 						//this returns the translated word. within the tokenizer it will go through each token defaultly spaced out by a "space" 
		//System.out.println( firstvowel ); 	//after each word is converted it is stored and when all the words are converted it displays below the orignizal text. 
		//return null;
		
	}

	public static void main(java.lang.String[]	args) {
		//System.out.println(PigLatin.convertWord("string"));
		//System.out.println(PigLatin.convertWord("apple"));
		
	}

}

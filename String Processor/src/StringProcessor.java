import javax.swing.JOptionPane;

/**
 * 
 */

/**
 * @author Jimmy Chavada
 * Date: Oct 2020
 * Description: This class processes strings so that it keeps the letters of a string and reverses the string
 * 				and finally detects whether the string is a palindrome 
 * Method list: 
 * 				Void main (string[] args)
 * 				String reverseWord (String word) - method to reverse the letters of a string
 * 				String keepLetters (String word) - method to keep letters in string and remove other characters
 */
public class StringProcessor {
	
	/*
	 * Method to reverse the string
	 */
	public static String reverseWord (String word) {
		String reversed = ""; // declares and initialized the reversed String
		
		// loop from the end of the word to the beginning
		for (int i = word.length() - 1; i >= 0; i = i - 1) { 
			String letter = word.substring(i, i + 1); // take 1 letter at a time and add it to the reversed word
			reversed = reversed + letter; // reversed word is equal to the reversed blank with the letters
		}
		return reversed; // returns the reversed word 
	}
	
	
	/*
	 * Method to just keep the letters in the string
	 * and remove all other characters 
	 */
	public static String keepLetters(String word) {
		String lettersOnly = "";
		
		// for loop to go through the phrase or word and check if it has letters
		for (int i = 0; i < word.length(); i = i + 1) {
			char letter = word.charAt(i); // gets the letter and its ascii code
			int ascii = (int)letter;	// the ascii numbers are viable for the letters 
			
			// to check if the ascii within the uppercase or lowercase ranges for the phrase typed by user
			if ((ascii >= 65 && ascii <= 90) || (ascii >= 97 && ascii <= 122)) {
				
				lettersOnly = lettersOnly + letter; // adds letter to empty letters only 
				
			}
		}
		
		return lettersOnly; // return the letters only 
	}
	

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// Declare variable
		String phraseIn; // input phrase
		String phraseOut; // output phrase
		String letters; // letters output 
		
		//prompt for a phrase or word
		phraseIn = JOptionPane.showInputDialog(null, "Enter a phrase or a word!");
		
		// call the the method and test for the keep letters
		letters = keepLetters(phraseIn);
		
		// display letters of the phrase only 
		JOptionPane.showMessageDialog(null, "This is the phrase with letters only... " + letters);
		
		// call in the reversed function and display the reversed word or phrase.
		phraseOut = reverseWord(letters); 
		JOptionPane.showMessageDialog(null, "The reversed phrase is... " + phraseOut);

		//check if the phrase is a palindrome 
		if (letters.equalsIgnoreCase(phraseOut)) {
			JOptionPane.showMessageDialog(null, phraseIn + " is a palindrome! Cool!");
		}
		else {
			JOptionPane.showMessageDialog(null, phraseIn + " This is not a palindrome! Funky!");
		}
	}

}

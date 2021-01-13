/**
 * 
 */
package loopsGamesProject;

import java.util.Scanner;

/**
 * @author Jimmy Chavada
 * Date: oct 2020
 * Description: 
 */
public class PartC {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		String word = "";
		String reversed = ""; // declares and initialized the reversed String
		
		Scanner userPhrase = new Scanner(System.in);
		
		System.out.println("Enter a phrase:");
		word = userPhrase.nextLine();
		
		// loop from the end of the word to the beginning
		for (int i = word.length() - 1; i >= 0; i = i - 1) { 
			String letter = word.substring(i, i + 1); // take 1 letter at a time and add it to the reversed word
			reversed = reversed + letter; // reversed word is equal to the reversed blank with the letters
			System.out.println("This is the phrase reversed!\n" + reversed);
		}
		String lettersOnly = "";
		// for loop to go through the phrase or word and check if it has letters
		for (int i = 0; i < word.length(); i = i + 1) {
			char letter = word.charAt(i); // gets the letter and its ascii code
			int ascii = (int)letter;	// the ascii numbers are viable for the letters 
			
			// to check if the ascii within the uppercase or lowercase ranges for the phrase typed by user
			if ((ascii >= 65 && ascii <= 90) || (ascii >= 97 && ascii <= 122)) {
				
				lettersOnly = lettersOnly + letter; // adds letter to empty letters only
				System.out.println("This is the phrase with only letters!\n" + lettersOnly);
				
			}
		}
		if (lettersOnly.equalsIgnoreCase(reversed));
			System.out.println("This palindrome!");
		

	}

}

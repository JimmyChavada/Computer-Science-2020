import java.util.Scanner;

/**
 * 
 */

/**
 * @author Jimmy Chavada
 * Date: oct 2020
 * Description: This program takes in a user inputted word or phrase then prints back the reversed version
 * 				if it is a palindrome, it will say so. This program will also remove all special 
 * 				characters and spaces from the phrase and will give a compact phrase
 * 
 */
public class PartCBonus {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// Declare variables for the reversed word, and user input 
		String reversedWord = "";// declares and initialized the reversed String
		String userWord = "";  
		String wordNoSpecialCharacters = "";

		Scanner input1 = new Scanner(System.in);

		System.out.println("Enter a phrase:");
		userWord = input1.nextLine(); 


		// 1. REMOVE special characters and spaces from entered phrase
		for(int j = 0; j < userWord.length(); j = j + 1) {
			char removeSpecial = userWord.charAt(j); //iterate character by character
			int ascii = (int)removeSpecial;	//get the character's ascii in decimal form

			// if the character is NOT a special character, append it to a variable
			if ((ascii >= 65 && ascii <= 90) || (ascii >= 97 && ascii <= 122)) {

				wordNoSpecialCharacters = wordNoSpecialCharacters + removeSpecial;  
			}	
		}

		// 2. REVERSE the word with no special characters
		// loop from the end of the word to the beginning, iterating 1 letter at a time
		for (int i = wordNoSpecialCharacters.length() - 1; i >= 0; i = i - 1) { 
			String letter = wordNoSpecialCharacters.substring(i, i + 1); // take 1 letter at a time and add it to the reversed word
			reversedWord = reversedWord + letter; // reversed word is equal to the reversed blank with the letters			 

		}
		
		//3. CHECK to see if the reversed word is a palindrome by comparing to word with no spaces/special characters
		if (reversedWord.equalsIgnoreCase(wordNoSpecialCharacters)) {
			System.out.println("The word " + reversedWord + " is a Palindrome!\n");
		}
		else {
			System.out.println("The word " + reversedWord + " is NOT a Palindrome!\n");
		}

		// 4. PRINT DETAILS of the phrase the user may/may not want
		System.out.println("--------------------------- Explanation -------------------------------------");	
		System.out.println("The phrase you enetered is: " + userWord);
		System.out.println("The phrase with no special characters or spaces is: " + wordNoSpecialCharacters);
		System.out.println("The reversed phrase is: " + reversedWord);	
		

	}
}



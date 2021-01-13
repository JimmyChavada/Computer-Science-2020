import java.util.Scanner;

import javax.swing.JOptionPane;

/**
 * 
 */

/**
 * @author Jimmy Chavada
 * Date: oct 2020
 * Description: User enters a word or phrase and program will enter it reversed 
 */
public class PartB {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// Declare variables for the reversed word, and user input 
		String reversed = "";// declares and initialized the reversed String
		String word = "";  
		
		Scanner input1 = new Scanner(System.in);
		
		System.out.println("Enter a phrase");
		word = input1.nextLine(); 

		
		// loop from the end of the word to the beginning
		for (int i = word.length() - 1; i >= 0; i = i - 1) { 
			String letter = word.substring(i, i + 1); // take 1 letter at a time and add it to the reversed word
			reversed = reversed + letter; // reversed word is equal to the reversed blank with the letters
			
			if (word.equalsIgnoreCase(reversed)) {
				System.out.println("This is a plaindrome! Cool!");
			}
		}
		System.out.println("The reversed phrase is " + "\n" + reversed);			

	}

}

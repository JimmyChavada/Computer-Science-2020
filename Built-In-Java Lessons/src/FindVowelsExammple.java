import javax.swing.JOptionPane;

/**
 * 
 */

/**
 * @author Jimmy Chavada
 * Date: oct 2020
 * Desc.: find vowels in the string which the user entered.
 */
public class FindVowelsExammple {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// Declare variables for input, vowels and counter
		String input = "", vowels = ""; 
		int counter = 0;
		
		// prompt user for string
		input = JOptionPane.showInputDialog(null, "Enter a phrase of your choice!");
		
		//change input to lower case
		input = input.toLowerCase(); 
		
		// go through the string to find the vowels one char at a time.
		for (int i = 0; i < input.length(); i++) {
			char letter = input.charAt(i); // gets each letter of the input string 
			int ascii = (int)letter; // force letter into int to find ascii variable
			
			// check if the ascii code is for a vowell
			if (ascii == 97 || ascii == 101 || ascii == 105 || ascii == 111 || ascii == 117) {
				counter = counter + 1;  // adds one to the counter
				vowels = vowels + letter + "  ";  // adds the letter to the list of vowels
				
				
				
			}
		}
		// output the information on the vowels. 
		JOptionPane.showMessageDialog(null, "Your string has " + counter + " vowels! They are... " + vowels);
		

	}

}

import javax.swing.JOptionPane;

/**
 * 
 */

/**
 * @author Jimmy Chavada
 * Date: Sept 2020
 * Description: this program asks a user for who was the first ronald mcdonald. it allows
 * 				the user to attempt 3 times before ending.
 */
public class RonaldMcDonald {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// Declare Variables 
		String answer = "";
		int tries = 0; 
		
		// prompt user for answer 
		answer = JOptionPane.showInputDialog(null, "Who was the first Ronald McDonald? "); 
		
		// add to tries
		tries = tries + 1;
		
		// check if answer is not correct 
		while (!answer.equals("Willard Scott") && tries < 3) {
			JOptionPane.showMessageDialog(null, "Incorrect answer! Try Again!");
			answer = JOptionPane.showInputDialog(null, "Who was the first Ronald McDonald? "); 
			tries = tries + 1; // add 1 to tries
			
		}
		if (answer.equalsIgnoreCase("willard scott")) {
			JOptionPane.showMessageDialog(null, "Correct! :)");
			
		}
		else {
			JOptionPane.showMessageDialog(null, "Nice Try! The correct answer is \"Willard Scott\"");
			
		}
	}

}

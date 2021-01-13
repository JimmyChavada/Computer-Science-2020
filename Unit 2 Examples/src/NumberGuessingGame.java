  import javax.swing.JOptionPane;

/**
 * 
 */

/**
 * @author Jimmy Chavada
 * Date: Sept/2020
 * Description: This is a Number Guessing Game. The user is asked to guess a 
 * 				number from 1 to 10 and if it matches the computer guess. the user
 * 				wins. 
 */
public class NumberGuessingGame {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		int computerGuess = 0, userGuess = 0;  // Declare and initialize the user and computer guesses
		String answer = "yes";   // answer to play again 
		
	while(answer.equalsIgnoreCase("yes")) {
		// Prompt the user for their guess 
		userGuess = Integer.parseInt(JOptionPane.showInputDialog(null, "Enter a number from 1 to 10"));
		
		computerGuess = (int)(Math.random() * 10 + 1);   // set the computer guess as a random number from 1 to 10 
		
		if (userGuess == computerGuess) {
			JOptionPane.showMessageDialog(null, "Great! You won!");
		}
		else if (userGuess < computerGuess) {
			JOptionPane.showMessageDialog(null, "Too low!\n The computer guessed " 
												+ computerGuess + "\n" + "\nYou guessed "  
												+ userGuess);
			
		}
		else {
			JOptionPane.showMessageDialog(null, "Too high!\n" + "The computer guessed " 
												+ computerGuess + "\n" + "\nYou guessed " 
												+ userGuess); 
		}
		answer = JOptionPane.showInputDialog(null, "Enter \"Yes\" to play again.");
	}
        JOptionPane.showMessageDialog(null, "Thank-you for playing my game!");
}
}

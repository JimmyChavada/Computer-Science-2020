import javax.swing.JOptionPane;

/**
 * 
 */

/**
 * @author Jimmy Chavada
 * Date: Sept 2020
 * Description: create a program that asks user for username and password then allows access.
 * 				the user is allowed 5 tries, if the tries are all used then the program ends 
 * 				with special message 
 */
public class Question1Lab4 {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// Declare variables
		String userName = "";  
		String password = ""; 
	    String correctUsername = "111";
	    String correctPassword = "LAB4";
		int tries = 0;  

		// Prompt for username 
		userName = JOptionPane.showInputDialog(null, "Enter your Username: "); 

		// prompt for password 
		password = JOptionPane.showInputDialog(null, "Enter you password: ");
		tries++;
		



		while ((!userName.equals(correctUsername) && !password.equals(correctPassword)) && tries < 5) {
			tries = tries + 1;
			JOptionPane.showMessageDialog(null, "Incorrect Password or ID");
			userName = JOptionPane.showInputDialog(null, "Enter your Username: "); 
			password = JOptionPane.showInputDialog(null, "Enter you password: "); 
		}
		
		if (tries >= 5) {
			JOptionPane.showMessageDialog(null, "Too many wrong entries\n Please contact the administrator.");
		} else {
			JOptionPane.showMessageDialog(null, "Correct");
			JOptionPane.showMessageDialog(null, "Welcome to DSSS network");
		}
		
		


	}

}

import javax.swing.JOptionPane;

/**
 * 
 */

/**
 * @author Jimmy Chavada
 * Date: sept 2020
 * Description: allows the user to enter a color - red, yellow, or green and displays the word 
 * 				stop, slow down, or go respectively. The program keeps asking for a color 
 * 				until the user enters the word quit.
 */
public class StopLights {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// Declare variables
		String color = null; 
		
		do {
			// prompt user for color 
			color = JOptionPane.showInputDialog(null, "Enter red, yellow, or green. End with \"quit\"");
			
			// check which color the user has chosen and display message 
			if (color.equalsIgnoreCase("red")) {
				JOptionPane.showMessageDialog(null, "STOP!");
			}
			else if (color.equalsIgnoreCase("yellow")) {
				JOptionPane.showMessageDialog(null, "Slow-Down!");
				
			}
			else if (color.equalsIgnoreCase("green")) {
				JOptionPane.showMessageDialog(null,"GO!");
			}
			else if(color.equalsIgnoreCase("quit")) {
				JOptionPane.showMessageDialog(null, "Thank-you for playing! Goodbye");
			}
			else {
				JOptionPane.showMessageDialog(null, "Error! Please enter red, yellow or green");
			}
			
		}while (!color.equalsIgnoreCase("quit")); // end loop is user input is quit

	}

}

import javax.swing.JOptionPane;  // importing the JOptionPane class

/**
 * 
 */

/**
 * @author Jimmy Chavada
 * Date: Sept 2020
 * Description: This program displays text on dialog boxes.
 */
public class OutputExampleDialog {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// displaying some dialog boxes
		JOptionPane.showMessageDialog(null, "Welcome to Java Programming");
		JOptionPane.showMessageDialog(null, "This is a multi-line\nMessage using an escape character");
		JOptionPane.showMessageDialog(null, "This next word is in quotations \"This is in quotes\"");
		
	}

}

import javax.swing.JOptionPane;
import javax.swing.JTextArea;

/**
 * 
 */

/**
 * @author Jimmy Chavada
 * Date: oct 2020
 * Description: loads the data for hockey players and their season goals 
 */
public class HockeyData {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// declare the arrays for the data
		String playerNames[];
		int playerGoals[];
		
		// create the arrays 
		playerNames = new String [5]; 
		playerGoals = new int [5]; 
		
		// variables for the average 
		double average = 0, sum = 0; 
		
		// loop through the arrays to input the information 
		for (int i = 0; i < playerGoals.length; i++) {
			
			// prompts user for goals and names of player 
			playerNames[i] = JOptionPane.showInputDialog(null, "Enter the name for player " + (i + 1));
			playerGoals[i] = Integer.parseInt(JOptionPane.showInputDialog(null, "Enter the goals for player " + (i + 1)));
			// add the goals to the sum 
			sum = sum + playerGoals[i];  
			
			
		}
		
		// calculate the average 
		average = sum / playerNames.length; 
		
		// create an output list to add the information to be displayed
		String list = "Names\tGoals\n";  
		list = list + "=====\t=====\n";
		
		// add players information to the output list 
		for (int i = 0; i < playerNames.length; i++) { 
			list = list + playerNames[i] + "\t" + playerGoals[i] + "\n";
		}
		 
		// display the average 
		list = list + "the average goals is " + average; 
		
		// create the output area 
		JTextArea outputArea = new JTextArea(); 
		
		// add the list to the outputArea 
		outputArea.setText(list);
		
		outputArea.setTabSize(15);
		outputArea.setEditable(false);
		JOptionPane.showMessageDialog(null, outputArea); // display the list
		
		
	}

}

import javax.swing.JOptionPane;
import javax.swing.JTextArea;

/**
 * 
 */

/**
 * @author Jimmy Chavada
 * Date: oct 2020
 * Description: User will enter data for input then it will be displayed using arrays
 */
public class ExaminingArrayConcepts {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// Declar variables 
		String test[];
		int studentMark[];

		// create the array
		test = new String[5];
		studentMark = new int[5];

		// variables for average
		double average = 0, sum = 0;
		
		JOptionPane.showMessageDialog(null, "Enter the names and scores for 5 tests for your average");

		// loop to get input 
		for (int i = 0; i < studentMark.length; i++) {

			// prompt user for name of test and mark
			test[i] = JOptionPane.showInputDialog(null, "Enter the " + (i +1) + " tests name: ");
			studentMark[i] = Integer.parseInt(JOptionPane.showInputDialog(null, "Enter the mark you got for that test: "));

			// add marks to the sum
			sum = sum + studentMark[i]; 
		}

		// calculate the average 
		average = sum / test.length;

		String list = "Test\tStudent Mark\n";
		list = list + "=====\t=====\n";

		// add players information to the output list 
		for (int i = 0; i < test.length; i++) { 
			list = list + test[i] + "\t" + studentMark[i] + "\n";
		}
		
		// display the average
		list = list + "The average is: " + average + "%";
		
		JTextArea outputArea = new JTextArea(); 
		
		// add the list to the output
		outputArea.setText(list);
		
		outputArea.setTabSize(10); 
		outputArea.setEditable(false);
		JOptionPane.showMessageDialog(null, outputArea); // display the list
	}

}

import javax.swing.JOptionPane;

/**
 * 
 */

/**
 * @author Jimmy Chavada
 * Date: OCT 2020
 */
public class StudentMarks {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		
		// creates and declares the array for a value for 6  
		double marks[] = new double[6]; 
		String output = ""; // variable for output to display all arrays in single dialog box
		
		// initialize the array 
		marks[0] = 67; 
		marks[1] = 87; 
		marks[2] = 86.5; 
		marks[3] = 45.6; 
		marks[4] = 98;
		marks[5] = 100; 
		
		// for loop to display all of the array values  
		for (int i = 0; i < marks.length; i++) {
			output = output + marks[i] + "\n"; // makes output spread out
		}
		JOptionPane.showMessageDialog(null, output); // makes output in single JOPtionPane
	}

}

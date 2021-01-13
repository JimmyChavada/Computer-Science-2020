import java.util.Scanner;

/**
 * 
 */

/**
 * @author Jimmy Chavada
 * Date: Sept 2020
 * Description: User enters a mark from 0-100 and programs converts percentage into grade (levelR - level4)
 */
public class MarkConversionLab3 {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// Declare Variables 
		int mark = 0; 
		String level;
		
		// setup input for mark
		Scanner inputMark = new Scanner(System.in);
		
		// prompt for mark
		System.out.println("Enter the percentage mark from 0-100:");
		
		// get mark 
		mark = inputMark.nextInt();
		 
		if (mark > 100 || mark < 0) {
			System.out.println("Error enter a value from 0-100");
		}
		else if (mark < 50) {
			System.out.println("Your level is \"Level R\"");
		}
		else if (mark >= 50 && mark < 60) {
			System.out.println("Your level is \"Level 1\"");
		}
		else if (mark >= 60 && mark < 70) {
			System.out.println("Your level is \"Level 2\"");
		}
		else if (mark >= 70 && mark < 80) {
			System.out.println("Your level is \"Level 3\"");
	    }	
		else {
			System.out.println("Your level is \"Level 4\"");
		}
	}
		
}


import java.util.Scanner;

/**
 * 
 */

/**
 * @author Jimmy Chavada
 * Date: sept 2020
 * Description: create a program that asks the user to type any name of a classmate 
 * 				then ends when thats all is typed.
 */
public class Question4Lab4 {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// Declare variables
		String studentsName = ""; 
		int counter = 0; 
		
		//get name
		Scanner inputName = new Scanner(System.in);
		
		// explain the program concept
		System.out.println("Enter the names of the students then type \"THAT'S ALL\" when you are done");
		
		// prompt for name and get name
		System.out.println("Enter the names of the students");
		studentsName = inputName.nextLine();
		
		// loop that asks user for input as long as input is not THAT'S ALL
		while (!studentsName.equals("THAT'S ALL")) {
			counter = counter + 1;
			System.out.println("Enter the names of the students");
			studentsName = inputName.nextLine();
		}
		// Print the number of students in class
		System.out.println("There are " + counter + " student(s) in this class" );
		
	}

}

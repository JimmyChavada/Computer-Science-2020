import java.util.Scanner;

/**
 * 
 */

/**
 * @author Jimmy Chavada
 * Date: Sept/2020
 * Description: This program will display the happy birthday song with a series of system.out.println and system.out.print commands
 */
public class Lab_2_Question_1 {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// Declare variable for name 
		String Name; 
		
		// set up input for the name 
		Scanner input = new Scanner(System.in);
		
		// prompt user for name 
		System.out.println("Enter Your Name");
		
		// get the user's name 
		Name = input.nextLine(); 
		
		// display results 
		System.out.println("Hello " + Name + ", Happy Birthday!!!");
		
		// song 
		System.out.println("Happy Birthday to you!\nHappy Brithday to you!\n" + "Happy Birthday Dear " + Name + "!" + " Happy Birthday to you!");
		

	}

}

import java.util.Scanner;

/**
 * 
 */

/**
 * @author Jimmy Chavada
 * Date: Sept 2020
 * Description: This program allows the user to play a game of rock paper scissors with the computer
 */
public class Question3Lab3 {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// Declare Variables
		String userChoice;                         
		String computerChoice = null;
		int computerInt; 
		boolean playAgain; 

		//-----------------------------------------input Setup------------------------------------------------------

		// setup input for user choice 
		Scanner inputUser = new Scanner(System.in); 

		// Welcome introduction and game explanation 
		System.out.println("Welcome to Rock Paper Scissors! \n"
				+ "Enter a move from the following:\n"
				+ "R - Rock\n"
				+ "P - Paper\n"
				+ "S - Scissors");

		//-----------------------------------------computer math-----------------------------------------------------
		// Computer randomizer
		computerInt = (int) (Math.random()*3 +1); 


		// Setup computer choice variables for options of computer choice 
		if (computerInt == 1) {
			computerChoice = "R";
		}
		else if (computerInt == 2) {
			computerChoice = "P";
		}
		else if (computerInt == 3) {
			computerChoice = "S"; 
		}

		//------------------------------------------user choice and outcome------------------------------------------		
		// prompt user for choice 
		System.out.println("Enter your choice:");
		userChoice = inputUser.nextLine();                // get user choice
		
		// see who wins 
		if (userChoice.equals(computerChoice)) {
			System.out.println("Computer chose: " + computerChoice);
			System.out.println("It's a Tie!");            // if user and computer choice are same show different outcome 
		}
		else if (userChoice.equalsIgnoreCase("R")) {
			System.out.println(computerChoice);
			if (computerChoice.equals("P")) {
				System.out.println("Computer chose Paper!");
				System.out.println("You lost!");}
			if (computerChoice.equals("S")) {
				System.out.println("Computer chose Scissors");
				System.out.println("Great! You won!");
			}
			// Check and outcome if user choice is paper
		}else if (userChoice.equalsIgnoreCase("P")) {
			System.out.println(computerChoice);
			if (computerChoice.equals("S")) {
				System.out.println("Computer chose Scissors!");
				System.out.println("You lost!");}
			if (computerChoice.equals("R")) {
				System.out.println("Computer chose Rock");
				System.out.println("Great! You won!");
			}
			// Check and print outcome if user choice is scissors
		}else if (userChoice.equalsIgnoreCase("S")) {
			System.out.println(computerChoice);
			if (computerChoice.equals("R")) {
				System.out.println("Computer chose Rock!");
				System.out.println("You lost!");}
			if (computerChoice.equals("P")) {
				System.out.println("Computer chose Paper");
				System.out.println("Great! You won!");
			}
		}else {
			System.out.println("Invalid Option!");
			System.out.println("Enter your choice: ");
			userChoice = inputUser.nextLine(); 
		}
	}
}
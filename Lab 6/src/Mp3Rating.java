import javax.swing.JOptionPane;

/**
 * 
 */

/**
 * @author Jimmy  Chavada
 * Date: Oct 2020
 * Description: 
 * Method List:
 * 				void main (String[] args) - main method
 * 				void displaySignature() - method to display signature
 * 				double computeMP3Rating(int song, int encoding) - method to calculate rating based on 2 ints 
 * 
 */
public class Mp3Rating {


	/*
	 * Method to display signature 
	 * 
	 */
	public static void displaySignature () { 
		JOptionPane.showMessageDialog(null,"*******************************************\n"
				+"ANOTHER WONDERFUL APPLICATION   \n"
				+"                                \n"
				+"               By: Jimmy Chavada         \n"
				+"*******************************************");
	}

	/*
	 * Method that calculates the rating based on two integers
	 * 
	 */

	public static double computeMP3Rating (int song, int encoding) {
		int rating;
		return (rating = song + encoding)/ 2.0;
	}

	/*
	 * Method to check if integer is within range 
	 */
	public static int checkInteger ( int userInput, int min, int max) {
		while (userInput > max || userInput < min) {
//		JOptionPane.showMessageDialog(null, "Error! Enter a value from 1-10"); //dialog error - ok 
		userInput = IO.readInt("Error! Enter a value from 1-10 ONLY");
		}
		System.out.println("exiting the while loop");
		return userInput;
	}


	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// Call signature 
		displaySignature(); 

		// prompt for name of song 
		String songName;
		songName = IO.readString("Enter the name of the song");

		// prompts for rating of quality and checks if integer is less than 0 or greater than 10 
		int userRatingSong = 0, userRatingQuality = 0; 
		userRatingSong = IO.readInt("Enter your rating for the song " + songName  + " from 1-10: ");
		userRatingSong = checkInteger(userRatingSong,0, 10);
		
		// prompts for rating of quality and checks if integer is less than 0 or greater than 10
		userRatingQuality = IO.readInt("Enter your rating for the quality of the song " + songName + " from 1-10");
		userRatingQuality = checkInteger(userRatingQuality, 0, 10);	
		
		
		// display result of both inputted values calculated
		double result = computeMP3Rating(userRatingSong, userRatingQuality);
		IO.display("The overall rating for this song is: " + result);

		// call signature again 
		displaySignature(); 
	}

}

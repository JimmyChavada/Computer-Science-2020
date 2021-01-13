import javax.swing.JOptionPane;

/**
 * 
 */

/**
 * @author Jimmy Chavada
 * Date: oct 2020
 */
public class StringClassFunctionsExample {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		//Declare Variables for input
		String text = "Computer Science is a lot of fun!";
		
		
//		text = JOptionPane.showInputDialog(null, "Input String");
		
		//variable for output and length
		String output;
		int len; 
		
		// returns length of string count of characters including space
		len = text.length();
		System.out.println(len);
		
		// return output text in upper case
		output = text.toUpperCase(); 
		System.out.println(output);
		
		// returns output text in lower case
		output = text.toLowerCase();
		System.out.println(output);
		
		// prints 0 to 4 characters in string (index is 0 based)
		output = text.substring(0, 4);
		System.out.println(output);
		
		// rather than using index use len variable subtract number from chars
		output = text.substring(len - 4); 
		System.out.println(output);
		
		// print characters 
		output = text.substring(9, 16);
		System.out.println(output);
		
		// cut in half and print reversed 
		String firstHalf = text.substring(0, len / 2); 
		String secondHalf = text.substring(len / 2); 
		System.out.println(secondHalf + "  " + firstHalf);
		
		// replace all spaces with nothing
		System.out.println(text.replaceAll(" ", ""));
		
		// works with askey words aswell (like c++)
		char letter = 550;
		
		// takes first letter into char variable (isolate one letter)
//		letter = text.charAt(0);
		System.out.println(letter);
		
		int counter = 0; 
		
		// takes letter at i value which is 0 out 
		for (int i = 0; i < text.length(); i++) {
			letter = text.charAt(i);
			
			//char can use == 
			// find out how many i's the string has
			if (letter == 'i') {
				counter = counter + 1; 
			}
		}
		System.out.println("The string " + text + " has " + counter + " i's");
		
		
		
		
		
		
		
	}

}

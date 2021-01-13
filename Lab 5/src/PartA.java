/**
 * 
 */

/**
 * @author Jimmy Chavada
 * Date: oct 2020
 * Description: This program takes a phrase "I'm too cool for this stuff, Mr.Campos!" and 
 * displays it with various String Functions 
 * 
 */
public class PartA {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// Declare variables for phrase and length 
		String phrase = ("I'm too cool for this stuff, Mr.Campos!"); 
		int len = 0; 
		String output, letterc = "";
		int counterc = 0; 
		
		System.out.println("Here are the amount of characters in the phrase:");
		len = phrase.length();
		System.out.println(len + "\n");
		
		// display quarter of the phrase. 
		System.out.println("Here is a quarter of the phrase:");
		String quarter = phrase.substring(0, len / 4 ); 
		System.out.println(quarter + "\n");
		
		// display last 2 characters of the phrase
		System.out.println("Here are the phrases last 2 characters:");
		output = phrase.substring(len - 2);
		System.out.println(output + "\n");
		
		// display the first 7 characters of the phrase 
		System.out.println("Here are the first 7 characters in the phrase (including spaces):");
		output = phrase.substring(0, 8);
		System.out.println(output + "\n");
		
		// display the phrase in lower case
		System.out.println("Here is the phrase in lower case:");
		output = phrase.toLowerCase();
		System.out.println(output + "\n");
		
		// display the position of the first 'c' in the phrase
		System.out.println("Here is where the first \"c\" is located");
		
		for (int i = 0; i < phrase.length(); i++) {
			char letter = phrase.charAt(i);  
			int ascii = (int)letter; 
			
			// check if the ascii code is c
			if (ascii == 99) {
				counterc = counterc + 1;  // adds one to the counter
				letterc = letterc + letter + "  ";  
			}
		}
		System.out.println("here is first c.. " + letterc);
		System.out.println("and it is the 8th character\n");
		
		
		
		// display position of the second t in phrase 
		
		// display all letter 'o' replaced with 'i'
		System.out.println("Here is the phrase with all the \"o's\" replaced with the letter \"i\"");
		System.out.println(phrase.replaceAll("o", "i"));
		System.out.println("\n");
		
		
		// display how many f's are in the phrase 
		char letter = 0;
		int counter = 0;  
		for (int i = 0; i < phrase.length(); i++) {
			letter = phrase.charAt(i);
			if (letter == 'f') {
				counter = counter + 1; 
			}
		}
		System.out.println("The phrase " + phrase + " has " + counter + " f's !");
		
		
		

	}

}

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;
import javax.swing.JOptionPane;
import javax.swing.JTextArea;

/**
 * 
 */

/**
 * @author Jimmy Chavada
 * Date: oct 2020
 * Description: loads the data for hockey players from a text file and then 
 * 				Writes more information into another file 
 * 				The program searches for the name and displays the related information
 * 				The program sorts the player goals in ascending order 
 * 
 * Method List: 
 * 				public static void main (String args)
 * 				public static int findName (String nameArray[], String searchKey)
 * 
 */
public class HockeyDataFileSearchAndSort {

	/*
	 * Method to search for a player name
	 * a linear search method 
	 */
	public static int findName (String nameArray[], String searchKey) {
		// looping through my array 
		for (int i = 0; i < nameArray.length; i++) {
			// check if the searchKey is equal to the nameArray at i 
			if (nameArray[i].equalsIgnoreCase(searchKey)) {
				return i; // returns the location of the searchKey
			}
		}


		return -1; // search key not found

	}

	/**
	 * @param args
	 */
	public static void main(String[] args) throws IOException {
		// declare the arrays for the data
		String playerNames[];
		int playerGoals[];

		// create the arrays 
		playerNames = new String [5]; 
		playerGoals = new int [5]; 

		// variables for the average 
		double average = 0, sum = 0; 

		// open the file to read 
		FileReader fileR = new FileReader("Hockey.txt");
		BufferedReader input = new BufferedReader(fileR); 

		// loop through the arrays to input the information 
		for (int i = 0; i < playerGoals.length; i++) {

			// read goals and names of player from the file 
			playerNames[i] = input.readLine();                  // reads the first line 
			playerGoals[i] = Integer.parseInt(input.readLine());// reads the second line (int)
			// add the goals to the sum 
			sum = sum + playerGoals[i];  		
		}
		fileR.close(); // closes the link to the file 

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

		outputArea.setTabSize(14);
		outputArea.setEditable(false);
		JOptionPane.showMessageDialog(null, outputArea); // display the list

		// open a new file to write to 
		FileWriter fileW = new FileWriter("HockeyFormatted.txt");
		PrintWriter output = new PrintWriter (fileW); 

		// loop to write each item to the file 
		for (int i = 0; i < playerGoals.length; i++) {
			output.println("Name: " + playerNames[i] + " \tGoals: " + playerGoals[i]); 
		}
		output.println("The average goals is: " + average); 

		fileW.close(); // closes the link to the file 

		JOptionPane.showMessageDialog(null, "HockeyFormatted.txt has been saved!");

		// search for a name to be found
		String nameToFind = JOptionPane.showInputDialog(null, "Enter the name you want to find: ");

		// call the findName method to search 
		int location = findName(playerNames, nameToFind);

		// check if the name is found 
		if (location < 0) {
			JOptionPane.showMessageDialog(null, nameToFind + " not found!");
		}
		else {
			JOptionPane.showMessageDialog(null, nameToFind + " has " + playerGoals[location] + " goals!");
		}

		// sort the goals array in ascending order (lowest to highest)

		for (int i = 0; i < playerGoals.length; i++) {
			for (int j = 0; j < playerGoals.length - 1; j++) {
				if (playerGoals[j] > playerGoals[j + 1]) {
					//swap the elements for the goals
					int tempGoals; 
					tempGoals = playerGoals[j];
					playerGoals[j] = playerGoals[j + 1];
					playerGoals[j + 1] = tempGoals;
					
					//swap the elements for the names 
					String tempNames; 
					tempNames = playerNames[j];
					playerNames[j] = playerNames[j + 1];
					playerNames[j + 1] = tempNames; 
				}
			}
		}

		// display the arrays again
		// create an output list to add the information to be displayed
		list = "Names\tGoals\n";  
		list = list + "=====\t=====\n";

		// add players information to the output list 
		for (int i = 0; i < playerNames.length; i++) { 
			list = list + playerNames[i] + "\t" + playerGoals[i] + "\n";
		}

		// display the average 
		list = list + "the average goals is " + average; 

		// add the list to the outputArea 
		outputArea.setText(list);

		outputArea.setTabSize(14);
		outputArea.setEditable(false);
		JOptionPane.showMessageDialog(null, outputArea); // display the list
	}

}

import java.awt.Color;
import java.awt.Font;
import java.io.BufferedReader;
import java.io.FileNotFoundException;
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
 * Description: User will enter data for input then it will be displayed using arrays
 */
public class SearchingAndSorting {
	
	
	/*
	 * Method to search for a test name 
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
	
	/*
	 * method to display j text area
	 */
	public static void displayJTextArea(String test[], int studentMark[], double average, double classAverage[]) {
	String list = "Test\tStudent Mark\tClass Average\n";
	list = list + "=====\t=====\t=====\n";

	// add players information to the output list 
	for (int i = 0; i < test.length; i++) { 
		list = list + test[i] + "\t" + studentMark[i] + "%" + "\t" + classAverage[i] + "%" + "\n";
	}
	
	// display the average
	list = list + "The average is: " + average + "%";
	
	JTextArea outputArea = new JTextArea(); 
	Font font = new Font("Segoe Script", Font.BOLD, 20);
    outputArea.setFont(font);
    outputArea.setForeground(Color.BLUE);
	
	// add the list to the output
	outputArea.setText(list);
	
	outputArea.setTabSize(10); 
	outputArea.setEditable(false);
	JOptionPane.showMessageDialog(null, outputArea); // display the list
	

	}

	/**
	 * @param args
	 */
	public static void main(String[] args) throws IOException {
//------------------------------Declare variables---------------------------------------------------------- 
		String test[];
		int studentMark[];
		double[] classAverage; 

		// variables for average
		double average = 0, sum = 0;

//------------------------------------Create and open files------------------------------------------------
		// try for errors
		try {
		// open a file to read it
		FileReader fileR = new FileReader("TestFile.txt");
		BufferedReader input = new BufferedReader(fileR); 
		// Separate file for the class average array
		FileReader fileClassAverage = new FileReader("ClassAverage.txt");
		BufferedReader inputclass = new BufferedReader(fileClassAverage);

//-------------------------------------------assign input for variables and read the files-------------------------------------
		int fileSize = Integer.parseInt(input.readLine()); // an integer to set the file size 

		// create the array
		test = new String[fileSize];
		studentMark = new int[fileSize];
		classAverage = new double[fileSize]; 
		
		// loop to get input 
		for (int i = 0; i < studentMark.length; i++) {

			// read the files and assign the input 
			test[i] = input.readLine(); 
			studentMark[i] = Integer.parseInt(input.readLine());
			classAverage[i] = Double.parseDouble(inputclass.readLine());
			// add marks to the sum
			sum = sum + studentMark[i]; 
			
		}
		fileR.close();  // close the files
		fileClassAverage.close(); 
		
//--------------------------------------------------calculate average and display------------------------------------------
		// calculate the average 
		average = sum / test.length;

		displayJTextArea(test, studentMark, average, classAverage); // call method to display the JTextArea
	
//---------------------------------------------------create output file-----------------------------------------------------
		// open a new file to write to 
		FileWriter fileW = new FileWriter("TestFileOutput.txt");
		PrintWriter output = new PrintWriter (fileW); 

//-------------------------------------------------loop to create output file---------------------------------------------
		// loop to write each item to the file 
		for (int i = 0; i < studentMark.length; i++) {
			output.println("Test: " + test[i] + " \t\t Test Score: " + studentMark[i] + "%"+ "\t\t Class Average: " + classAverage[i] + "%"); 
			
		}
		output.println("The average is: " + average + "%");  // output the average onto the JTextArea
		 
		fileW.close(); // closes the link to the file 
		fileClassAverage.close(); 
	
		JOptionPane.showMessageDialog(null, "TestFileOutput.txt has been saved!");
		
//------------------------------------------------search for name program----------------------------------------------------		
		// search for a name to be found
		String nameToFind = JOptionPane.showInputDialog(null, "Enter the name you want to find: ");

		// call the findName method to search 
		int location = findName(test, nameToFind);

		// check if the name is found 
		if (location < 0) {
			JOptionPane.showMessageDialog(null, nameToFind + " not found!");
		}
		else {
			JOptionPane.showMessageDialog(null, nameToFind + " you got a " + studentMark[location] + "% mark. " + "The class average is " + classAverage[location] + "%");
		}
		
//-----------------------------------------------sort the values in the files-----------------------------------------------
		
		// sort the goals array in ascending order (lowest to highest)

		for (int i = 0; i < studentMark.length; i++) {
			for (int j = 0; j < studentMark.length - 1; j++) {
				if (studentMark[j] < studentMark[j + 1]) {	
					
					// swap for the marks
					int tempMarks; 
					tempMarks = studentMark[j];
					studentMark[j] = studentMark[j + 1];
					studentMark[j + 1] = tempMarks;
					
					//swap the elements for the names 
					String tempTests;
					tempTests = test[j];
					test[j] = test[j + 1];
					test[j + 1] = tempTests; 
					
					//swap elements for the class average 
					double tempAverage;
					tempAverage = classAverage[j];
					classAverage[j] = classAverage[j + 1];
					classAverage[j + 1] = tempAverage; 

				}
			}
		}

		// display the arrays again
		// create an output list to add the information to be displayed
		displayJTextArea(test, studentMark, average, classAverage); 
		
//----------------------------------------------catch errors-----------------------------------------------------
		}
		catch (NumberFormatException error) {
			JOptionPane.showMessageDialog(null, "File is corrupted!");
		}
		catch (FileNotFoundException error) {
			JOptionPane.showMessageDialog(null, "File name is not found or spelt incorrect!");
		}
	}


}
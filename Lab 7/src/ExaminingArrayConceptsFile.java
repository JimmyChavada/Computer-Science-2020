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
 * Description: User will enter data for input then it will be displayed using arrays
 */
public class ExaminingArrayConceptsFile {

	
	/*
	 * method to display j text area
	 */
	public static void displayJTextArea(String test[], int studentMark[], double average) {
	String list = "Test\tStudent Mark\n";
	list = list + "=====\t=====\n";

	// add players information to the output list 
	for (int i = 0; i < test.length; i++) { 
		list = list + test[i] + "\t" + studentMark[i] + "%" + "\n";
	}
	
	// display the average
	list = list + "The average is: " + average + "%";
	
	JTextArea outputArea = new JTextArea(); 
	
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
		// Declar variables 
		String test[];
		int studentMark[];

		// create the array
		test = new String[5];
		studentMark = new int[5];
		
		// variables for average
		double average = 0, sum = 0;
		
		// open a file to read it
		FileReader fileR = new FileReader("Array.txt");
		BufferedReader input = new BufferedReader(fileR); 
		

		// loop to get input 
		for (int i = 0; i < studentMark.length; i++) {

			// prompt user for name of test and mark
			test[i] = input.readLine(); 
			studentMark[i] = Integer.parseInt(input.readLine());
			// add marks to the sum
			sum = sum + studentMark[i]; 
		}
		fileR.close(); 

		// calculate the average 
		average = sum / test.length;

		displayJTextArea(test, studentMark, average); 
		
		// open a new file to write to 
		FileWriter fileW = new FileWriter("OutputFile.txt");
		PrintWriter output = new PrintWriter (fileW); 
		
		// loop to write each item to the file 
		for (int i = 0; i < studentMark.length; i++) {
			output.println("Test: " + test[i] + " \tTest Score: " + studentMark[i] + "%"); 
		}
		output.println("The average is: " + average + "%"); 
		 
		fileW.close(); // closes the link to the file 
		
		JOptionPane.showMessageDialog(null, "outputFile.txt has been saved!");
	}

}

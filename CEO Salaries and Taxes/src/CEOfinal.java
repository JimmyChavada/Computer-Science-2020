import java.io.BufferedReader;
import java.io.BufferedWriter;
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
 * Date: Nov/10/2020
 * Description: This program allows the user to enter a file name with ceos their salaries, company name, and tax, the program will calculate the tax 
 * 				and display it in a JText area. 
 * Method List:
 * 				static int findName (String nameArray[], String searchKey) - find name of CEO
 * 				static double calculateTax (double salary, double tax) - calculate the tax
 * 				static void displayJTextArea (String ceoName[], String companyName[], double salary[], double taxOwed[]) - display j text area
 * 				static void main(String[] args) - main method
 *
 */
public class CEOfinal {

//-----------------------------------------------------Method to find name-----------------------------------------------
	/*
	 * Method to search for a CEO name
	 * in a linear search method
	 */
	public static int findName (String nameArray[], String searchKey) {
		// looping through the array to find certain name
		for (int i = 0; i < nameArray.length; i++) {
			// check if the searchKey is equal to the nameArray at i
			if (nameArray[i].equalsIgnoreCase(searchKey)) {
				return i; // returns the location of the searchKey
			}
		}
		return -1; // search key not found

	}
//-----------------------------------------------Method to Calculate Tax-------------------------------------------------
	/*
	 * Method to calculate percentage
	 */
	public static double calculateTax (double salary) {
		double taxOwed; // create variable for tax owed
		double tax = 35; // initialize tax variable to 35
		taxOwed = salary * tax/100; // calculate the tax 
		return taxOwed; // return the final tax owed for the salary 
	}
//---------------------------------------------Method to display JTextArea-----------------------------------------------
	/*
	 * Method to display the JTextArea
	 */
	public static void displayJTextArea (String ceoName[], String companyName[], double salary[], double taxOwed[]) {
		String list = "Name\tCompany Name\tSalary\tTax Owed\n"; // create string for the list titles
		list = list + "=====\t=====\t=====\t=====\n";   // add the list plus the underlines

		// add ceo information to the output list 
		for (int i = 0; i < ceoName.length; i++) {
			list = list + ceoName[i] + "\t" + companyName[i] + "\t" + "$" + salary[i] + "\t" + "$" + taxOwed[i] +  "\n";
		}

		JTextArea outputArea = new JTextArea(10,40);  // create the output text

		// add the list to the output
		outputArea.setText(list);

		outputArea.setTabSize(20);  // tab size for even spacing
		outputArea.setEditable(false); // set so it cant be edited
		JOptionPane.showMessageDialog(null, outputArea); // display the list
	}
	/**
	 * @param args
	 */
	public static void main(String[] args) throws IOException {
//-----------------------------------------------Declare Variables----------------------------------------------------------------
		// declare appropriate variables for the 4 arrays 
		String ceoName[];
		String companyName[];
		double salary[];
		double taxOwed[];

//-----------------------------------------------Create and open file-------------------------------------------------------------
		// try for errors
		try {
			// open a file to read it
			String userFile; // string for the users file input
			userFile = JOptionPane.showInputDialog(null, "Enter a file name with the ceo data"); // create text box with input prompt for file name
			FileReader fileR = new FileReader(userFile); // open the name of the file typed by the user
			BufferedReader input = new BufferedReader(fileR);

//-----------------------------------Assign input for variables and read from files-----------------------------------------------
			int fileSize = Integer.parseInt(input.readLine()); // an integer to set the file size set to 6
			
			// create the array and give it amount of index
			ceoName = new String[fileSize];
			companyName = new String[fileSize];
			salary = new double[fileSize];
			taxOwed = new double[fileSize];

			// loop to get input
			for (int i = 0; i < ceoName.length; i++) {

				// read the files and assign the input
				ceoName[i] = input.readLine();
				companyName[i] = input.readLine();
				salary[i] = Double.parseDouble(input.readLine());
				taxOwed[i] = calculateTax(salary[i]);

			}
			fileR.close();  // close the files

//--------------------------------------------------display-----------------------------------------------------------------------
			// call the method to display all the information
				displayJTextArea(ceoName, companyName, salary, taxOwed);
			
//--------------------------------------------Create output file-------------------------------------------------------------------
			// open a new file to write to
			FileWriter fileW = new FileWriter("ceoFileOutput.txt");
			PrintWriter output = new PrintWriter (fileW);

			//open new file to write highest salary over 4000000 dollars
			FileWriter fileH = new FileWriter("HIGHSALARY.txt");
			PrintWriter outputHighest = new PrintWriter (fileH);

			// open new file to write lowest salary under 4000000 dollars
			FileWriter fileL = new FileWriter("LOWSALARY.txt");
			PrintWriter outputLowest = new PrintWriter (fileL);

//---------------------------------------------Loop to create output file-----------------------------------------------------------
			// loop through the 3 files and sort information accordingly
			for (int i = 0; i < ceoName.length; i++) {
				output.println("Ceo Name: " + ceoName[i] + "\t\t" + "Company Name: " + companyName[i] + "\t\t\t" + "Salary: " + salary[i] +
						"$" + "\t\t\t" + "Tax Owed: " + taxOwed[i] + "$");
				// display the people with the high salaries
				if (salary[i] > 4000000) {
					outputHighest.println("Ceo Name: " + ceoName[i] + "\t\t" + "Company Name: " + companyName[i] + "\t\t\t" + "Salary: " + salary[i] +
							"$" + "\t\t\t" + "Tax Owed: " + taxOwed[i] + "$");
				}
				//display the people with the low salaries
				else if (salary[i] < 4000000) {
					outputLowest.println("Ceo Name: " + ceoName[i] + "\t\t" + "Company Name: " + companyName[i] + "\t\t\t" + "Salary: " + salary[i] +
 							"$" + "\t\t\t" + "Tax Owed: " + taxOwed[i] + "$");
				}
			}
			fileH.close();  // close all files after this loops
			fileL.close();  
			fileW.close();

			// display message confirming the files have been saved 
			JOptionPane.showMessageDialog(null, "ceoFileOutput.txt has been saved. \n HIGHSALARY.txt has been saved. \n LOWSALARY.txt has been saved.");


//------------------------------------------Search for the name---------------------------------------------------------------------
			//search for a name to be found
			String nameToFind = JOptionPane.showInputDialog(null, "Enter the name you want to find: ");
			
			
			// call the findName method to search
			int locationToFindName = findName(ceoName, nameToFind);

			// check if the name is found if found then display the name salary and tax and ask again if wrong
				while (locationToFindName < 0) {
					JOptionPane.showMessageDialog(null, nameToFind + " not found!"); // error msg if name is wrong
					nameToFind = JOptionPane.showInputDialog(null, "Error! Enter the name you want to find: "); // prompt for name again
					locationToFindName = findName(ceoName, nameToFind); // find location of name and name to find
				}
				//display the name company salary and tax of specified person 
				JOptionPane.showMessageDialog(null, nameToFind + " works for, " + companyName[locationToFindName] + " They have a salary of $"
												+ salary[locationToFindName] + ", and owes $" + taxOwed[locationToFindName] + " to tax.");
			
			
//-----------------------------------------------------Change Salary-----------------------------------------------------------------
			
			String quit = null; // create string to satisfy the buttons requirements 

			// prompt for answer if user wants to change salary with buttons 
			String[] options = {"Yes", "No"}; // add options 

			int changeSalary = JOptionPane.showOptionDialog(null, "Would you like to change a CEO's Salary?",   // prompt for user choice with different paths for buttons 
					quit, JOptionPane.DEFAULT_OPTION, JOptionPane.INFORMATION_MESSAGE, null, options, options[0]);  
			
			// if the button "yes" is chosen:
			if (changeSalary == 0) {
				// enter the name if user chooses yes to change the salary 
				String name = JOptionPane.showInputDialog(null, "Enter the CEO's name");
				// declare location 
				int locationToChangeName = findName(ceoName, name); 

				// while location is less than 0 then the name is invalid 
					while (locationToChangeName < 0) {
						JOptionPane.showMessageDialog(null, name + " not found!");  // error message if name is wrong
						name = JOptionPane.showInputDialog(null, "Error! Enter the CEO's name"); // prompt for name again
						// find location 
						locationToChangeName = findName(ceoName, name); 
					}
					// declare and prompt for new salary
					double newSalary = Double.parseDouble(JOptionPane.showInputDialog(null, name + " Has a salary of $" + salary[locationToChangeName] + " Enter the new salary.")); // prompt for salary if name is correct 
					
					// while the salary is less that 0 prompt for salary again 
					while(newSalary < 0 ) {
						newSalary = Double.parseDouble(JOptionPane.showInputDialog(null, "Error! Enter the new salary again."));
					}
					// set locations for new salary and tax
					salary[locationToChangeName] = newSalary;  
					taxOwed[locationToChangeName] = calculateTax(newSalary); 
					
					// declare and ask user for file for new output
					String newFile = JOptionPane.showInputDialog(null, "Which OUTPUT file would you like to save the new data into?"); 
					JOptionPane.showMessageDialog(null, "Files have been saved.");
				
					// open the file to write in 
					FileWriter fw = new FileWriter(newFile, false); // open the file
					BufferedWriter bw = new BufferedWriter(fw); // write to file
					
					// loop to write down all the new information alongside the original CEO's 
					bw.write(fileSize);
					for (int i = 0; i < salary.length; i++) {
						bw.write("\n" + ceoName[i] + companyName[i]  + salary[i]  + taxOwed[i]);
						bw.newLine();
					}
					bw.close(); // close the file
				
			}
			// if the button "no" is chosen continue and show sorted table  
			else if (changeSalary == 1) {
			
			}
	
//--------------------------------------------------Sort the values in the file--------------------------------------------------------
			
			for (int i = 0; i < salary.length; i++) {
				for (int j = 0; j < salary.length - 1; j++) {
					if (salary[j] > salary[j + 1]) {

						// swap for the salary
						double tempSalary;
						tempSalary = salary[j];
						salary[j] = salary[j + 1];
						salary[j + 1] = tempSalary;

						//swap the elements for the names
						String tempceoNames;
						tempceoNames = ceoName[j];
						ceoName[j] = ceoName[j + 1];
						ceoName[j + 1] = tempceoNames;

						//swap elements for the ceo company name
						String tempCompany;
						tempCompany = companyName[j];
						companyName[j] = companyName[j + 1];
						companyName[j + 1] = tempCompany;

						// swap elements for the tax 
						double temptax;
						temptax = taxOwed[j];
						taxOwed[j] = taxOwed[j + 1];
						taxOwed[j + 1] = temptax;

					}
				}
			}
			JOptionPane.showMessageDialog(null, "CEO data sorted by acsedning order for SALARY");

			//display the JText area again
			displayJTextArea(ceoName, companyName, salary, taxOwed);
			
//------------------------------------------------sort alphabetically---------------------------------------------------------
			
			for (int i = 0; i < salary.length; i++) {
		        for (int j = i + 1; j < salary.length; j++) {
		        	if (ceoName[i].compareTo(ceoName[j]) > 0) {
		        		String temp = ceoName[i];
		        		ceoName[i] = ceoName[j];
		        		ceoName[j] = temp;
		        		
						//swap elements for the ceo company name
						String tempCompany;
						tempCompany = companyName[i];
						companyName[i] = companyName[j];
						companyName[j] = tempCompany;

						// swap elements for the tax 
						double temptax;
						temptax = taxOwed[i];
						taxOwed[i] = taxOwed[j];
						taxOwed[j] = temptax;

						// swap for the salary
						double tempSalary;
						tempSalary = salary[i];
						salary[i] = salary[j];
						salary[j] = tempSalary;
						
		        	}
		        }
			}
			JOptionPane.showMessageDialog(null, "CEO data sorted alphabetically by CEO NAME from A-Z");
			displayJTextArea(ceoName, companyName, salary, taxOwed);
//------------------------------------------------Catch error-----------------------------------------------------------------
		// catch errors to display user friendly message instead of red text in console 
		}
		catch (NumberFormatException error) {
			JOptionPane.showMessageDialog(null, "Error file is corrupted, or is not found");
		}
		catch (FileNotFoundException error) {
			JOptionPane.showMessageDialog(null, "Error file name is not found or is spelt incorrect");
		}
		catch(java.io.IOException error) {
			JOptionPane.showMessageDialog(null, "Error within data");
		}
	}
}

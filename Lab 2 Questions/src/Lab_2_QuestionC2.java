import java.util.Calendar;
import java.util.Date;
import java.util.GregorianCalendar;
import java.util.Scanner;

/**
 * 
 */

/**
 * @author Jimmy Chavada
 * Date: Sept 2020
 * Description: This program tracks the users sleep over the years and displays the years, months, days slept
 *
 */
public class Lab_2_QuestionC2 {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// Declare Variables 
		int yearBorn, monthBorn, dayBorn; 
		int yearCurrent, currentMonth, currentDay; 
		int totalDaysAlive; 
		int totalHoursSlept; 
		
//---------------------------------------------------------------------			
		// Setup input year, month, day 
		Scanner input1 = new Scanner(System.in);
		Scanner input2 = new Scanner(System.in);
		Scanner input3 = new Scanner(System.in);
		
		// Setup input for year2, month2, day2 
		Scanner inputY2 = new Scanner(System.in); 
		Scanner inputM2 = new Scanner(System.in);
		Scanner inputD2 = new Scanner(System.in);
		

//---------------------------------------------------------------------			 
		// Prompt for year born
		System.out.println("Enter the year you were born (yyyy)! In Numbers");
		yearBorn = input1.nextInt(); 	// Get year 
		
		// Prompt for month born
		System.out.println("Enter the month you were born(mm)! In Numbers");
		monthBorn = input2.nextInt();	//get month born
		
		// Prompt for day born
		System.out.println("Enter the day you were born (dd)! In Numbers");
		dayBorn = input3.nextInt();		// Get day 
		System.out.println("\n\n");
		
//---------------------------------------------------------------------		
		// Prompt for current year 
		System.out.println("Enter the current year (yyyy)! In Numbers");
		yearCurrent = inputY2.nextInt(); 	// Get year
		
		// Prompt for current month
		System.out.println("Enter the current month (mm)! In Numbers");
		currentMonth = inputM2.nextInt();	// Get month 
		
		// Prompt for current day 
		System.out.println("Enter the current day (dd)! In Numbers");
		currentDay = inputD2.nextInt();		// Get day 
		System.out.println("\n\n");
//-----------------------Calculate Total Days Alive----------------------------------------------

		int yrsInBetween= yearCurrent - yearBorn;
		int monthDiff = Math.abs(currentMonth - monthBorn); 	//to ensure a positive value
		int totalMonthsAlive = yrsInBetween*12 + monthDiff;

		// Number of leap years from current year 
		int numOfLeaps = yrsInBetween / 4;
		totalDaysAlive = ((yrsInBetween-numOfLeaps) * 365) + (numOfLeaps*366) - (monthDiff * 30);
		totalHoursSlept = totalDaysAlive * 8;
		
	
	

//---------------------------------------------------------------------	
		// Display Results 
		System.out.println("Here is a summary of results:\n");
		System.out.println("---------Year Born Info--------\t\t---------Year Current Info--------");
		System.out.println(
				"Year:\t" + yearBorn + "\t\t\t\tYear:\t" + yearCurrent +"\n" 
				+ "Month:\t" + monthBorn + "\t\t\t\tMonth:\t" + currentMonth + "\n"
				+ "Day:\t" + dayBorn +"\t\t\t\tDay:\t" + currentDay);
		
		System.out.println("------------------------------------------------------------------------\n");
		System.out.println("Total Days Alive:\t" + totalDaysAlive + " Days");
		System.out.println("Total Hours Slept:\t" + totalHoursSlept + " Hours");
		
		


	}

}

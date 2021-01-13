import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JTextField;

/**
 *
 */

/**
 * @author Jimmy Chavada
 * Date: OCT 2020
 * Description: This program creates a parking garage fee system that charges the user $5 for two hours of parking
 * then charges $2 per hour beyond the first 2 hours. The program will have a maximum charge of $25 for
 * a given 24 hour period.
 * 
 * Method List:
 * 				class ParkingGarageSummative extends JFrame implements ActionListener - adds the GUI window and all its components includes all Methods 
 * 				double calculateParkingCharges (int numOfHours, double cost) - this method calculates the cost of parking tickets
 *  			void actionPerformed(ActionEvent evt) - a method to handle the events performed for specified variables 
 *  			static boolean checkInput (double input) - this Method checks the user input for a valid input considering specified conditions 
 *  			main(String[] args) - the main method which calls the window Method and displays it on screen 
 *				public ParkingGarageSummative() - specific Method that creates the components of the GUI 
 */

public class ParkingGarageSummative extends JFrame implements ActionListener {

	// Declare variables for all labels
	JLabel lblWelcome, lblCharges, lblCost1, lblCost2, lblInfoMsg, lblCostMsg, lblParkingHours,
	lblOutputHours, lblOutputTotalDue, lblSeperate, lblSeperate2, lblSeperate3, lblPaypal, lblMasterCard, lblVisa;

	// Declare variables for text fields users can type in
	JTextField txtUserInputHours, txtHoursOutput, txtAmountOutput;

	// Declare variable for button user can click to perform action
	JButton btnCalculateAmountOwed, btnExitProgram;
	//----------------------------------------Create Window and Method----------------------------------------------------
	/*
	 * This method creates a GUI window with all the programs
	 */
	public ParkingGarageSummative() { // constructor for GUI window
		// create window title and size
		super ("Parking Garage");  // set the title for the window 
		setLayout(null);          // layout for the GUI is set to null to allow own UI
		setSize(600, 500);		  // set window size to prefered amount 

		//----------------------------------------Declare Labels----------------------------------------------------
		// create variables for all labels in the GUI and declare labels for images 
		lblWelcome = new JLabel ("Welcome, To the ticket Charging system");
		lblCharges = new JLabel ("Charges:");
		lblCost1 = new JLabel ("- 2 Hours = $5.00");
		lblCost2 = new JLabel ("- 24 Hours = $25.00");
		lblInfoMsg = new JLabel ("Maximum time is ONLY 24 hours");
		lblCostMsg = new JLabel ("After 2 hours an extra $2.00 will be charged for every hour");
		lblParkingHours = new JLabel ("Enter the amount of Hours you will be Parking:");
		lblOutputHours = new JLabel ("Hours of Parking: ");
		lblOutputTotalDue = new JLabel ("Amount due: ");
		lblSeperate = new JLabel ("-----------------------------------------------------------------------");
		lblSeperate2 = new JLabel ("-----------------------------------------------------------------------");
		lblSeperate3 = new JLabel ("-----------------------------------------------------------------------------------"
				+ "------------------------------------------------------------");
		lblPaypal = new JLabel (new ImageIcon("paypalSmall.png")); 
		lblMasterCard = new JLabel (new ImageIcon("master.png")); 
		lblVisa = new JLabel (new ImageIcon("visa.png"));
		//--------------------------------------------DeclareText fields and Buttons------------------------------------------------
		// create text fields for all user input
		txtUserInputHours = new JTextField();
		txtAmountOutput = new JTextField(); 
		txtHoursOutput = new JTextField(); 

		// Create button for all user action
		btnCalculateAmountOwed = new JButton("Calculate amount you Pay");
		btnExitProgram = new JButton("Exit");
		//--------------------------------------------Create the Labels and add to window------------------------------------------------
		// add labels to the window to create messages
		lblWelcome.setBounds(190, 1, 250, 25); // set the location of the message for x, y, length, and width
		add(lblWelcome);  // add the label into the window

		lblSeperate2.setBounds(160, 10, 400, 25);
		add(lblSeperate2);

		lblCharges.setBounds(20, 25, 250, 30);
		add(lblCharges);

		lblCost1.setBounds (20, 50, 250, 25);
		add(lblCost1);
		lblCost2.setBounds(20, 70, 250, 25);
		add(lblCost2);

		lblSeperate.setBounds(160, 85, 350, 25);
		add(lblSeperate);

		lblInfoMsg.setBounds(20, 100, 250, 25);
		add(lblInfoMsg);

		lblCostMsg.setBounds(20, 125, 400, 25);
		add(lblCostMsg);
		lblSeperate3.setBounds(5, 150, 800, 25);
		add(lblSeperate3);

		lblParkingHours.setBounds(170, 210, 300, 25);
		add(lblParkingHours);

		lblOutputHours.setBounds(20, 325, 250, 25);
		add(lblOutputHours);

		lblOutputTotalDue.setBounds(20, 400, 250, 25);
		add(lblOutputTotalDue);

		lblPaypal.setBounds(400, 100, 260, 250);
		add(lblPaypal);

		lblMasterCard.setBounds(400, 160, 260, 250);
		add(lblMasterCard); 

		lblVisa.setBounds(400, 220, 260, 250);
		add(lblVisa); 
		//------------------------------------------Create the Text fields and add to window--------------------------------------------------
		// add all text fields into the window
		txtUserInputHours.setBounds (200, 250, 200, 30);  // set x and y coordinates and length and width sizes 
		add(txtUserInputHours);							// add the text field into the window to display to the user 

		txtAmountOutput.setBounds (20, 420, 90, 30);
		add(txtAmountOutput);

		txtHoursOutput.setBounds(20, 350, 90, 30);
		add(txtHoursOutput);

		//---------------------------------------------------Create the buttons and add to window-----------------------------------------
		// add button into the window
		btnCalculateAmountOwed.setBounds(200, 290, 200, 40); // set x and y coordinates and lenght and width sizes 
		add(btnCalculateAmountOwed);                        // add the button into the text field 

		btnExitProgram.setBounds(420, 400, 150, 40);
		add(btnExitProgram); 

		btnCalculateAmountOwed.addActionListener(this); // add the button function to this window
		btnExitProgram.addActionListener(this); 


		txtAmountOutput.setEditable(false);   // make the text field un editable for the user, so that they cannot alter the output
		txtHoursOutput.setEditable(false);
		setDefaultCloseOperation(EXIT_ON_CLOSE); // set default to exit program on close
		setVisible(true);   // set the visibility of the window to true
	}

	//--------------------------------------------Method to create events for buttons------------------------------------------------
	@Override
	public void actionPerformed(ActionEvent evt) {
		int userhours = 0;

		// Create events if button is pressed
		if (evt.getSource() == btnCalculateAmountOwed) {
			userhours = Integer.parseInt(txtUserInputHours.getText());            // convert the txt box into a int and get the text inputted by user 
			txtHoursOutput.setText("" + userhours);  // after user input is collected display a message for how many hours they have 
			lblOutputHours.setText("Hours of Parking: ");

			double totalDue = (calculateParkingCharges(userhours));               // use the calculateParkingCharges method to to get the users price  
			txtAmountOutput.setText("You pay " + "$" + totalDue);
		}
		else if (evt.getSource() == btnExitProgram) {                                   // if the exit button is pressed exit the program 
			System.exit(0);
		}

		if (checkInput(userhours) == false) {
			userhours = Integer.parseInt(txtUserInputHours.getText());             // if the users price does not match the conditions display error message and prompt for other input 
			lblOutputHours.setText("Error! Enter a value from 1 - 24 ONLY"); 
		} 


	}

	//---------------------------------------------Method to calculate the cost-----------------------------------------------
	/*
	 * This method will calculate the amount of money that is supposed to be charged
	 * based on how many hours the person has been staying at the parking spot
	 */
	public static double calculateParkingCharges (int numOfHours) { 
		// declare variable for the cost
		double cost = 0;

		// if statement to check if number of hours is between 0 and 2, or between 2 and 24 hours.
		if (numOfHours > 0 && numOfHours <= 2) {  
			cost = 5.00;    // user cost for hours from 1-2 are set to $5
		}
		else if (numOfHours > 2 && numOfHours <= 24) { 
			cost = 5.00 + (2.00 * (numOfHours-2));  // formula to make the cost go up $2 until the total reaches $25
		}
		if (cost >= 25.00) {
			cost = 25;       // if the cost is $25 then the hours from 12 - 24 are the same price 
		}
		return cost;		// return the cost to the user 

	}
	//-------------------------------------------------Method to Check user input-------------------------------------------
	/*
	 * this method checks if the user input is in the valid range given
	 *
	 */
	public static boolean checkInput (double input) {
		boolean validInput = false;      // the valid input is always false (allows for one return statement instead of two)
		if (input > 0 && input <= 24) {  // if statement to check if user input is less than 0 or greater than 24

			validInput = true;           // if this condition is met, than the valid input is true 
		}
		return validInput;				// otherwise the input is false and user is met with error message 
	}
	//-------------------------------------------------Main method to call window-------------------------------------------
	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// call window into the main to display to user 
		new ParkingGarageSummative();
	}

}
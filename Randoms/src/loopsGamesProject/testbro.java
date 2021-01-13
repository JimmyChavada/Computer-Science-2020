import java.text.;
import javax.swing.*;
/**[3 marks]
* Jimmy Chavada
* Date: Oct 2020
* Description: This program takes the user inputted temperature and converts the temperature from celsius to fahrenheit and vise-versa
*
*/
double celsius, fahrenheit; // Declares variable for celsius and fahrenheit
int choice; // variable for user choice 

DecimalFormat twoD = new DecimalFormat ("0.00");  // this formats the values in 2 decimal spaces

//this prompts the user for an input in a dialog box for which conversion requested
choice = Integer.parseInt(JOptionPane.showInputDialog(null, "Enter \n1- Celsius to Fahrenheit \n2- Fahrenheit to Celsius"));

while (choice > 2 || choice < 1) {   // checks if user choice is less than 1 or greater than 2

   // if choice is not 1 or 2 then there is a dialog box for an error 
   choice = Integer.parseInt(JOptionPane.showInputDialog(null, "Invalid choice! Enter 1 or 2"));
}

if (choice == 1){ // checks if the choice is 1
   // if the choice is 1 then user is prompted for a temp in celsius 
   celsius = Double.parseDouble(JOptionPane.showInputDialog(null, "Enter temperature in celsius"));
   fahrenheit = celsius * 9 / 5 + 32;       // fahrenheit is equal to celsius * by the formula
   // this prints the value of the fahrenheit rounded to 2 decimal places 
   JOptionPane.showMessageDialog(null, "The fahrenheit equivalent is " + twoD.format(fahrenheit));
}
else if (choice == 2){ // checks if choice is 2
   // if choice is 2 then prompts for fahrenheit temperature 
   fahrenheit = Double.parseDouble(JOptionPane.showInputDialog(null, "Enter temperature in fahrenheit"));
   celsius = (fahrenheit - 32) * 5 / 9;      // celsius conversion formula to fahrenheit
   JOptionPane.showMessageDialog(null, "The celsius equivalent is " + twoD.format(celsius)); // displays the celsius value and converts value into 2 decimal spaces
}
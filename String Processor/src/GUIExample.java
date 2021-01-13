import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JTextField;

/**
 * 
 */

/**
 * @author Jimmy Chavada
 * Date: oct 2020
 * Description: This is the GUI for string processor 
 *
 */
public class GUIExample extends JFrame implements ActionListener {
	
	// declaring the Jlabel, text, and button in here 
	JLabel lblMessage, lblPic; // declaring the variables for the labels, buttons, and text feilds 
	JTextField txtInput; 
	JButton btnReverse, btnClear;

	/**
	 * This is the constructor to build the window 
	 * 
	 */
	public GUIExample() {
		super("Palindrome GUI");
		
		lblMessage = new JLabel ("Enter a Phrase!"); // initializes the label 
		lblPic = new JLabel (new ImageIcon ("ROCKETRIGHTNEW.png")); 
		
		// create the text feild 
		txtInput = new JTextField(); 
		
		// create the buttons 
		btnReverse = new JButton("Reverse String");
		btnClear = new JButton("Clear String");
		
		
		// set the layout of the window 
		setLayout(null); 
		setSize(350, 250);
		
		// place the components
		lblMessage.setBounds(10, 10, 100, 15); // sets the location for the label 
		add(lblMessage); // adds the location for the lbl message label 
		
		lblPic.setBounds(135, 145, 60, 60); 
		add(lblPic); 
		
		txtInput.setBounds(110, 10, 200, 25);
		add(txtInput); 
		
		btnReverse.setBounds(10, 95, 120, 25);
		add(btnReverse); 
		
		btnClear.setBounds(145, 95, 80, 25);
		add(btnClear); 

		// add the listeners for our GUI
		btnReverse.addActionListener(this); // add listener to this GUI thus the this 
		btnClear.addActionListener(this);
		
		
		setDefaultCloseOperation(EXIT_ON_CLOSE); 
		setVisible(true);
		
	}// ends constructor
	
	
	/*
	 * 
	 */
	public void actionPerformed (ActionEvent evt) {
		
		if (evt.getSource() == btnReverse) {
			String phraseIn = "", phraseOut = "";
			
			// call the reverse function from the string processor 
			phraseIn = txtInput.getText(); // gets the text from the text field 
			phraseOut = StringProcessor.reverseWord(phraseIn);
			
			// display the reversed word in the text field 
			txtInput.setText(phraseOut);
			
		}
		else if (evt.getSource() == btnClear) {
			txtInput.setText(""); // clears the text 
		}
	}

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// call constructor 
		new GUIExample(); 

	}

}

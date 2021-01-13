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
 * Date: Oct 2020
 * Description: This program displays the MP3Rating class in a GUI format 
 * Method List:
 * 				main(String[] args) - main method 
 * 
 *
 *The public class will create variables for all components of the GUI formatting 
 *and will bring JFrame and actionlistner 
 */
public class Lab6PartC extends JFrame implements ActionListener{

	// create variables for all labels in the GUI 
	JLabel lblSongName, lblSongRating, lblSongQuality, lblOutputOverall, lblOutputSongName, lblPictureLogo; 

	// create variables for all text fields in the GUI
	JTextField txtSongName, txtSongRating, txtSongQuality; 

	// create variables for all buttons in the GUI
	JButton btnCalculateOverall; 

	public Lab6PartC() { // constructor for the window 
		// creates window title and window 
		super ("MP3 Rating app");
		setLayout(null);
		setSize(450, 450); 

		// create labels and boxes 
		lblSongName = new JLabel ("MP3 Song Name ");
		lblSongRating = new JLabel ("Song Rating (1-10) ");
		lblSongQuality = new JLabel ("Quality of the song (1-10)");
		txtSongName = new JTextField(); 
		txtSongRating = new JTextField(); 
		txtSongQuality = new JTextField(); 
		lblOutputSongName = new JLabel(); 
		lblOutputOverall = new JLabel(); 
		lblPictureLogo = new JLabel(); 
		lblPictureLogo = new JLabel(new ImageIcon ("music.jpg"));
		btnCalculateOverall = new JButton("Calculate");


		// place the labels and text boxes 
		lblSongName.setBounds(10, 10, 100, 15);    // these set the bounds, (location) length, and width for the lbl or text
		add(lblSongName); 						   // this adds the lbl or txt box to the actual window

		lblSongRating.setBounds(10, 65, 125, 25);
		add(lblSongRating);

		lblSongQuality.setBounds(10, 100, 200, 80);
		add(lblSongQuality);

		txtSongName.setBounds(220, 10, 150, 20);
		add(txtSongName);

		txtSongRating.setBounds(220, 65, 150, 20);
		add(txtSongRating);

		txtSongQuality.setBounds(220, 130, 150, 20);
		add(txtSongQuality);

		lblOutputSongName.setBounds(30, 250, 200, 50);
		add(lblOutputSongName); 

		lblOutputOverall.setBounds(30, 280, 200, 50);
		add(lblOutputOverall); 

		lblPictureLogo.setBounds(240, 200, 150, 150);
		add(lblPictureLogo);

		btnCalculateOverall.setBounds(10, 200, 200, 40);
		add(btnCalculateOverall);


		btnCalculateOverall.addActionListener(this);      // add action listener for the button 

		setDefaultCloseOperation(EXIT_ON_CLOSE);          // exit on close operation
		setVisible(true); 								  // allow visibility for window and boxes 

	}

	/*
	 * This method will create events for when the button is pressed
	 */
	@Override
	public void actionPerformed(ActionEvent evt) {
		// creates events for the buttons or anything interacted with by the user 

		if (evt.getSource() == btnCalculateOverall) {
			String songName;
			songName = txtSongName.getText();
			lblOutputSongName.setText("Song name: " + songName);	
			int ratingValue, qualityValue; 
			double overallScore; 
			ratingValue = Integer.parseInt(txtSongRating.getText());
			qualityValue = Integer.parseInt(txtSongQuality.getText()); 
			overallScore = Mp3Rating.computeMP3Rating(ratingValue, qualityValue); 
			lblOutputOverall.setText(String.valueOf("Overall song rating: " + overallScore));
		}

	}

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// Call window into main 
		new Lab6PartC(); 

	}



}

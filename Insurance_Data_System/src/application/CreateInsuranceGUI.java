package application;
import java.awt.Container;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JSpinner;
import javax.swing.JTextArea;
import javax.swing.JTextField;
import javax.swing.SpinnerListModel;

public class CreateInsuranceGUI extends JFrame implements ActionListener {

	JFrame insurance = new JFrame("Insurance Data System GUI");
	Container content = insurance.getContentPane();

	// add components
	JButton enterCar = new JButton("Press to Enter a New Car");
	
	JTextField plateNumber = new JTextField();
	JLabel pn = new JLabel ("Enter plate number");

			// spinner with years
	String years[] = { "2019", "2018", "2017", "2016", "2015", "2014", "2013", "2012", "2011", "2010", "2009" };
	JSpinner carYear= new JSpinner(new SpinnerListModel(years));

			// radio button for if car has had an accident
			yesRadioButton=new JRadioButton();yesRadioButton.setText("Yes");

			noRadioButton=new JRadioButton();noRadioButton.setText("No");
	
			BG = new ButtonGroup();
			BG.add(yesRadioButton);
			BG.add(noRadioButton);
	
			//text area to display
			JTextArea display = new JTextArea(); //this will display the arraylist of cars with details
	
			//search for a car
			JButton searchCar = new JButton("Seach for a car");
			
			JTextField carPlate = new JTextField(); 
			JLabel cp = new JLabel ("Enter plate number");
			
			JTextArea carFound = new JTextArea();
			
			JOptionPane carNotFound = new JOptionPane("Car not found!",JOptionPane.ERROR_MESSAGE,JOptionPane.DEFAULT_OPTION);
			
			
			//quit the application
	         JButton quitApp = new JButton("Quit application");
	         
	         JOptionPane confirmation = new JOptionPane("Are you sure?", JOptionPane.YES_NO_OPTION);

			@Override
			public void actionPerformed(ActionEvent e){
				// TODO Auto-generated method stub
				
			}
	         
	         
	         
	         
	         
	         
	         
	         
	         
	         

	


}

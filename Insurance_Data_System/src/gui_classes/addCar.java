package gui_classes;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.ArrayList;

import javax.swing.JButton;
import javax.swing.JCheckBox;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JSpinner;
import javax.swing.JTextArea;
import javax.swing.JTextField;

import application.Car;

public class addCar extends JFrame implements ActionListener{

	JPanel addCarPanel;
	JFrame InsuranceGUI;
	JTextField plateNumber;
	JLabel enterPlate;
	JSpinner carYear;
	JCheckBox hadAccident;
	JButton enter,displayAll;
	JTextArea carInformation;
	JButton searchCars;
	JOptionPane carNotFound;
    ArrayList<Car> carList;	
	
	
	
	public void createGUI(){
		InsuranceGUI = new JFrame ();
		
		addCarPanel = new JPanel();
		
		
		
	}
    
	public void actionPerformed(ActionEvent e) {
		// TODO Auto-generated method stub
		
	} 

	
	
	



}

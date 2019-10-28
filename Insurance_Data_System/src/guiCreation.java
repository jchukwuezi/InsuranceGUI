

import java.awt.Color;
import java.awt.Container;
import java.awt.GridBagConstraints;
import java.awt.GridBagLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.ArrayList;

import javax.swing.AbstractButton;
import javax.swing.JButton;
import javax.swing.JCheckBox;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JSpinner;
import javax.swing.JTextArea;
import javax.swing.JTextField;
import javax.swing.SpinnerNumberModel;
import javax.swing.text.JTextComponent;

import application.Car;

public class guiCreation extends JFrame implements ActionListener {
	ArrayList<Car> carList;

	JPanel parentPanel;
	JFrame insure;
    
	//components
	JLabel regLabel = new JLabel("Registration : ");
	JTextField regField = new JTextField(10);
	JLabel carLabel = new JLabel("Age of Car (in Years)");
	SpinnerNumberModel yearModel = new SpinnerNumberModel(0,0,100,1);
	JSpinner carYear = new JSpinner(yearModel);
	
	JLabel accidentLabel= new JLabel("Has this car had an accident previously? ");
	JCheckBox hadAccident= new JCheckBox();
	
	JButton enterBtn = new JButton("Enter");
	JButton displayBtn = new JButton("Display All");
	JButton searchBtn = new JButton("Search");
	JButton exitBtn = new JButton("Exit");
	JTextArea carTextArea = new JTextArea(10,10); 
	
	JButton searchCars;
	JOptionPane carNotFound;
 
	
	public guiCreation() { //constructor for the class
	
    insure = new JFrame();
    insure.setTitle("Chukwuezi Car Insurance");
    insure.setSize(400,400);
    
    //setting layout
    parentPanel = new JPanel();
    Container content = insure.getContentPane();
    content.setLayout(new GridBagLayout());
    content.setBackground(Color.blue);
   
    
    GridBagConstraints gc = new GridBagConstraints();
    
    //first row
    gc.weightx=0.5;
    gc.weighty=0.5;
    
    /////registration label and text field
    gc.anchor= GridBagConstraints.LINE_END;
    gc.gridx= 0;
    gc.gridy=0;
    content.add(regLabel,gc);
    
    gc.anchor= GridBagConstraints.LINE_START;
    gc.gridx=1;
    gc.gridy=0;
    content.add(regField,gc);
    
    /////car year label and spinner
    gc.anchor= GridBagConstraints.LINE_END;
    gc.gridx=2;
    gc.gridy=0;
    content.add(carLabel, gc);
    
    gc.anchor= GridBagConstraints.LINE_START;
    gc.gridx=3;
    gc.gridy=0;
    content.add(carYear, gc);
    
    
    //second row
    
    ///accident label and checkbox
    gc.anchor= GridBagConstraints.LINE_END;
    gc.gridx=0;
    gc.gridy=2;
    content.add(accidentLabel,gc);
    
    gc.anchor= GridBagConstraints.LINE_START;
    gc.gridx=1;
    gc.gridy=2;
    content.add(hadAccident, gc);
    
    
    //enter button
    gc.gridx=2;
    gc.gridy=2;
    content.add(enterBtn, gc);
    
    //display button
    gc.gridx=3;
    gc.gridy=2;
    content.add(displayBtn, gc);
    
    //search button
    gc.gridx=4;
    gc.gridy=2;
    content.add(searchBtn, gc);
    
    //exit button
    gc.gridx=5;
    gc.gridy=2;
    content.add(exitBtn, gc);
    
    
    
    //final row
    
    //details text area
    carTextArea.setEditable(false);
    gc.gridy=3;
    gc.gridx=2;
    gc.anchor = GridBagConstraints.CENTER;
    gc.fill = GridBagConstraints.BOTH;
    content. add(carTextArea, gc);
    

    
  //registering components with listener
	enterBtn.addActionListener(this);
    displayBtn.addActionListener(this);
    searchBtn.addActionListener(this);
    exitBtn.addActionListener(this);
    
    insure.setVisible(true); 
	}
		
	
	
		//event handler
	public void actionPerformed(ActionEvent e) {
		String plateNumber = regField.getText();
		int yearsOld =  (int) carYear.getValue(); 
		Boolean accident = hadAccident.isSelected();
		
		Car aCar = new Car(plateNumber,yearsOld,accident);
	    
		if (e.getSource() == enterBtn) {
		carTextArea.setText("Details of the car that has been added : " + "\n" + aCar.toString());
		carList.add(aCar);
		}
		
		
	     if (e.getSource() == displayBtn)
		{
	    	 carTextArea.setText("");
           if (carList.isEmpty()) {
           carTextArea.setText("No cars have been added to the list");
            }
            
           else 
           {	   
    			for(int i=0;i<carList.size();i++)
    			{
    				carTextArea.setText(aCar.toString());
    			}
           
           }
         }
		
	     
		
	        if (e.getSource() == searchBtn) {
			for (int j=0; j<carList.size(); j++) {
				if (plateNumber.equalsIgnoreCase(aCar.getPlateNumber())) {
					carTextArea.setText("This car has been found. These are the details :" + "\n" + aCar.toString());
				}
				else {
					carTextArea.setText("This car was not found, please try again");
				}
				}
				
		} 
	        
	        
	        if (e.getSource() == exitBtn) {
	        	JOptionPane pane = new JOptionPane();
	        	pane.showConfirmDialog(insure, "Are you sure you want to quit?", "Quit", JOptionPane.WARNING_MESSAGE );
	        	insure.setDefaultCloseOperation(insure.EXIT_ON_CLOSE);	
	        	
	        }
		
	
	}
	
	
		
	
   
	
	
	
	
	public static void main(String[] args) {
		guiCreation gui = new guiCreation();
		}









    
	
	
	
	



}

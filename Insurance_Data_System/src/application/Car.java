package application;
/*//////////////////////
Project: Insurance_Data_System
Student name: Joshua Chukwuezi
Student number: C18709101
Course Code: DT354/2
/////////////////////*/


public class Car { // car class to create objects for the system
	private String plateNumber;
	private int carYear;
	private boolean hadAccident;

	public Car(String pn, int cy, boolean ha) {
		this.plateNumber = pn;
		this.carYear = cy;
		this.hadAccident = ha;
	}

//getters and setters
	public String getPlateNumber() {
		return plateNumber;
	}

	public void setPlateNumber(String plateNumber) {
		this.plateNumber = plateNumber;
	}

	public int getCarYear() {
		return carYear;
	}

	public void setCarYear(int carYear) {
		this.carYear = carYear;
	}

	public boolean isHadAccident() {
		return hadAccident;
	}

	public void setHadAccident(boolean hadAccident) {
		this.hadAccident = hadAccident;
	}

	public String toString() {
		String accident;
		
		if (this.hadAccident == true)
		{
			accident=" yes";
		}
		else
			accident=" no";
		
		return "\nPlate Number= " + this.plateNumber + "\nCar Year= " + this.carYear
				+ "\nHas the Vehicle had an Accident? = " + accident;
	}

	}



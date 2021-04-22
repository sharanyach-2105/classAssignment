package com.model;

public class UtilityCar extends Car {
	private boolean rearCoolingVents;
	public UtilityCar() {
	}
	public UtilityCar(long id,String name,boolean rearCoolingVents) {
		super(id,name);
		this.rearCoolingVents=rearCoolingVents;
		
	}

	public boolean isRearCoollingVents() {
		return rearCoolingVents;
	}
	public void setRearCoollingVents(boolean rearCoollingVents) {
		this.rearCoolingVents = rearCoollingVents;
	}

	public String toString() {
		return"UtilityCar[rearCoolingVents="+rearCoolingVents+"]";
	}


@Override
public double calculateDrivingCost(double km) {
	double price=18;
	return(price*km)/10;
}


}
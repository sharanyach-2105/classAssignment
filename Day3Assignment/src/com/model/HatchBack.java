package com.model;

public class HatchBack extends Car{
	Boolean powerWindowsEnabled;
	Boolean automaticGear;
	public HatchBack() {
	

}
	public HatchBack(long id,String name,Boolean powerWindowsEnabled,Boolean automaticGear) {
		super(id,name);
		this.powerWindowsEnabled=powerWindowsEnabled;
		this.automaticGear=automaticGear;
	}
	public Boolean getPowerWindowsEnabled() {
		return powerWindowsEnabled;
	}
	public void setPowerWindowsEnabled(Boolean powerWindowsEnabled) {
		this.powerWindowsEnabled = powerWindowsEnabled;
	}
	public Boolean getAutomaticGear() {
		return automaticGear;
	}
	public void setAutomaticGear(Boolean automaticGear) {
		this.automaticGear = automaticGear;
	}
	public String toString() {
		return "HatchBack[powerWindowsEnabled=" + powerWindowsEnabled+",automaticGear=" + automaticGear+"]";
	}
	public double calculateDrivingCost(double km) {
		double price=0;
		double count=km/10;
		if(automaticGear==true) {
			price=10;
		}
		else {
			price=12;
		}
		return price*count;
	}
	
}

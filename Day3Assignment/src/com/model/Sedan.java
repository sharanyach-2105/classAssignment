package com.model;

public class Sedan extends Car {
	Boolean absEnabled;
	Integer bootSpace;
	public Sedan() {

}
	public Sedan(long id,String name,Boolean absEnabled,Integer bootSpace) {
		super(id,name);
		this.absEnabled=absEnabled;
		this.bootSpace=bootSpace;
	}
	public Boolean getAbsEnabled() {
		return absEnabled;
	}
	public void setAbsEnabled(Boolean absEnabled) {
		this.absEnabled = absEnabled;
	}
	public Integer getBootSpace() {
		return bootSpace;
	}
	public void setBootSpace(Integer bootSpace) {
		this.bootSpace = bootSpace;
	}
	public String toString() {
		return "Sedan[absenabled=" + absEnabled +",bootSpace=" +bootSpace+"]";
	}
	public double calculateDrivingCost(double km) {
		double price=15;
		if(absEnabled==true) {
			price=price+10;
		}
		if(bootSpace>600) {
			double c=(price*20)/100;
			price=price+c;
		}
		
		
		return price;
	}
}
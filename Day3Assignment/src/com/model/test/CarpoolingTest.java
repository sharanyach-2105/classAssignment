package com.model.test;

import java.util.Scanner;
import com.model.Car;
import com.model.HatchBack;
import com.model.Sedan;
import com.model.UtilityCar;


public class CarpoolingTest {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Id : ");
		int id = sc.nextInt();
		sc.nextLine();
		System.out.println("Name : ");
		String name = sc.nextLine();
		System.out.println("Enter Type :");
		String type = sc.nextLine();
		if (type.equalsIgnoreCase("Sedan")) {
			System.out.println("absEnabled : ");
			boolean absEnabled = sc.nextBoolean();
			System.out.println("bootSpace : ");
			int bootSpace = sc.nextInt();
			Car sedan = new Sedan(id,name, absEnabled, bootSpace);
			System.out.println("Enter Travel Distance");
			double km = sc.nextDouble();
			System.out.println("Cost is Rs " + sedan.calculateDrivingCost(km));
		}
		if (type.equalsIgnoreCase("HatchBack")) {
			System.out.println("powerWindowsEnable  : true or false :");
			boolean powerWindowsEnable = sc.nextBoolean();
			System.out.println("automaticGear : true or false :");
			boolean automaticGear = sc.nextBoolean();
			Car sedan = new HatchBack( id,name,powerWindowsEnable, automaticGear);
			System.out.println("Enter Travel Distance");
			double km = sc.nextDouble();
			System.out.println("Cost is Rs " + sedan.calculateDrivingCost(km));// I assume that every km charge rs10;
		}
		if (type.equalsIgnoreCase("UTilityCar")) {
			System.out.println("Enter rearCoolingVents enable or not : true or false :");
			boolean rearCoolingVents = sc.nextBoolean();
			Car utilityCar = new UtilityCar(id, name, rearCoolingVents);
			System.out.println("Enter Travel Distance");
			double km = sc.nextDouble();
			System.out.println("Cost is Rs " + utilityCar.calculateDrivingCost(km));
		}
	}
	

}

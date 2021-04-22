package com.medicine;

import java.util.Random;

public class TestMedicine  {
	public static void main(String[] args) {
		Medicine []medicine=new Medicine[5];

		Random random=new Random();
		int index=random.nextInt(4);

		 medicine[0]=new Ointment();
		 medicine[1]=new Syrup();
		 medicine[2]=new Tablets();

		medicine[0].displayLabel();
		medicine[1].displayLabel();
		medicine[2].displayLabel();

	}
}

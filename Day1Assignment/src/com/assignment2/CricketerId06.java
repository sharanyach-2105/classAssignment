package com.assignment2;
import java.util.Scanner;

public class CricketerId06 {

	public static void findCricketerId(int []array,int size, int score) {
		System.out.print("Highest Score Cricketer Id : ");
		for(int i=0;i<size;i++) {
			while(score<array[i]) {
				System.out.print(array[i-1]+" ");
				break;
			}
		}
	}
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter Size : ");
		int size = sc.nextInt();
		if (size < 0) {
			System.out.println("Invalid Size");
			System.exit(size);
		}
		int[] idScore = new int[size];
		System.out.println("Enter Id and Score ");
		for (int i = 0; i < size; i++) {
			idScore[i] = sc.nextInt();
			if (idScore[i] < 0) {
				System.out.println("Invalid Input");
				System.exit(i);
			}
		}
		System.out.println("Enter searching score ");
		int score =sc.nextInt();
		findCricketerId(idScore,size,score);
	}

}
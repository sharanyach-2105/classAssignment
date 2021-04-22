package com.assignment2;
import java.util.Scanner;

public class RupeesCount04 {

	public static int countRupes(int no) {
		if (no <= 0)
			return -1;
		int[] a = { 500, 100, 50, 10, 5, 2, 1 };
		int count = 0;
		for (int i = 0; i < a.length; i++) {
			while (no >= a[i]) {
				no = no - a[i];
				count++;
			}
		}
		return count;
	}

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter School fees");
		int fees = sc.nextInt();
		System.out.println("Rupees Count : " + countRupes(fees));
	}

}
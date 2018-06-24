package com.basic;

import java.util.Scanner;

public class EvenDigitSum {
	public static void main(String args[]) {
		Scanner scanner = new Scanner(System.in);
		System.out.println("enter the input:");
		int input1 = scanner.nextInt();
		int sum = 0;
		if (input1 > 0) {
			while (input1 > 0) {
				int r = input1 % 10;
				if (r % 2 == 0) {
					sum = sum + r;
				}
				input1 = input1 / 10;
			}
		}
		// return sum;
		System.out.println("The sum of even digits="+sum);

	}
}

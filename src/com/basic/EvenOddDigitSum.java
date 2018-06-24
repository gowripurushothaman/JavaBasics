package com.basic;

import java.util.Scanner;

public class EvenOddDigitSum {
	public static void main(String args[]) {
		Scanner scanner=new Scanner(System.in);
		System.out.println("Enter the number:");
		int input1=scanner.nextInt();
		System.out.println("Enter the String(odd or even):");
		String input2=scanner.next();
		int sum=0,sum1=0;
		if (input1 > 0 && input2.equals("even")) {
			while (input1 > 0) {
				int r = input1 % 10;
				if (r % 2 == 0) {
					sum = sum + r;
				}
				input1 = input1 / 10;
			}
		}
		if (input1 > 0 && input2.equals("odd")) {
			while (input1 > 0) {
				int r = input1 % 10;
				if (r % 2 != 0) {
					sum1 = sum1+ r;
				}
				input1 = input1 / 10;
			}
		}
		if(input2.equals("even"))
			System.out.println("Sum of even digits="+sum); 
		else
			System.out.println("sum of odd digits="+sum1);
	}

}

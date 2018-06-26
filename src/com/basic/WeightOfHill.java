package com.basic;

import java.util.Scanner;

public class WeightOfHill {
	public static void main(String args[]) {
		Scanner scanner=new Scanner(System.in);
		System.out.println("enter the row:");
		int row=scanner.nextInt();
		System.out.println("enter the add value in each row");
		int add=scanner.nextInt();
		int sum=0;
		System.out.println("enter the starting value of hill pattern");
		int start=scanner.nextInt();
		for(int i=row;i>0;i--) {
			for(int j=i;j<=row;j++) {
				System.out.print(start+" ");
				sum=sum+start;
			}
			start=start+add;
			System.out.println(" ");
		}
		System.out.println("Weight of hill="+sum);
	}

}

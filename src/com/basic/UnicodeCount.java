package com.basic;

import java.util.Scanner;

public class UnicodeCount {
	public static void main(String args[]) {
		Scanner scanner=new Scanner(System.in);
		System.out.println("Enter the number:");
		int input1=scanner.nextInt();
		int count=0;
		int n[]=new int[10];
	while(input1>0){
		int r=input1%10;
		n[r]=1;
		input1=input1/10;
		
	}
		for(int j=0;j<=9;j++){
			if(n[j]==1){
				count++;
			}
		}
		System.out.println(count);
	}
	

}

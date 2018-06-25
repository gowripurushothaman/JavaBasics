package com.basic;

import java.util.Scanner;

public class IsPalindromPossible {
	public static void main(String args[]) {
		Scanner scanner=new Scanner(System.in);
		int count=0,count1=0;
		System.out.println("enter the number:");
		int input1=scanner.nextInt();
		int length=Integer.toString(input1).length();
		int a=length/2;
		int b=length%2;
		int arr[]=new int[10];
		while(input1>0) {
			int r=input1%10;
			arr[r]=arr[r]+1;
			input1=input1/10;
		}
		for(int i=0;i<arr.length;i++) {
			if(arr[i]>=2) {
				count++;
			}
			else if(arr[i]==1) {
				count1++;
			}
		}
		if(a==count && b==count1) {
			System.out.println("palindrome is possible");
		}
		else {
			System.out.println("paslindrome is not possible");
		}
	}

}

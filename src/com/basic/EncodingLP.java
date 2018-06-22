package com.basic;

import java.util.Scanner;

public class EncodingLP {
	public static void main(String args[]) {
		Scanner scanner=new Scanner(System.in);
		int sum=0;
		String s1=scanner.nextLine();
		String s[]=s1.split(" ");
        int number=s.length;
        int arr[]=new int[number];
        int arr1[]=new int[number];
        for(int i=0;i<number;i++) {
        	arr[i]=Integer.parseInt(s[i]);
        	sum=sum+arr[i];
        	
        }
        System.out.print("Encoded array={");
        for(int k=0;k<number;k++) {
        	if(k!=number-1) {
        		arr1[k]=arr[k+1]-arr[k];
        	}
        	else {
        		arr1[k]=arr[number-1];
        	}
        	System.out.print(arr1[k]);
        	if(k<number-1) {
        		System.out.print(",");
        	}
        }
        for(int k=0;k<number;k++) {
        	
        }
        System.out.print("}");
        System.out.println("");
        System.out.println("First number in original array="+arr[0]);
		System.out.println("Sum of all numbers in array="+sum);
	}

}

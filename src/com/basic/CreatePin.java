package com.basic;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;


public class CreatePin {
	public static void main(String args[]) {
		Scanner scanner=new Scanner(System.in);
		System.out.println("enter 3 number within the range(100<=num>=999)");
		int input1=scanner.nextInt();
		int input2=scanner.nextInt();
		int input3=scanner.nextInt();
		int arr[]= {input1,input2,input3};
		int arr1[]=new int[3];
		int arr2[]=new int[3];
		int arr3[]=new int[3];
		int total[]=new int[arr1.length+arr2.length+arr3.length];
		//System.out.println("total"+total.length);
		
		int j=0;
		for(int i=0;i<arr.length;i++) {
			arr1[j]=arr[i]%10;
			
			//System.out.println("units="+arr1[j]);
			arr2[j]=((arr[i]/10)%10);
			
			//System.out.println("tens="+arr2[j]);
			arr3[j]=arr[i]/100;
			
			//System.out.println("huns="+arr3[j]);
			j++;
		}
		Arrays.sort(arr1);
		Arrays.sort(arr2);
		Arrays.sort(arr3);
		int units=arr1[0];
		int tens=arr2[0];
		int huns=arr3[0];
		int r=0,z=0;
		for(int k=0;k<arr.length;k++) {
			while(arr[k]>0) {
				r=arr[k]%10;
				total[z]=r;
				//System.out.print(total[z]);
				z++;
				arr[k]=arr[k]/10;
			}
		}
		Arrays.sort(total);
		int max=total[total.length-1];
		//System.out.println("max="+max);
		System.out.println("password="+max+huns+tens+units);
}}

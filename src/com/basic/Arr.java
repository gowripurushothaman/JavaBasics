package com.basic;

public class Arr {
	public static void main(String[] args) {
		int N=1234,i;
		int arr[]=new int[10];
		i =0;
		while(N>0) {
			int r=N%10;
			N=N/10;
			arr[i]=r;
			i++;
			
		}
		for(i=0;i<10;i++) {
			
		System.out.print(arr[i]+" ,");
		}
		
	}
	

}

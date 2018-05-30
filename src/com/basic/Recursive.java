package com.basic;

public class Recursive {
	static int n1=0,n2=1;
	static void PrintFibonacci(int count) {
		if(count>0) {
			int n3;
			n3=n1+n2;
			System.out.print(" "+n3);
			n1=n2;
			n2=n3;
			PrintFibonacci(count-1);
		}
		
	}
	public static void main(String[] args) {
		int count=10;
		System.out.print(n1+" "+n2);
		PrintFibonacci(count-2);
		
	}

}

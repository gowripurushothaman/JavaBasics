package com.basic;

public class PrimeCount {
	public static void main(String args[]) {
		int input1, input2 = 100, count = 0, count1 = 0;
		for (input1 = 1; input1 <= input2; input1++) {
			//most of the prime number is odd number
			if ((input1 % 2 != 0)||(input1%2==0)) {
				for (int i = 1; i <= input1; i++) {
					if (input1 % i == 0) {
						count++;
						//System.out.println(count + " " + i);
					}
				}
				if(count==2) {
					System.out.println("prime number="+input1);
					count=0;
					count1++;
				}
				if(count>=2) {
					count=0;
				}
				
		}
		
		
	}
		//2 is even number but it is prime number that's why add 1 here
		System.out.println("count of prime number within given range="+(count1+1));
	}}

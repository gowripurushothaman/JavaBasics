package com.basic;

import java.util.Scanner;

public class IsPalinNum {
	public static void main(String args[]) {
		Scanner scanner=new Scanner(System.in);
		System.out.println("enter the number:");
		int num=scanner.nextInt();
		String s=Integer.toString(num);
		StringBuffer str=new StringBuffer(s);
		System.out.println(str);
		StringBuffer rev=new StringBuffer(str.reverse());
		System.out.println(rev);
		if(s.equals(rev.toString())) {
			System.out.println("palindrome");
		}
		else {
			System.out.println("this is not palindrome");
		}
		
		}

}

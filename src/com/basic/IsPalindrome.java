package com.basic;

import java.util.Scanner;

public class IsPalindrome {
	boolean isPalindrome(String s) {
		  int n = s.length();
		  for (int i = 0; i < (n/2); ++i) {
		     if (s.charAt(i) != s.charAt(n - i - 1)) {
		         return false;
		     }
		  }

		  return true;
		}
	public static void main(String args[]) {
		IsPalindrome p=new IsPalindrome();
		System.out.println("enter the string:");
		Scanner scanner=new Scanner(System.in);
        String s=scanner.next();
		System.out.println(p.isPalindrome(s));
	}

}

package com.basic;

import java.util.Scanner;

public class RemoveVowels {
	public static void main(String args[]) {
		Scanner scanner=new Scanner(System.in);
		System.out.println("enter the string");
		String s=scanner.nextLine();
		s=s.replaceAll("[AEIOUaeiou]", "");
		System.out.println(s);
	}

}

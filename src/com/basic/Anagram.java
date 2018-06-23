package com.basic;

import java.util.Scanner;

public class Anagram {
	public static void main(String args[]){
		Scanner scanner=new Scanner(System.in);
		System.out.println("enter the first string");
		String s1=scanner.nextLine();
		System.out.println("enter the second string");
		String s2=scanner.nextLine();
		s1=s1.toLowerCase();
		s2=s2.toLowerCase();
		
		String substring=s1.substring(2);
		String substring1=s2.substring(2);
	    if(substring.equals(substring1)){
			if(s1.equals(s2)){
			System.out.println("true");
		    }
			else if((s1.charAt(1)==s2.charAt(0))&(s1.charAt(0)==s2.charAt(1))){
			   System.out.println("True");
			}
		}
		else
			System.out.println("false");
	    int count=0;
		char ch1[]=s1.toCharArray();
		for(int z=0;z<s1.length();z++) {
			if(Character.isDigit(ch1[z])) {
				count++;
			}
		}
		if(count>=1) {
			System.out.println("this is invalid input");
		}
		
	}

}

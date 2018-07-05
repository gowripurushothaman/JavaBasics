package com.basic;

import java.util.Scanner;

public class IdGeneration {
	public static void main(String args[]) {
		Scanner scanner=new Scanner(System.in);
		String First_Name=scanner.next();
		String Last_Name=scanner.next();
		int PIN=scanner.nextInt();
		int N=scanner.nextInt();
		int PIN_length=Integer.toString(PIN).length();
		String smallerName="";
		String longerName="";
		if(N>=PIN_length) {
			System.out.println("ERROR");
		}
		int lengthOne=First_Name.length();
		int lengthTwo=Last_Name.length();
		if(lengthOne<lengthTwo) {
			smallerName=First_Name;
			longerName=Last_Name;
		}
		else if(lengthOne>lengthTwo) {
			smallerName=Last_Name;
			longerName=First_Name;
		}
		else {
			int b=First_Name.compareTo(Last_Name);
			if(b<0) {
				smallerName=First_Name;
				longerName=Last_Name;
			}
			else {
				smallerName=Last_Name;
				longerName=First_Name;
			}
		}
		//System.out.println(smallerName);
		int length=smallerName.length();
		char lastLetter=smallerName.charAt(length-1);
		//System.out.println(lastLetter);
		String newPin=String.valueOf(PIN);
		char ch1=newPin.charAt(N-1);
		//System.out.println(ch1);
		StringBuilder s=new StringBuilder(newPin);
		s.reverse();
		char ch2=s.charAt(N-1);
		//System.out.println(ch2);
		char[] c=longerName.toCharArray();
		for(int i=0;i<c.length;i++) {
			if(Character.isLowerCase(c[i])) {
				c[i]=Character.toUpperCase(c[i]);
			}
			else if(Character.isUpperCase(c[i])) {
				c[i]=Character.toLowerCase(c[i]);
			}
		}
		
		String l=String.valueOf(c);
		//System.out.println(c);
		if(Character.isUpperCase(lastLetter)) {
			lastLetter=Character.toLowerCase(lastLetter);
		}
		else {
			lastLetter=Character.toUpperCase(lastLetter);
		}
		String newword=lastLetter+l+ch1+ch2;
		System.out.println(newword);
		
		
		
		
		}

}

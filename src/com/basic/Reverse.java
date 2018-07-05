package com.basic;
import java.util.Scanner;


public class Reverse {
    public static void main(String args[]) {
    	System.out.println("Enter the input string:");
    	Scanner scanner=new Scanner(System.in);
    	String input=scanner.nextLine();
    	String str[]=input.split(" ");
    	for(int i=str.length-1;i>=0;i--) {
    		System.out.print(str[i]+" ");
    	}
    	
    }
}

package com.basic;
import java.util.*;

public class StringPower {
	public static void main(String args[]) {
		Scanner scanner=new Scanner(System.in);
		String s1=scanner.nextLine();
		String s2=scanner.nextLine();
		int i1=Integer.parseInt(s1);
		long i2=Long.parseLong(s2);
		double pow=0;
		boolean b=false;
		for(int i=1;i<10;i++) {
			pow=Math.pow(i1, i);
			if(pow==i2) {
				b=true;
				System.out.println("yes");
			}
			
		}
		if(b==false) {
		System.out.println("no");
		}
		
	}

}

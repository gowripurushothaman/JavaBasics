package com.basic;

import java.util.ArrayList;
import java.util.Iterator;


public class AddAllFunction {
	public static void main(String args[]) {
		ArrayList<String> al=new ArrayList<String>();
		al.add("ravi");
		al.add("ragu");
		al.add("ratha");
		al.add("ranjith");
		ArrayList al2=new ArrayList();
		al2.add("ranjith");
		al.removeAll(al2);
		System.out.println("By using removeAll method:");
		
		for(String a:al) {
			System.out.println(a);
		}
		System.out.println("");
		System.out.println("By using addAll method");
		al.addAll(al2);
		for(String a:al) {
			System.out.println(a);
		}
        
		
	}

}

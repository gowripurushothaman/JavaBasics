package com.basic;

import java.util.Vector;

public class VectorDemo {
	public static void main(String args[]) {
		Vector v=new Vector();
		System.out.println("capacity before adding element  "+v.capacity());
		for(int i=1;i<=10;i++) {
			v.addElement(i);
		}
		System.out.println("Capacity after adding element  "+v.capacity());
		v.addElement("A");
		System.out.println("capacity after adding extra element  "+v.capacity());
		System.out.println(v);
	}

}

package com.basic;
import java.util.*;

import com.sun.org.apache.bcel.internal.generic.LLOAD;

public class ArrayListPro {
	public static void main(String args[]) {
		ArrayList l=new ArrayList();
		l.add("A");
		l.add(10);
		l.add("A");
		l.add(null);
	System.out.println(l);
	l.remove(2);
	l.add("N");
	l.add(2,"M");
	System.out.println(l);
	
	}

}

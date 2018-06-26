package com.basic;
import java.util.*;

public class LinkedListDemo {
	public static void main(String args[]) {
		LinkedList l1=new LinkedList();
		l1.add("Gowri");
		l1.add("kalpana");
		l1.add("purushothaman");
		l1.add("siva");
		l1.set(3, "Sridhar");//replace the third element
		l1.add(0,"Sridhar");//add the given value in 0th position
		l1.remove(4);//remove 4th element
		l1.add("null");
		System.out.println(l1);
		
		
	}

}

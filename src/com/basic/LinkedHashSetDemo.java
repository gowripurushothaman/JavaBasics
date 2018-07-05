package com.basic;
import java.util.*;

public class LinkedHashSetDemo {
	public static void main(String args[]) {
		Set set=new LinkedHashSet();
		set.add("A");
		set.add("10");
		set.add(20);
		System.out.println(set);
		System.out.println(set.isEmpty());
		set.clear();
		System.out.println(set.isEmpty());
	    set.add("z");
	    
	    set.add(null);
	    System.out.println(set);
	}

}

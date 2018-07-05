package com.basic;
import java.util.*;


public class HashSetDemo {
    public static void main(String args[]) {
    	HashSet h=new HashSet();
    	h.add("A");
    	h.add("B");
    	h.add("c");
    	h.add(null);
    	System.out.println(h.add("c"));//false(because duplicare value is not allow)
    	System.out.println(h);//insertion order is based HashCode
    	
    }
}

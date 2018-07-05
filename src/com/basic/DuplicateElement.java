package com.basic;
import java.util.*;

public class DuplicateElement {
	public static void main(String args[]) {
		String str[]= {"ab","bc","cd","de","ab","bc"};
		HashSet<String> set=new HashSet<String>();
		for(String i:str) {
			if(!set.add(i)) {
				System.out.println("Dumpliate Element="+i);
			}
		}
		System.out.println(set);
	}

}

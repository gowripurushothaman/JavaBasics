package com.basic;

import java.util.HashSet;

public class RemoveDuplicate {
  public static void main(String args[]) {
	  int array[]= {4, 3, 2, 4, 9, 2};
	  HashSet set=new HashSet();
	  for(int i:array) {
		  set.add(i);
	  }
	  System.out.println(set);
  }
}

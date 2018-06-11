package com.basic;

import java.io.IOException;
import java.util.Arrays;

public class RuntimeExample {
	public static void main(String[] args) {
		Runtime runtime=Runtime.getRuntime();
		long start=System.currentTimeMillis();
		int pro=runtime.availableProcessors();
		System.out.println(pro);
		try {
			Process process=runtime.exec("notepad");
		} catch (IOException e) {
			e.printStackTrace();
		}
		long pro1=runtime.freeMemory();
		System.out.println(pro1);
		long end=System.currentTimeMillis();
		System.out.println(end-start);
		System.out.println(System.getenv());
		//Array copy
		int a[]= {1,2,3,4,5};
	    int[] b=new int[a.length];
		System.arraycopy(a, 2, b, 0, 3);
		//import java.util.Arrays
		System.out.println(Arrays.toString(b));//print copy value by using toString method
		
		}
	
	
	}

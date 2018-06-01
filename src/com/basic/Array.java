package com.basic;

public class Array {
	static int i=0;
	public static void main(String[] args) {
		int[] arr=new int[3];
		for(  i=0;i<arr.length;i++) {
			arr[i]=i+1;
			System.out.print(arr[i]+" ");
			
		}
		System.out.println();
		int[] array= {1,2,3,4,5,6,7};
		for(i=0;i<array.length;i++) {
			array[i]=i*i;
			System.out.print(array[i]+" ");
			
			
		}
		
		
	}

}

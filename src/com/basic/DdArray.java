package com.basic;

public class DdArray {
	public static void main(String[] args) {
		int[][] arr=new int[3][3];
		for(int i=0;i<arr.length;i++) {
			for(int j=0;j<arr.length;j++) {
				arr[i][j]=i*j;
				System.out.print(arr[i][j]+" ");
			}
			System.out.println();
		}
		
		
	}

}

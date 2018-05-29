package com.basic;

public class LableForLoop {
	public static void main(String[] args) {
		int i;
		aa:
		for(i=0;i<3;i++) {
			bb:
			for(int j=0;j<3;j++) {
				if(i==2&&j==2) {
					break bb;
				}
				System.out.println(i+" "+j);
			}
		}
	}

}

package com.basic;
import java.util.*;


public class NonRepeated {
	public static void main(String args[]) {
		Scanner scanner=new Scanner(System.in);
		int count=0;
		int n[]= {2,6,36,36,42,42,78};
		//Arrays.sort(n);
		int n1[]=new int[n.length];
		for(int i=0;i<n.length;i++) {
			for(int j=0;j<n.length;j++) {
				if(n[i]==n[j]) {
					count++;
				}
			}
			n1[i]=count;
			count=0;
		}
		for(int k=0;k<n.length;k++) {
			if(n1[k]==1) {
				System.out.println(n[k]);
			}
		}
		
		
	}

}

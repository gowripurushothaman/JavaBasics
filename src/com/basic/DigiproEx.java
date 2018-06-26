package com.basic;

import java.util.Scanner;

public class DigiproEx {
	public static void main(String args[]) {
		Scanner scanner = new Scanner(System.in);
		System.out.println("enter the string:");
		String input = scanner.nextLine();
		String s[] = input.split(" ");
		int last=Integer.parseInt(s[s.length-1]);
		//int arr[] = { Integer.parseInt(s[0]), Integer.parseInt(s[1]), Integer.parseInt(s[2]), Integer.parseInt(s[3]) };
        int arr1[]=new int[s.length];
        
        for(int i=0;i<arr1.length-1;i++) {
        	arr1[i]=Integer.parseInt(s[i]);
        	if((arr1[i]<9)) {
        		arr1[i]=210+arr1[i];
        		//System.out.println(arr1[i]);
        	}
        }
        int units[]=new int[3];
        int tens[]=new int[3];
        int huns[]=new int[3];
        int l=0,m=0,n=0,sum=0,sum1=0,sum2=0;
        for(int j=0;j<arr1.length-1;j++) {
        	while(arr1[j]>0) {
        	    l=arr1[j]%10;
        	    units[j]=l;
        	    sum=sum+l;
        	    m=(arr1[j]/10)%10;
        	    tens[j]=m;
        	    sum1=sum1+m;
        	    n=arr1[j]/100;
        	    huns[j]=n;
        	    sum2=sum2+n;
        	    arr1[j]=0;
        	}
        }
        if(last==0) {
        	System.out.println(sum);
        }
        else if(last==1) {
        	System.out.println(sum1);
        }
        else {
        	System.out.println(sum2);
        }
	}
}

package com.basic;

import java.util.Scanner;

public class StringCode {
	  public static void main(String args[]){
          Scanner scanner=new Scanner(System.in);
          System.out.println("enter the string");
          String s=scanner.nextLine();
          String ss[]=s.split(" ");
          String str[]=new String[ss.length];
          //split the string input
          for(int i=0;i<ss.length;i++){
                    System.out.println(ss[i]);
          }
          for(int j=0;j<ss.length;j++){
              int len=ss[j].length();
              byte[] bytes=ss[j].getBytes();
              //to get byte code
              for(int k=0;k<ss[j].length();k++){
                   System.out.println(bytes[k]);
              }
              int c=len/2;
              int d=len%2;
              int e=c+d;
              int sub=0,sum=0;
              for(int x=0;x<e;x++){
                      int a=bytes[x];
                      int b=bytes[len-(x+1)];
                      a=a-96;
                      b=b-96;
                      if(a==b){
                             sub=a;
                      }
                      else{
                             sub=a-b;
                              if(sub<0){
                                    sub=-(sub);
                              }

                      }
                       sum=sum+sub;
                       str[j]=Integer.toString(sum);
              }
              System.out.println("sum="+sum);
              }
              for(int z=0;z<str.length;z++){
                      System.out.print(str[z]);
              }
         
   }
}

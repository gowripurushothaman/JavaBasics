package com.basic;
class Palindrome{
	int num;
	int a,sum=0;
	Palindrome(){
		
	}
	public void reversed(int num) {
		int temp=num;
		while(num>0) {
			a=num%10;
			sum=(sum*10)+a;
			num=num/10;
		}
		System.out.println("The given number="+temp);
		System.out.println("The reversed number="+sum);
	}
	
}
public class PalindromeProgram {
	public static void main(String[] args) {
		Palindrome p=new Palindrome();
		p.num=7631;
		p.reversed(p.num);
		
	
		
		
	}

}

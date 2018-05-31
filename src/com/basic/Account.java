package com.basic;

class AccountDetail{
	int acc_Num;
	float amount;
	String name;
	float balance;
	public void inser(int i,float j,String k) {
		acc_Num=i;
		amount=j;
		name=k;
	}
	
	void display() {
		System.out.println("Name ="+name+" "+"Account Number="+acc_Num+" "+"Account balance is ="+amount);
		
	}
	void deposit(float amt) {
		balance=amt+amount;
	}
	void withdraw(float a) {
		if(amount>a)
		amount=amount-a;
		else
			System.out.println("Insufficient Balance");
	}
	void output() {
		System.out.println("Deposit="+balance);
		System.out.println("Withdraw="+amount);
		System.out.println("Current Balance="+amount);
		
	}
	
	
}
public class Account {
	public static void main(String[] args) {
		AccountDetail a1=new AccountDetail();
		a1.inser(1000,4000,"Purushothaman");
		a1.display();
		a1.deposit(1000);
		a1.withdraw(500);
		a1.output();
	
		
		
		
	}
	
	

}

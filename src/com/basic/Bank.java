package com.basic;
class SavingAccount{
	static float annualInterestRate=0.04f;
	private  float savingBalance=0;
	SavingAccount(int savingBalance){
		this.savingBalance=savingBalance;
	}
	public void calculateMonthlyInterst() {
		savingBalance=((savingBalance* annualInterestRate)/12)+savingBalance;
		System.out.println("savingBalance="+savingBalance);
	}
	public void modifyInterstRate(float annualInterstRate) {
		annualInterestRate=annualInterstRate;
		savingBalance=((savingBalance* annualInterestRate)/12)+savingBalance;
		System.out.println("new savingBalance="+savingBalance);
		 }
}
public class Bank {
	public static void main(String[] args) {
		SavingAccount saver1=new SavingAccount(2000);
		SavingAccount saver2=new SavingAccount(3000);
		System.out.println("if  Set annualInterestRate to 4% then the balance of the saver is:");
		System.out.println("Balnce for saver1:");
		saver1.calculateMonthlyInterst();
		System.out.println("Balnce for saver2:");
		saver2.calculateMonthlyInterst();
		System.out.println("if  Set annualInterestRate to 5% then the balance of the saver is:");
		System.out.println("New Balnce for saver1:");
	    saver1.modifyInterstRate((0.05f));
	    System.out.println("New Balnce for saver1:");
	    saver2.modifyInterstRate((0.05f));
	    }

}

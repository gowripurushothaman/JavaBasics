package com.basic;
class PerfectNum{
	int num,sum=0,i=1;
	public PerfectNum() {
		
	}
	public int getNum() {
		return num;
	}
	public void setNum(int num) {
		this.num = num;
	}
	public int getSum() {
		return sum;
	}
	public void setSum(int sum) {
		this.sum = sum;
	}
	public void isperfect(int num) {
		while(i<num) {
			if(num%i==0) {
				sum=sum+i;
			}
			i++;
			
		}
		if(sum==num) {
			System.out.println("The given number is perfect number");
			
		}
		else {
			System.out.println("The given number is not perfect number");
		}
			
		
	}
	
}

public class Perfect {
	public static void main(String[] args) {
		PerfectNum p=new PerfectNum();
		p.setNum(6);
		p.isperfect(p.getNum());
		
		
	}

}

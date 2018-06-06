package com.basic;

public class SwitchProgram {
	public static void main(String[] args) {
		int i = 1;
		while ( i <= 10 ) {
		++i;
		if(i==5) {
			continue;
		}
		
		System.out.print(i+" ");
		
		}
System.out.println();

		for (double k= 0.1; k !=10; k += 0.1 ) {
			if(k>1) {
				break;
			}
		System.out.print( k +" ");
		
		}
		
		int n = 2;
		switch (n)
		{
		case 1:
		System.out.println( "The number is 1" );
		case 2:
		System.out.println( "The number is 2" );
		break;
		default:
		System.out.println( "The number is not 1 or 2" );
		break;
		}
	    System.out.println("The following code should print the values 1 to 10:");

		n = 1;
		while (n<=10 )
		System.out.println( n++ );

	}

}

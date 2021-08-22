package com.bridgelabz2;
import java.util.Scanner;

public class PrimeFactorN {
	public static void main(String args[])
	{
		Scanner sc = new Scanner(System.in);
		int num = sc.nextInt();
		sc.close();
		System.out.println("Prime Factor are:");
		    for(int i=2;i<=num;i++)
		    {
		    	while(num%i==0) {
		    		System.out.print(i+"");
		    		num=num/i;
		    	}
		    }
		    if(num<1)
		    	System.out.println(num);
	}

}

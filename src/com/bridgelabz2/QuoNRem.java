package com.bridgelabz2;
import java.util.Scanner;

public class QuoNRem {
	public static void main(String[] args)
	{
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter divisor:");
		System.out.println("Enter divident:");
		int divisor = sc.nextInt();
		int divident = sc.nextInt();
		sc.close();
		int Quotient = divisor / divident;
		int Remainder = divisor % divident;
		System.out.println("Quotient =" +Quotient);
		System.out.println("Remainder =" +Remainder);
		
		
		
		
	}

}

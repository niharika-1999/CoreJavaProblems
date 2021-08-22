package com.bridgelabz2;
import java.util.Scanner;

public class LargestOf3 {
	public static void main(String[] args) {
		int num1,num2,num3;
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter num1");
		System.out.println("Enter num2");
		System.out.println("Enter num3");
		num1=sc.nextInt();
		num2=sc.nextInt();
		num3=sc.nextInt();
		sc.close();
		
		if(num1>=num2 && num1>=num3)
			System.out.println(num1 + "is largest");
		else if(num2>=num1 && num2>=num3)
			System.out.println(num2 + "is largest");
		else
			System.out.println(num3 + "is largest");
			
	}

}

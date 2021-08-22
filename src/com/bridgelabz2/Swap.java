package com.bridgelabz2;
import java.util.Scanner;

//Swapping Two Numbers

public class Swap {
	public static void main(String[] args) {
		int x,y,t;
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter x and y:");
		x=sc.nextInt();
		y=sc.nextInt();
		sc.close();
		
		t = x;
		x = y;
		y = t;
		System.out.println("After Swapping : "+x+" "+y);
	}

}

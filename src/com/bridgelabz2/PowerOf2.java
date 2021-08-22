package com.bridgelabz2;

public class PowerOf2 {
	public static void main(String[] args) {
		int n= Integer.parseInt(args[0]);
		int i=0;
		int PowerOf2=1;
		while(i<=n)
		{
			System.out.println(i+" "+PowerOf2);
			PowerOf2 = 2 * PowerOf2;
			i=i=1;
		}
	}

}

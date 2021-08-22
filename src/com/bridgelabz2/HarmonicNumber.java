package com.bridgelabz2;
import java.io.*;
//Harmonic Number Program

public class HarmonicNumber {
	static double nthharmonic(int N)
	{
		float harmonic = 1;
		for(int i=2;i<=N;i++)
		{
			harmonic += (float)1/i;
		}
		return harmonic;
	}
	public static void main(String[] args)
	{
		int N=10;
		System.out.print(nthharmonic(N));
		
	}
}

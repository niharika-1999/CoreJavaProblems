package com.bridgelabz2;

public class flipcoin {
	public static void main(String[] args)
	{
		int loopcount=1;
		double result;
		double Tails=0;
		while (loopcount<=10)
		{
			result=Math.random();
			if(result<=0.5)
			{
				System.out.println("Tails");
			}
			if(result<=0.5)
				Tails=Tails++;
			
			else
			{
				System.out.println("Heads");
			}
			loopcount=loopcount+1;
			double percentTails=Tails/10*100;
			double percentHeads=(10-Tails)/10*100;	
				System.out.println("Percentage of Tails is:"+percentTails);
				System.out.println("Percentage of Heads is:"+percentHeads);
		}
	}

}

package com.bridgelabz.basiccoreprograms;

public class FlipCoin
{
    public static void main(String[] args) 
    {
       int numofFlips=20;
       int tails = 0;
       int heads = 0;
        if(numofFlips <= 0)
        {
        	System.err.println("Number of Flips cant be lerss than zero");
        }
        else
        {
        	for (int index=0; index < numofFlips; index++)
        	{
        		if (Math.random() < 0.5)
        		{
        	        tails++;
        		}
        	}
        	double percentageofTails = (tails * 100) / numofFlips;
            double percentageofHeads = 100 - percentageofTails;
            System.out.println("percentage of tails: " + percentageofTails);
            System.out.println("percentage of heads: " + percentageofHeads);
            }
	  }

}

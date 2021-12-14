package com.bridgelabz.basiccoreprograms;

import java.util.Scanner;

public class PowerOf2 {
	public static void main(String[] args) {
		 System.out.println("Enter the power of N :");
	    Scanner scanner = new Scanner(System.in);
	   int num= scanner.nextInt();
		int powerof2=1;
		        if(num<31)
		        {
		            for (int i = 1; i <= num; i++)
		            {
		                powerof2 = powerof2 * 2;
		            }
		            System.out.println(num+ " number power of 2  is :"+powerof2);
		        }
		        else{
		            System.out.println("please enter the Number till 31");
		        }
		        if (((powerof2 % 4 == 0) && (powerof2 % 100!= 0)) || (powerof2 % 400 == 0))
				{
					System.out.println("Leap Year");
				}
				else {
					System.out.println("Not a Leap year");
				}
		    }
	

	}

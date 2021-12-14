package com.bridgelabz.basiccoreprograms;

public class LeapYear {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("Welcome to Leap Year Program");
		int number = 2020;
		if (((number % 4 == 0) && (number % 100!= 0)) || (number % 400 == 0))
		{
			System.out.println("Leap Year");
		}
		else {
			System.out.println("Not a Leap year");
		}
	}

}

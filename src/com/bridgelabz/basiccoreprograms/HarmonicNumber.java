package com.bridgelabz.basiccoreprograms;
import java.util.Scanner;


public class HarmonicNumber {

	public static void main(String[] args) {
		System.out.println("Welcome to Harmonic Number Program");
		System.out.println("Enter the Harmonic  Nth Number  ");
        Scanner scanner = new Scanner(System.in);
        int num = scanner.nextInt();
        System.out.println("The Harmonic Series Number is ");
        double result = 0.0;
    while(num > 0)
    {
        result = result +  (double )1/num ;
        num--;
       System.out.println(result + "  ");
 
}
    System.out.println( "  ");
    System.out.println("The Harmonic Series Number is  " + result);
}
}

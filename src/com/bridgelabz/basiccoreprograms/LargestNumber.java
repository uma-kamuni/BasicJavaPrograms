package com.bridgelabz.basiccoreprograms;
import java.util.Scanner;
public class LargestNumber {

	public static void main(String[] args) {
		System.out.println("Welcome to Largest 3 number program");
        Scanner scanner= new Scanner(System.in);
        System.out.println(" Enter 3 numbers ");
        int num1= scanner.nextInt();
        int num2= scanner.nextInt();
        int num3= scanner.nextInt();
        if (num1 > num2 && num1 > num3) {
            System.out.println(num1 + "is a largest");
        } else if (num2 > num1 && num2 > num3) {
            System.out.println(num2 + "is a largest");
        } else {
            System.out.println(num3 + "is a largest");

        }
	}

}

package com.bridgelabz.basiccoreprograms;
import java.util.Scanner;

public class EvenorOdd {
	public static void main(String[] args) {
	System.out.println("Welcome to Even Odd Program");
    Scanner scanner = new Scanner(System.in);
    System.out.println("Enter the Number  ");
    int num = scanner.nextInt();
    if (num%2==0){
        System.out.println(num + " is a Even number");
    }
    else
    {
        System.out.println(num + " is a  odd number");
    }
}
}
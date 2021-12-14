package com.bridgelabz.basiccoreprograms;
import java.util.Scanner;
public class Factor {

	public static void main(String[] args) {
		System.out.println("Welcome to prime factorization Program");
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter the Number  ");
        int number = scanner.nextInt();
	for(int i = 2; i<=number; i++) 
	{
        while(number%i == 0) {
            System.out.println(i+" ");
            number = number/i;
        }
    }
        System.out.println(number);
}
}
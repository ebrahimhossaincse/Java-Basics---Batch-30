package me.ebrahimhossain;  // Declares the package name for organizing the class

import java.util.Scanner;  // Imports Scanner class to take user input

public class UserInput {  // Defines the UserInput class
    public static void main(String[] args) {  // The main method, which is the entry point of a Java program

        // Creating a Scanner object to read input from the user
        Scanner input = new Scanner(System.in);

        // Prompting the user to enter the first number
        System.out.println("Please enter 1st number: ");
        int number = input.nextInt();  // Reads the first integer input

        // Prompting the user to enter the second number
        System.out.println("Please enter 2nd number: ");
        int number2 = input.nextInt();  // Reads the second integer input

        // Performing and printing basic arithmetic operations
        System.out.println("Summation: " + (number + number2));  // Addition
        System.out.println("Difference: " + (number - number2));  // Subtraction
        System.out.println("Product of numbers: " + (number * number2));  // Multiplication

        // Checking for division by zero before performing division
        if (number2 != 0) {
            System.out.println("Division of numbers: " + (number / number2));  // Division
        } else {
            System.out.println("Division by zero is not allowed.");
        }

        // Closing the Scanner object to prevent resource leaks
        input.close();
    }
}

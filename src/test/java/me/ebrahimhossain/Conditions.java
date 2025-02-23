package me.ebrahimhossain;  // Declares the package name for organizing the class

import java.util.Scanner;  // Imports the Scanner class to take user input

public class Conditions {  // Defines the Conditions class
    public static void main(String[] args) {  // The main method, which is the entry point of a Java program
        Scanner input = new Scanner(System.in);  // Creates a Scanner object to read user input

        // Taking two integer inputs from the user
        System.out.println("Please enter 1st number: ");
        int number1 = input.nextInt();  // Reads the first integer from the user

        System.out.println("Please enter 2nd number: ");
        int number2 = input.nextInt();  // Reads the second integer from the user

        // Conditional statement to compare the two numbers
        if (number1 > number2) {
            System.out.println(number1 + " is greater than " + number2);
        } else if (number1 == number2) {
            System.out.println(number1 + " is equal to " + number2);
        } else {
            System.out.println(number2 + " is greater than " + number1);
        }

        // Taking two string inputs from the user
        System.out.println("Please enter 1st text: ");
        String text1 = input.nextLine();  // Reads the first string input

        System.out.println("Please enter 2nd text: ");
        String text2 = input.nextLine();  // Reads the second string input

        // Comparing the two strings
        if (text1.equals(text2)) {
            System.out.println(text1 + " is equal to " + text2);
        } else if (text1.equalsIgnoreCase(text2)) {
            System.out.println(text1 + " is equal to " + text2 + " but case insensitive");
        } else {
            System.out.println(text1 + " is not equal to " + text2);
        }

        // Taking a month input for the switch case condition
        System.out.println("Enter condition 1: ");
        int month = input.nextInt();  // Reads an integer input for the month

        // Switch case to print the month name based on the input number
        switch (month) {
            case 1:
                System.out.println("January");
                break;
            case 2:
                System.out.println("February");
                break;
            default:
                System.out.println("Not Found");  // Default case if the input does not match any case
        }

        input.close();  // Closing the Scanner object to prevent resource leaks
    }
}

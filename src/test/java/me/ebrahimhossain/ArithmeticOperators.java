package me.ebrahimhossain;  // Declares the package name, which helps in organizing classes

public class ArithmeticOperators {  // Defines a public class named ArithmeticOperators
    public static void main(String[] args) {  // The main method, which is the entry point of a Java program

        // Declare and initialize two integer variables
        int a = 100;
        int b = 50;

        // Perform addition and store the result in 'res'
        int res = a + b;

        // Print the sum using the 'res' variable
        System.out.println("Sum: " + res);

        // Perform addition directly inside the print statement
        System.out.println("Summation: " + (a + b));

        // Perform subtraction and print the result
        System.out.println("Subtraction: " + (a - b));

        // Perform multiplication and print the result
        System.out.println("Multiplication: " + (a * b));

        // Perform division and print the result
        System.out.println("Division: " + (a / b));
    }
}

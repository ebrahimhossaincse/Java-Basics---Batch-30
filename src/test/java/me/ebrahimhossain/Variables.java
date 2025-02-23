package me.ebrahimhossain;  // Declares the package name for organizing the class

public class Variables {  // Defines the Variables class

    // **Instance Variable (Non-Static)**
    // This variable belongs to an instance of the class and requires an object to access it.
    int instance_variable = 20;

    // **Static Variable**
    // This variable belongs to the class and is shared among all instances.
    static int static_variable = 30;

    public static void main(String[] args) {  // The main method, which is the entry point of a Java program

        // **Local Variable**
        // This variable is declared inside a method and can only be used within this method.
        int local_variable = 10;

        // Printing the local variable
        System.out.println("Local Variable: " + local_variable);
    }
}

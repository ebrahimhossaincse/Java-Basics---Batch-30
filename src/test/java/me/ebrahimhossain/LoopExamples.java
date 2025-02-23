package me.ebrahimhossain;  // Declares the package name for organizing the class

public class LoopExamples {  // Defines the LoopExamples class

    public static void main(String[] args) {  // The main method, which is the entry point of a Java program

        // **For Loop Example**
        // Loops from 0 to 29 (total 30 iterations)
        for (int i = 0; i < 30; i++) {
            System.out.println("Iteration: " + i);  // Prints the current iteration number
        }

        // **While Loop Example**
        // Initializes counter to 0 and loops while counter < 10
        int counter = 0;
        while (counter < 10) {
            System.out.println("While loop counter: " + counter);  // Prints current counter value
            counter++;  // Increments counter by 1
        }

        // **Do-While Loop Example**
        // This loop runs at least once, even if the condition is false
        int counter2 = 0;
        do {
            System.out.println("Do-while loop counter: " + counter2);  // Prints current counter2 value
            counter2++;  // Increments counter2
        } while (counter2 < 0);  // Condition is false, so this loop runs only once
    }
}

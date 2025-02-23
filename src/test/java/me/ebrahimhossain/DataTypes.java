package me.ebrahimhossain;  // Declares the package name for organizing the class

public class DataTypes {  // Defines the DataTypes class
    public static void main(String[] args) {  // The main method, which is the entry point of a Java program

        // Declaring and initializing different data types
        int a = 1;  // Integer type variable
        float b = 1.2f;  // Floating-point number (requires 'f' suffix)
        double c = 1.21221133223;  // Double-precision floating-point number
        char d = 'A';  // Character type variable
        boolean e = true;  // Boolean type variable (true/false)
        byte f = 127;  // Byte type variable (ranges from -128 to 127)
        String name = "Ebrahim";  // String type variable (sequence of characters)

        // Printing individual values of different data types
        System.out.println("Integer value: " + a);
        System.out.println("Float value: " + b);
        System.out.println("Double value: " + c);
        System.out.println("Character value: " + d);
        System.out.println("Boolean value: " + e);
        System.out.println("Byte value: " + f);
        System.out.println("String value: " + name);

        // Printing multiple values in a single statement
        System.out.println("Integer value: " + a +
                " Float value: " + b +
                " Double value: " + c +
                " Character value: " + d +
                " Boolean value: " + e);
    }
}

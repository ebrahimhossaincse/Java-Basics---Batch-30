package me.ebrahimhossain;

import java.util.Scanner;

public class UserInput {
    public static void main(String[] args) {
        //ClassName obj_name = new ClassName(parameters);
        Scanner input = new Scanner(System.in);

        System.out.println("Please enter 1st number: ");
        int number = input.nextInt();

        System.out.println("Please enter 2nd number: ");
        int number2 = input.nextInt();

        System.out.println("Summation: "+(number+number2));
        System.out.println("Difference: "+(number-number2));
        System.out.println("Product of number: "+(number*number2));
        System.out.println("Division of number: "+(number/number2));


    }
}

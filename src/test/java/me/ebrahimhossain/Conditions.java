package me.ebrahimhossain;

import java.util.Scanner;

public class Conditions {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
/*
        System.out.println("Please enter 1st number: ");
        int number1 = input.nextInt();

        System.out.println("Please enter 2nd number: ");
        int number2 = input.nextInt();

        if(number1 > number2){
            System.out.println(number1+" is greater than "+number2);
        }else if(number1 == number2){
            System.out.println(number1+" is equal to "+number2);
        }
        else{
            System.out.println(number2+" is greater than "+number1);
        }


        System.out.println("Please enter 1st text: ");
        String text1 = input.nextLine();
        System.out.println("Please enter 2nd text: ");
        String text2 = input.nextLine();

        if(text1.equals(text2)){
            System.out.println(text1+" is equal to "+text2);
        } else if (text1.equalsIgnoreCase(text2)) {
            System.out.println(text1+" is equal to "+text2+" but ignore case sensitive");
        } else{
            System.out.println(text1+" is not equal to "+text2);
        }
*/

        System.out.println("Enter condition 1: ");
        int month = input.nextInt();

        switch (month) {
            case 1:
                System.out.println("January");
                break;
            case 2:
                System.out.println("February");
                break;

            default:
                System.out.println("Not Found");
        }

    }
}

package me.ebrahim.hossain.oop;

public class MethodOverloading {

    public static void add(int number1, int number2){
        int sum = number1 + number2;
        System.out.println("Adding " + number1 + " and " + number2 +" = " + sum);
    }

    public static void add(int number1, int number2, int number3){
        int sum = number1 + number2+number3;
        System.out.println("Sum " +sum);
    }

    public static void add(int number1, int number2, int number3, int number4){
        int sum = number1 + number2+number3+number4;
        System.out.println("Sum " +sum);
    }

    public static void main(String[] args) {
        add(1, 2);
        add(2, 3, 4);
        add(3, 4, 5, 6);
    }
}

package me.ebrahimhossain;

public class Methods {

    int a;
    static int b;

    public void nonStaticMethod() {
        System.out.println(a+b);
    }

    public static void staticMethod() {
        Methods obj = new Methods();
        System.out.println(obj.a+b);
    }

    public static void add(int number1, int number2){
        int sum = number1 + number2;
        System.out.println("Adding " + number1 + " and " + number2 +" = " + sum);
    }

    // Non Static
    public void multiply(int number1, int number2){
        int mul = number1 * number2;
        System.out.println("Multiplying " + number1 + " and " + number2 +" = " + mul);
    }


    public static void main(String[] args) {
        add(10, 2220);
        add(10,50);
        // Non Static Method access Object
        Methods obj = new Methods();
        obj.multiply(10,30);
    }

}

package me.ebrahim.hossain.oop;

class Student extends Books{
    static String name = "Jason";
    static int age = 25;

    public static void studentInfo(){
        System.out.println("Name: " + name+"\nAge: " + age+"\n");
        System.out.println("Title: " + title+"\nAuthor: " + author+"\nPublisher: " + publisher+"\n");
    }
}

package me.ebrahim.hossain.exceptions;

public class ExceptionHandling {
    public static void main(String[] args) {
        int a = 1;
        int b = 0;
        try{
            System.out.println(a/b);
            try{

            } catch (Exception e) {
                throw new RuntimeException(e);
            }
        }catch(Exception e){
            System.out.println("Value can not divide by zero");
        }

    }
}

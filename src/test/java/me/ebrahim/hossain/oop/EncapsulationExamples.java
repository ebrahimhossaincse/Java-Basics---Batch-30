package me.ebrahim.hossain.oop;

public class EncapsulationExamples {
    private static String name = "Ebrahim";

    public static String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    private static String username = "";
    private static String password = "";

    public static String getUsername() {
        return username;
    }

    public  void setUsername(String username) {
        this.username = username;
    }

    public static String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public static boolean login() {
        System.out.println(getUsername());
        return false;
    }
}

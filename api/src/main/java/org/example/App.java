package org.example;

public class App {
    public static void main(String[] args)
    {
        System.out.println(Utils.isAllPositiveNumber("5","7","33"));
        System.out.println(Utils.isAllPositiveNumber("-5","7","33"));
        System.out.println(Utils.isAllPositiveNumber("abc","7","33"));
    }
}
package com.pluralsight.design_patterns.creational.singleton;

public class DbSingletonDemo {

    public static void main(String[] args) {

        DbSingleton s1 = DbSingleton.getInstance();

        System.out.println(s1);

        DbSingleton s2 = DbSingleton.getInstance();

        System.out.println(s2);

        if (s1 == s2) {
            System.out.println("They are using the same memory slot");
        }
    }
}

package com.company.day11;
//DRY ->dont repeat yourself
//OOP

import java.util.Scanner;

public class ClassLevel {

    String bookName = "Java";  // instance variables
    static double price;// static variables
    static String companyName = "Amazon";

    public static void main(String[] args) {
        ClassLevel exp1 = new ClassLevel();
        System.out.println(exp1.bookName);

        int num = 10;
        String str1 = "Alex";
        String str = "Alex";
        Scanner scanner = new Scanner(System.in);
    }
    public static void method1() {
        System.out.println(companyName);
    }
}

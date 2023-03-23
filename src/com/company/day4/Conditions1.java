package com.company.day4;

import java.util.Scanner;

public class Conditions1 {

    public static void main(String[] args) {

        /** write a program user is able to vote or not
         * ask user his/her age
         * conditions should be age bigger than 18.
         */

        System.out.println("What is your age");
        Scanner scan = new Scanner(System.in);
        int age = scan.nextInt();
        if (age >= 18)
            System.out.println("Hey you should vote in the next election");
        else
            System.out.println("sorry you are not able to vote");


    }
}

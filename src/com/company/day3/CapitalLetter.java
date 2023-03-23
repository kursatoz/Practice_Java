package com.company.day3;

import java.sql.SQLOutput;
import java.util.Scanner;

public class CapitalLetter {

    public static void main(String[] args) {

        /**
         *  write a program convert character lower case to uppercase
         * user enter a char  like : a
         * result should be like  : A
         * dont user the string method  char.toUpperCase();
         */

        String lowerLetter;
        char upper_Letter;

        System.out.println("Enter the your letter: ");
        Scanner temp = new Scanner(System.in);
        lowerLetter = temp.nextLine();
        upper_Letter = (char) (lowerLetter.charAt(0) - 32);

        System.out.println(upper_Letter);
    }
}

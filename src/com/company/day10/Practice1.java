package com.company.day10;


import java.util.Scanner;

public class Practice1 {
    public static void main(String[] args) {

        /**
         * ask user a number  5
         *  5! = 5x4x3x2x1 = 120
         *
         */

        System.out.println("Enter a number");
        Scanner scanner = new Scanner(System.in);
        int number = scanner.nextInt();
        int fact = 1;
        for (int i = number; i >=1  ; i--) {
            fact = fact*i;
            if (i == 1)
                System.out.print(i);
            else
             System.out.print(i+" x ");

        }
        System.out.print(" = "+fact);

    }

}

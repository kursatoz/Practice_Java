package com.company.day11;

import java.util.Scanner;

public class DoWhile {


    public static void main(String[] args) {
        /**
         *
         * create a Guess number game
         * ask user a number
         * user should try guessing number
         * TRY AGAIN ->> looping
         *
         */
        int userNumber, targetNumber;
        boolean flag = true;
        int count = 3; // limited trying time
        Scanner scanner = new Scanner(System.in);
        targetNumber = (int) (Math.random() * 10);

        do {
            while (count != 0) {
                count--;
                System.out.println("Hey pls a enter number between 0 to 10");
                userNumber = scanner.nextInt();
                if (userNumber < 0 || userNumber > 10) {
                    System.out.println("!!!WARNING!!!\npls enter number 1 to 10");
                    flag = false;
                }

                if (userNumber == targetNumber) {
                    System.out.println("!!!You won!!!!");
                    System.out.println(" you got the number in the " + count + " tries");
                    break;
                } else {
                    System.out.println("Try again you have left " + count + " times");
                }
            }
        } while (flag);


    }

}


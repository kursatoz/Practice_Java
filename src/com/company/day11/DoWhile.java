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
            int userNumber,targetNumber;
            boolean flag =true;


        Scanner scanner = new Scanner(System.in);
        targetNumber = (int)(Math.random()*10);


           do {
               System.out.println("Hey pls enter number between 0 to 10");

               userNumber = scanner.nextInt();
               if (userNumber < 0 || userNumber > 10) {
                   System.out.println("!!!WARNING!!!\npls enter number 1 to 10");
               }
               if (userNumber == targetNumber) {
                   System.out.println("!!!You won!!!!");
                   flag = false;
               }

           } while (flag );



    }
}

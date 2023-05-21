package com.company.day22.DiceGame;

import java.util.Scanner;

public class Round {

//    public static void main(String[] args) {
//        System.out.println(round());
//    }

    public static int round(){

        Scanner scanner = new Scanner(System.in);
        int roundTime = 0;


        do {

            try {
                System.out.println("How many times would you like to play?");
                roundTime = scanner.nextInt();

            } catch (Exception e) {
                System.out.println("You should enter a number please!");
                round();

            }

        }while(roundTime< 1 && roundTime >10);

        return roundTime;
    }

}

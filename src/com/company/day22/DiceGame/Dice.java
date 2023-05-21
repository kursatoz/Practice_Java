package com.company.day22.DiceGame;

import java.util.Random;

public class Dice {
/**
 *  Write a program that plays a simple dice game between the computer and the user.
 *  When the program runs, a loop should repeat x times. user giving number
 *  Each iteration of the loop should do the following:
 *  Generate a random integer in the range of 1 through 6. for computer
 *  Generate another random integer in the range of 1 through 6. for user
 *  The die with the highest value wins.
 * (In case of a tie, there is no winner for that particular roll of the dice.)
 */

//public static void main(String[] args) {
//    System.out.println(dice());
//}

public static int dice(){

    Random random = new Random();
    int intDice = random.nextInt(6)+1;

    return intDice;
}

}

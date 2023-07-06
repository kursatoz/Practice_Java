package com.company.day5;

import java.util.Scanner;

public class Practice1 {
    public static void main(String[] args) {

/**
 * create a lottery game;
 * random number : 8 7
 * guess number :  8 9
 *
 * first generate two digits  random number
 * user should enter two digits guess number
 * if user hit to random both two digit get 10k usd;
 * if user hit to random number just one digit  get 7k usd;
 * else user lose the game 0 usd
 *      try again
 *
 *
 */

// Math.random(); -->  0.434354 (0 to 1)
// Math.random()*10 --> 4.34354
//(int)(Math.random()*10) --->4

        String randomNumber = ""+(int)(Math.random()*100);
        //  System.out.println("randomNumber: " +randomNumber);

        Scanner scan = new Scanner(System.in);
        System.out.println("Enter your two digit guess number, pls?");
        String guessNumber = scan.nextLine(); //  8 7
        int guess1, guess2;
        int random1,random2;
        guess1 = guessNumber.charAt(0);//first digit
        guess2 = guessNumber.charAt(1);// second digit

        random1 = randomNumber.charAt(0); //first digit
        random2 = randomNumber.charAt(1);//second digit

      //  System.out.println(guess1+"--" +guess2+"--" +random1 +"--" + random2+"--");
     if (guessNumber.length()<3) { // check digit numbers
         if (guessNumber.equals(randomNumber)) {
             System.out.println("!!!!!You got 10k USD, You won!!!!!");

         } else if (guess1 == random1 || guess2 == random2) { // r; 76 g; 74 || r; 86 g; 36
             System.out.println("----You got 7k USD, good guess----");
         } else if (guess1 == random1 || guess1 == random2 || guess2 == random1 || guess2 == random2) {
             System.out.println("+++++You hit just one digit , and you won 3k USD ++++++ ");

         } else {
             System.out.println("~~~~~~You lose and try again~~~~~");
         }
     }else{
         System.out.println("Please enter just two digit numbers???");
     }


    }
}

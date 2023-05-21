package com.company.day22.DiceGame;

public class Game extends Round{

    public static void main(String[] args) {

        int computerTotalPoint = 0;
        int userTotalPoint = 0;

        int roundTime = round();

        for (int i = 0; i <roundTime ; i++) {
            computerTotalPoint += Dice.dice();
            userTotalPoint +=Dice.dice();
        }
        System.out.println(computerTotalPoint);
        System.out.println(userTotalPoint);

        if (computerTotalPoint > userTotalPoint)
            System.out.println("Computer wins the game!");
         else if(userTotalPoint> computerTotalPoint)
            System.out.println("User wins the game!");

    }

}

package com.company.day14;

import java.util.Random;
import java.util.Scanner;

public class BattleShip {
    public static void main(String[] args) {
        /**
         *     board[1][1] = S   board[2][3] =S    user[4][3] == 'S' => hit  user[2][0] == 'S' =>missed
         *      0 1 2 3 4
         *    0 - - - - -
         *    1 - S - - -
         *    2 - - - S -
         *    3 - S - - -
         *    4 - - - S -
         *
         */
        int boardSize = 4;
        char[][] board = new char[boardSize][boardSize];
        int shipsNumber = 6;
        int hit = 0;
        int miss = 0;
        Scanner scanner = new Scanner(System.in);

// random assign ship
        for (int i = 0; i < shipsNumber; i++) {
            int row = (int) (Math.random() * boardSize);
            int col = (int) (Math.random() * boardSize);
            board[row][col] = 'S';
        }
        // user enter row and col
        int shoot = 0;
        while (shoot < shipsNumber) {
            System.out.println("Enter a row:");
            int row = scanner.nextInt();
            System.out.println("Enter a col:");
            int col = scanner.nextInt();
            if (board[row][col] == 'S') {
                board[row][col] = 'H';
                System.out.println("you hit to ship!!");
                hit++;
            } else {
                System.out.println("you missed!!");
                board[row][col] = 'M';
                miss++;
            }
            shoot++;
            // display board
            for (int i = 0; i < boardSize; i++) {
                for (int j = 0; j < boardSize; j++) {
                    System.out.print(board[i][j] + " ");
                }
                System.out.println();
            }



        }
        System.out.println("you hit ships "+hit+" times and you missed ship "+miss+" times");

    }
}

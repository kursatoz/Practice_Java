package com.company.day10;

public class Practice6 {
    public static void main(String[] args) {
        /**
         *         1
         *       1 2
         *     1 2 3
         *   1 2 3 4
         */
        int n = 8; // row number
        for (int i = 1; i <= n ; i++) {   // row
            for (int j = n; j>i  ; j--) { // space
                System.out.print(" ");
            }
            for (int k = 1; k <= i; k++) {
                System.out.print(" " +k);
              }
            System.out.println();
        }


    }
}

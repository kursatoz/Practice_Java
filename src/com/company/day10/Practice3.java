package com.company.day10;

public class Practice3 {
    public static void main(String[] args) {
        /**
         * 1
         * 1 2
         * 1 2 3
         * 1 2 3 4
         * 1 2 3 4 5
         */

        for (int row = 1; row <=5 ; row++) {
            for (int j = 1; j <=row ; j++) {
                System.out.print(j+" ");
            }
            System.out.println();

        }
    }
}

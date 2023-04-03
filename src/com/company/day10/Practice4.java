package com.company.day10;

public class Practice4 {
    public static void main(String[] args) {
        /**
         * 1
         * 2 3
         * 4 5 6
         * 7 8 9 10
         *
         */
        int counter = 1;
        for (int i = 1; i <=4 ; i++) {
            for (int j = 1; j <=i ; j++) {
                System.out.print(counter+" ");
                counter++;
            }
            System.out.println();
        }


    }
}

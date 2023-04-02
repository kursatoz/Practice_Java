package com.company.day9;

public class Practice1 {
    public static void main(String[] args) {

        /**      0 1 2 3 4 item
         *    0  1 2 3 4 5
         *    1  1 2 3 4 5
         *    2  1 2 3 4 5
         *    3  1 2 3 4 5
         *    4  1 2 3 4 5
         *
         */
        for (int i = 0; i <5; i++) {
            for (int j = 1; j <=5 ; j++) {
                System.out.print(j+"-");

            }
            System.out.println();
        }

    }
}

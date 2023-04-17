package com.company.day13;

public class MDA {


    public static void main(String[] args) {

            int[] cell = {2,5,25,55};

                          //-----0------  -----1----- ------2------
            int[][] cell1 ={{0,1,2,3,4,5},{0,1,2,3,4},{5,4,3,2,1,0}};
//        System.out.println(cell1[1][3]); //3
//        System.out.println(cell1[2][0]); // 5

        int row = (int)(Math.random()*5);
        int col = (int)(Math.random()*5);
        System.out.println(row);
        /**
         *    3 4 0 - -
         *    - - - - -
         *    - - - X -     (4,3) == 'X'
         *    - - - - -
         *    - - - - -
         *
         *
         */

        for (int i = 0; i <cell1[2].length ; i++) {

        }




    }
}

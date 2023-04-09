package com.company.day11;

public class While {

    public static void main(String[] args) {
        /**
         * for i
         * while
         * do while
         * for each
         */
int n =10;
String name =" Flora";
        for (int i = 0; i <= name.length() ; i++) {
            System.out.println(i);
        }

        while(n!=0){
            System.out.println(n);
            n--;

        }


        do {
            System.out.println(n);

        }while(n!=0);


    }



}

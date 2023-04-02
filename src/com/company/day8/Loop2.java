package com.company.day8;

import java.util.Scanner;

public class Loop2 {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter begin and ending number for sum calculator");
        int x = scanner.nextInt();
        int y =  scanner.nextInt();

        System.out.println(sum(x,y));

        }


     public static int sum(int begin , int end){ // begin =10 end= 15  10+11+12+13+14+15
        int total =0;
        for (int i = begin ; i <=end; i++){
            total +=i;

        }
        return total;
     }

}

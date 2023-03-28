package com.company.day8;

import java.util.Scanner;

public class Mul {


        public static void main(String[] args) {

            Scanner scanner = new Scanner(System.in);
            System.out.println("Enter begin and ending number for multiplication calculator");
            int x = scanner.nextInt();
            int y =  scanner.nextInt();

            System.out.println(mul(x,y));

        }
// 1 to 10 ->  1*2*3*4*5*6*7*8*9*10

        public static int mul(int begin , int end){ // begin =10 end= 15  10+11+12+13+14+15
            int total = 1;
            for (int i = begin ; begin <=end; begin++){
                total *=begin;

            }
            return total;
        }

    }


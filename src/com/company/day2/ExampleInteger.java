package com.company.day2;

import java.io.*;
import java.util.Scanner;

public class ExampleInteger {

    public static void main(String[] args) {
//      int a =10,b = 10;
//          a+=2;
//          a +=3;
//        System.out.println(a);
//        String name = "Halil";
//        int number = 100;
//        Integer num =100;
//        num.toString();
////        System.out.println(b--+"  "+--a);
////        System.out.println(b+"  "+--a);
        Scanner scan = new Scanner(System.in);

        String num1 = scan.nextLine();
        char firstLetter = (char)((int)num1.charAt(0)-32);
        System.out.println(firstLetter);






    }


}

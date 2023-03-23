package com.company.day4;
import java.util.Scanner;
public class Condition3 {

    public static void main(String[] args) {

/** ask to user get car speed number
 *  if speed  > 50
 *      if speed > 70
 *              get warming message
 *      if speed  > 90
 *                get demerit point 3
 *      if speed  >100
 *                go to jail
 *  esle if    speed <50
 *          safe drive
 *
 **/
        System.out.println(" What is the last car speed ? ");
        Scanner scan = new Scanner(System.in);
            int speed = scan.nextInt();
            if (speed >= 50){
                if (speed >=100){
                    System.out.println("You will go to jail");
                    System.out.println("it is too late!!!!");
                }else if(speed >= 90){
                    System.out.println("You got a 2 demirit points");
                    System.out.println("be carafull");
                }else if (speed >= 70){
                    System.out.println("!!!!!Warning message!!!!");
                    System.out.println(" be carefull");
                }else{
                    System.out.println("Be Carafull and safe drive think of your family");
                }

            }else{
                System.out.println("You are safe!!!!!!");
            }

    }
}

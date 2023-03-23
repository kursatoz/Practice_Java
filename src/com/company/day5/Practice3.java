package com.company.day5;

import java.util.Scanner;

public class Practice3 {
    public static void main(String[] args) {

        /**
         * Create a Menu program
         * Menu list; Home - About Us- Contact - Programs - Order
         *if user enter number between 1 to 5
         * user will navigate into the menu depends on the number
         * 1- Home
         * 2- About US
         * 3- Contact
         * 4- Programs
         * 5- Orders
         */
        Scanner scan = new Scanner(System.in);
        System.out.println("Please chose a menu in the following options");
        System.out.println("1- HOME\n2- ABOUT US\n3- CONTACT\n4- PROGRAMS\n5- ORDERS");
       int menuOption = scan.nextInt();
       if (menuOption == 1)
         menuButton();
       else if (menuOption == 2)
          aboutButton();
       else if (menuOption == 3)
           contactButton();
       else if (menuOption == 4)
        programsButton();
       else if (menuOption == 5)
           ordersButton();
       else
           System.out.println("Please enter the in following option and try again!");

    }
      public static void menuButton(){
          System.out.println("1- you are in the  --HOME-- menu\n2- ABOUT US\n3- CONTACT\n4- PROGRAMS\n5- ORDERS");
      }
     public static void aboutButton(){
          System.out.println("1- HOME\n2- You are in the --ABOUT US-- menu\n3- CONTACT\n4- PROGRAMS\n5- ORDERS");
      }
     public static void contactButton(){
          System.out.println("1- HOME\n2- ABOUT US\n3-You are in the  --CONTACT-- menu\n4- PROGRAMS\n5- ORDERS");
      }
     public static void programsButton(){
          System.out.println("1- HOME\n2- ABOUT US\n3- CONTACT\n4- You are in the  --PROGRAMS-- menu\n5- ORDERS");
      }
     public static void ordersButton(){
          System.out.println("1- HOME\n2- ABOUT US\n3- CONTACT\n4- PROGRAMS\n5- You are in the  --ORDERS-- menu");
      }




}

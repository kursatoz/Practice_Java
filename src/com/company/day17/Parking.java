package com.company.day17;

import java.util.Arrays;
import java.util.Scanner;

public class Parking {
    /**
     * 0 1 2 3 4 5 6 7
     * - - - . . - . - // yesterday parking spots
     * . - - . . . - - // today's parking spots
     * as a result = free parking spots are [ 1 - 2 - 7 ]
     */
    static String[] yesterday = new String[8];
    static String[] today = new String[8];

    public static void main(String[] args) {

        yesterdayParking(yesterday);
        todayParking(yesterday);
        resultSpots();
    }

    public static void yesterdayParking(String[] yesPark) {

        System.out.println("Enter parking sport to check");
        Scanner scanner = new Scanner(System.in);
        for (int i = 0; i < yesPark.length; i++) {
            yesPark[i] = scanner.nextLine();
        }

    }

    public static void todayParking(String[] todayPark) {

        System.out.println("Enter parking sport to check");
        Scanner scanner = new Scanner(System.in);
        for (int i = 0; i < todayPark.length; i++) {
            todayPark[i] = scanner.nextLine();
        }

    }

    public static void resultSpots() {

        int occupied = 0;
        int free = 0;
        for (int i = 0; i < yesterday.length; i++) {
            if (yesterday[i].charAt(0) == 'd'  && today[i].charAt(0) == 'd')
                occupied++;
            if (yesterday[i].charAt(0) == 'b'  && today[i].charAt(0) == 'b')
                free++;
        }

        System.out.println(" Total free spots numbers: " + free);
        System.out.println(" Total occupied spots numbers: " + occupied);

    }


}

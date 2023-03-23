package com.company.day6;

import java.util.Scanner;

public class Practice2 {
    public static void main(String[] args) {
        /**
         * Call Center
         * for English press 1 Hello
         * pour la presse fancaise 2 Bonjour
         * 3 prensas para español  Hola
         * 4 Najimatiya dlya russkovo Privet
         *  Turkce icin 5'e bassiniz Merhaba
         */

        System.out.println("Welcome to Halil.ca customer service!!\n Please enter a number for following language options");
        Scanner scanner = new Scanner(System.in);
        int lang = scanner.nextInt();
       callCenter(lang);

    }

    public static void callCenter(int num){
        if (num == 1) {
            System.out.println("for English press 1 Hello");
        } else if (num == 2) {
            System.out.println("pour la presse fancaise 2 Bonjour");
        } else if (num == 3) {
            System.out.println("3 prensas para español  Hola");
        } else if (num == 4) {
            System.out.println("4 Najimatiya dlya russkovo Privet");
        } else if (num == 5) {
            System.out.println("Turkce icin 5'e bassiniz Merhaba");
        } else {
            System.out.println("Please enter a number between 1-5");
        }


    }





}

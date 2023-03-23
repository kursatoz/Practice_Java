package com.company.day3;

import java.util.Scanner;

public class CreateEmail {

    public static void main(String[] args) {
        /**
         write a program create a company email
         ask to user firstName & lastName
         ask to user company name
         ask to country extension  ca || com|| tr
         print out : Ensar.Ozturk@nebula.ca
         */
        String firstName, lastName, companyName, domainExtension;

        int number = 10;
        Scanner scan = new Scanner(System.in);

        System.out.println("Enter your First name");
        firstName = scan.nextLine();

        System.out.println("Enter your Last name");
        lastName = scan.nextLine();

        System.out.println("Enter your Company name");
        companyName = scan.nextLine();

        System.out.println("Enter your country domain name");
        domainExtension = scan.nextLine();
        System.out.println("Your email should be like: " + firstName + "." + lastName + "@" + companyName + "." + domainExtension);
        // Ensar.Ozturk@nebula.ca

    }
}

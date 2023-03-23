package com.company.day3;


import java.util.Scanner;

public class ConvertFahrenheit {

    public static void main(String[] args) {


//        write a program conver celcius  to Fahrenheit
        // user enter a celcius number
        // result be like Fahrenheit
        //(0°C × 9/5) + 32 = 32°F
        System.out.println("___________________________");
        System.out.println("|||||||||||||||||||||||||||");
        System.out.println("---------------------------");
        System.out.println("Hi!, What is temperature in your country?");
        double temp, fahrenheit;

        Scanner scan = new Scanner(System.in);
        temp = scan.nextDouble();
        fahrenheit = (temp + 32) * 5 / 9;
        System.out.println("Your temperature is:  " + fahrenheit);


    }

}

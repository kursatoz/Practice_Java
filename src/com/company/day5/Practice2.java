package com.company.day5;

public class Practice2 {

    public static void main(String[] args) {

        // method has to have  "()", "{}"
        // does not create method inside of main method
        //one of method keep and save data or information
        // one of method doing action

firstMethod(); // call method || invoke method
        System.out.println(sumNumbers(10,44));

    }

    public static void firstMethod(){  //one of method keep and save data or information

        System.out.println("First Method void type");
    }

    public static int sumNumbers (int num1, int num2){
        int sum = num1 + num2;
        return sum;
    }


}

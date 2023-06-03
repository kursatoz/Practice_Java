package com.company.day24;

public class InterviewQuestion {

    public static void main(String[] args) {
/**
 * 1-Use the digits of first number passed to this function to multiply
 * by the second number passed to the function and display the results separated
 * by comma (as shown in sample below) as one string.
 * Sample output when (123, 3) were passed to this function:
 * out output: 3,6,9
 *          abc                c               a                   b
  * input: (254,2)   254 %10 = 4 // 254 /100 = 2  //  254 %100-c = 5
 * output: 4,10,8
 *  input: (365478,10)  (365478) convert to String and get each one as a char
 *
 *
 */

        System.out.println(multi(123,3));

    }

    public static String multi(int number, int multiply){
        String result="";
        String [] arr = Integer.toString(number).split("");
        for (int i = 0; i <arr.length ; i++) {

            result += Integer.parseInt(arr[i])*multiply+",";
        }


        return  result.substring(0,result.length()-1);
    }



}

package com.company.day24;

public class InterviewQuestion2 {
    /**
     * 2-This function receives an string. Your task is to find all even numbers (digits)
     * and sum them up then display the total value in console.
     * For example if following string is passed to this function “v112, sf34,@ 4)-k )”
     * Result should be:
     * The sum of all even number :10
     *
     *
     */
    public static void main(String[] args) {
        System.out.println(sum("v112, sf34,@ 4)-k )"));

    }
    public static int sum(String str){
        int resul = 0;
        String[] arr = str.split("");
        for (int i = 0; i <arr.length ; i++) {
                if (isADigit(arr[i])){
                    if (Integer.parseInt(arr[i])%2 == 0){
                        resul += Integer.parseInt(arr[i]);
                    }

                }
        }

        return resul;
    }

    public static boolean isADigit(String character){
        boolean result = Character.isDigit(character.charAt(0));
        // if ( character.charAt(0)>=48 && character.charAt(0)<= 57 )

        return result;
    }



}

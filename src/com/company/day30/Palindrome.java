package com.company.day30;

//https://leetcode.com/problems/palindrome-number/
public class Palindrome {
    /**
     * @param args 121 - 55555 -  1 2 3 2 1         0 1 2 3 2 1 0
     *             ANA - Madam in Eden, I'm Adam -  w i s e s i w
     */

    public static void main(String[] args) {
//        System.out.println(isPalindromeNumber(1121)); //false
//        System.out.println(isPalindromeString("ana")); // true
        checkArgument("Mad am in _Ede*n, I'm Adam");
    }

    public static void checkArgument(Object input) {
        if (input instanceof String)
            System.out.println(isPalindromeString((String) input));
        else if (input instanceof Integer)
            System.out.println(isPalindromeNumber((Integer) input));
    }

    public static boolean isPalindromeNumber(Integer number) {
        /** 0 1 2
         *  3 5 6 % 10 = 6
         *  356 /10 = 35
         *  35 % 10  = 5
         *  35/10 = 3
         */
        int r, sum = 0;
        int newNumber = number;
        while (number > 0) {
            r = number % 10;
            sum = (sum * 10) + r;
            number /= 10; // number = number /10;

        }
        if (newNumber == sum) {
            return true;
        } else
            return false;
    }

    public static boolean isPalindromeString(String str) {
        /** 0 1 2 3 4 5 6 7 8 9
         *  Mad am in _Ede*n, I'm Adam
         */
        String cleanText = str.replaceAll("[^a-zA-Z0-9]", "");
        String rev = "";
        for (int i = cleanText.length() - 1; i >= 0; i--) {
            rev += cleanText.charAt(i);
        }
        // System.out.println(rev);
        if (cleanText.equalsIgnoreCase(rev)) {
            return true;
        } else
            return false;
    }

}

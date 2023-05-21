package com.company.day21;

public class ReverseWord {
    /**
     * 01234567890123
     * str=          T155 QA course
     * reverse str = esruoc AQ 551T
     */

    public static void main(String[] args) {
        String input = "T115 is QA course!";
        System.out.println(reverseText(input));
    }
    public static String reverseText(String str) {
        char[] reverseArray = str.toCharArray();
        String text = "";
        int left = 0;
        int right = str.length() - 1;

        while (left < right) {
            char temp = reverseArray[left];
            reverseArray[left] = reverseArray[right];
            reverseArray[right] = temp;
            left++;
            right--;

        }
        return  new String(str);
    }

}



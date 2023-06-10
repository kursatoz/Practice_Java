package com.company.day26;

import java.util.HashSet;
import java.util.Set;

public class InterviewQuestion {

    /**
     * print only unique value in string
     * input  :  "aabcncccddeeff"
     * output :  "abcndef"
     */

    public static void main(String[] args) {
// second way
        String str = "azbcncccddeeff";
        Set<Character> setUnique = new HashSet<Character>();
        for (int i = 0; i < str.length(); i++) {
            setUnique.add(str.charAt(i));
        }
        System.out.println(setUnique);

        System.out.println(unique(str));

    }

    //   first way
    public static String unique(String str) {
        String temp = " ";
        String[] arr = str.split("");
        for (int i = 0; i < str.length(); i++) {
            if (!temp.contains(arr[i])) {
                temp += arr[i];
            }
        }

  return temp;
    }
}


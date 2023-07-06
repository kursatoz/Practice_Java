package com.company.day30;
//https://leetcode.com/problems/plus-one/

import java.util.Arrays;

/**
 * 3,2,1 => 3,2,6
 * 9,9,9 => 1,0,0,0
 * 4,3,2,1 => 4,3,3,0
 */

public class PlusOne {
    public static void main(String[] args) {
 int[] arr = {9,9};
        System.out.println(Arrays.toString(incrementOne(arr)));

    }

    public static int[] incrementOne(int[] digit){

        int l = digit.length-1;
        while (l>=0){
            if (digit[l] == 9){
                digit[l] = 0;
            }else {
                digit[l] += 1;
                return digit;
            }
            l--;
         }
        int[] result = new int[digit.length+1];
            result[0] = 1;
        for (int i = 0; i <result.length-1 ; i++) {
            result[i+1] = digit[i];
        }
 return result;
    }

}

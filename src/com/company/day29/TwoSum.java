package com.company.day29;

import java.io.FilterOutputStream;
import java.util.Arrays;
//https://leetcode.com/problems/two-sum/
public class TwoSum {

    public static void main(String[] args) {

        System.out.println(Arrays.toString(twoSum(new int[]{2,15,11,7}, 9)));
    }

    public static int[] twoSum(int[] numbers, int target){
        int[] result = new int[2]; // 3,2,4
        for (int i = 0; i <numbers.length ; i++) {
            for (int j = i+1; j <numbers.length ; j++) {
               if (numbers[i]+numbers[j] == target) {
                   result[0] = i;
                   result[1] = j;
               }
            }

        }

        return result;
    }
}

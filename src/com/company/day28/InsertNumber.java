package com.company.day28;

public class InsertNumber {
    /**
     * Input: nums = [1,3,5,6,7,8,9,11,22,25,36,147], target = 37
     * Output: 2
     *
     *
     */


    public static void main(String[] args) {
        int[] arr ={1,3,5,7,8,9,10,25,47};
             System.out.println(insert(arr, 48));

    }
    public static int insert(int[] arr, int target ){
       int result;
        int start = 0;
        int end = arr.length-1;

        while (start<=end){
            int mind = (start+end)/2; // the mind index should be updated in each loop
            if (arr[mind] == target)
                return mind;
           else if(arr[mind]< target)
                    start = mind+1;
            else if(arr[mind]> target)
                    end = mind-1;
        }
        return start;
    }



}

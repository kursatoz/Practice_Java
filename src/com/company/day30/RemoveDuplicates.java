package com.company.day30;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class RemoveDuplicates {
    public static void main(String[] args) {
            List<Integer> lst = new ArrayList<Integer>();
            lst.add(1);
            lst.add(1);
            lst.add(2);
            lst.add(2);
            lst.add(3);
            lst.add(4);
       // int[] a={1,1,1,1,1,1,1,1,3,3,4,5,5,5};
        System.out.println(deleteDuplicates(lst));
    }
    public static List<Integer> deleteDuplicates(List<Integer> arr){
    List<Integer> temp = new ArrayList<Integer>();
            int j = 0;
        for (int i = 0; i <arr.size()-1 ; i++) {
            if(!arr.get(i).equals(arr.get(i+1))){
                temp.set(j++,arr.get(i));
            }
        }
       // temp[j++] = arr[l-1];
       return temp;
    }

}

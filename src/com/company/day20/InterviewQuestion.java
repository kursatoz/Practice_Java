package com.company.day20;

import java.util.ArrayList;
import java.util.Arrays;

public class InterviewQuestion {
    public static void main(String[] args) {
        /**
         * swap element : biggest element swap with second biggest element
         2   1                               1  2
         * array=[2,5,10,69,78,54,11]  ---- newarray=[2,5,10,78,69,54,11]
         */
        ArrayList<Integer> list = new ArrayList<Integer>(Arrays.asList(10,9,8,7,6,5,4,3));
        // find first and second-biggest elements
        int firstIndex = 0;
        int secondIndex = 1;
        for (int i = 2; i < list.size(); i++) {
            if (list.get(i) > list.get(firstIndex)) {
                secondIndex = firstIndex;
                firstIndex = i;
            } else if (list.get(i) > list.get(secondIndex)) {
                secondIndex = i;
            }
        }
// swap the element and set to the new index
        int temp = list.get(firstIndex);
        list.set(firstIndex, list.get(secondIndex));
        list.set(secondIndex, temp);
        System.out.println(list);

    }
}

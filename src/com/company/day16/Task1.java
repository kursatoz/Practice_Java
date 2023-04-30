package com.company.day16;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Comparator;

public class Task1 {
    /**
     *   descending sorting your elements
     *  (2,5,69,0,2,715,35,2,79,100,13) after sorting (715,100,79,69,35,13,5,2,2,0)
     * //0 1 2  3 4 5   6  7 8  9  10
     *        list.get(0) >list.get(1)
     *        list.get(i) > list.get(j)
     */
    public static void main(String[] args) {
    ArrayList<Integer> list = new ArrayList<Integer>(Arrays.asList(36,3,2,78,98,63,100,215,147,896));

//            sortingByAscending(list);
//            sortingByDescending(list);
 //       list.sort(Comparator.naturalOrder()); //TODO learn how to sort method works


    }
    public static void sortingByDescending(ArrayList<Integer> list){
        int temp = list.get(0);
        for (int i = 0; i < list.size() ; i++) {
            for (int j = 0; j < list.size() ; j++) {
                if (list.get(i) > list.get(j)){
                    temp = list.get(i);
                    list.set(i, list.get(j));
                    list.set(j, temp);
                }
            }
        }
        System.out.println("the sorted by Descending new list below \n"+ list);
    }


    public static void sortingByAscending(ArrayList<Integer> list){
        int temp = list.get(0);
        for (int i = 0; i < list.size() ; i++) {
            for (int j = 0; j < list.size() ; j++) {
                if (list.get(i) < list.get(j)){
                    temp = list.get(i);
                    list.set(i, list.get(j));
                    list.set(j, temp);
                }
            }
        }
        System.out.println("the sorted Ascending new list below \n"+ list);


    }


}

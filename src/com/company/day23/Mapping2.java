package com.company.day23;

import java.util.*;

public class Mapping2 {
    public static void main(String[] args) {

        List<String> myList = new ArrayList<String>();
        myList.add("Java_Ercan");
        myList.add("Java_Asil");
        myList.add("Java_Serpil");
        myList.add("Java_Kursad");

        //Map myMap  = new HashMap();

        Map<String,Integer> myMap = new HashMap<String, Integer>();

        for (String each : myList ) {
            myMap.put(each,each.length());
        }
        System.out.println(myMap);


    }

}

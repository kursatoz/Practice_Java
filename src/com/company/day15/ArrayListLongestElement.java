package com.company.day15;

import java.beans.beancontext.BeanContext;
import java.util.ArrayList;

public class ArrayListLongestElement {
    public static void main(String[] args) {

        ArrayList<String> names= new ArrayList<String>();

        names.add("Amr");
        names.add("Arda");
        names.add("Abdurrahim");
        names.add("Asil");
        names.add("Ercan");
        names.add("Halil");
        names.add("Serpil");

        longest(names);
    }

    public static void longest(ArrayList<String> elt){

        String longestName = elt.get(0);
        for  (String each : elt) {
            if (each.length() > longestName.length()){
                longestName = each;

            }

        }
        System.out.println(longestName + " is the longest name");

    }

}

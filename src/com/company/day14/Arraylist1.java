package com.company.day14;

import com.company.day13.Bank;
import org.w3c.dom.ls.LSOutput;

import java.util.ArrayList;
import java.util.Arrays;

public class Arraylist1 {

    public static void main(String[] args) {


        /**
         *
         * Array vs ArrayList
         *
         *
         */
         int [] arr = new int[5];
     String a ="";
     Integer b;

        ArrayList<Integer> arrList = new ArrayList();
        ArrayList<String> arrString = new ArrayList();
        arrString.set(0,"ALi");
        arrString.set(1,"Halil");
        arrString.set(2,"Furkan");
        arrString.set(3,"Asil");

        String[] str = arrString.toArray(new String[0]);
        System.out.println(Arrays.toString(str));

//        arrList.add(123);
//        arrList.add(321);
//        arrList.add(0,100);
//        System.out.println(arrList.get(0));
//        System.out.println(arrList.get(1));
//        System.out.println(arrList.get(2));
//        for (int i = 0; i <arrList.size() ; i++) {
//            System.out.print(arrList.get(i)+" - ");
//        }
//
//        System.out.println(arrString.isEmpty());
//
//        System.out.println("the last element of arralist"+arrList.get(arrList.size()-1));
//        arrList.remove(arrList.size()-1);
//        arrList.set(1,365);

    }


}

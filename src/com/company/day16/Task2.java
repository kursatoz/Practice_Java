package com.company.day16;

import java.util.ArrayList;
import java.util.Arrays;

public class Task2 {
    public static void main(String[] args) {
        double gr =0.0;
        String info =" Hazelnut Chocolate Spread, Perfect Toppin for Easter Treats, 725g Jar 2 Pack, 6 Count, 9.7 kilogram";
        ArrayList<String> cardInfo = new ArrayList<String>(Arrays.asList(info.split(",")));
//        System.out.println(cardInfo.get(0).trim()); //Hazelnut Chocolate Spread
//        System.out.println(cardInfo.get(1).trim()); //Perfect Topping for Easter Treats
//        System.out.println(cardInfo.get(2).trim()); //725g Jar 2 Pack
        for (String elt : cardInfo) {
            if ( elt.contains("g")){
                int indexOfG = elt.trim().indexOf("g");
                gr = Double.parseDouble(elt.substring(0,indexOfG+1));
                    break;
            }

        }
      System.out.println("Nutella gr is : "+gr);


    }
}

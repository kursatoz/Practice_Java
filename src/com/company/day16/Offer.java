package com.company.day16;


import java.util.ArrayList;
import java.util.Arrays;

public class Offer {
    public static void main(String[] args) {
        Hiring offer1 = new Hiring("Abdurrahim","Unsal","SaintLouis",105000.00,false,"SDET",3);
        Hiring offer2 = new Hiring("Ercan","Bayraktar",110000.00);
        Hiring offer3 = new Hiring("Serpil","Dundar",99000.00);
        Hiring offer4 = new Hiring("Kursad","Oz",99001.00);

        ArrayList<Hiring> offerList = new ArrayList<Hiring>(Arrays.asList(offer1,offer2,offer3));
        offerList.add(offer4);
            int count = 1;
        for ( Hiring eachOffer : offerList ) {
            System.out.println(count+". -------------------");
            System.out.println(eachOffer.toString());
           count++;
        }


//        offerList.set(0,offer3);
//        System.out.println("the first offer is for:  "+offerList.get(0));
//        System.out.println(offer1.toString());
//        offer1.setEmployeeExperience(5);
//        offer1.promotion10();
//        System.out.println(offer1.getSalary());


    }
}

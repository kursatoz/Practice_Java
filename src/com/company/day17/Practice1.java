package com.company.day17;

import java.util.ArrayList;
import java.util.Arrays;

public class Practice1 {

    public static void main(String[] args) {
        String[] elements = {
                "iPhone 6s,449,18.71",
                "iPhone 6s Plus,549,22.88",
                "iPhone X,1149,56.16",
                "MacbookPro,1499.99,79.49",
                "ThumbDrive,39.99,2.68",
                "Beats HeadPhones,349.99,15.12",
                "Mouse,79.99,8.98",
                "Charger,39.99,4.56",
                "iPad,429,18.31",
                "Dyson Vacuum,399,16.25",
                "TV,2199,89.49",
                "Apple Watch,559,21.18"};
        ArrayList<String> products =  new ArrayList<String>(Arrays.asList(elements));
        String[] productName = new String[products.size()];
        for (int i = 0; i < products.size() ; i++) {
            productName[i] = products.get(i).split(",")[0];
        }
       // System.out.println(Arrays.toString(productName));
//-------------------------------------------------- just write all iphone items
        ArrayList<String> iPhone = new ArrayList<String>();
        for (String each :products) {
            if (each.startsWith("iPhone")){
                iPhone.add(each);
            }
        }
      //  System.out.println(iPhone);
      //  System.out.println(averageIphone(iPhone));

        discountAppleWatch(products);
        System.out.println(products);


    }
    //-----------------------  average just for iphone price
    public static double averageIphone(ArrayList<String> iPhone){
        double averagePrice =0.0;
        double sum = 0.0;
        for  (String each : iPhone ) {
          double price = Double.parseDouble(each.split(",")[1]);
           sum =+ price;
        }
        averagePrice = sum / iPhone.size();

    return averagePrice;

    }


    //------------------- Apple watch has 10% discount

public static void discountAppleWatch(ArrayList<String> list){
        int indexOfAppleWatch = 0;
    for (int i = 0; i < list.size(); i++) {
           if(list.get(i).startsWith("Apple Watch"))
            indexOfAppleWatch = i;
    }

     String name = list.get(indexOfAppleWatch).split(",")[0];
     double price = Double.parseDouble(list.get(indexOfAppleWatch).split(",")[1]);
     double monthly = Double.parseDouble(list.get(indexOfAppleWatch).split(",")[2]);
     double newPrice = price - price*0.1;
     double newMonthly =monthly - monthly*0.1;
     String appleWatchupdate = name+","+newPrice+","+newMonthly;
     list.set(indexOfAppleWatch,appleWatchupdate);



}







}

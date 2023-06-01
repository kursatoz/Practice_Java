package com.company.day23;

import java.util.HashMap;
import java.util.Map;

public class Mapping {


    public static void main(String[] args) {

        Map myMap = new HashMap();

        myMap.put("Serpil",1);
        myMap.put("Asil",2);
        myMap.put("Ercan",3);
        myMap.put("Serpil",5);//overridden the first one


        for (Object each : myMap.keySet()) {
            System.out.println("List name; "+ each +"  Order number ;"+myMap.get(each));
        }



    }

}

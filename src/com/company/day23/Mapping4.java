package com.company.day23;

import java.util.HashMap;
import java.util.Map;
import java.util.TreeMap;

public class Mapping4 {

    public static void main(String[] args) {

        Map<String,Double> map = new TreeMap<String, Double>();
        map.put("Tomato",1.99);
        map.put("Potato",2.99);
        map.put("Banana",0.99);
        map.put("Apple", 1.99);
        map.put("Orange",10.36);
        map.put("Strawberry",2.99);

        System.out.println(map.size()); // 6

        if (!map.containsKey("Grape"))
            map.put("Grape",2.99);


//        map.remove("Apple");
//        map.replace("Banana",10.11);
//        map.replace("Tomato",map.get("Tomato")+1);
//        System.out.println(map);

    }


}

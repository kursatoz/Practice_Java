package com.company.day26;

import java.util.ArrayList;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;

public class Collection2 {

    public static void main(String[] args) {
        Map<String,String> map1 = new LinkedHashMap();
        map1.put("Name","Ercan");
        map1.put("email","ercan.brktr@gmail.com");
        map1.put("gender","Male");

        Map<String,String> map2 = new LinkedHashMap();
        map2.put("Name","Serpil");
        map2.put("email","serpil.dundar@gmail.com");
        map2.put("gender","F");

        List<Map<String,String>> fullContact = new ArrayList();
        fullContact.add(map1);
        fullContact.add(map2);
       // System.out.println("Full List: " + fullContact);

        System.out.println(fullContact.get(1).get("email"));
        System.out.println(fullContact.get(0).get("gender"));


    }
}

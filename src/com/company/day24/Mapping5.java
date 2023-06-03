package com.company.day24;

import java.util.*;

public class Mapping5 {
    public static void main(String[] args) {
/**
 * T115 : Asil, Ercan
 * T116: Kursad, Hafsa
 * ____________________
 * QA: Asil, Ercan, Serpil
 * Developer: Furkan, Hafsa, Burcu
 * Scrum_Master : Asil, Kursad, Ercan
 *
 *
 *
 */
        List<String> list = new ArrayList<String>(Arrays.asList("Kursad","Asil","Ercan","Halil"));

        Map<String, List<String>> map = new HashMap<String, List<String>>();

        map.put("T115",list);
        map.put("T116",Arrays.asList("Hafsa","Serpil","Burcu"));
        map.put("T117",new ArrayList<String>(Arrays.asList("Furkan","Abdurrahim","Yagiz")));

//        System.out.println(map.get("T116").get(2)); // Burcu
//        System.out.println(map.get("T115").remove(3));
//        System.out.println(map.get("T117").contains("Yagiz"));
//        System.out.println(map.get("T115").add("Abdurrahim"));
//        System.out.println(map.get("T115"));

        for ( Map.Entry<String, List<String>> each   : map.entrySet()) {
            System.out.println("QA course bath: "+ each.getKey()+" Students List: "+each.getValue());

        }







    }
}

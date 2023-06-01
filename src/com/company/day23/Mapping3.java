package com.company.day23;

import java.util.HashMap;
import java.util.Map;

public class Mapping3 {
    /**
     *  input: aabdeeeaabbcccz
     *  output :  a:4 + b:3 + e:2 + c:3 + z:1
     *
     */
    public static void main(String[] args) {
        System.out.println(frequenceLetter("aabdeeeaabbcccz"));
    }
    public static String frequenceLetter(String str){
        String[] arr = str.split("");
        Map<String,Integer> map = new HashMap<String, Integer>();

        for (String each : arr ) {
            if (map.containsKey(each)){
                map.put(each, map.get(each)+1);
            }
            else
                map.put(each,1);
         }
        String result ="";
        for (Map.Entry<String,Integer> each  : map.entrySet()) {
            result+= each.getKey()+each.getValue()+"-";

        }

        return result;
    }


}

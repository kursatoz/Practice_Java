package com.company.day27;

import java.util.HashMap;
import java.util.Map;

public class RomantoInteger {

     /** 50 + 5 + 1+1+1 = 58
     *    L  V  I  I  I
     *  1000  100  1000  10  100  1  5
      *  M     C    M    X   C    I  V
     *   100  500   5
      *   C    D    V  = 4 0 5
     * @param args
     */
    public static void main(String[] args) {

        System.out.println(convertToInteger("m2MXCIV"));
    }
    public static int  convertToInteger(String roman) throws StringIndexOutOfBoundsException{ // CDV
        int total = 0;
        Map<Character , Integer> map = new HashMap();
        map.put('I',1);
        map.put('V',5);
        map.put('X',10);
        map.put('L',50);
        map.put('C',100);
        map.put('D',500);
        map.put('M',1000);

        for (int i = 0; i <roman.length()-1 ; i++) {
            if (!map.containsValue(roman.charAt(i)))
                throw new NullPointerException("Hey there is not matches symbol");

            if (map.get(roman.charAt(i+1)) <= map.get(roman.charAt(i)))
                total += map.get(roman.charAt(i));

            else if (map.get(roman.charAt(i)) <= map.get(roman.charAt(i + 1))) {
                total -= map.get(roman.charAt(i));
            }

        }
        return total + map.get(roman.charAt(roman.length()-1));
    }


}

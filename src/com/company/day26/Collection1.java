package com.company.day26;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
import java.util.List;

public class Collection1 {

    public static void main(String[] args) {


        List<Integer> list = new ArrayList<Integer>(Arrays.asList(3,6,5,8,9,6));
        Iterator<Integer> numbers = list.iterator();
  String str = "";
        while(numbers.hasNext()){
            int x = numbers.next();
            if (x >= 5)
                str += x;


        }
        System.out.println(str);

    }

}

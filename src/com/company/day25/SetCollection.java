package com.company.day25;

import java.util.Arrays;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

public class SetCollection {
    public static void main(String[] args) {


        Set<String> states = new HashSet<String>();
        // all Collection type has addAll method
        states.addAll(Arrays.asList("GA", "NY", "FL", "CA", "NY", "WA", "VA", "VA", "FL"));
        System.out.println("states before = " + states);
//        states.remove("GA");
//        System.out.println("states after  = " + states);


//      remove all the states with letter A
        Iterator<String> stIter = states.iterator();
        // Iterator has 3 methods hasNext() next() remove() works together
        // to remove item while iterating over a collection

        while (stIter.hasNext()) {

              if (stIter.next().contains("A")) {
               System.out.println("removing = " + stIter.next());
                stIter.remove();
            }

        }
        System.out.println("states after   = " + states);
        while (stIter.hasNext()) {
//
//            String each = stIter.next();
//            if(each.contains("A") ){
//                System.out.println("removing = " + each);
//                stIter.remove();
//            }
//
//        }
            System.out.println("states after   = " + states);

            System.out.println("stIter.hasNext() = " + stIter.hasNext());
//             IF YOU TRY TO GET THE NEXT ITEM THAT YOU DO NOT HAVE USING ITERATOR
//             YOU WILL GET NoSuchElementException
            System.out.println("stIter.next() = " + stIter.next());



        }
    }
}

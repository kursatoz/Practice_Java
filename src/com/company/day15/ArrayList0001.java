package com.company.day15;

import java.util.ArrayList;

public class ArrayList0001 {
    public static void main(String[] args) {

        ArrayList<String> names= new ArrayList<String>();

        names.add("Amr");
        names.add("Arda");
        names.add("Abdurrahim");
        names.add("Asil");
        names.add("Ercan");
        names.add("Halil");
        names.add("Serpil");

        displayWithChar(names,'*');

    }





    public static void displayWithChar (ArrayList<String> elt, char c){
            String str ="";
        for ( String each : elt ) {
            if (each == elt.get(elt.size()-1)){
                str +=each;
            }else{
                str +=each+c;
            }

        }
        System.out.println(str);


    }


}

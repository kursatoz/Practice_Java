package com.company.day15;

public class ArrayList001 {
    public static void main(String[] args) {

String str = "T115 is a good team in Wise Quarter !";
//
//            String charList =" ";
//        for (int i = 0; i <str.length() ; i++) {
//            charList += str.charAt(i);
//
//        }

        char[] ls = str.toCharArray();
        String char1List =" ";
        for( char  elt   :  ls   ){
            if (elt == ' '){
                continue;
            }else
           char1List +=elt +".";

        }
        System.out.println(char1List);


    }
}

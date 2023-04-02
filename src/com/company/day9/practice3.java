package com.company.day9;

public class practice3 {
    public static void main(String[] args) {

        String text ="AAA";
        String newtext ="";
        for (int i = 0; i <text.length() ; i++) {
                if (!newtext.contains(text.substring(i,i+1))){

                    newtext+=text.charAt(i);
                }

        }
        System.out.println(newtext);
    }


}

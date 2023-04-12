package com.company.day12;

public class Array2 {

    public static void main(String[] args) {

        String[] name ={"Ercan","Furkan","Halil","Asil","Emel","Serpil","Amr","Arda","Ensar","Abdurrahim"};
         String longest = name[0];
        for (int i = 0; i <name.length ; i++) {
            if (name[i].length() > longest.length() ){
                longest = name[i];
            }
        }
//        System.out.println(longest);

        int[] num = {22,33,1,55,4,99,71,25};
        int min = num[0];
        for (int i = 0; i < num.length ; i++) {
            if (num[i] < min){
                min = num[i];
            }
        }
        System.out.println(min);



    }
}

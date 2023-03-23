package com.company.day4;

public class Conditions2 {
    public static void main(String[] args) {

        /** write a program
         * make  order name by alfabatic letter
         *
         *
         */

        String name1, name2, name3;
        name1 = "Kursad"; name2 = "Halil"; name3 = "Flora";

       if (name1.compareTo(name2)>0 && name1.compareTo(name3)>0 && name2.compareTo(name3)>0 ){
           System.out.println("cond1   "+name2 +"-"+name1+"-"+name3);

        }else if(name2.compareTo(name1)>0 && name2.compareTo(name3)>0 && name3.compareTo(name2)>0){

           System.out.println("cond2   "+name1 +"-"+name2+"-"+name3);

       }else if(name2.compareTo(name3)>0 && name2.compareTo(name1)>0 && name1.compareTo(name3)>0) {

           System.out.println("cond3   " + name3 + "-" + name2 + "-" + name1);
       }else if(name3.compareTo(name2)>0 && name3.compareTo(name1)>0 && name2.compareTo(name1)>0){

           System.out.println("cond3   "+name3 +"-"+name2+"-"+name1);

       }else{
           System.out.println("last one   "+name1 +"-"+name2+"-"+name3);
       }
    }
}

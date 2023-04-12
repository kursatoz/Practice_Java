package com.company.day12;

import java.util.Arrays;
import java.util.Scanner;

public class Array1 {

    public static void main(String[] args) {
        //0 1 2 3 4 5
        String teacherName = "Kursad";
        int[] numbers = {1,5,90,8,7,22};
        String[] name ={"Ercan","Furkan","Halil","Asil","Emel","Serpil","Amr","Arda","Ensar","Abdurrahim"};

//        System.out.println(name.length); // for array
//        System.out.println(teacherName.length());// for string
         int[] num = new int[10];
         Scanner scanner = new Scanner(System.in);

            for (int i = 0; i <num.length ; i++) {
            System.out.println("enter an element to the array index of "+i);
               num[i] = (int)(Math.random()*100);
        }
        System.out.println(Arrays.toString(num));





    }



}

package com.company.day9;

public class Practice2 {
    public static void main(String[] args) {
/**
 * 01234   43210
 * kayk,==kayak      anna, deed , Madam im adam
 * kayak.equal(kayak)
 * kayak.contain(kayak)
 *
 *
 */
     palindrome("kursad");
    }

    public static void palindrome(String text){
        String reverse ="";
        for (int i = text.length()-1; i >=0 ; i--) {
            reverse += text.charAt(i);
        }
        if (text.equalsIgnoreCase(reverse)){
            System.out.println(text +" is a Palindrome ");
        }else
        System.out.println(text +" is NOT a Palindrome ");
        }


    }



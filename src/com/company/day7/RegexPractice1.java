package com.company.day7;

/**
 * print out the second word in a sentence.
 * input:"I have JAVA"
 * output:"have"
 */

public class RegexPractice1 {
    public static void main(String[] args) {
                     //012345678910
        String sent = "Iam have JAVA";

        int firstSpaceIndex = sent.indexOf(' ');
        int secondSpaceOfIndex = sent.lastIndexOf(' ');
        String secondWord = sent.substring(firstSpaceIndex,secondSpaceOfIndex);
        System.out.println(secondWord.trim());


    }

}

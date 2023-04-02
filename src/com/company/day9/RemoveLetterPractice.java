package com.company.day9;

public class RemoveLetterPractice {

    public static void main(String[] args) {

        /**
         * 012345678901234567890123  delete all duplicated letter
         * AAABBDNDD DaSZO@I 6 654@@
         * ABDN aSZ0@I654
         *
         */
        String str = "AAABBDNDD DaSZO@I 6 654@@";
        String nonDuplicated = "";
        for (int i = 0; i <str.length() ; i++) {
            if (!nonDuplicated.contains(str.substring(i,i+1))){
                nonDuplicated+=str.charAt(i);

            }


        }
        System.out.println(str);
        System.out.println(nonDuplicated);

    }


}

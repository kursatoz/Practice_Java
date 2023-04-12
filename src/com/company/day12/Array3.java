package com.company.day12;

public class Array3 {
    public static void main(String[] args) {

        String[] email = {"furkan.camioglu@amazon.com"};
       int indexLength= email[0].length();

        String str ="";
//        for (int i = 0; i <indexLength ; i++) {
//            if (email[0].charAt(i) != '@'){
//                str += email[0].charAt(i);
//            }else
//                break;
//        }
//        System.out.println(str);
        int x = 0;
        while(indexLength>0){
            if (email[0].charAt(x) != '@'){
                str += email[0].charAt(x);

            }else
                break;
            x++;
            indexLength--;
        }
        System.out.println(str);
    }
}

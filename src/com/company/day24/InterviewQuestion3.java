package com.company.day24;

public class InterviewQuestion3 {
    /**
     * 3-Create an unordered list where items are the elements of array passed to this function.
     * For example if array [“A”, “B”, “C”, “D”] is passed to this function, your output would be
     * <ul>
     *     <li>A</li>
     *     <li>B</li>
     *     <li>C</li>
     *     <li>D</li>
     * </ul>
     *
     */

    public static void main(String[] args) {
        String[] arr = {"A","B","C","D"};

        System.out.println(ulList(arr));

    }

    public static String ulList(String[] arr){
        String result = "";
        for (int i = 0; i < arr.length ; i++) {
            result += "\n\t<li>"+arr[i]+"</li>";
        }


        return "<ul>"+result+"\n</ul>";
    }


}

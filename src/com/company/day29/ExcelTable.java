package com.company.day29;
//https://leetcode.com/problems/excel-sheet-column-number/
public class ExcelTable {
    public static void main(String[] args) {
        System.out.println(columnToNumber("BA"));

    }
     public static int columnToNumber(String columnName){
        int result = 0;
         for (char each  : columnName.toCharArray() ) {
             result = result*26 + (each -'A'+1);
         }
         return result;
     }



//    public static String excelColumn(int num){
//        StringBuilder result = new StringBuilder();
//        while(num!=0){
//
//            int remainder = num%26;  // 53 %26 = 1
//                num/=26;
//                result.append((char)('A'+remainder+1));
//        }
//
//
//        return  result.reverse().toString();
//    }
}

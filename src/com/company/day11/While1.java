package com.company.day11;

public class While1 {
    public static void main(String[] args) {
        int i;
        int sum =0;
        for (i = 0; i <= 10 ; i++) {
            sum+=i; //-> sum = sum +i;
        }
        System.out.println(sum);

        System.out.println("==============================================");
        int total =0;
        int n =0;
        while(n<=10){
            total=total+n;
            n++;
       }
        System.out.println(total);



    }
}

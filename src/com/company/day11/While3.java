package com.company.day11;

public class While3 {
    /**
     * 60s count down
     * 0s console print : 1 min is done
     *
     */
    public static void main(String[] args) throws InterruptedException {
        int sec =60;
        while(sec!=0){

            System.out.print(sec +"s ");
            sec--;
            Thread.sleep(1000); // giving time between the looping process

        }
        System.out.println("1 min is done");
    }



}

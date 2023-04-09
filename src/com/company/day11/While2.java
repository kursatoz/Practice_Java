package com.company.day11;

public class While2 {
    public static void main(String[] args) {
/**
 *  starting  letter = k
 *   looping until ending letter =m
 *   // k l m
 */
char letter = 'c';
int count =0;
while (letter <= 'x'){
    count++;
    if(letter == 'k'){

        System.out.println("you find letter "+letter +" is "+count+". order letter");
        break;
    }


    System.out.print(letter+" ");
    letter++;


}
        System.out.println("break the  loop");


    }
}
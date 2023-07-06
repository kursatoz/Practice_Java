package com.company.day6;
import java.util.Scanner;

public class Practice1 {
    public static void main(String[] args) {

        System.out.println("Welcome to Halil.ca online shopping site!!!");
        System.out.println("Enter you order quantity number = ");
        Scanner scanner = new Scanner(System.in);
        int orderQuantity = scanner.nextInt();
        int storageQuantity = 10;

        if (isOrderAvailable(orderQuantity, storageQuantity)) {
            checkOutPassed();
            storageQuantity -= orderQuantity;
            System.out.println("In storage "+storageQuantity +" items are available now");
        } else {
            checkOutFailed();
        }
    }

    public static boolean isOrderAvailable(int orderQty, int storageQty) { //5 , 10
        return storageQty >= orderQty;
    }
    public static String checkOutPassed() {
       return "Your order is processing  \n your order has been shipped\n Thank your for shopping";
    }
    public static void checkOutFailed() {
        System.out.println("Sorry, Our storage is not enough for your order items");
    }







}

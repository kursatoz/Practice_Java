package com.company.day12;

public class HalilBookStore {
    public static void main(String[] args) {

        BookWarehouseStore javaBook = new BookWarehouseStore();
        javaBook.bookName ="Java OCA Exam Pre 1.2";
        javaBook.bookAuthor = "Arda Erdogan";
        javaBook.bookColor = "Yellow";
        javaBook.bookPrice= 66.99;
        javaBook.bookEdition = 2;
        javaBook.isHardCover = true;
        javaBook.bookPublishYear = 2020;

        System.out.println(javaBook.bookAllInfo());

    }
}

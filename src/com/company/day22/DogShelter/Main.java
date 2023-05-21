package com.company.day22.DogShelter;


import java.util.Scanner;

public class Main { //TODO
    DogShelter shelter = new DogShelter();

Scanner scanner = new Scanner(System.in);

    public int display(){
        System.out.println("Please select to number in following options");
        int displayNumber = scanner.nextInt();
        System.out.println("1.Add_Dog");
        System.out.println("2.View_AllDog");
        System.out.println("3.View_AllAvailableDog");
        System.out.println("4.View_SearchDog");
        System.out.println("5.Update_DogHOmeStatus");
        System.out.println("6.Exit");
        return displayNumber;
    }

    public void displayMenuAction(int menuOption){

        switch (menuOption){

            case 1: shelter.addDog(); //TODO
                break;
            case 2: shelter.viewAllDog();
                break;
            case 3: shelter.viewAllAvailableDog();
                break;
            case 4: shelter.searchDogId();//TODO
                break;
            case 5: shelter.updateHomeStatus();
                break;
            case 6: System.exit(0);

        }


    }







}

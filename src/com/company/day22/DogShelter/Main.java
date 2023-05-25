package com.company.day22.DogShelter;


import java.util.Scanner;

public class Main {

    Scanner scanner = new Scanner(System.in);
    DogShelter shelter = new DogShelter();

    public void run(){
        int userMenuOption;
        do {
           userMenuOption =display();
          displayMenuAction(userMenuOption);
        }while(userMenuOption != 6);

    }

    public Main(){
        run();
    }



    public int display(){
        System.out.println("Please select to number in following options");
        System.out.println("1.\tAdd_Dog");
        System.out.println("2.\tView_AllDog");
        System.out.println("3.\tView_AllAvailableDog");
        System.out.println("4.\tView_SearchDog");
        System.out.println("5.\tUpdate_DogHOmeStatus");
        System.out.println("6.\tExit");
        int displayNumber = scanner.nextInt();
        return displayNumber;
    }

    public void displayMenuAction(int menuOption){

        switch (menuOption){

            case 1: addDogInfo();
                break;
            case 2: shelter.viewAllDog();
                break;
            case 3: shelter.viewAllAvailableDog();
                break;
            case 5: updateDogHomeStatus();
                break;
            case 6: System.exit(0);
                break;


        }


    }
    private void updateDogHomeStatus() {
        System.out.print("Enter dog id: ");
        shelter.updateHomeStatus(scanner.nextInt());

    }

    private void addDogInfo() {

        Dog dogDetail = new Dog();
        System.out.println("Enter dog id: ");
        dogDetail.setDogId(Integer.parseInt(scanner.next()));

        System.out.println("Enter dog name:  ");
        dogDetail.setDogName(scanner.next());

        System.out.println("Enter dog age: ");
        dogDetail.setDogAge(Integer.parseInt(scanner.nextLine()));

        System.out.println("Enter dog breed:  ");
        dogDetail.setDogBreed(scanner.next());

        System.out.println("Enter dog sex:  ");
        dogDetail.setSex(scanner.nextLine().charAt(0));
        dogDetail.setDogFoundHome(false);

        shelter.addDog(dogDetail);

    }

    public static void main(String[] args) {
       new Main();
    }



}

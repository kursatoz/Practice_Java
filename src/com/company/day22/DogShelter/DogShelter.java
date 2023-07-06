package com.company.day22.DogShelter;

import java.util.ArrayList;
import java.util.List;

public class DogShelter {

    private final List<Dog> dogList = new ArrayList();


    public void addDog(Dog dogInfo) {
        for (Dog each : dogList) {
            if (each.getDogId() == dogInfo.getDogId()) {
                System.out.println("WARNING! This dog id is already in our system!!");
            }
        }
        dogList.add(dogInfo);
    }

    public void viewAllDog() {
        for (Dog each : dogList) {
            System.out.println(each.toString());
        }
    }

    public void viewAllAvailableDog() {
        for (Dog each : dogList) {
            if (!each.isDogFoundHome())
                System.out.println(each);
        }
    }

    public void searchDogId(int id) {
        for (Dog each : dogList) {
            if (each.getDogId() == id)
                System.out.println(each);
        }

    }

    public void updateHomeStatus(int id) {
        boolean flag = false;
        for (Dog each : dogList) {
            if (each.getDogId() == id)
                flag = true;
            each.setDogFoundHome(true);
        }
        if (!flag)
            System.out.println("We do not have a dog with the " + id);
    }

}

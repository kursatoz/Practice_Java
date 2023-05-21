package com.company.day22.DogShelter;

public class Dog {

    private int dogId;
    private String dogName;
    private int dogAge;
    private String dogBreed;
    private char sex;
    private boolean dogFoundHome;

 public Dog(){}

    public Dog(int dogId, String dogName, int dogAge, String dogBreed, char sex, boolean dogFoundHome) {
        this.dogId = dogId;
        this.dogName = dogName;
        this.dogAge = dogAge;
        this.dogBreed = dogBreed;
        this.sex = sex;
        this.dogFoundHome = dogFoundHome;
    }

    public int getDogId() {
        return dogId;
    }

    public void setDogId(int dogId) {
        this.dogId = dogId;
    }

    public String getDogName() {
        return dogName;
    }

    public void setDogName(String dogName) {
        this.dogName = dogName;
    }

    public int getDogAge() {
        return dogAge;
    }

    public void setDogAge(int dogAge) {
        this.dogAge = dogAge;
    }

    public String getDogBreed() {
        return dogBreed;
    }

    public void setDogBreed(String dogBreed) {
        this.dogBreed = dogBreed;
    }

    public char getSex() {
        return sex;
    }

    public void setSex(char sex) {
        this.sex = sex;
    }

    public boolean isDogFoundHome() {
        return dogFoundHome;
    }

    public void setDogFoundHome(boolean dogFoundHome) {
        this.dogFoundHome = dogFoundHome;
    }

    @Override
    public String toString() {
        return "Dog Shelter list;" +
                "dogId=" + dogId +
                ", dogName='" + dogName + '\'' +
                ", dogAge=" + dogAge +
                ", dogBreed='" + dogBreed + '\'' +
                ", sex=" + sex +
                ", dogFoundHome=" + dogFoundHome ;
    }
}

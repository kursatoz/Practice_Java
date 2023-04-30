package com.company.day16;

import java.util.Scanner;

public class Students {
    String studentFirstName;
    String studentLastName;
    String studentLocation;
    int studentId;
    int studentAge;
    String studentGrade;

    public Students(String studentFirstName, String studentLastName, String studentLocation,int studentId){
        this.studentFirstName = studentFirstName;
        this.studentLastName = studentLastName;
        this.studentLocation = studentLocation;
        this.studentId = studentId;
    }

    public Students(String studentFirstName, String studentLastName, String studentLocation, int studentId, int studentAge, String studentGrade) {
        this.studentFirstName = studentFirstName;
        this.studentLastName = studentLastName;
        this.studentLocation = studentLocation;
        this.studentId = studentId;
        this.studentAge = studentAge;
        this.studentGrade = studentGrade;
    }

    public Students(){}

    public void newStudentUpdate(String studentFirstName,String lastName, int studentNumber){
        this.studentFirstName = studentFirstName;
        studentLastName = lastName;
        studentId = studentNumber;

    }







}

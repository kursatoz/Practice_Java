package com.company.day18;

public class School{

           private String schoolName; // encapsulation ; member of OOP , DRY, limited access some data, flexibilities, maintainability, extensibility
           int schoolId;
           String schoolLocation;

    public String getSchoolName() {
        return schoolName;
    }

    public void setSchoolName(String schoolName) {
        this.schoolName = schoolName;
    }

    class Student{

        public void main(String[] args) {

            School stSchool = new School();

        }


    }


}


class Teacher{
    public static void main(String[] args) {

        School mySchool = new School();
        mySchool.schoolId = 36977;
        mySchool.schoolLocation = "ON";
        mySchool.setSchoolName("SAPAT");
        mySchool.getSchoolName();

    }


}

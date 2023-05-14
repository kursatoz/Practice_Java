package com.company.day19.ClassRegistrationPractices;

public class Student {

  private int studentId;
  private String firstName;
  private String lastName;
  private int year;


    public Student(int studentId, String firstName, String lastName, int year) {
        this.studentId = studentId;
        this.firstName = firstName;
        this.lastName = lastName;
        this.year = year;
    }

    public int getStudentId() {
        return studentId;
    }

    public int getYear() {
        return year;
    }


    public String getInfo() {
        return "Student{" +
                "studentId=" + studentId +
                ", firstName='" + firstName + '\'' +
                ", lastName='" + lastName + '\'' +
                ", year=" + year +
                '}';
    }
}

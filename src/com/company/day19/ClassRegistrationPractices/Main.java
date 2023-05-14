package com.company.day19.ClassRegistrationPractices;

public class Main {
    public static void main(String[] args) {

        ClassRegistration course1 = new ClassRegistration("T115",15);
            course1.addStudents(202301001,"Ercan","Bayraktar",2);
            course1.addStudents(202301002,"Abdurrahim","Unsal",2);
            course1.addStudents(202301003,"Arda","Erdogan",3);
            course1.addStudents(202301003,"Serpil","Dundar",3);
            course1.addStudents(202301003,"Furkan","Camioglu",4);
            course1.addStudents(202301003,"Kursad","Ozduman",4);

        System.out.println(course1.getClassList());
        System.out.println(course1.getClassList(4));
    }
}

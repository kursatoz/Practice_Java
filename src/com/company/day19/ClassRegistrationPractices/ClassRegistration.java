package com.company.day19.ClassRegistrationPractices;

public class ClassRegistration {
    private  Student[] registeredStudent;
    private String className;
    private int numStudents; //15
    private int maxStudents;  //15

    public ClassRegistration(String className, int maxStudents) {
        this.className = className;
        this.maxStudents = maxStudents;
    }

    public void addStudents(int studentId, String firstName, String lastName,int year){
        numStudents = 0;
        if (numStudents < maxStudents) {
            Student st = new Student(studentId, firstName, lastName, year);
            registeredStudent[numStudents] = st;
            numStudents++;
        }else System.out.println("The class is full sorry!");

    }

    public String getClassList(){
         String s = "";
        for (int i = 0; i <registeredStudent.length ; i++) {
                  s+=i+". \n"+registeredStudent[i].getInfo();
        }
        return s;
    }

    public String getClassList(int year){
        String s = "";
        for (int i = 0; i <registeredStudent.length ; i++) {
            if (registeredStudent[i].getYear() == year){

                s+=i+". \n"+registeredStudent[i].getInfo();

            }
        }
        return s;
    }

    public boolean checkStudentId(int id){
        for (int i = 0; i <registeredStudent.length ; i++) {
            if (registeredStudent[i].getStudentId() == id){
                return true;
            }
        }
        return false;
    }

    public int getNumStudents() {
        return numStudents;
    }

    public String getClassName() {
        return className;
    }



}

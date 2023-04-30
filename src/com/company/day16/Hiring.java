package com.company.day16;

public class Hiring {

    String employeeFirstName;
    String employeeLastName;
    String employeeLocation;
    double employeeSalary;
    boolean isFullTime;
    String employeeJobTitle;
    int employeeExperience;

    public Hiring(String employeeFirstName, String employeeLastName, String employeeLocation, double employeeSalary, boolean isFullTime, String employeeJobTitle, int employeeExperience) {
        this.employeeFirstName = employeeFirstName;
        this.employeeLastName = employeeLastName;
        this.employeeLocation = employeeLocation;
        this.employeeSalary = employeeSalary;
        this.isFullTime = isFullTime;
        this.employeeJobTitle = employeeJobTitle;
        this.employeeExperience = employeeExperience;
    }
    public Hiring(){}

    public Hiring(String employeeFirstName, String employeeLastName ){
        this.employeeFirstName = employeeFirstName;
        this.employeeLastName = employeeLastName;
    }
    public Hiring(String employeeFirstName, String employeeLastName,double employeeSalary ){
        this.employeeFirstName = employeeFirstName;
        this.employeeLastName = employeeLastName;
        this.employeeSalary = employeeSalary;
    }

    public double getSalary(){
      //  System.out.println(employeeSalary);
        return employeeSalary;
    }


    public void setEmployeeExperience(int experience){
        this.employeeExperience = experience;
    }

    public double promotion10(){

        if (employeeExperience > 4) {
           employeeSalary*=1.1;
                      }
      return employeeSalary;
    }


    @Override
    public String toString() {
        return "\nHiring{" +
                "employeeFirstName='" + employeeFirstName + '\'' +
                ",\nemployeeLastName='" + employeeLastName + '\'' +
                ",\nemployeeLocation='" + employeeLocation + '\'' +
                ",\nemployeeSalary=" + employeeSalary +"$"+
                ",\nisFullTime=" + isFullTime +
                ",\nemployeeJobTitle='" + employeeJobTitle + '\'' +
                ",\nemployeeExperience=" + employeeExperience +
                '}';
    }
}

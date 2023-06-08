package com.company.day25;

public class Job implements Comparable<Job> {

    // in order to sorted elements'
    // collection sorted method Tree<>
    //

    private double salary;
    private String companyName;
    private String location;
    private String jobPosition;

    public Job(){

    }

    public Job(double salary, String companyName, String location, String jobPosition) {
        this.salary = salary;
        this.companyName = companyName;
        this.location = location;
        this.jobPosition = jobPosition;
    }

    public double getSalary() {
        return salary;
    }

    public void setSalary(double salary) {
        this.salary = salary;
    }

    public String getCompanyName() {
        return companyName;
    }

    public void setCompanyName(String companyName) {
        this.companyName = companyName;
    }

    public String getLocation() {
        return location;
    }

    public void setLocation(String location) {
        this.location = location;
    }

    public String getJobPosition() {
        return jobPosition;
    }

    public void setJobPosition(String jobPosition) {
        this.jobPosition = jobPosition;
    }

    @Override
    public int compareTo(Job o) {
        if(this.salary > o.salary)
         return 1; // true
        else if(this.salary <o.salary)
            return 0; // false
        else
            return -1; //error
    }

    @Override
    public String toString() {
        return "Job{" +
                "salary=" + salary +
                ", companyName='" + companyName + '\'' +
                ", location='" + location + '\'' +
                ", jobPosition='" + jobPosition + '\'' +
                '}';
    }
}

package edu.neu.csye6200.daycare.model;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;


@Entity(name = "student")
public class Student extends Person {
    @Column(name = "gpa")
    private double gpa;


    public Student() {
        super();
    }

    public Student(String firstName, String lastName, String emailId, String dateOfBirth, String parentFullName, String address, double gpa) {
        super(firstName, lastName, emailId, dateOfBirth, parentFullName, address);
        this.gpa = gpa;
        if (this.getAge() < 6)
            throw new IllegalArgumentException("Student Age should be more than or equal to 6 Months");
    }

    public double getGpa(){
        return gpa;
    }

    public void setGpa(double gpa){
        this.gpa = gpa;
    }


}

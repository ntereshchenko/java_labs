package edu.ntudp.fit.lab3.models;

import edu.ntudp.fit.lab3.Sex;

public class Human {
    private String lastName;
    private String firstName;
    private String fatherName;
    private Sex sex;
    public Sex getSex() {
        return sex;
    }

    public void setSex(Sex sex) {
        this.sex = sex;
    }
    public String getLastName() {
        return lastName;
    }

    public String getFirstName() {
        return firstName;
    }

    public String getFatherName() {
        return fatherName;
    }



    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public void setFatherName(String fatherName) {
        this.fatherName = fatherName;
    }




    public String toString() {
        return "\n Last name: " + lastName + "\n " + "First name: " + firstName + "\n " + "Father name: "
                + fatherName + "\n " + "Sex: " + sex;
    }
}




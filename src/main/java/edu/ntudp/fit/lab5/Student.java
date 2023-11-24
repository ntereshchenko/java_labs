package edu.ntudp.fit.lab5;

import java.sql.Date;

public class Student {
    private int id;
    private String lastName;
    private String firstName;
    private String middleName;
    private Date birthDate;
    private int studentIdCard;

    public Student(int id, String lastName, String firstName, String middleName, Date birthDate, int studentIdCard) {
        this.id = id;
        this.lastName = lastName;
        this.firstName = firstName;
        this.middleName = middleName;
        this.birthDate = birthDate;
        this.studentIdCard = studentIdCard;
    }

    public int getId() {
        return id;
    }

    public String getLastName() {
        return lastName;
    }

    public String getFirstName() {
        return firstName;
    }

    public String getMiddleName() {
        return middleName;
    }

    public Date getBirthDate() {
        return birthDate;
    }

    public int getStudentIdCard() {
        return studentIdCard;
    }

    // Setters
    public void setId(int id) {
        this.id = id;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public void setMiddleName(String middleName) {
        this.middleName = middleName;
    }

    public void setBirthDate(Date birthDate) {
        this.birthDate = birthDate;
    }

    public void setStudentIdCard(int studentIdCard) {
        this.studentIdCard = studentIdCard;
    }
    @Override
    public String toString() {
        return String.format(
                "ID: %d, Name: %s %s %s, Birth Date: %s, Student ID Card: %d",
                id, firstName, lastName, middleName, birthDate, studentIdCard
        );
    }
}

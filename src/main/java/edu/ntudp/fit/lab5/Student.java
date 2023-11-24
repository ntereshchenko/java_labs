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

    // Геттери, сеттери та інші методи

    @Override
    public String toString() {
        return String.format(
                "ID: %d, Name: %s %s %s, Birth Date: %s, Student ID Card: %d",
                id, firstName, lastName, middleName, birthDate, studentIdCard
        );
    }
}

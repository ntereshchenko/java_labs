package edu.ntudp.fit.lab4.controller;

import edu.ntudp.fit.lab4.models.Human;
import edu.ntudp.fit.lab4.models.Student;

public class StudentCreator {
    public Student createStudent(Human human) {
        Student newStudent = new Student();
        newStudent.setLastName(human.getLastName());
        newStudent.setFatherName(human.getFatherName());
        newStudent.setFirstName(human.getFirstName());
        newStudent.setSex(human.getSex());
        return newStudent;
    }
}
package edu.ntudp.fit.lab3.controller;

import edu.ntudp.fit.lab3.models.Human;
import edu.ntudp.fit.lab3.models.Student;

public class StudentCreator {
    public Student createStudent(Human human) {
        Student student = new Student();

        student.setFirstName(human.getFirstName());
        student.setLastName(human.getLastName());
        student.setMiddleName(human.getMiddleName());


        return student;
    }
}

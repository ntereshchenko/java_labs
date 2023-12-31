package edu.ntudp.fit.lab3.controller;

import edu.ntudp.fit.lab3.models.Department;
import edu.ntudp.fit.lab3.models.Faculty;
import edu.ntudp.fit.lab3.models.Human;

import java.util.List;

public class FacultyCreator {
    public Faculty createFaculty(List<Department> departments, String facultyName, Human facultyBoss) {
        Faculty newFaculty = new Faculty();
        newFaculty.setFacultyName(facultyName);
        newFaculty.setFacultyBoss(facultyBoss);
        newFaculty.setDepartments(departments);
        return newFaculty;
    }
}
package edu.ntudp.fit.lab3.controller;

import edu.ntudp.fit.lab3.models.Department;
import edu.ntudp.fit.lab3.models.Faculty;
import edu.ntudp.fit.lab3.models.Human;

import java.util.ArrayList;

public class FacultyCreator {
    public Faculty createFaculty(String name, Human chief, ArrayList<Department> departments) {
        Faculty faculty = new Faculty();

        faculty.setChief(chief);
        faculty.setName(name);
        faculty.setDepartments(departments);

        return faculty;
    }
}
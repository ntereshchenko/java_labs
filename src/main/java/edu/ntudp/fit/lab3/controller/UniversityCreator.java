package edu.ntudp.fit.lab3.controller;

import edu.ntudp.fit.lab3.models.Faculty;
import edu.ntudp.fit.lab3.models.Human;
import edu.ntudp.fit.lab3.models.University;

import java.util.ArrayList;

public class UniversityCreator {
    public University createUniversity(String name, Human chief, ArrayList<Faculty> faculties) {
        University university = new University();

        university.setName(name);
        university.setChief(chief);
        university.setFaculties(faculties);

        return university;
    }
}
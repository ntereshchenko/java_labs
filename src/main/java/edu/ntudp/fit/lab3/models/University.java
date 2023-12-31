package edu.ntudp.fit.lab3.models;

import edu.ntudp.fit.lab3.controller.StudentCreator;

import java.util.List;

public class University extends StudentCreator {
    private String universityName;
    private Human universityBoss;
    private List<Faculty> faculties;

    public void setUniversityName(String universityName) {
        this.universityName = universityName;
    }

    public void setUniversityBoss(Human universityBoss) {
        this.universityBoss = universityBoss;
    }

    public void setFaculties(List<Faculty> faculties) {
        this.faculties = faculties;
    }

    public String getUniversityName() {
        return universityName;
    }

    public Human getUniversityBoss() {
        return universityBoss;
    }

    public List<Faculty> getFaculties() {
        return faculties;
    }

    public String toString() {
        return "University name: " + universityName + "\n" + "University boss:" + universityBoss +
                "\nFaculties:\n" + getFaculties();
    }
}

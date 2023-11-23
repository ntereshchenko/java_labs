package edu.ntudp.fit.lab4.models;

import edu.ntudp.fit.lab4.controller.StudentCreator;

import java.util.List;
import java.util.Objects;

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

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        University that = (University) o;
        return Objects.equals(universityName, that.universityName) && Objects.equals(universityBoss, that.universityBoss) && Objects.equals(faculties, that.faculties);
    }
}
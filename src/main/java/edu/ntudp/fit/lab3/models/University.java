package edu.ntudp.fit.lab3.models;

import edu.ntudp.fit.lab3.controller.StudentCreator;

import java.util.ArrayList;

public class University extends StudentCreator {
    private String name;
    private Human chief;
    private ArrayList<Faculty> faculties;
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Human getChief() {
        return chief;
    }

    public void setChief(Human chief) {
        this.chief = chief;
    }

    public ArrayList<Faculty> getFaculties() {
        return faculties;
    }

    public void setFaculties(ArrayList<Faculty> faculties) {
        this.faculties = faculties;
    }

    @Override
    public String toString() {
        StringBuilder stringBuilder = new StringBuilder();
        stringBuilder.append("University: ").append(name).append("\n");
        stringBuilder.append("Chief: ").append(chief).append("\n");
        stringBuilder.append("Faculties:\n");
        for (Faculty faculty : faculties) {
            stringBuilder.append("\t").append(faculty).append("\n");
        }
        return stringBuilder.toString();
    }

}

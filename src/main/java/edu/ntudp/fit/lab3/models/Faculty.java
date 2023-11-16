package edu.ntudp.fit.lab3.models;

import java.util.ArrayList;

public class Faculty {
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    private String name;

    private Human chief;
    private ArrayList<Department> departments;

    public Human getChief() {
        return chief;
    }

    public void setChief(Human chief) {
        this.chief = chief;
    }

    public ArrayList<Department> getDepartments() {
        return departments;
    }

    public void setDepartments(ArrayList<Department> departments) {
        this.departments = departments;
    }
    public String toString() {
        return "{name: " + getName() + ", chief: " + getChief() + "\ndepartments:" + getDepartments() + "}";
    }
}
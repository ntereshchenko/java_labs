package edu.ntudp.fit.lab3.models;

import java.util.ArrayList;

public class Department {
    private String name;
    private Human chief;
    private ArrayList<Group> groups;
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

    public ArrayList<Group> getGroups() {
        return groups;
    }

    public void setGroups(ArrayList<Group> groups) {
        this.groups = groups;
    }
    /*public String toString() {
        return "Department: {name: " + getName() + ", chief:" + getChief() + ", \ngroups:" + getGroups() + "}";
    }*/
    @Override
    public String toString() {
        StringBuilder stringBuilder = new StringBuilder();
        stringBuilder.append("Department: ").append(name).append("\n");
        stringBuilder.append("Chief: ").append(chief).append("\n");
        stringBuilder.append("Groups:\n");
        for (Group group : groups) {
            stringBuilder.append("\t").append(group).append("\n");
        }
        return stringBuilder.toString();
    }
}

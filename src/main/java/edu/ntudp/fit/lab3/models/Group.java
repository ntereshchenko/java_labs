package edu.ntudp.fit.lab3.models;

import java.util.ArrayList;

public class Group {
    private String name;
    private Human chief;
    private ArrayList<Student> students;
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

    public ArrayList<Student> getStudents() {
        return students;
    }

    public void setStudents(ArrayList<Student> students) {
        this.students = students;
    }

  /* public String toString() {
        return "Group: {name: " + getName() + ", chief:" + getChief() +
                ", \nstudents: " + getStudents() + "}";
    }*/
  @Override
  public String toString() {
      StringBuilder stringBuilder = new StringBuilder();
      stringBuilder.append("Group: ").append(name).append("\n");
      stringBuilder.append("Chief: ").append(chief).append("\n");
      stringBuilder.append("Students:\n");
      for (Student student : students) {
          stringBuilder.append("\t").append(student).append("\n");
      }
      return stringBuilder.toString();
  }
  }


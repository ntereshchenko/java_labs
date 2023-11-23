package edu.ntudp.fit.lab4.models;


import java.util.List;
import java.util.Objects;

public class Faculty {
    private String facultyName;
    private Human facultyBoss;
    private List<Department> departments;

    public void setFacultyName(String facultyName) {
        this.facultyName = facultyName;
    }

    public void setFacultyBoss(Human facultyBoss) {
        this.facultyBoss = facultyBoss;
    }

    public void setDepartments(List<Department> departments) {
        this.departments = departments;
    }

    public String getFacultyName() {
        return facultyName;
    }

    public Human getFacultyBoss() {
        return facultyBoss;
    }

    public List<Department> getDepartments() {
        return departments;
    }

    public String toString() {
        return "\nFaculty name: " + facultyName + "\n" + "Faculty boss:" + facultyBoss +
                "\nDepartments:\n" + getDepartments();
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Faculty faculty = (Faculty) o;
        return Objects.equals(facultyName, faculty.facultyName) && Objects.equals(facultyBoss, faculty.facultyBoss) && Objects.equals(departments, faculty.departments);
    }
}
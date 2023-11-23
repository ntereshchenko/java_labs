package edu.ntudp.fit.lab4.models;


import java.util.List;
import java.util.Objects;

public class Department {
    private String departmentName;
    private Human departmentBoss;
    private List<Group> groups;

    public void setDepartmentName(String departmentName) {
        this.departmentName = departmentName;
    }

    public void setDepartmentBoss(Human departmentBoss) {
        this.departmentBoss = departmentBoss;
    }

    public void setGroups(List<Group> groups) {
        this.groups = groups;
    }

    public List<Group> getGroups() {
        return groups;
    }

    public String toString() {
        return "\nDepartment name: " + departmentName + "\n" + "Department boss:" + departmentBoss +
                "\nGroups:\n" + getGroups();
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Department that = (Department) o;
        return Objects.equals(departmentName, that.departmentName) && Objects.equals(departmentBoss, that.departmentBoss) && Objects.equals(groups, that.groups);
    }
}

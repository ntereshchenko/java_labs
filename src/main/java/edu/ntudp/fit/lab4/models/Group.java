package edu.ntudp.fit.lab4.models;

import java.util.List;
import java.util.Objects;

public class Group {
    private String groupName;
    private Human groupBoss;
    private List<Student> students;

    public String getGroupName() {
        return groupName;
    }

    public Human getGroupBoss() {
        return groupBoss;
    }

    public List<Student> getStudents() {
        return students;
    }

    public void setGroupName(String groupName) {
        this.groupName = groupName;
    }

    public void setGroupBoss(Human groupBoss) {
        this.groupBoss = groupBoss;
    }

    public void setStudents(List<Student> students) {
        this.students = students;
    }

    public String toString() {
        return "\nGroup name: " + groupName + "\n" + "Group boss:" + getGroupBoss() + "\nStudents:\n" + getStudents();
    }
    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Group group = (Group) o;
        return Objects.equals(groupName, group.groupName) && Objects.equals(groupBoss, group.groupBoss) && Objects.equals(students, group.students);
    }

}

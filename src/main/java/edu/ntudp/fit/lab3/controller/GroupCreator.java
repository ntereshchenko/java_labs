package edu.ntudp.fit.lab3.controller;

import edu.ntudp.fit.lab3.models.Group;
import edu.ntudp.fit.lab3.models.Human;
import edu.ntudp.fit.lab3.models.Student;

import java.util.ArrayList;

public class GroupCreator {
    public Group createGroup(String name, Human chief, ArrayList<Student> students) {
        Group group = new Group();

        group.setChief(chief);
        group.setName(name);
        group.setStudents(students);

        return group;
    }
}

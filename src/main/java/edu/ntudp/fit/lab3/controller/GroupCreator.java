package edu.ntudp.fit.lab3.controller;

import edu.ntudp.fit.lab3.models.Group;
import edu.ntudp.fit.lab3.models.Human;
import edu.ntudp.fit.lab3.models.Student;

import java.util.List;

public class GroupCreator {
    public Group createGroup(List<Student> students, String groupName, Human groupBoss) {
        Group newGroup = new Group();
        newGroup.setGroupName(groupName);
        newGroup.setGroupBoss(groupBoss);
        newGroup.setStudents(students);
        return newGroup;
    }
}

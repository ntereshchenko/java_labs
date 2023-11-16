package edu.ntudp.fit.lab3.controller;

import edu.ntudp.fit.lab3.models.Department;
import edu.ntudp.fit.lab3.models.Group;
import edu.ntudp.fit.lab3.models.Human;

import java.util.ArrayList;

public class DepartmentCreator {
    public Department createDepartment(String name, Human chief, ArrayList<Group> groups) {
        Department department = new Department();

        department.setGroups(groups);
        department.setChief(chief);
        department.setName(name);

        return department;
    }
}


package edu.ntudp.fit.lab3.controller;

import edu.ntudp.fit.lab3.models.Department;
import edu.ntudp.fit.lab3.models.Group;
import edu.ntudp.fit.lab3.models.Human;

import java.util.List;

public class DepartmentCreator {
    public Department createDepartment(List<Group> groups, String departmentName, Human departmentBoss) {
        Department newDepartment = new Department();
        newDepartment.setDepartmentName(departmentName);
        newDepartment.setDepartmentBoss(departmentBoss);
        newDepartment.setGroups(groups);
        return newDepartment;
    }

}


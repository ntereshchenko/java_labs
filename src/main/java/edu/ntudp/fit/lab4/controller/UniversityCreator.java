package edu.ntudp.fit.lab4.controller;

import edu.ntudp.fit.lab3.Sex;
import edu.ntudp.fit.lab4.models.*;

import java.util.List;

public class UniversityCreator {

    private final HumanCreator humanCreate = new HumanCreator();
    private final StudentCreator studentCreate = new StudentCreator();
    private final GroupCreator groupCreate = new GroupCreator();
    private final DepartmentCreator departmentCreate = new DepartmentCreator();
    private final FacultyCreator facultyCreate = new FacultyCreator();

    public University createUniversity(String universityName, Human universityBoss, List<Faculty> faculties) {
        University newUniversity = new University();
        newUniversity.setUniversityName(universityName);
        newUniversity.setUniversityBoss(universityBoss);
        newUniversity.setFaculties(faculties);
        return newUniversity;
    }

    public University createTypicalUniversity() {

        Human newHuman1 = humanCreate.createHuman("Bondarenko", "Paulo", "Ivanovych", Sex.MALE);
        Human newHuman2 = humanCreate.createHuman("Tereshchenko", "Nastya", "Sergeevna", Sex.FEMALE);
        Human newHuman3 = humanCreate.createHuman("Matveev", "Max", "Olegovich", Sex.MALE);
        Human newHuman4 = humanCreate.createHuman("Maykov", "Oleg", "Antonovich", Sex.MALE);
        Human newHuman5 = humanCreate.createHuman("Romanenko", "Ira", "Andreevna", Sex.FEMALE);
        Human newHuman6 = humanCreate.createHuman("Gor", "Alex", "Olegovich", Sex.MALE);

        Student newStudent1 = studentCreate.createStudent(newHuman1);
        Student newStudent2 = studentCreate.createStudent(newHuman2);
        Student newStudent3 = studentCreate.createStudent(newHuman3);
        Student newStudent4 = studentCreate.createStudent(newHuman4);
        Student newStudent5 = studentCreate.createStudent(newHuman5);
        Student newStudent6 = studentCreate.createStudent(newHuman6);


        Group newGroup1 = createGroup("122-21-sk", newHuman2, newStudent1, newStudent2, newStudent3);
        Group newGroup2 = createGroup("122-21-1", newHuman6, newStudent4, newStudent5, newStudent6);

        Department newDepartment1 = createDepartment("PZKS", newHuman1, newGroup1, newGroup2);


        Faculty newFaculty1 = createFaculty("FIT", newHuman5, newDepartment1);


        University newUniversity1 = createUniversity("NTU DP", newHuman4, List.of(newFaculty1));

        return newUniversity1;
    }

    private Group createGroup(String groupCode, Human groupLeader, Student... students) {
        List<Student> studentList = List.of(students);
        return groupCreate.createGroup(studentList, groupCode, groupLeader);
    }

    private Department createDepartment(String departmentName, Human departmentHead, Group... groups) {
        List<Group> groupList = List.of(groups);
        return departmentCreate.createDepartment(groupList, departmentName, departmentHead);
    }

    private Faculty createFaculty(String facultyName, Human facultyDean, Department... departments) {
        List<Department> departmentList = List.of(departments);
        return facultyCreate.createFaculty(departmentList, facultyName, facultyDean);
    }
}


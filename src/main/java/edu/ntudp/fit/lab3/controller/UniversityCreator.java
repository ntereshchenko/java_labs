package edu.ntudp.fit.lab3.controller;

import edu.ntudp.fit.lab3.Sex;
import edu.ntudp.fit.lab3.models.*;



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

        Human firstHuman = humanCreate.createHuman("Bondarenko", "Paulo", "Ivanovych", Sex.MALE);
        Human secondHuma = humanCreate.createHuman("Tereshchenko", "Nastya", "Sergeevna", Sex.FEMALE);
        Human thirdHuman = humanCreate.createHuman("Matveev", "Max", "Olegovich", Sex.MALE);
        Human fourthHuman = humanCreate.createHuman("Maykov", "Oleg", "Antonovich", Sex.MALE);
        Human fifthHuman = humanCreate.createHuman("Romanenko", "Ira", "Andreevna", Sex.FEMALE);
        Human sixthHuman = humanCreate.createHuman("Gor", "Alex", "Olegovich", Sex.MALE);

        Student firstStudent = studentCreate.createStudent(firstHuman);
        Student secondStudent = studentCreate.createStudent(secondHuma);
        Student  thirdStudent = studentCreate.createStudent(thirdHuman);
        Student fourthStudent = studentCreate.createStudent(fourthHuman);
        Student fifthStudent = studentCreate.createStudent(fifthHuman);
        Student sixthStudent = studentCreate.createStudent(sixthHuman);


        Group firstroup = createGroup("122-21-sk", secondHuma, firstStudent, secondStudent,  thirdStudent);
        Group secondGroup = createGroup("122-21-1", sixthHuman, fourthStudent, fifthStudent, sixthStudent);

        Department firstDepartment = createDepartment("PZKS", firstHuman, firstroup, secondGroup);


        Faculty firstFaculty = createFaculty("FIT", fifthHuman, firstDepartment);


        University university = createUniversity("NTU DP", fourthHuman, List.of(firstFaculty));

        return university;
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


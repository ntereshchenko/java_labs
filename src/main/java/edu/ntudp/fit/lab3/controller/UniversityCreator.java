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
        Human fourHuman = humanCreate.createHuman("Maykov", "Oleg", "Antonovich", Sex.MALE);
        Human fiveHuman = humanCreate.createHuman("Romanenko", "Ira", "Andreevna", Sex.FEMALE);
        Human sixHuman = humanCreate.createHuman("Gor", "Alex", "Olegovich", Sex.MALE);

        Student firstStudent = studentCreate.createStudent(firstHuman);
        Student secondStudent = studentCreate.createStudent(secondHuma);
        Student  thirdStudent = studentCreate.createStudent(thirdHuman);
        Student fourStudent = studentCreate.createStudent(fourHuman);
        Student fiveStudent = studentCreate.createStudent(fiveHuman);
        Student sixStudent = studentCreate.createStudent(sixHuman);


        Group firstroup = createGroup("122-21-sk", secondHuma, firstStudent, secondStudent,  thirdStudent);
        Group secondGroup = createGroup("122-21-1", sixHuman, fourStudent, fiveStudent, sixStudent);

        Department firstDepartment = createDepartment("PZKS", firstHuman, firstroup, secondGroup);


        Faculty firstFaculty = createFaculty("FIT", fiveHuman, firstDepartment);


        University university = createUniversity("NTU DP", fourHuman, List.of(firstFaculty));

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


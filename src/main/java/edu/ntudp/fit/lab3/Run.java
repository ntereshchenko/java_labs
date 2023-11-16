package edu.ntudp.fit.lab3;

import edu.ntudp.fit.lab3.controller.*;
import edu.ntudp.fit.lab3.models.*;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;

public class Run {
    public static University createTypicalUniversity() {
        Human firstHuman = new HumanCreator().createHuman("Onichenko", "Nikita", "Olegovich");
        Human secondHuman = new HumanCreator().createHuman("Pastukha", "Lina", "Victorivna");
        Human thirdHuman = new HumanCreator().createHuman("Marchenko", "Khristina", "Olexandrivna");
        Human fourHuman = new HumanCreator().createHuman("Gordienko", "Oleg", "Pavlovich");
        Human fiveHuman = new HumanCreator().createHuman("Lebid", "Olena", "Tarasivna");

        Student firstStudent = new StudentCreator().createStudent(firstHuman);
        Student secondStudent = new StudentCreator().createStudent(secondHuman);
        Student thirdStudent = new StudentCreator().createStudent(thirdHuman);
        Student fourStudent = new StudentCreator().createStudent(fourHuman);
        Student fiveStudent = new StudentCreator().createStudent(fiveHuman);

        ArrayList<Student> students = new ArrayList<>(Arrays.asList(firstStudent, secondStudent, thirdStudent,fourStudent, fiveStudent));
        Group group = new GroupCreator().createGroup("144-19-1", firstStudent, students);

        ArrayList<Group> departmentGroups = new ArrayList<>(Collections.singletonList(group));
        Human departmentChief = new HumanCreator().createHuman("Nikitenko", "Pavlo", "Vasylovich");
        Department department = new DepartmentCreator().createDepartment("Machino-stroitelnyu", departmentChief, departmentGroups);

        ArrayList<Department> facultyDepartments = new ArrayList<>(Collections.singletonList(department));
        Human facultyChief = new HumanCreator().createHuman("Semenenko", "Anton", "Mykolaiovich");
        Faculty faculty = new FacultyCreator().createFaculty("MMF", facultyChief, facultyDepartments);

        ArrayList<Faculty> universityFaculties = new ArrayList<>(Collections.singletonList(faculty));
        Human universityChief = new HumanCreator().createHuman("Zavgorodniy", "Artem", "Olegovych");

        return new UniversityCreator().createUniversity("National Technical University \"Dniprovska Polytechnic\" ", universityChief, universityFaculties);
    }

    public static void main(String[] args) {
        University university = createTypicalUniversity();
        System.out.println(university.toString());
    }
}

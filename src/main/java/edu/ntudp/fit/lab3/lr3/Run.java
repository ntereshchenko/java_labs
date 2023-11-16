package edu.ntudp.fit.lab3.lr3;

import edu.ntudp.fit.lab3.controller.*;
import edu.ntudp.fit.lab3.models.*;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;

public class Run {
    public static University createTypicalUniversity() {
        Human firstHuman = new HumanCreator().createHuman("Tereshchenko", "Nastya", "Sergeevna");
        Human secondHuman = new HumanCreator().createHuman("Johnson", "Alice", "");
        Human thirdHuman = new HumanCreator().createHuman("Matveev", "Max", "Olegovich");
        Human fourHuman = new HumanCreator().createHuman("Bondarenko", "Paulo", "");
        Human fiveHuman = new HumanCreator().createHuman("Maykova", "Olena", "");

        Student firstStudent = new StudentCreator().createStudent(firstHuman);
        Student secondStudent = new StudentCreator().createStudent(secondHuman);
        Student thirdStudent = new StudentCreator().createStudent(thirdHuman);
        Student fourStudent = new StudentCreator().createStudent(fourHuman);
        Student fiveStudent = new StudentCreator().createStudent(fiveHuman);

        ArrayList<Student> students = new ArrayList<>(Arrays.asList(firstStudent, secondStudent, thirdStudent,fourStudent, fiveStudent));
        Group group = new GroupCreator().createGroup("122-21sk", firstStudent, students);

        ArrayList<Group> departmentGroups = new ArrayList<>(Collections.singletonList(group));
        Human departmentChief = new HumanCreator().createHuman("Chayna", "Eva", "Sergeevna");
        Department department = new DepartmentCreator().createDepartment("PZKS", departmentChief, departmentGroups);

        ArrayList<Department> facultyDepartments = new ArrayList<>(Collections.singletonList(department));
        Human facultyChief = new HumanCreator().createHuman("Maygun", "Borys", "Mykolaiovich");
        Faculty faculty = new FacultyCreator().createFaculty("FIT", facultyChief, facultyDepartments);

        ArrayList<Faculty> universityFaculties = new ArrayList<>(Collections.singletonList(faculty));
        Human universityChief = new HumanCreator().createHuman("Maximenko", "Andriy", "Andriyovich");

        return new UniversityCreator().createUniversity(
                "National Technical University \"Dniprovska Polytechnic\"",
                universityChief,
                universityFaculties
        );
    }

    public static void main(String[] args) {
        University university = createTypicalUniversity();
        System.out.println(university.toString());
    }
}

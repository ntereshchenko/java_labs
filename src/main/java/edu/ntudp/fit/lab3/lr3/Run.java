package edu.ntudp.fit.lab3.lr3;
import edu.ntudp.fit.lab3.controller.*;


public class Run {

    public static void main(String[] args) {
        UniversityCreator universityCreate = new UniversityCreator();
        System.out.println(universityCreate.createTypicalUniversity());
    }
}
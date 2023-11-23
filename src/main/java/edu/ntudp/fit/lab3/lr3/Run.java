package edu.ntudp.fit.lab3.lr3;

import edu.ntudp.fit.lab3.controller.*;
import edu.ntudp.fit.lab3.models.*;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;

public class Run {

    public static void main(String[] args) {
        UniversityCreator universityCreate = new UniversityCreator();
        System.out.println(universityCreate.createTypicalUniversity());
    }
}
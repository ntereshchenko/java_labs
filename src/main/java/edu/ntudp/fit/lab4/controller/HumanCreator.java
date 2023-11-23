package edu.ntudp.fit.lab4.controller;

import edu.ntudp.fit.lab3.Sex;
import edu.ntudp.fit.lab4.models.Human;


public class HumanCreator {
    public Human createHuman(String lastName, String firstName, String fatherName, Sex sex) {
        Human newHuman = new Human();
        newHuman.setLastName(lastName);
        newHuman.setFirstName(firstName);
        newHuman.setFatherName(fatherName);
        newHuman.setSex(sex);
        return newHuman;
    }

}

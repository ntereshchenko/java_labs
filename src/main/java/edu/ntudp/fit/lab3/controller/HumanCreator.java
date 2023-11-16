package edu.ntudp.fit.lab3.controller;

import edu.ntudp.fit.lab3.models.Human;

public class HumanCreator {
    public Human createHuman(String lastName, String firstName, String middleName) {
        Human human = new Human();

        human.setMiddleName(middleName);
        human.setFirstName(firstName);
        human.setLastName(lastName);

        return human;
    }
}

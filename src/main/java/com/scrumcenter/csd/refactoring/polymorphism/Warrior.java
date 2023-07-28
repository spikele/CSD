package com.scrumcenter.csd.refactoring.polymorphism;

public class Warrior extends Player {
    @Override
    public String move() {
        changeLocation(2);
        return "Warrior moves forward";
    }
}

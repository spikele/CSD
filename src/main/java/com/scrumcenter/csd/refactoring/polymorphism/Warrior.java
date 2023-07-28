package com.scrumcenter.csd.refactoring.polymorphism;

public class Warrior implements Player {
    @Override
    public String move() {
        return "Warrior moves forward";
    }
}

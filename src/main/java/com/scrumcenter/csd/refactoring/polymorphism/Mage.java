package com.scrumcenter.csd.refactoring.polymorphism;

public class Mage extends Player {
    @Override
    public String move() {
        changeLocation(3);
        return "Mage teleports";
    }
}

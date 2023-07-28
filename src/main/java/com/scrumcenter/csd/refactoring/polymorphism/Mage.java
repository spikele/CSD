package com.scrumcenter.csd.refactoring.polymorphism;

public class Mage implements Player {
    @Override
    public String move() {
        return "Mage teleports";
    }
}

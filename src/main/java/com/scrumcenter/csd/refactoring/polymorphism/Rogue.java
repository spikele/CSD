package com.scrumcenter.csd.refactoring.polymorphism;

public class Rogue extends Player {
    @Override
    public String move() {
        changeLocation(1);
        return "Rogue sneaks";
    }
}

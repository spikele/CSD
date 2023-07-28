package com.scrumcenter.csd.refactoring.polymorphism;

public class Rogue implements Player {
    @Override
    public String move() {
        return "Rogue sneaks";
    }
}

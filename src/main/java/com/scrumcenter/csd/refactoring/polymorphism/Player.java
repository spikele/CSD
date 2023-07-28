package com.scrumcenter.csd.refactoring.polymorphism;

public abstract class Player {
    Integer location = 0;

    Integer getLocation() {
        return this.location;
    }

    Integer changeLocation(Integer fields) {
        this.location = this.location + fields;
        return this.location;
    }

    abstract String move();
}



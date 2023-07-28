package com.scrumcenter.csd.refactoring.polymorphism;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class PlayerTest {
    @Test
    public void testWarriorMove() {
        Player warrior = new Warrior();
        assertEquals("Warrior moves forward", warrior.move());
    }

    @Test
    public void testMageMove() {
        Player mage = new Mage();
        assertEquals("Mage teleports", mage.move());
    }

    @Test
    public void testRogueMove() {
        Player rogue = new Rogue();
        assertEquals("Rogue sneaks", rogue.move());
    }

    //A player's location after instantiation should be 0
    //Location should change after move() is called
    //Warrior should move 2, Mage 3, Rogue 1
    @Test
    public void testInstantiation() {
        Player warrior = new Warrior();
        assertEquals(0, warrior.getLocation());
    }

    @Test
    public void testWarriorMoveLocation() {
        Player warrior = new Warrior();
        warrior.move();
        assertEquals(2, warrior.getLocation());
    }

    @Test
    public void testRogueMoveLocation() {
        Player rogue = new Rogue();
        rogue.move();
        assertEquals(1, rogue.getLocation());
    }

    @Test
    public void testMageMoveLocation() {
        Player mage = new Mage();
        mage.move();
        assertEquals(3, mage.getLocation());
    }
}
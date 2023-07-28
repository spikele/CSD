package com.scrumcenter.csd.refactoring.polymorphism;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class PlayerTest {
    @Test
    public void testWarriorMoveNew() {
        Player warrior = new Warrior();
        assertEquals("Warrior moves forward", warrior.move());
    }

    @Test
    public void testMageMoveNew() {
        Player mage = new Mage();
        assertEquals("Mage teleports", mage.move());
    }

    @Test
    public void testRogueMoveNew() {
        Player rogue = new Rogue();
        assertEquals("Rogue sneaks", rogue.move());
    }
}
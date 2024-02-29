package edu.sdccd.cisc190;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class DieTest {
    public static final int NUM_SIDES = 6;
    Die die;

    @BeforeEach
    void setUp() {
        die = new Die(NUM_SIDES);
    }

    @Test
    void roll() {
        int rollResult = die.roll();
        System.out.println(rollResult);
        assertTrue(1 <= rollResult && NUM_SIDES >= rollResult);
    }

    @Test
    void rollLoop() {
        int[] rollResults = new int[NUM_SIDES+1];
        for(int i=0; i<10000; i++) {
            rollResults[die.roll()]++;
        }
        for(int i=1; i<NUM_SIDES+1; i++) {
            System.out.println(i + ": " + rollResults[i]);
        }
    }
}
package edu.sdccd.cisc190;

import java.util.Random;

public class Die {
    private int numSides;
    private Random random;

    public Die(int numSides) {
        this.numSides = numSides;
        random = new Random();
        random.setSeed(System.currentTimeMillis());
    }

    public int roll() {
        return random.nextInt(numSides) + 1;
    }
}

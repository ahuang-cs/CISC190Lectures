package edu.sdccd.cisc190;

import java.util.Random;

public class GameBoard {
    public static final int DIMENSION = 6;
    public static final int NUM_BAIT = 30;
    public static int NUM_FISH = 10;

    private GameBoardCell[][] gameBoard;
    private int baitRemaining;
    private int fishRemaining;

    public GameBoard() {
        gameBoard = new GameBoardCell[DIMENSION][DIMENSION];

        baitRemaining = NUM_BAIT;
        fishRemaining = NUM_FISH;

        Random rand = new Random();
        for (int i = 0; i < NUM_FISH; i++) {
            int row, col;
            do {
                row = rand.nextInt(DIMENSION);
                col = rand.nextInt(DIMENSION);
            } while (gameBoard[row][col].containsFish);
            gameBoard[row][col].containsFish = true;
        }
    }

    public boolean fishAt(int row, int col) {
        return gameBoard[row][col].containsFish;
    }

    public boolean makeGuess(int row, int col) {
        boolean foundFish = fishAt(row, col);
        baitRemaining--;
        if(foundFish) {
            fishRemaining--;
        }
        return foundFish;
    }

    public int getBaitRemaining() {
        return baitRemaining;
    }

    public int getFishRemaining() {
        return fishRemaining;
    }
}
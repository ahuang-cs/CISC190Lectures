package edu.sdccd.cisc190;

public enum Choice {
    ROCK(1),
    PAPER(2),
    SCISSORS(3);

    private int id;
    private Choice(int id) {
        this.id = id;
    }

    public static Choice getRandomChoice() {
        return Choice.values()[(int)(Math.random() * values().length)];
    }

    /**
     * Returns the winning condition as -1, 0, 1
     * @param choice1
     * @param choice2
     * @return 0 if draw, 1 if choice1 wins, -1 if choice2 wins
     */
    public static int getWinner(Choice choice1, Choice choice2) {
        if(choice1 == Choice.PAPER && choice2 == Choice.ROCK) {
            return 1;
        } else if(choice1 == Choice.ROCK && choice2 == Choice.PAPER) {
            return -1;
        } else if(choice1 == Choice.PAPER && choice2 == Choice.SCISSORS) {
            return -1;
        } else if(choice1 == Choice.SCISSORS && choice2 == Choice.PAPER) {
            return 1;
        } else if(choice1 == Choice.SCISSORS && choice2 == Choice.ROCK) {
            return -1;
        } else if(choice1 == Choice.ROCK && choice2 == Choice.SCISSORS) {
            return 1;
        }
        return 0;
    }
}

package edu.sdccd.cisc190;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner kb = new Scanner(System.in);
        Choice computerChoice, parsedChoice;
        String choice;

        while(true) {
            computerChoice = Choice.getRandomChoice();
            printMenu();
            choice = kb.nextLine();
            try {
                parsedChoice = Choice.valueOf(choice);
            } catch(IllegalArgumentException e) {
                System.out.println("Invalid choice. Try again.");
                continue;
            }
            System.out.printf("The computer chose %s\n", computerChoice);
            switch(Choice.getWinner(parsedChoice, computerChoice)) {
                case 1:
                    System.out.println("You win!");
                    System.exit(0);
                    break;
                case -1:
                    System.out.println("You lose!");
                    System.exit(0);
                    break;
            }
        }
    }

    public static void printMenu() {
        System.out.print("Please choose one of the following");
        for(Choice val: Choice.values()) {
            System.out.print(" " + val);
        }
        System.out.println(": ");
    }
}

package edu.sdccd.cisc190;

import java.util.InputMismatchException;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner kb = new Scanner(System.in);
        System.out.print("Enter a number: ");
        try {
            int i = readInt(kb);
        } catch (NumberFormatException | InvalidInputException e) {
            System.err.println(e.getMessage());
        }
        System.out.println("Exited normally.");
    }

    /**
     *
     * @param s
     * @return
     * @throws InvalidInputException a non numeric value was input
     * @throws NumberFormatException a value less than 1000 was input
     */
    public static int readInt(Scanner s) throws InvalidInputException, NumberFormatException {
        int i = 0;
        try {
            i = s.nextInt();
            System.out.printf("You entered %d\n", i);

        } catch (ArrayIndexOutOfBoundsException e) {
            throw new InvalidInputException("Invalid input!");
        } catch (Exception e) {
            System.err.println("We received an unexpected error. Exiting...");
            System.exit(1);
        } finally {
            System.out.println("Finally!");
        }
        if(i < 1000) throw new NumberFormatException("The number must be less than 1000!");
        return i;
    }

}

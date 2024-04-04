package edu.sdccd.cisc190;

import java.util.Arrays;

public class Main {
    int counter = 10;
    static int clsCounter = 0;

    @Override
    public String toString() {
        return "Main{" +
                "counter=" + counter +
                '}';
    }

    /**
     * toCSV() returns the static clsCounter contents
     * @return clsCounter as a string
     */
    public static String toCSV() {
        return Integer.toString(clsCounter);
    }

    /**
     * printContents prints the input string to system out
     * @param input a string to be printed
     */
    public static void printContents(String input) {
        System.out.println(input);
    }

    public static void printContents(int input) {
        System.out.println(input);
    }

    // modifiers  return type  name  parentheses input parameters
    public static void main(String[] args) {
        System.out.println(Main.clsCounter);
        System.out.println(Main.toCSV());

        Main main = new Main();
        Main.printContents(main.counter);
        Main.printContents("hello");
        main.toCSV();
        main.toString();

        User user1 = new User("Alice", "alice@user.com");
        Main.printContents(user1.toString());
        try {
            modifyUser(user1);
        } catch (Exception e) {
            System.err.println(e.getMessage());
        }
        Main.printContents(user1.toString());

        int i = 100;
        Main.printContents(i);
        modifyInt(i);
        Main.printContents(i);

        Main.printContents(Main.factorialWithLoop(10));
        Main.printContents(Main.factorialRecursive(10));
    }
    public static void modifyUser(User user) throws Exception {
        if(user.getName().equals("Alice")) {
            throw new Exception("Alice cannot be modified!");
        }
        user.setName("Bob");
    }
    public static void modifyInt(int input) {
        input = 50;
    }

    // n! = 1 * 2 * ... * n
    public static int factorialWithLoop(int n) {
        int result = 1;
        for(int i = 2; i <= n; i++) {
            result *= i;
        }
        return result;
    }

    public static int factorialRecursive(int n) {
        // base case
        if(n == 0) {
            return 1;
        }

        // recursive case
        return n * factorialRecursive(n-1);
    }

}

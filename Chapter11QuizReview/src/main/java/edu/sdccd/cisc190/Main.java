package edu.sdccd.cisc190;

import java.util.ArrayList;
import java.util.List;

public class Main {

    // modifiers  return type   method name     input params
    static public void          methodA       (int i, int j){
        // this is the method body
    }
    public static void methoda(int hello, int world){}

    /**
     *
     * @param args list of command line parameters
     */
    public static void main(String[] args) {
        double totalIncome = 0.0;

        System.out.println(args.length);
        List<Book> books = new ArrayList<Book>();
        books.size();

        if(true) {
            printError("hello");
        }

        try {
            Book javaTextBook = new Book("123123123123", 0.0, 0);
            throw new Error();

        } catch(NumberFormatException e) {
            // code runs
        } catch(RuntimeException e) {

        } catch (Exception e) {

        } catch (Throwable e) {

        } finally {

        }

        int number;
        String input = "99#7";
        try {
            number = Integer.parseInt(input);
        } catch(NumberFormatException e) {
            number = 0;
        } catch (RuntimeException e) {
            number = 1;
        } catch(Exception e) {
            number = -1;
        }

        String str = "";
        try {
            number = Integer.parseInt(str);
        } catch(NumberFormatException e) {
            printError(e);
        } catch(IllegalArgumentException e) {
            printError(e);
        }
    }

    public static void printError(String message) {
        System.err.println(message);
    }
    // overloaded
    public static void printError(Exception e) {
        printError(e.getMessage());
    }

    interface Printer {
        final static String message = "";

        void print(String message);
    }
    // overriding
    class StdErrPrinter implements Printer {
        @Override
        public void print(String message) {
            System.err.println(message);
        }
    }

}

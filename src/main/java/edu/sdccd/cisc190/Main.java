package edu.sdccd.cisc190;

import java.util.Scanner;

public class Main {
    /**
     * Main.main() is the entry point for this app
     * @param args input parameters
     */
    public static void main(String[] args) {
//        Scanner scanner = new Scanner(System.in);
//        System.out.println("Enter student first name: ");
//        String firstName = scanner.nextLine();
//
//        System.out.println("Enter student last name: ");
//        String lastName = scanner.nextLine();
//
//        System.out.println("Enter student email: ");
//        String email = scanner.nextLine();

        System.out.println(Student.CAMPUS);

//        Student student = new Student(firstName, lastName, email);
        Student student = new Student(args[0], args[1], args[2]);
        System.out.println(student.getFirstName());
        System.out.println("Student.CAMPUS: " + Student.CAMPUS);
        System.out.println("student.CAMPUS: " + student.CAMPUS);
        student.CAMPUS = "Mesa";
        System.out.println("Student.CAMPUS: " + Student.CAMPUS);
        System.out.println("student.CAMPUS: " + student.CAMPUS);


//        int integerDemo = 1;
//        System.out.println(integerDemo);
//
//        long longDemo = 99999999999L;
//        System.out.println(longDemo);
//        System.out.println(longDemo + 200);
//        System.out.println(longDemo - 200);
//        System.out.println(longDemo / 5);
//        System.out.println(longDemo * 25);
//
////        byte
////        long
//        float floatDemo = 1.5f;
//        System.out.println(floatDemo);
//        double doubleDemo = 1.5;
//        System.out.println(doubleDemo);
//
//        System.out.println(integerDemo * integerDemo);
//        System.out.println(integerDemo * doubleDemo);
//        System.out.println(integerDemo * floatDemo);
//
//        System.out.println(longDemo / 25);
//        System.out.println(longDemo / 25.0);
//        System.out.println(longDemo % 25);
//
//        char charDemo = 'h';
//        System.out.println(charDemo);
//        String hello = "hello";
//        String world = "world";
//        System.out.println(hello);
//        System.out.println(hello + " world");
//        System.out.println(hello + " " + world);
//
//        System.err.println("This is a test of the error out");

        System.out.println("This is the end of main()");
    }
}

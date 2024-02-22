package edu.sdccd.cisc190;

import edu.sdccd.cisc190.Exceptions.StudentEnrolledException;

import java.util.Scanner;

public class Main {
    /**
     * Main.main() is the entry point for this app
     * @param args input parameters
     */
    public static void main(String[] args) {
        char a = 'A';
        char c = 'c';
        System.out.println(0 + 'a');
        System.out.println(0 + 'A');
        System.out.println(0 + 'b');
        System.out.println(c);
        System.out.println(a + c);
        System.out.println(a - c);
        if('A' > 'a') {
            System.out.println("A comes after a");
        }

        String strA = "A";
        String strC = "C";
        System.out.println(strA + strC);


        double z = 5.0;
        String s = "string";
        String zFormatted = String.format("z is %6.2f\n", z);
        System.out.print(zFormatted);
        System.out.printf("this is a %s\n", s);

        boolean isRaining = false;
        if(!isRaining) {
            System.out.println("Go outside!");
        } else {
            System.out.println("Wait awhile");
        }
        // ternary operator
        System.out.println(isRaining ? "Wait awhile" : "Go outside!");

        System.exit(0);

        int x = 5;
        int y = 10;
        //       true         true
        //  true     true           true
        //   4   6    3   4     7   8  4
        if(x < y && (x + y) >= 15 || (x--) < 10) {
            System.out.println("true");
        }
        x += 3;
        switch(x) {
            case 1:
                System.out.println("one");
            case 2:
                System.out.println("two");
            case 8:
                System.out.println("eight");
        }

        System.out.println(x);

        System.exit(0);

        Student student = new Student(args[0], args[1], args[2]);
        Teacher teacher = new Teacher("Andrew", "Huang", "ahuang@sdccd.edu", true);
        Administrator admin = new Administrator();

        User user = admin;

        if(user instanceof Student) {
            System.out.println("This is a student");
        } else if (user instanceof Teacher){
            System.out.println("This a teacher");
        } else {
            System.out.println("This is not a student or teacher");
        }

        if(student.getYear().equals(StudentYear.FRESHMAN)) {
            System.out.println("This is a freshman");
        } else if(student.getYear().equals(StudentYear.SENIOR)) {
            System.out.println("This is a senior");
        } else {
            System.out.println("This student isn't a freshman or senior");
        }

        switch (student.getYear()) {
            case FRESHMAN:
                System.out.println("This is a freshman");
                break;
            case SENIOR:
                System.out.println("This is a senior");
                break;
            default:
                System.out.println("This student isn't a freshman or senior");
                break;
        }


        System.out.println("This is the end of main");
        System.exit(0);


        try {
            System.out.println(args[0]);
            Student notEnrolledStudent = new Student();
            notEnrolledStudent.setEnrolled(false);
            notEnrolledStudent.isEnrolled();
        } catch(ArrayIndexOutOfBoundsException arrayIndexOutOfBoundsException) {
            System.err.println("Missing args[5]!");
        } catch (StudentEnrolledException studentEnrolledException) {
            System.err.println("Student not enrolled! Try again.");
        } catch (Exception b) {
            System.err.println(b.getClass() + " " + b.getMessage());
        } finally {
            System.out.println("This is the end of the try/catch block");
        }
        System.out.println("This is the end of main");
        System.exit(0);

        System.out.println(args);
        System.out.println("args.length " + args.length);




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

        Student $s$tu_23dent23 = new Student();
        Student thisIsANewStudent;
        Student this_is_a_new_student;
//        Student student = new Student(firstName, lastName, email);
        //Student student = new Student(args[0], args[1], args[2]);
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

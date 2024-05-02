package edu.sdccd.cisc190;

public class Main {

    public static void main(String[] args) {
        System.out.printf("The current max course size is: %d\n", Course.MAX_COURSE_SIZE);

        Course cisc190 = new Course();
        try {
            Student bob = new Student(1231231234, "Bob Smith", "bob@smith.com");
            cisc190.addStudent(bob);
            System.out.println("Grade:" + bob.getGrade());

            Grade grade = Grade.valueOf("FRESHMAN");
            int ordinal = grade.ordinal();
            System.out.printf("Grade %d is: %s\n", ordinal, grade);

            switch(bob.getGrade()) {
                case FRESHMAN:
                    System.out.println("Welcome freshman!");
                    break;
                default:
                    break;
            }

            System.out.printf("Student dropped: %s\n", cisc190.dropStudent(bob).getName());

            System.out.printf("Student dropped: %s\n", cisc190.dropStudent(bob).getName());

        } catch (NullPointerException e) {
            System.err.println("Student does not exist!");
        } catch (Exception e) {
            System.err.println(e.getMessage());
        }

    }
}

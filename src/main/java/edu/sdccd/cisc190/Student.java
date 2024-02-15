package edu.sdccd.cisc190;

public class Student extends User {
    public static String CAMPUS = "Miramar";
    private boolean isEnrolled;

    public Student(String firstName, String lastName, String email){
        super(firstName, lastName, email);
        isEnrolled = true;
    }
    public Student() {
        super();
        isEnrolled = true;
    }

    public boolean isEnrolled() {
        return isEnrolled;
    }

    public void setEnrolled(boolean enrolled) {
        isEnrolled = enrolled;
    }
}

package edu.sdccd.cisc190;

// this is a single line comment
/*
This
is
a
block
comment
 */

import edu.sdccd.cisc190.Exceptions.StudentEnrolledException;

/**
 * The Student class defines students and their information
 * A Student extends User
 */
public class Student extends User {

    private StudentYear year;
    public static String CAMPUS = "Miramar";
    private boolean isEnrolled;

    /**
     * Construct a Student with first and last names and email
     * @param firstName is the Student's first name
     * @param lastName is the Student's last name
     * @param email is the Student's email max length 32 characters
     */
    public Student(String firstName, String lastName, String email){
        super(firstName, lastName, email);
        isEnrolled = true;
        year = StudentYear.FRESHMAN;
    }
    public Student() {
        super();
        isEnrolled = true;
    }

    public boolean isEnrolled() throws StudentEnrolledException {
        if(isEnrolled) throw new StudentEnrolledException();

        return isEnrolled;
    }

    public void setEnrolled(boolean enrolled) {
        isEnrolled = enrolled;
    }

    public StudentYear getYear() {
        return year;
    }

    public void setYear(StudentYear year) {
        this.year = year;
    }
}

package edu.sdccd.cisc190;

import java.util.ArrayList;
import java.util.List;

public class Course {
    public static int MAX_COURSE_SIZE = 40;

    public static void setMaxCourseSize(int newMaxCourseSize) {
        MAX_COURSE_SIZE = newMaxCourseSize;
    }

    private String courseName;
    private int currentEnrollmentSize;
    private List<Student> students;

    public Course() {
        students = new ArrayList<Student>();
        currentEnrollmentSize = 0;
    }

    public Course(String courseName) {
        this();
        this.courseName = courseName;
    }

    public void addStudent(Student student) throws Exception {
        if(currentEnrollmentSize >= MAX_COURSE_SIZE) throw new Exception("Course full!");
        students.add(student);
        currentEnrollmentSize++;
    }

    public Student dropStudent(Student student) {
        if(students.remove(student)) {
            currentEnrollmentSize--;
            return student;
        }
        return null;
    }

    public String getCourseName() {
        return courseName;
    }

    public void setCourseName(String courseName) {
        this.courseName = courseName;
    }

    public int getCurrentEnrollmentSize() {
        return currentEnrollmentSize;
    }

    public void setCurrentEnrollmentSize(int currentEnrollmentSize) {
        this.currentEnrollmentSize = currentEnrollmentSize;
    }
}

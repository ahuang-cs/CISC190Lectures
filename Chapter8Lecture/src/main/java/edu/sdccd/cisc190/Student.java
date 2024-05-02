package edu.sdccd.cisc190;

public class Student {
    private final int id;
    private String name;
    private String email;
    private Grade grade;

    public Student(int id, String name, String email) {
        this.id = id;
        this.name = name;
        this.email = email;
        this.grade = Grade.FRESHMAN;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public int getId() {
        return id;
    }

    public Grade getGrade() {
        return grade;
    }

    public void setGrade(Grade grade) {
        this.grade = grade;
    }

    @Override
    public String toString() {
        return "Student [name=" + name + ", email=" + email + "]";
    }

    @Override
    public boolean equals(Object obj) {
        Student student = (Student) obj;
        return this.name.equals(student.getName()) && this.email.equals(student.getEmail());
    }

    @Override
    protected Object clone() throws CloneNotSupportedException {
        return new Student(this.id, this.name, this.email);
    }
}

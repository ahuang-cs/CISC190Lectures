package edu.sdccd.cisc190;

public class User {
    public static enum Types {
        CUSTOMER,ADMIN,VISITOR;
    }
    private String name;
    private int age;
    public User(String newName, int newAge) {
        this.name = newName;
        this.age = newAge;
    }
    public User(String name) {
        this.name = name;
    }
    public User(int age) {
        this.age = age;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) throws Exception {
        if(age < 18) {
            throw new Exception("Must be an adult!");
        }
        this.age = age;
    }
}

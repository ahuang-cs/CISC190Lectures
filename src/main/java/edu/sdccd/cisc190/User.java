package edu.sdccd.cisc190;

public class User {
    private String firstName;
    private String lastName;
    private String email;

    public User() {
    }

    public User(String newFirstName, String newLastName, String newEmail) {
        this.firstName = newFirstName;
        this.lastName = newLastName;
        this.email = newEmail;
    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }
}

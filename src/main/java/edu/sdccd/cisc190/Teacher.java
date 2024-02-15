package edu.sdccd.cisc190;

public class Teacher extends User {
    private boolean hasRoomKeys;

    public Teacher(String newFirstName, String newLastName, String newEmail, boolean hasRoomKeys) {
        super(newFirstName, newLastName, newEmail);
        this.hasRoomKeys = hasRoomKeys;
    }
}

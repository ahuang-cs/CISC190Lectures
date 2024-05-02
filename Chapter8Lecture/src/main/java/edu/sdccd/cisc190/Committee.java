package edu.sdccd.cisc190;

public final class Committee {
    private final String committeeName;
    private final Person chairPerson;

    public Committee(String committeeName, Person chairPerson) {
        this.committeeName = committeeName;
        this.chairPerson = new Person(chairPerson);
    }
    public String getCommitteeName(){ return committeeName; }
    public Person getChairPerson() { return new Person(chairPerson); }
}

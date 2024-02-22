package ciscpackage;

public class Dog {
    private String name;
    private String type;
    private String favoriteToy;
    protected String mood;

    public Dog(String name, String type, String favoriteToy) {
        this.name = name;
        this.type = type;
        this.favoriteToy = favoriteToy;
        mood = "meh";
    }

    public void playWithDog(String toy) {
        if(toy.equals(favoriteToy)) {
            mood = "happy";
        } else {
            mood = "meh";
        }
    }

    public String getName() {
        return name;
    }
}

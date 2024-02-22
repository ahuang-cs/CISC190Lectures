package ciscpackage;

public class Corgi extends Dog {
    static int staticInt;
    int bareInt;
    String objVar;
    public Corgi(String newName, String newType, String newFavoriteToy) {
        super(newName, newType, newFavoriteToy);
        String constructorVar = " constructor var";
        objVar = newName + " " + constructorVar;
        System.out.println(newName + constructorVar);
    }

    public void herd(String[] animals) {
        System.out.println(objVar);
        mood = "happy";
    }
}

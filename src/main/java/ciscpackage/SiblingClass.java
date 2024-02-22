package ciscpackage;

public class SiblingClass {
    DefaultClass defClass;

    public SiblingClass() {
        defClass = new DefaultClass();
        //System.out.println(defClass.name);
        System.out.println(defClass.pubStr);
        System.out.println(defClass.proStr);
        System.out.println(defClass.defStr);

//        System.out.println(defClass.getPrivateString());
        System.out.println(defClass.getDefaultString());
        System.out.println(defClass.getProtectedString());
    }
}

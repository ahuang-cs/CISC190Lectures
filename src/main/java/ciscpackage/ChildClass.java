package ciscpackage;

public class ChildClass extends DefaultClass {
    public ChildClass() {
        DefaultClass defClass = new ChildClass();
//        System.out.println(defClass.name);
        System.out.println(defClass.pubStr);
        System.out.println(defClass.proStr);
        System.out.println(defClass.defStr);

//        System.out.println(defClass.getPrivateString());
        System.out.println(defClass.getProtectedString());
        System.out.println(defClass.getDefaultString());
    }
}

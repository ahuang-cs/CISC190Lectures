package edu.sdccd.cisc190;

public class Main {
    //Java automatically stores this value in all uninitialized static member variables:
    static int i;
    static String str;
    static char c;
    int nonStatic;
    //        0     1      2
    enum Tree{OAK, MAPLE, PINE};

    public static void main(String[] args) {
        System.out.println(getRectangle());
        System.out.println(i);
        System.out.println(str);
        try {
            System.out.println(str.length());
        } catch(NullPointerException npe) {
            System.err.println("str is not initialized!");
        }
        System.out.println(c);

        Rectangle r1 = new Rectangle(5,10);
        Rectangle r2 = r1;
        Rectangle r3 = new Rectangle(r1);
        System.out.println(r1);
        System.out.println(r2);
        System.out.println(r3);

        System.out.println(Tree.MAPLE.ordinal());
        System.out.println(Tree.OAK);

        Tree tree = Tree.MAPLE;
        switch(Tree.OAK) {
            case OAK:
                System.out.println("OAK");
                break;
        }
        System.out.println(getTree(Tree.MAPLE));

        //+ equals(object2:Stock) : boolean
        // public method that takes in a Stock object and returns a boolean

    }

    public static String getTree(Tree tree) {
        return tree.toString();
    }

    public static Rectangle getRectangle() {
        Main main = new Main();
        System.out.println(main.nonStatic);
        return new Rectangle();
    }


}

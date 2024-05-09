package edu.sdccd.cisc190;

public class Square extends Rectangle {
    private int color;

    public Square(int width, int height) throws Exception {
        super(width, height);

        if(width != height) throw new Exception("Squares must have width equal height!");
        this.color = 5;
    }

    public void accessTest() {
        //System.out.println(priv);   // children classes cannot see parent private fields
        System.out.println(prot);
        System.out.println(def);
        System.out.println(pub);
    }
}

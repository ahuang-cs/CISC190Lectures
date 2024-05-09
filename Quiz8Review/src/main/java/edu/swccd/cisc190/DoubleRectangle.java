package edu.swccd.cisc190;

import edu.sdccd.cisc190.Rectangle;

public class DoubleRectangle extends Rectangle {
    public void accessTest() {
        //System.out.println(priv);   // children classes cannot see parent private fields
        System.out.println(prot);
        //System.out.println(def);    // children classes cannot see parent default fields
        System.out.println(pub);
    }
}

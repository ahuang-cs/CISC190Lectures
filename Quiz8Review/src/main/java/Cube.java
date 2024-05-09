import edu.sdccd.cisc190.Rectangle;

public class Cube {
    public void accessTest() {
        Rectangle rectangle = new Rectangle();
        // outside packages and classes can only see public fields
//        System.out.println(rectangle.priv);
//        System.out.println(rectangle.prot);
//        System.out.println(rectangle.def);
        System.out.println(rectangle.pub);
    }
}

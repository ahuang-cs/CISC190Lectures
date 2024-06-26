package edu.sdccd.cisc190;

import java.util.Objects;

public class Rectangle {
    private int priv;
    protected int prot;
    int def;
    public int pub;


    int height;
    int width;
//    @Override
//    public String toString() {
//        return "This is a rectangle instance!";
//    }
    public Rectangle() {
        System.out.println(priv);
        System.out.println(prot);
        System.out.println(def);
        System.out.println(pub);
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Rectangle rectangle = (Rectangle) o;
        return height == rectangle.height && width == rectangle.width;
    }

    @Override
    public int hashCode() {
        return Objects.hash(height, width);
    }

    public Rectangle(int height, int width) {
        this.height = height;
        this.width = width;
    }

    public Rectangle(Rectangle src) {
        this.height = src.height;
        this.width = src.width;
    }
}

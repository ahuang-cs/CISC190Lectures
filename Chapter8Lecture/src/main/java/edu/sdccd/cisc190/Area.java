package edu.sdccd.cisc190;

public class Area {
    public static void main(String[] args) {
        System.out.printf("%.2f\n", getArea(3));
        System.out.printf("%.1f\n", getArea(2, 4));
        System.out.printf("%.1f\n", getArea(3, 4, 5));
    }
    static double getArea(double radius) {
        return Math.PI * radius * radius;
    }
    static double getArea(double length, double width) {
        return length * width;
    }
    static double getArea(double base1length, double base2length, double height) {
        return (base1length + base2length) * height / 2;
    }
}

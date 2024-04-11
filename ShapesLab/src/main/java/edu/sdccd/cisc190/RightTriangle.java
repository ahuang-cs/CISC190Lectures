package edu.sdccd.cisc190;

public class RightTriangle extends Shape {
    private double base;
    private double height;
    public RightTriangle(double base, double height) {
        this.base = base;
        this.height = height;
    }

    @Override
    public double getPerimeter() {
        return base + height + Math.sqrt(Math.pow(base, 2) + Math.pow(height, 2));
    }

    @Override
    public double getArea() {
        return 0.5 * base * height;
    }
}

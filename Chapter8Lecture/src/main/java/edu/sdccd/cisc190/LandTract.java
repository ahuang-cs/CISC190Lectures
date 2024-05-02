package edu.sdccd.cisc190;

public class LandTract {
    private int length;
    private int width;

    public LandTract(int length, int width) {
        this.length = length;
        this.width = width;
    }
    public LandTract(LandTract landTract) {
        this.length = landTract.length;
        this.width = landTract.width;
    }
    public int getLength() {return length;}
    public int getWidth() {return width;}
    public int area() { return length * width; }
    public boolean equals(LandTract landTract) {
        return this.area() == landTract.area();
    }

    public String toString() {
        return String.format("Length: %d, Width: %d, Area: %d", length, width, area());
    }
}

package edu.sdccd.cisc190;

public class Car {
    private String make;
    private String model;
    private int year;

    public Car(String make, String model, int year, String trim) {
        this.make = make;
        this.model = model;
        this.year = year;
        this.trim = trim;
    }

    @Override
    public String toString() {
        return "Car{" +
                "make='" + make + '\'' +
                ", model='" + model + '\'' +
                ", year=" + year +
                ", trim='" + trim + '\'' +
                '}';
    }

    public String getMake() {
        return make;
    }

    public void setMake(String make) {
        this.make = make;
    }

    public String getModel() {
        return model;
    }

    /**
     *
     * @param model The model of the Car
     */
    public void setModel(String model) {
        this.model = model;
    }

    public int getYear() {
        return year;
    }

    public void setYear(int year) {
        this.year = year;
    }

    public String getTrim() {
        return trim;
    }

    public void setTrim(String trim) {
        this.trim = trim;
    }

    private String trim;
}

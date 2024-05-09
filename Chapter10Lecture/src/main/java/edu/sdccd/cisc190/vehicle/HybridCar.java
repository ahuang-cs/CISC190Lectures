package edu.sdccd.cisc190.vehicle;

import edu.sdccd.cisc190.Customer;

public class HybridCar extends Car implements Combustible, Chargeable {
    private int fuelLevel;
    private int batteryCharge;
    public HybridCar(String manufacturerName, int milesOnVehicle, int price, int numberOfSeats, Option[] options, int numberOfDoors) {
        super(manufacturerName, milesOnVehicle, price, numberOfSeats, options, numberOfDoors);
        fuelLevel = 0;
        batteryCharge = 67;
    }

    @Override
    public int getBatteryCharge() {
        return batteryCharge;
    }

    @Override
    public void chargeUp() {
        batteryCharge = 100;
    }

    @Override
    public void buildEngine() {
        System.out.println("Built engine!");
    }

    @Override
    public int getFuelLevel() {
        return fuelLevel;
    }

    @Override
    public void tankUp() {
        fuelLevel = 100;
    }

    @Override
    protected Vehicle createVehicle() {
        return null;
    }
}

package edu.sdccd.cisc190.vehicle;

public interface Chargeable {
    int getBatteryCharge();
    void chargeUp();

    default void createChargeable(){
        buildEngine();
    }
    void buildEngine();
}
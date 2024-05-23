package edu.sdccd.cisc190;

public class Order {
    private int orderNum;
    private double orderAmount;
    private double orderDiscount;

    public Order(int orderNum, double orderAmount, double orderDiscount) {
        this.orderNum = orderNum;
        this.orderAmount = orderAmount;
        this.orderDiscount = orderDiscount;
    }

    public int getOrderNum() {
        int hello = 0;
        return orderNum;
    }

    public double getOrderAmount() {
        return orderAmount;
    }

    public double getOrderDiscount() {
        return orderDiscount;
    }
}

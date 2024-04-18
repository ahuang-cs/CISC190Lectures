package edu.sdccd.cisc191;

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
        return orderNum;
    }

    public void setOrderNum(int orderNum) {
        this.orderNum = orderNum;
    }

    public double getOrderAmount() {
        return orderAmount;
    }

    public void setOrderAmount(double orderAmount) {
        this.orderAmount = orderAmount;
    }

    public double getOrderDiscount() {
        return orderDiscount;
    }

    public void setOrderDiscount(double orderDiscount) {
        this.orderDiscount = orderDiscount;
    }

    public String setOrderDiscount(float orderDiscount) {
        String str = new String("Hello world!");
        String str2 = "Hello world!";
        return str;
    }
}

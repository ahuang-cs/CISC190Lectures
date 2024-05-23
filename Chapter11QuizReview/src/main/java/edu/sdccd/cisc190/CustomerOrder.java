package edu.sdccd.cisc190;


// this is a comment
/*

 */

import java.io.PrintWriter;
import java.util.Random;

/**
 *
 */
public class CustomerOrder {

    /**
     *
     * @param args command line input parameters
     */
    public static void main(String[] args) {
        Integer.parseInt("5");
        Integer i = new Integer(5);
        double l = 5.0;
        float f = 5f;
        int j= 5;
        long z = 5l;

        String str = "hello world";
        int[] a = {0,1,2,3,4};
        int[] b = new int[4];
        // 0 is the index or subscript
        System.out.print("bob");
        System.out.println("\b\bhello" +
                "world");




        final int ordNum = 5;
        double ordAmount = 580.0;
        double discountPer = 0.1;
        Order order = new Order(ordNum, ordAmount, discountPer);
        double finalAmount = order.getOrderAmount() - order.getOrderAmount() * order.getOrderDiscount();
        System.out.printf("Final order amount = \"%%\" $%,.2f %s\n", finalAmount, "hello");
    }
}

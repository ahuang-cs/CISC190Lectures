package edu.sdccd.cisc190;

import java.util.Scanner;

public class Main {
    private static Car[] cars;
    public static void main(String[] args) {
        cars = new Car[20];

        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter year: ");
        int year = scanner.nextInt();
        System.out.println("Enter make: ");
        String make = scanner.next();
        System.out.println("Enter model: ");
        String model = scanner.next();
        System.out.println("Enter trim: ");
        String trim = scanner.next();

        cars[0] = new Car(make,model,year,trim);
        System.out.println(cars[0]);
        updateTrim(cars[0], "base");
        System.out.println(cars[0]);
    }

    private static void updateTrim(Car car, String trim) {
        car.setTrim(trim);
    }

}

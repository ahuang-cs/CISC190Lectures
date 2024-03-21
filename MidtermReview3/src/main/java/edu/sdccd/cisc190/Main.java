package edu.sdccd.cisc190;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Please enter a number: ");
        int number = input.nextInt();
        while(number < 100 || number > 500) {
            System.out.print("Enter another number: ");
            number = input.nextInt();
        }
    }
}

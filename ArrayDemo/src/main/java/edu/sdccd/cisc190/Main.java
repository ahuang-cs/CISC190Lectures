package edu.sdccd.cisc190;

import java.io.*;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
//        int numTests;
//        int[] tests;
//        Scanner kb = new Scanner(System.in);
//        System.out.print("Enter number of tests: ");
//        numTests = kb.nextInt();
//        tests = new int[numTests];
//        System.out.println("Test array size: " + tests.length);
//
//        tests = new int[numTests];

        int[] arr1 = {0,1,2,3,4};
        int[] arr2 = {0,1,2,3,4};

        if(arr1 == arr2) {  // this is a mistake!
            System.out.println("Arrays are equal");
        }

        if(equals(arr1,arr2)) {
            System.out.println("Arrays are equal");
        }

        System.out.println("Max value: " + getMax(arr1));
        System.out.println("Average: " + getAverage(arr1));
        try {
            arr1 = readFromFile();
            print(arr1);
        } catch (IOException e) {
            System.err.println(e.getCause());
        }
    }

    public static int getLineCount() throws IOException {
        BufferedReader br = new BufferedReader(new FileReader("values.txt"));
        int lines = 0;
        while(br.readLine() != null) lines++;
        br.close();
        return lines;
    }

    public static int[] readFromFile() throws IOException {
        int[] arr = new int[getLineCount()];
        Scanner input = new Scanner(new File("values.txt"));
        int i = 0;
        while(input.hasNext() && i < arr.length) {
            arr[i] = input.nextInt();
            i++;
        }
        return arr;
    }

    public static void writeToFile(int[] arr) throws FileNotFoundException {
        PrintWriter pw = new PrintWriter("values.txt");
        for(int i: arr) {
            pw.println(i);
        }
        pw.close();
    }

    public static int getAverage(int[] arr) {
        int sum = 0;
        for (int i = 0; i < arr.length; i++) {
            sum += arr[i];
        }
        return sum / arr.length;

    }

    public static int getMax(int[] arr) {
        int max = arr[0];
        for(int i = 1; i < arr.length; i++) {
            if(arr[i] > max) max = arr[i];
        }
        return max;
    }

    public static boolean equals(int[] arr1, int[] arr2) {
        if(arr1.length != arr2.length) return false;
        for(int i = 0; i < arr1.length; i++) {
            if(arr1[i] != arr2[i]) return false;
        }
        return true;
    }

    public static void modifyArray(Integer[] is) {
        is[0] = 10;
        is[1] = 20;
        is[2] = 30;
        is[3] = 40;
    }


    private static Integer[] expandArray(Integer[] is, int newSize) throws Exception {
        if(newSize < is.length) throw new Exception("Cannot shrink array");
        Integer[] newArray = new Integer[newSize];
        for(int i = 0; i < is.length; i++) newArray[i] = is[i];
        return newArray;
    }

    public static void print(int[] ints) {
        System.out.println("Array Length: " + ints.length);
        System.out.print("Array Values: ");
        for(int j = 0; j < ints.length; j++) {
            System.out.print(ints[j] + " ");
        }
    }
}

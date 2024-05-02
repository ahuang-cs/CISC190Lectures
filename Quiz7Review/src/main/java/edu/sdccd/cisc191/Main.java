package edu.sdccd.cisc191;

import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        String[] arr = new String[10];
        arr[0] = "Hello";

        arrayVisibility(arr);
        for (int i = 0; i < arr.length; i++) {
            System.out.println(arr[i]);
        }

        int[] x = {23, 55, 83, 19};
        int[] y = {36, 78, 12, 24};
        for(int a = 0; a<x.length; a++) {
            x[a] = y[a];
            y[a] = x[a];
        }
        System.out.println("");
                 //0  1  2  3  4  5  6  7  8
//        int[] z = {55,33,88,22,99,11,44,66,77};
//        int a = 10;
//        if(x[2] > x[5]) a = 5;
//        else a = 8;

        final int SUB = 12;
        int[] x1 = new int[SUB];
        int y1 = 100;

        // x1[0]: 100
        // x1[1]: 110
        // x1[8]: 180
        for(int i = 0; i < SUB; i++) {
            x1[i] = y1;
            y1 += 10;
        }

//        final int SIZE = 25;
//        int[] array1 = new int[SIZE];
//        int value = 0;
//        for(int i = 0; i <=array1.length; i++) {
//            value += array1[i];
//        }

        List list = new ArrayList();
        list.size();
        list.add(new Object());

        int[] array2 = new int[25];
        // code that will populate array2
        int value = array2[0];
        for(int i = 0; i <array2.length; i++) {
            if(array2[i] < value) {
                value = array2[i];
            }
        }

        int[] a = {23,55,83,19};
        int[] b = {36,78,12,24};

        a = b;
        b = a;


        int[] c = {22,33,44};
        arrayProcess(c[1]);

        question11();

        int[] d = {0,1,2,3,4,5};

        //[row][col]
        int[][] scores = {
                {88,80,79,92},
                {75,84,93,80},
                {98,95,92,94},
                {91,84,88,96}
        };
        System.out.println(scores[2][3]);

    }

    private static void question10() {
        final int SIZE = 25;
        int[] array1 = new int[SIZE];
        int value = 0;
        for(int i = 0; i < array1.length; i++) {
            value += array1[i];
        }
    }

    private static void question11() {
                        //0    1      2      3
        String[] str = {"abc","def","ghi", "jkl"};

        System.out.println(str[2]);
    }

    private static void arrayProcess(int i) {
        i = i + 5;
    }

    public static void arrayVisibility(String[] arr) {
        arr[1] = "World";
    }
}

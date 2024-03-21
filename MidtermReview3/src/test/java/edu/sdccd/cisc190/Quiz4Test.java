package edu.sdccd.cisc190;

import org.junit.jupiter.api.Test;

import java.io.*;
import java.util.Scanner;

public class Quiz4Test {
    @Test
    void orderOfOps1() {
        int x = 12, y = 5;

        // 1  14
        x += y--;

        // x = 17
        // y = 4

        x = 12;
        y = 5;
        x += --y;
        // x = 16
        // y = 4
    }

    @Test
    void doWhileTest() {
        // -2147483648 to 2147483647
        int x = 10;
        do {
            x *= 20;
        } while (x > 5);
    }

    @Test
    void forLoopTest() {
        int i = 0;
        for(int count = 10; count < 21; count++) {
            i++;
            System.out.println("Java is great!!!");
        }
        System.out.println(i);
        i = 0;
        int count = 10;
        do {
            System.out.println("Java is great!!!");
            count++;
            i++;
        } while(count < 21);
        System.out.println(i);
    }

    @Test
    void fileWriterTest() {
        try {
            FileWriter fwriter = new FileWriter("MyFile.txt",true);
            PrintWriter outfile = new PrintWriter(fwriter);
        } catch (IOException e) {
            System.err.println(e.getMessage());
        }
    }

    @Test
    void orderOps2() {
        int x,y = 15, z=3;

        //1 16 15 12 16 14
        x = (y--) / (++z);
        //   14 / 4
        //   3
    }

    @Test
    void whileTest() {
        int x = 10, y = 20;
        while (y < 100) {   // 1   2    3    4
            x += y;         //x30  70   130  210
            y += 20;        //y40  60   80   100
        }
    }

    @Test
    void forLoopTest2() {
        int x = 10;
        for (int y = 5; y < 20; y+=5) {  //  1     2      3    4
                                         // y 5   10     15    20
            x += y;                      //x 15   25     40    40
        }
    }

    @Test
    void doWhileTest2() {
        int x = 11;
        int i = 0;
        do {                // 1   2   3   4   5     6
            x += 20;        // 31  51  71  91  111
            i++;
        } while( x <= 100);
        System.out.println("do-while count: " + i);

        x = 11;
        i = 0;
        while( x <= 100 ) {
            x += 20;
            i++;
        }
        System.out.println("while count: " + i);
    }

    @Test
    void printWriterTest2() {
        try {
            File file = new File("DiskFile.txt");
            if(file.exists()) {
                PrintWriter diskOut = new PrintWriter("DiskFile.txt");
                diskOut.println("Calvin");
            }
        } catch (FileNotFoundException e) {
            throw new RuntimeException(e);
        }
    }

    @Test
    void whileTest3() {
        int x = 10;
        while(x < 100)
        {
            x += 10;
        }
    }

    @Test
    void orderOps3() {
        int x,y = 4, z = 6;
           // postincrement will happen after the * even with parens
        x = (y++) * (++z);
            // 4 * 7
    }

    @Test
    void orderOps4() {
        int x = 25, y = 8;
        //1   15
        x += y++;

        // x=33, 9
    }
}

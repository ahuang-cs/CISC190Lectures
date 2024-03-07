package edu.sdccd.cisc190;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class IntegerDemoTest {
    //named constant
    public static final int BUFFER_SIZE = 1024;

    // string literal
    String path = "src/main/resources";
    IntegerDemo integerDemo;

    @BeforeEach
    void setUp() {
        integerDemo = new IntegerDemo(5);
    }

    @Test
    void setPrimitiveInt() {
        assertEquals(5, integerDemo.getPrimitiveInt());
        integerDemo.setPrimitiveInt(10);
        assertEquals(10, integerDemo.getPrimitiveInt());
    }

    @Test
    void setWrapperInt() {
        assertEquals(5, integerDemo.getWrapperInt());
        integerDemo.setWrapperInt(20);

        assertEquals(20, integerDemo.getWrapperInt());
    }

    @Test
    void primitivePassByTest() {
        int primitiveInt = 50;
        assertEquals(100, IntegerDemo.primitivePassByTest(primitiveInt));
        assertEquals(50, primitiveInt);

    }

    @Test
    void wrapperPassByTest() {
        Integer wrapperInt = 50;
        assertEquals(200, IntegerDemo.wrapperPassByTest(wrapperInt));
        assertEquals(50, wrapperInt);
    }

    @Test
    void testHenHouse() {
        int x = 578;
        String name = "John Doe";


        System.out.println("There are " +
                x + 5 + "\n +" +
                "hens in the hen house.");
    }

    @Test
    void testMath() {
        int x=5, y=28;
        float z;
        z = (float) y/x;

        // PEMDAS
        // parens, exponents, mult, div, add, sub
                            //12  11  12  12
        System.out.println(25 / 4 + 4 * 10 % 3);
        System.out.println((25 / 4) +( (4 * 10) % 3));

        // this is a single line comment
        /*
        this is a block comment
         */
        /**
         * cleaner block comment
         */
        System.out.println( 17 % 3 * 2 - 12 + 15);
        System.out.println( (((17 % 3) * 2) - 12) + 15);


        int x1 = 0;
        x1 += 1;
        System.out.println(x1);
        x1 = x1 + 1;
        System.out.println(x1);
        x1 /= 5;
        x1 %= 10;

        double r = 0.95;
        float f = 1.25f;

        String name = "Bob";
        if(name != "Alice") {
            System.out.println("Not Alice!");
        }

    }

    @Test
    void conditionalTest() {
        int ans = 0, x = 15, y = 25;
        if(x >= y) {
            ans = x + 10;
            x -= y;
        } else {
            ans = y + 10;
            y += x;
        }
    }

    @Test
    void switchTest() {
        int x = 10;
        switch(x) {
            case 10:
                x += 15;
            case 12:
                x -= 5;
            default:
                x *= 3;
        }
    }

    @Test
    void printfTest() {
        double x = 456123078.259;
        System.out.printf("%,.2f", x);
    }

    @Test
    void badIfTest() {
        double discountRate = 0.0;
        int purchase = 1250;
        if(purchase > 1000)
            discountRate = 0.05;
        else if(purchase > 750)
            discountRate = 0.03;
        else if(purchase > 500)
            discountRate = 0.01;
        else
            discountRate = 0;

    }

    @Test
    void badIfSyntaxTest() {
        int x = 35;
        int y = 20, ans = 80;

        if(x < y);
            ans += y;
    }

    @Test
    void shortCircuitTest() {
        boolean t = true;
        boolean f = false;

        if(f && t) {
            System.out.println("we're in f&&t!");
        }
        if(t && f) {
            System.out.println("we're in t&&f!");
        }
    }

    @Test
    void strCmpTest() {
        String str1 = "string 1";
        String str2 = "string 1";

        if(str1.equals(str2)) {
            System.out.println("str1 equals str2");
        }
        if(str1.compareTo(str2) < 0) {
            System.out.println("str1 less than str2");
        }
    }

    @Test
    void badIfSyntax2Test() {
        int x = 90, y = 55, ans = 10;
        if(x == y);
            ans *= 2;
    }
}


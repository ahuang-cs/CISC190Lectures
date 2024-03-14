package edu.sdccd.cisc190;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class MainTest {
    @Test
    /**
     * If str1 and str2 are both Strings, which of the following will
     * correctly test to determine whether str1 is less than str2?
     */
    void stringCmpTest() {
        String str1 = "hello world";
        String str2 = "hello,world!";
        String str3 = "Hello World";

        // test relational operators
        assertFalse(str1.equals(str2));
        assertFalse(str1 == str2);
        assertEquals(-12, str1.compareTo(str2));
        assertEquals(0, str3.compareToIgnoreCase(str1) + str1.compareToIgnoreCase(str3));
    }

    @Test
    void stringFormatTest() {
        double x = 45678123123.250;
        assertEquals("45,678,123,123.25", String.format("%,.2f", x));
    }

    @Test
    void ifSyntaxTest() {
        int bonus, sales = 1250;
        if(sales > 1000)
            bonus = 100;
        else if(sales > 750 )
            bonus = 50;
        else if(sales > 500)
            bonus = 25;
        else
            bonus = 0;

        assertEquals(100, bonus);
    }

    @Test
    /**
     * Which of the following is the correct boolean expression to test for:
     * int x being a value between, but not including, 500 and 650, or int y not equal to 1000?
     */
    void booleanIfTest() {
        int x = 600;
        int y = 800;

        assertTrue((x < 650 && x > 500) || y != 1000);
    }

    @Test
    void ifMathTest() {
        int x = 35;
        int y = 20, ans = 80;
        if(x < y);
        ans += y;
        assertEquals(100,ans);
    }

    @Test
    void orderOfOpsTest() {
        int hours = 45;
        double pay,  payRate = 10.00;
        //          9      2       12             12       14 16    14     16        12
        pay = hours <= 40 ? hours * payRate : 40 * payRate + (hours - 40) * payRate * 1.5;
        //pay = hours <= 40 ? hours * payRate : 40 * 15 * payRate * 1.5;
        assertEquals(475.0, pay);
    }

    @Test
    void orderOfOpsTest2(){
        double charges, rate = 7.00;
        int time = 180;

        charges = time <= 119 ? rate * 2: time / 60.0 * rate;
        //charges = (time <= 119) ? (rate * 2): (time / 60.0 * rate);
        //charges = false ? 14 : 21;
        assertEquals(21, charges);
    }

    @Test
    void syntaxErrorTest() {
        int y = 10;
        int x = 0;
        if (y == 10) {
            x = 30;
            x += y;
        }
        System.out.print("x = " + x);
    }

    @Test
    void testSwitchMissingBreaks() {
        int x = 10;
        switch(x) {
            case 10:
                x += 15;
                break;
            case 12:
                x -= 5;
                break;
            default:
                x *= 3;
                break;
        }

        System.out.println(x);
    }
}
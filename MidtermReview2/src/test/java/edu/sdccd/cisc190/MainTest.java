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
        assertFalse(str1.compareTo(str2) == 0);
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

        // intentional null statement
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

    @Test
    void nestedIfTest() {
        double discountRate = 0.0;
        int puchase = 1250;
        char cust = 'N';

        if(puchase > 1000)
            if(cust == 'Y')
                discountRate = .05;
            else
                discountRate = .04;
        else if(puchase > 750)
            if(cust == 'Y')
                discountRate = .04;
            else
                discountRate = .03;
        else
            discountRate = 0;
    }

    @Test
    void charCmp() {
        char chr = 'a';

        if(chr == 'b') {

        }
    }

    @Test
    void switchMissingBreakTest() {
        double discountRate;
        char custType = 'B';
        switch(custType) {
            case 'A':
                discountRate = .08;
                break;
            case 'B':
                discountRate = .06;
            case 'C':
                discountRate = .04;
            default:
                discountRate = 0.0;
        }
    }

    @Test
    void notEqualTest() {
        String str1 = "hello";
        String str2 = "world";

        assertTrue(!str1.equals(str2));
        assertTrue(str1 != str2);
    }

    @Test
    void strFormatTest2() {
        // display 12.7801 as $12.78
        float x = 11231232.7801f;

        System.out.printf("$%.2f", x);
    }

    @Test
    void ifWithMathTest() {
        int ans = 35, x = 50, y = 50;

        if(x >= y) {
            ans = x + 10;
            x -= y;
        } else {
            ans = y + 10;
            y += x;
        }

        assertEquals(60, ans);
        assertEquals(50, y);
        assertEquals(0, x);
    }

    @Test
    void printfTest() {
        int d = 9, e = 12;
        System.out.printf("%d %d\n", d, e);
    }
}
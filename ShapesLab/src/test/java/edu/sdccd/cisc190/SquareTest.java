package edu.sdccd.cisc190;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class SquareTest {
    Shape square;

    @BeforeEach
    void setUp() {
        square = new Square(5);
    }

    @Test
    void getPerimeter() {
        assertEquals(20, square.getPerimeter());
    }

    @Test
    void getArea() {
        assertEquals(25, square.getArea());
    }
}
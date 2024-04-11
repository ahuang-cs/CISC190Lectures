package edu.sdccd.cisc190;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class CircleTest {
    Shape circle;

    @BeforeEach
    void setUp() {
        circle = new Circle(10);
    }

    @Test
    void getPerimeter() {
        assertEquals(62.83185307179586, circle.getPerimeter());
    }

    @Test
    void getArea() {
        assertEquals(314.1592653589793, circle.getArea());
    }
}
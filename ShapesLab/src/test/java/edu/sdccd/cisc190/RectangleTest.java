package edu.sdccd.cisc190;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class RectangleTest {
    Shape shape;

    @BeforeEach
    void setUp() {
        shape = new Rectangle(3,5);
    }

    @Test
    void getPerimeter() {
        assertEquals(16,shape.getPerimeter());
    }

    @Test
    void getArea() {
        assertEquals(15,shape.getArea());
    }
}
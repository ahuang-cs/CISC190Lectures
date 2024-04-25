package edu.sdccd.cisc190;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.util.Arrays;

import static org.junit.jupiter.api.Assertions.*;

class SpreadsheetTest {
    private Spreadsheet square, ragged, nonsquare;

    @BeforeEach
    void setUp() {
        square = new Spreadsheet(new int[][] {
                {1,2,3},
                {4,5,6},
                {7,8,9}});
        ragged = new Spreadsheet(new int[][] {
                {-10,-12,-3},
                {-4,-5,-6,-8},
                {-7,-8}});
        nonsquare = new Spreadsheet(new int[][] {
                {1,2,3},
                {4,5},
                {6,7,8,9}});
    }

    @Test
    void sortRows() {
        int[][] expectedSortedSquare = new int[][] {
                {1,2,3},
                {4,5,6},
                {7,8,9}};
        square.sortRowsAscending();
        assertTrue(Arrays.deepEquals(expectedSortedSquare, square.getSheet()));
        int[][] expectedSortedRagged = new int[][] {
                {-12,-10,-3},
                {-8,-6,-5,-4},
                {-8,-7}};
        ragged.sortRowsAscending();
        assertTrue(Arrays.deepEquals(expectedSortedRagged, ragged.getSheet()));
        int[][] expectedSortedNonsquare = new int[][] {
                {1,2,3},
                {4,5},
                {6,7,8,9}};
        nonsquare.sortRowsAscending();
        assertTrue(Arrays.deepEquals(expectedSortedNonsquare, nonsquare.getSheet()));
    }

    @Test
    void max() {
        assertEquals(9, square.max());
        assertEquals(-3, ragged.max());
        assertEquals(9, nonsquare.max());
    }

    @Test
    void rowSum() {
        assertEquals(15, square.rowSum(1));
        assertEquals(-15, ragged.rowSum(2));
        assertEquals(6, nonsquare.rowSum(0));
    }

    @Test
    void colSum() {
        assertEquals(15, square.colSum(1));
        assertEquals(-9, ragged.colSum(2));
        assertEquals(9, nonsquare.colSum(3));
    }

    @Test
    void getRowSums() {
        int[] expectedSquareSums = new int[]{6,15,24};
        assertArrayEquals(expectedSquareSums, square.getRowSums());

        int[] expectedRaggedSums = new int[]{-25,-23,-15};
        assertArrayEquals(expectedRaggedSums, ragged.getRowSums());

        int[] expectedNonsquareSums = new int[]{6,9,30};
        assertArrayEquals(expectedNonsquareSums, nonsquare.getRowSums());
    }
}
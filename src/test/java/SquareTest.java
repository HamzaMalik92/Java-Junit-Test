package com.pixcel;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

class SquareTest {


    @Test
    void shouldReturnCorrectArea() {
        Square square = new Square(5.5);
        assertEquals(30.25, square.getArea());
    }


    @Test
    void shouldReturnZeroForSideZero() {
        Square square = new Square(0);
        assertEquals(0, square.getArea());
    }


    @Test
    void shouldReturnOneForSideOne() {
        Square square = new Square(1);
        assertEquals(1, square.getArea());
    }
}

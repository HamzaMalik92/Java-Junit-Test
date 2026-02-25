package com.pixcel.geeksforgeeks.dsa;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.junit.jupiter.api.Assertions.assertTrue;

class NumbersTest {

    @Test
    void testIsEven() {
        assertTrue(Numbers.isEven(2));
        assertTrue(Numbers.isEven(10));
        assertTrue(Numbers.isEven(-2));
        assertTrue(Numbers.isEven(-10));
        assertTrue(Numbers.isEven(0));
        assertFalse(Numbers.isEven(3));
        assertFalse(Numbers.isEven(11));
        assertFalse(Numbers.isEven(-3));
        assertFalse(Numbers.isEven(-11));
    }
}
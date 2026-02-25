package com.pixcel.geeksforgeeks.dsa;

import org.junit.jupiter.api.MethodOrderer;
import org.junit.jupiter.api.Order;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.TestMethodOrder;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvSource;

import java.util.List;

import static org.junit.jupiter.api.Assertions.*;

@TestMethodOrder(MethodOrderer.OrderAnnotation.class)
class NumbersTest {

    @Test
    @Order(1)
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

    @Test
    @Order(2)
    void testMultiplicationTable() {
        int[] testNumbers = {0, 1, 5, 10, -3};
        for (int n : testNumbers) {
            List<String> actualTable = Numbers.multiplicationTable(n);
            System.out.println("actualTable = " + actualTable);
            assertEquals(10, actualTable.size(), "Table size should be 10 for n=" + n);
            for (int i = 1; i <= 10; i++) {
                String expected = n + "*" + i + "=" + (n * i);
                assertEquals(expected, actualTable.get(i - 1), "Failed at n=" + n + ", i=" + i);
            }
        }
    }

    @Test
    @Order(3)
    void sumNaturalNum() {
        int[] testNumbers = {0, 1, 5, 10, 100};
        long[] expectedSums = {0, 1, 15, 55, 5050};

        for (int i = 0; i < testNumbers.length; i++) {
            assertEquals(expectedSums[i], Numbers.sumNaturalNum(testNumbers[i]), "Failed for N = " + testNumbers[i]);
        }
    }

    @Test
    @Order(5)
    void sumSquareOfNaturalNum() {
        int[] testNumbers = {0, 1, 5, 10, 100};
        long[] expectedSums = {0, 1, 55, 385, 338350};

        for (int i = 0; i < testNumbers.length; i++) {
            assertEquals(expectedSums[i], Numbers.sumSquareOfNaturalNum(testNumbers[i]), "Failed for N = " + testNumbers[i]);
        }
    }

    @Order(6)
    @Test
    void swapTwoNumbersTest() {
        Number[] numbers = {5, 10};
        Number[] swapped = Numbers.swapTwoNumbers(numbers);

        assertEquals(10, numbers[0]);
        assertEquals(5, swapped[1]);

        Number[] doubles = {2.5, 7.5};
        swapped = Numbers.swapTwoNumbers(doubles);
        assertEquals(7.5, swapped[0]);
        assertEquals(2.5, swapped[1]);
    }


    @Test
    @Order(7)
    void testClosestDivisible() {
        // Typical cases
        assertEquals(12, Numbers.closestDivisible(13, 4), "Closest to 13 divisible by 4 should be 12");
        assertEquals(-18, Numbers.closestDivisible(-15, 6), "Closest to -15 divisible by 6 should be -18");

        // n divisible by m
        assertEquals(20, Numbers.closestDivisible(20, 5), "20 is divisible by 5");

        // Tie with positive numbers
        assertEquals(8, Numbers.closestDivisible(6, 4), "Closest to 6 divisible by 4 should be 8");

        // Tie with negative numbers
        assertEquals(-8, Numbers.closestDivisible(-6, 4), "Closest to -6 divisible by 4 should be -8");

        // Zero cases
        assertEquals(0, Numbers.closestDivisible(0, 3), "0 divisible by 3 should be 0");

        // Large numbers
        assertEquals(1000000, Numbers.closestDivisible(999999, 500000), "Closest divisible by 500000");

        // Edge case: negative n and negative m
        assertThrows(IllegalArgumentException.class, () -> Numbers.closestDivisible(-10, -10));
        // m cannot be 0
        assertThrows(IllegalArgumentException.class, () -> Numbers.closestDivisible(10, 0));
    }

    @Test
    @Order(7)
    void testOppositeFaceOfDice() {
        assertEquals(6, Numbers.oppositeFaceOfDice(1));
        assertEquals(5, Numbers.oppositeFaceOfDice(2));
        assertEquals(4, Numbers.oppositeFaceOfDice(3));
        assertEquals(3, Numbers.oppositeFaceOfDice(4));
        assertEquals(2, Numbers.oppositeFaceOfDice(5));
        assertEquals(1, Numbers.oppositeFaceOfDice(6));

        // Invalid dice faces
        Exception ex1 = assertThrows(IllegalArgumentException.class, () -> Numbers.oppositeFaceOfDice(0));
        assertEquals("Invalid dice face: 0", ex1.getMessage());

        Exception ex2 = assertThrows(IllegalArgumentException.class, () -> Numbers.oppositeFaceOfDice(7));
        assertEquals("Invalid dice face: 7", ex2.getMessage());
    }

    @ParameterizedTest(name = "a1={0}, a2={1}, n={2} => expected {3}")
    @CsvSource({
            "2, 3, 4, 5",
            "1, 3, 10, 19",
            "2, 1, 3, 0",
            "2, 3, 1, 2",
            "1, 2, 1000000, 1000000"
    })
    @Order(8)
    void nthTermOfArithmeticSeries(int a1, int a2, int n, int expected) {
        assertEquals(expected, Numbers.nthTermOfArithmeticSeries(a1, a2, n));
    }
}
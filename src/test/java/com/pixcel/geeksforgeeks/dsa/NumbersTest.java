package com.pixcel.geeksforgeeks.dsa;

import org.junit.jupiter.api.MethodOrderer;
import org.junit.jupiter.api.Order;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.TestMethodOrder;

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
}
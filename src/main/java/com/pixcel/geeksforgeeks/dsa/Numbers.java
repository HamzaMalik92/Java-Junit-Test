package com.pixcel.geeksforgeeks.dsa;

import lombok.Data;

import java.util.ArrayList;
import java.util.List;

@Data
public class Numbers {
    private Numbers() {
    }

    public static boolean isEven(int n) {
        return n % 2 == 0;
    }

    public static List<String> multiplicationTable(int n) {

        ArrayList<String> table = new ArrayList<>();
        for (int i = 1; i <= 10; i++) {
            table.add(n + "*" + i + "=" + n * i);
        }
        return table;
    }

    public static long sumNaturalNum(int n) {
        return ((long) n * (n + 1)) / 2;
    }

    public static long sumSquareOfNaturalNum(int n) {
        return ((long) n * (n + 1) * (2L * n + 1)) / 6;
    }

    public static Number[] swapTwoNumbers(Number[] numbers) {
        Number c = numbers[0];
        numbers[0] = numbers[1];
        numbers[1] = c;
        return numbers;
    }


    public static int closestDivisible(int n, int m) {
        if (m <= 0) {
            throw new IllegalArgumentException("m cannot be <= 0");
        }

        int q = n / m;
        int candidate1 = m * q;
        int candidate2;

        // Decide whether to take q + 1 or q - 1 depending on direction
        if (n >= 0) {
            candidate2 = m * (q + 1);
        } else {
            candidate2 = m * (q - 1);
        }

        int dist1 = Math.abs(n - candidate1);
        int dist2 = Math.abs(n - candidate2);

        if (dist1 < dist2) {
            return candidate1;
        } else if (dist1 > dist2) {
            return candidate2;
        } else {
            // distances are equal → pick one with max absolute value
            return Math.abs(candidate1) > Math.abs(candidate2) ? candidate1 : candidate2;
        }
    }

    public static int oppositeFaceOfDice(int n) {
        return switch (n) {
            case 1 -> 6;
            case 2 -> 5;
            case 3 -> 4;
            case 4 -> 3;
            case 5 -> 2;
            case 6 -> 1;
            default -> throw new IllegalArgumentException("Invalid dice face: " + n);
        };
    }

    public static int nthTermOfArithmeticSeries(int a1, int a2, int n) {
        int d = a2 - a1;       // common difference
        return a1 + (n - 1) * d;
    }
}

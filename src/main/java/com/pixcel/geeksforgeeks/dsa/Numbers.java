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
}

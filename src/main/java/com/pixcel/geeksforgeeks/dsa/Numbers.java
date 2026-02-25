package com.pixcel.geeksforgeeks.dsa;

import lombok.Data;

@Data
public class Numbers {
    private Numbers() {
    }

    public static boolean isEven(int n) {
        return n % 2 == 0;
    }
}

package com.pixcel;

import lombok.AllArgsConstructor;
import lombok.Data;

@Data
@AllArgsConstructor
public class Square {
    double side;

    double getArea() {
        return side * side;
    }
}

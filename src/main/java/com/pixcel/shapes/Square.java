package com.pixcel.shapes;

import lombok.AllArgsConstructor;
import lombok.Data;

@Data
@AllArgsConstructor
public class Square {
    double side;

    public double getArea() {
        return side * side;
    }
}

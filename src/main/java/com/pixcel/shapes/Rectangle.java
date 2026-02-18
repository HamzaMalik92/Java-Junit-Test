package com.pixcel.shapes;

import lombok.AllArgsConstructor;
import lombok.Data;

@Data
@AllArgsConstructor
public class Rectangle {

    private double length;
    private double width;

    public double getArea() {
        return length * width;
    }

    public boolean isSquare() {
        return length == width;
    }
}

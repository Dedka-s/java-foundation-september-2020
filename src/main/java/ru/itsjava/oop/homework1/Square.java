package ru.itsjava.oop.homework1;

import lombok.AllArgsConstructor;

@AllArgsConstructor
public class Square extends Figure{
    private double side;

    @Override
    public double getArea() {
        return side*side;
    }

    @Override
    public double getPerimeter() {
        return side*4;
    }
}

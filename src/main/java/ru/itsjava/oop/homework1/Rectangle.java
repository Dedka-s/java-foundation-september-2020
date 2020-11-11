package ru.itsjava.oop.homework1;

import lombok.AllArgsConstructor;

@AllArgsConstructor
public class Rectangle extends Figure{
    private double side1;
    private double side2;

    @Override
    public double getArea() {
        return side1*side2;
    }

    @Override
    public double getPerimeter() {
        return 2*side2+2*side1;
    }
}

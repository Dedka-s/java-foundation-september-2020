package ru.itsjava.allhomework.hw28_11.figure;

import lombok.AllArgsConstructor;


@AllArgsConstructor
public class Rectangle extends Figure {
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

    @Override
    public String toString() {
        return "{Side 1: " + side1 + "Side 2: " + side2 + "}";
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Rectangle)) return false;

        Rectangle rectangle = (Rectangle) o;

        if (((Rectangle) o).getPerimeter()==getPerimeter()) return true;
        return false;
    }

    @Override
    public int hashCode() {
        long temp = Double.doubleToLongBits(side1);
        return (int) (temp ^ (temp >>> 32));
    }


}

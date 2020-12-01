package ru.itsjava.allhomework.hw28_11.figure;

import lombok.AllArgsConstructor;


@AllArgsConstructor
public class Square extends Figure {
    private double side;

    @Override
    public double getArea() {
        return side*side;
    }

    @Override
    public double getPerimeter() {
        return side*4;
    }

    @Override
    public String toString() {
        return "{Side : " + side + "}";
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Square)) return false;

        Square square = (Square) o;

        return Double.compare(square.side, side) == 0;
    }

    @Override
    public int hashCode() {
        long temp = Double.doubleToLongBits(side);
        return (int) (temp ^ (temp >>> 32));
    }
}

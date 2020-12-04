package ru.itsjava.allhomework.hw28_11.figure;

import lombok.AllArgsConstructor;

@AllArgsConstructor
public class Round extends Figure{
    private double r;

    @Override
    public double getArea() {
        return Figure.PI * r * r;
    }

    @Override
    public double getPerimeter() {
        return 2 * Figure.PI * r;
    }

    @Override
    public String toString() {
        return "Round { r= " + r + " }";
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Round)) return false;

        Round round = (Round) o;

        return Double.compare(round.r, r) == 0;
    }

    @Override
    public int hashCode() {
        long temp = Double.doubleToLongBits(r);
        return (int) (temp ^ (temp >>> 32));
    }
}

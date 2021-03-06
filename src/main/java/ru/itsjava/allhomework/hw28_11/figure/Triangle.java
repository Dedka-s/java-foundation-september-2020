package ru.itsjava.allhomework.hw28_11.figure;

import lombok.AllArgsConstructor;

@AllArgsConstructor
public class Triangle extends Figure {
    private double side1;
    private double side2;
    private double side3;

    @Override
    public double getArea() {
        if ((side1>side2+side3)||(side2>side1+side3)||(side3>side1+side2)) {
            System.out.println("Неверно введены стороны");
            return 0;
        } else {
            double p = (side1+side2+side3)/2;
            return Math.sqrt(p*(p-side1)*(p-side2)*(p-side3));
        }
    }

    @Override
    public double getPerimeter() {
        if ((side1>side2+side3)||(side2>side1+side3)||(side3>side1+side2)) {
            System.out.println("Неверно введены стороны");
            return 0;
        } else {
            return side1+side2+side3;
        }
    }

    @Override
    public String toString() {
        return "{Side 1: " + side1 + " Side 2: " + side2 + " Side 3: " + side3 +"}";
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Triangle)) return false;

        Triangle triangle = (Triangle) o;

        if (((Triangle) o).getArea()==getArea()) return true;
        return false;
    }

    @Override
    public int hashCode() {
        long temp = Double.doubleToLongBits(side1);
        return (int) (temp ^ (temp >>> 32));
    }
}

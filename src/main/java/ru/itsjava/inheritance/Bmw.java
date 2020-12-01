package ru.itsjava.inheritance;

public class Bmw extends Car implements Movable{
    @Override
    public String getCarMake() {
        return "Bmw";
    }

    @Override
    public void move() {
        System.out.println(getCarMake() + " move");
    }
}

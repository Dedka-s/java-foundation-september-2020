package ru.itsjava.oop.homework1;

public class Panther extends Cat{
    public Panther(String name) {
        super(name);
    }

    @Override
    public void sayMeow() {
        System.out.println("Rrrrr");
    }
}

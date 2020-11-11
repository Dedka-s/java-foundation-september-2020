package ru.itsjava.oop.homework1;

public class Female extends Person{
    public Female(String name, int age) {
        super(false, name, age);
    }

    @Override
    public void printAge() {
        System.out.println("Всегдв 18");
    }
}

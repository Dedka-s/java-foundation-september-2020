package ru.itsjava.allhomework.hw26_11.man_dog_cat_bird_fish;

public class Dog implements Walkable, Swimable, Runnable{
    @Override
    public void run() {
        System.out.println("Бегать люблю больше чем ходить");
    }

    @Override
    public int maxRunDistance() {
        return 100;
    }

    @Override
    public void swim() {
        System.out.println("Люблю купаться");
    }

    @Override
    public double maxSwimSpeed() {
        return 4;
    }

    @Override
    public void walk() {
        System.out.println("Ходить люблю меньше чем бегать");
    }
}

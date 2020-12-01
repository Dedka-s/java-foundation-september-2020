package ru.itsjava.allhomework.hw26_11.man_dog_cat_bird_fish;

public class Man implements Walkable, Swimable, Runnable, Flyable{
    @Override
    public void fly() {
        System.out.println("Умею только на самолете");
    }

    @Override
    public String sing() {
        return "лала я улетел на юга";
    }

    @Override
    public void run() {
        System.out.println("Бегать люблю меньше чем ходить");
    }

    @Override
    public int maxRunDistance() {
        return 30;
    }

    @Override
    public void swim() {
        System.out.println("Плаваю медленее всех");
    }

    @Override
    public double maxSwimSpeed() {
        return 2;
    }

    @Override
    public void walk() {
        System.out.println("Люблю ходить больше чем бегать");
    }
}

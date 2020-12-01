package ru.itsjava.allhomework.hw26_11.man_dog_cat_bird_fish;

public class Bird implements Walkable, Swimable, Flyable{
    @Override
    public void fly() {
        System.out.println("Умею");
    }

    @Override
    public String sing() {
        return "птичья песня";
    }

    @Override
    public void swim() {
        System.out.println("Умеют только утки");
    }

    @Override
    public double maxSwimSpeed() {
        return 9;
    }

    @Override
    public void walk() {
        System.out.println("Только за хлебушком");
    }
}

package ru.itsjava.allhomework.hw26_11.man_dog_cat_bird_fish;

public class Fish implements Swimable, Flyable{
    @Override
    public void fly() {
        System.out.println("Только летучая рыба");
    }

    @Override
    public String sing() {
        return "";
    }

    @Override
    public void swim() {
        System.out.println("Быстро");
    }

    @Override
    public double maxSwimSpeed() {
        return 40;
    }
}

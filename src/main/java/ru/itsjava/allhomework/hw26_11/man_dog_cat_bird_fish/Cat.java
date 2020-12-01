package ru.itsjava.allhomework.hw26_11.man_dog_cat_bird_fish;

public class Cat implements Walkable, Runnable{
    @Override
    public void run() {
        System.out.println("не люблю");
    }

    @Override
    public int maxRunDistance() {
        return 1;
    }


    @Override
    public void walk() {
        System.out.println("НЕ ЛЮБЛЮ");
    }
}

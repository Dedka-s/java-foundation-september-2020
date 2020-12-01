package ru.itsjava.interfaces;

public class BadGin implements Creatable{
    @Override
    public void createWish() {
        System.out.println("Слушаюсь и повинусь! Но я тебя подставил!");
    }
}

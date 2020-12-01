package ru.itsjava.allhomework.hw28_11.cow_man_plant;

public class Plant implements Eatable, Talkable{
    @Override
    public void eat() {
        System.out.println("Пью водичку");
    }

    @Override
    public void talk() {
        System.out.println("Не умею");
    }
}

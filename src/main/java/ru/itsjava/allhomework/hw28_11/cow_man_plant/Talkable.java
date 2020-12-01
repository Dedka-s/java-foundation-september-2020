package ru.itsjava.allhomework.hw28_11.cow_man_plant;

public interface Talkable {
    default void talk(){
        System.out.println("Я возможно могу говорить");
    }
}

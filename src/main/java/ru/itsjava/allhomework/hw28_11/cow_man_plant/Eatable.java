package ru.itsjava.allhomework.hw28_11.cow_man_plant;

public interface Eatable {
    default void eat(){
        System.out.println("Я возможно умею есть");
    }
}

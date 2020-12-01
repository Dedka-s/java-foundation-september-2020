package ru.itsjava.inheritance;

public interface Conrollable {
    default void move(){
        System.out.println("move from conrol");
    }

}

package ru.itsjava.inheritance;

public abstract class Car implements Movable{
    public void printEmotion(){
        System.out.println("So good seats");
    }

    public abstract String getCarMake();
}

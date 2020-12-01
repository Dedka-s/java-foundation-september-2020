package ru.itsjava.allhomework.hw28_11.cow_man_plant;

public class Main {
    public static void main(String[] args) {
        Cow cow = new Cow();
        Man man = new Man();
        Plant plant = new Plant();

        cow.talk();
        cow.eat();

        man.talk();
        man.eat();

        plant.talk();
        plant.eat();
    }
}

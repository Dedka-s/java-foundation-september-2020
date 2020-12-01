package ru.itsjava.interfaces;

public class InterfacePractics {
    public static void main(String[] args) {
        Creatable khotabitch = new Gin();
        khotabitch.createWish();
        Creatable badGin = new BadGin();
        badGin.createWish();
        System.out.println("Creatable.LIFE = " + Creatable.LIFE);
    }
}

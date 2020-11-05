package ru.itsjava.oop;

public class Jungle {
    public static void main(String[] args) {
        Lion scare = new Lion("Scare");

        scare.printLion();

        scare.setName("King Scare");

        scare.printLion();
        System.out.println("В наших джунглях есть: " + scare.getName());

        scare.setPawsCount(3);
        System.out.println("Количество лап " + scare.getName() + ": " + scare.getPawsCount());
    }
}

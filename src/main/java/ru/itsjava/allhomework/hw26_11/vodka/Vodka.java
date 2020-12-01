package ru.itsjava.allhomework.hw26_11.vodka;

public class Vodka {
    private String brand;
    private double volume;
    private double cost;
    private boolean fake;

    public Vodka(boolean fake) {
        this.fake = fake;
        if (this.fake == true) {
            cost = 100;
            volume = 5;
            brand = "самогон";
        } else {
            cost = 1000;
            volume = 1;
            brand = "не самогон";
        }

    }

    public Vodka() {
        this.brand = "из ларька";
        this.volume = 0.75;
        this.cost = 250;
        this.fake = false;
    }

    public Vodka(String brand, double volume, double cost, boolean fake) {
        this.brand = brand;
        this.volume = volume;
        this.cost = cost;
        this.fake = fake;
    }

    public Vodka(double volume, double cost) {
        this.volume = volume;
        this.cost = cost;
        fake = true;
        brand = "самогон";
    }

    public Vodka(String brand, double volume, double cost) {
        this.brand = brand;
        this.volume = volume;
        this.cost = cost;
        fake = false;
    }

    public void showVodka() {
        System.out.println("brand = " + brand);
        System.out.println("volume = " + volume);
        System.out.println("cost = " + cost);
        System.out.println("fake = " + fake);
    }

    public void drinkTooMuch () {
        System.out.println("Будет похмелье");
    }

    public void drinkTooMuch (boolean itWasAWedding) {
        if (itWasAWedding == true) {
            System.out.println("У тебя будет похмелье 2 дня");
        } else {
            System.out.println("Будет похмелье");
        }
    }

    public void drinkTooMuch (int numberOfBottles) {
        System.out.println("Так меного питьнельзя");
    }

}

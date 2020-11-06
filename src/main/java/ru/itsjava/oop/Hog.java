package ru.itsjava.oop;

public class Hog {
    private String name;
    private int pawsCount;

    public Hog(String name) {
        this.name = name;
        pawsCount = 4;
    }

    public void printHog() {
        System.out.println("Кабан с именем " + name);
    }

    public String getName() {
        return name;
    }

    public int getPawsCount() {
        return pawsCount;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setPawsCount(int pawsCount) {
        this.pawsCount = pawsCount;
    }
}

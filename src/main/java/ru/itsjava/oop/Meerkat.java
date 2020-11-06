package ru.itsjava.oop;

public class Meerkat {
    private String name;
    private int pawsCount;

    public Meerkat (String name) {
        this.name = name;
        pawsCount = 4;
    }

    public void printMeerkat() {
        System.out.println("Сурикат с именем " + name);
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getPawsCount() {
        return pawsCount;
    }

    public void setPawsCount(int pawsCount) {
        this.pawsCount = pawsCount;
    }
}

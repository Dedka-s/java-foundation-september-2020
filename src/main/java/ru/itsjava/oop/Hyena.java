package ru.itsjava.oop;

public class Hyena {
    private String name;
    private int pawsCount;

    public Hyena(String name) {
        this.name = name;
        pawsCount = 4;
    }

    public void printHyena() {
        System.out.println("Гиеана с именем " + name);
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

package ru.itsjava.oop;


public class Cow {
    private String nameBreed;
    private String color;

    public Cow (String nameBreed, String color) {
        this.nameBreed = nameBreed;
        this.color = color;
    }

    public String getNameBreed() {
        return nameBreed;
    }

    public void setNameBreed(String nameBreed) {
        this.nameBreed = nameBreed;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public void printCow () {
        System.out.println(nameBreed + " " + color);
    }
}

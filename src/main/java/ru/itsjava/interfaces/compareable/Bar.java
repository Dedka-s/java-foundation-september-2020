package ru.itsjava.interfaces.compareable;

import java.util.Arrays;

public class Bar {
    public static void main(String[] args) throws CloneNotSupportedException {
        Bottle waterBottle = new Bottle("glass", 0.5);
        Bottle whiskeyBottle = new Bottle("glass", 0.7);
        Bottle colaBottle = new Bottle("plastic", 1.5);
        System.out.println("waterBottle.compareTo(whiskeyBottle) = " + waterBottle.compareTo(whiskeyBottle));

        Bottle[] bottles = {colaBottle, whiskeyBottle, waterBottle};
        System.out.println("Arrays.toString(bottles) befor = " + Arrays.toString(bottles));
        Arrays.sort(bottles);
        System.out.println("Arrays.toString(bottles) after = " + Arrays.toString(bottles));

        System.out.println("waterBottle.clone() = " + waterBottle.clone());
    }
}

package ru.itsjava.allhomework.hw26_11.person;

import java.util.Arrays;

public class Main {
    public static void main(String[] args) throws CloneNotSupportedException {
        Person p1 = new Person("Misha", "Ivanov", 18);
        Person p2 = new Person("Misha", "Petrov", 30);
        Person p3 = new Person("Anastasia", "Ivanova", 21);
        Person p4 = new Person("Oleg", "Petrov", 18);
        Person p5 = new Person("Misha", "Ivanov", 22);
        Person p6 = new Person("Azamat", "Ararat", 18);
        Person[] list ={p1, p2, p3, p4, p5, p6};

        System.out.println("list.toString() = " + Arrays.toString(list));
        Arrays.sort(list);
        System.out.println("list.toString() = " + Arrays.toString(list));
        System.out.println("p1.clone() = " + p1.clone());
    }
}

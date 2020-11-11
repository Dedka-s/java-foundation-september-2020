package ru.itsjava.oop.homework1;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.Setter;

@Setter
@Getter
@AllArgsConstructor
public class Person {
    private boolean isMale;
    private String name;
    private int age;

    public void printAge() {
        System.out.println(age);
    }
}

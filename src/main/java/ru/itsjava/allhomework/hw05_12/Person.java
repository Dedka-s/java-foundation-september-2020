package ru.itsjava.allhomework.hw05_12;

import lombok.Data;

@Data
public class Person{
    private final String name;
    private int age;

    public Person(String name, int age) throws AgeException{
        this.name = name;
        if (age<0 || age>150) throw new AgeException();
        this.age = age;
    }

    public void setAge(int age) throws AgeException{
        if (age<0 || age>150) throw new AgeException();
        this.age = age;
    }
}

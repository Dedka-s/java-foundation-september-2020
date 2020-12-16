package ru.itsjava.allhomework.hw10_12starics;

import lombok.AllArgsConstructor;
import lombok.Data;

@Data
@AllArgsConstructor
public class Person {
    private int age;
    private boolean isMale;
    private String name;


    public String toString(){
        return name;
    }

}

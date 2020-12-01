package ru.itsjava.allhomework.hw26_11.person;

import lombok.AllArgsConstructor;
import lombok.Data;

@Data
@AllArgsConstructor
public class Person implements Comparable<Person>, Cloneable{
    private final String name;
    private final String surname;
    private int age;

    @Override
    public int compareTo(Person o) {
        int compareSurname = surname.compareTo(o.surname);
        if (compareSurname == 0){
            int compareName = name.compareTo(o.name);
            if (compareName == 0) {
                return Integer.compare(age,o.age);
            } else return compareName;
        } else return compareSurname;
    }

    @Override
    protected Object clone() throws CloneNotSupportedException {
        return super.clone();
    }

    public String toString(){
        return surname + " " + name + " " + age;
    }
}

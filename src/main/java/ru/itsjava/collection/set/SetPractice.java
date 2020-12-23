package ru.itsjava.collection.set;

import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

public class SetPractice {
    public static void main(String[] args) {
        Set<Man> mans = new HashSet<>();
        Man andrey = new Man("Andrey");
        System.out.println("mans.add(andrey) = " + mans.add(andrey));
        System.out.println("mans.add(andrey) = " + mans.add(andrey));
        System.out.println("mans.size() = " + mans.size());
        Man mark = new Man("Mark");
        mans.add(mark);

        for (Man man : mans) {
            System.out.print(man + " ");
        }
        System.out.println();

        Iterator<Man> iterator = mans.iterator();
        while (iterator.hasNext()) {
            System.out.print(iterator.next() + " ");
        }
        System.out.println();

        Set<Man> manSet = Set.of(andrey, mark);
        for (Man man : manSet) {
            System.out.print(man + "!");
        }
    }
}

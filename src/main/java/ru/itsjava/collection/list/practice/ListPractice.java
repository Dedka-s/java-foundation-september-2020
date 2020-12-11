package ru.itsjava.collection.list.practice;

import java.util.ArrayList;
import java.util.List;

public class ListPractice {
    public static void main(String[] args) {
        List<String>stringList = new ArrayList<>();
        stringList.add("first");
        System.out.println("stringList.get(0) = " + stringList.get(0));
        stringList.add("second");
        System.out.println("stringList.get(1) = " + stringList.get(1));
        stringList.add(0,"SuperFirst");
        System.out.println("stringList.get(0) = " + stringList.get(0));

        System.out.println("stringList.size() = " + stringList.size());

        //stringList.remove("SuperFirst");
        stringList.remove(0);
        System.out.println("stringList.get(0) = " + stringList.get(0));

        stringList.clear();
        System.out.println("stringList.isEmpty() = " + stringList.isEmpty());

        stringList.add("first");
        stringList.add("second");

        System.out.println("stringList.contains(\"first\") = " + stringList.contains("first"));
        stringList.set(1, "last");
        System.out.println("stringList.get(1) = " + stringList.get(1));
        stringList.add("last");

        for (String elem : stringList) {
            System.out.print(elem + " ");
        }
        System.out.println();

        stringList.remove("last");

        for (String elem : stringList) {
            System.out.print(elem + " ");
        }
        System.out.println();




    }
}

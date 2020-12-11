package ru.itsjava.core;

public class Main {
    public static void main(String[] args) {

        int num = 5;

        System.out.println("(num++) = " + (num++));
        System.out.println("after inc: num = " + num);
        System.out.println("(++num) = " + (++num));
        System.out.println(num++ + ++num);
    }
}

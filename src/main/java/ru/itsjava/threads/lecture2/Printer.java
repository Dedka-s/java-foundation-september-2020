package ru.itsjava.threads.lecture2;

public class Printer {
    public synchronized void print(String message, int times) {
        for (int i = 0; i < times; i++) {
            System.out.print(message + " ");
        }
    }

    public synchronized void printM() {
        for (int i = 0; i < 3; i++) {
            System.out.print("M");
        }
    }
}

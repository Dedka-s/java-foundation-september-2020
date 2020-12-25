package ru.itsjava.allhomework.hw24_12_thread;


public class Main {
    public static void main(String[] args) {
        Thread thread = new PrintMessage("Ай");
        thread.setDaemon(true);
        thread.start();

        Runnable runnable = new PrintMessage2("Ой");
        Thread thread2 = new Thread(runnable);
        thread2.start();
        try {
            thread2.join();
        } catch (InterruptedException e) {
            e.printStackTrace();
        }

        Runnable runnable2 = new PrintMessage2("Ой-ОЙ-ОЙ");
        Thread thread3 = new Thread(runnable2);
        thread3.start();

    }
}

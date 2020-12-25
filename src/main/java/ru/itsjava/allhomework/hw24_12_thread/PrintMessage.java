package ru.itsjava.allhomework.hw24_12_thread;

import lombok.AllArgsConstructor;

@AllArgsConstructor
public class PrintMessage extends Thread{
    private final String message;


    @Override
    public void run() {
        for (int i = 0; i < 60; i++) {
            try {
                Thread.sleep(5000);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
            System.out.print(message + " ");

        }
    }
}

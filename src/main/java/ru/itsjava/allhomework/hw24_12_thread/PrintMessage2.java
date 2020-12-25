package ru.itsjava.allhomework.hw24_12_thread;

import lombok.AllArgsConstructor;

@AllArgsConstructor
public class PrintMessage2 implements Runnable{
    private final String message;
    @Override
    public void run() {
        for (int i = 0; i < 6; i++) {
            try {
                Thread.sleep(1000);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
            System.out.print(message + " ");

        }
    }
}

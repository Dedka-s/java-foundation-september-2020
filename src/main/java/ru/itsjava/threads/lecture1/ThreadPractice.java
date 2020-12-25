package ru.itsjava.threads.lecture1;

public class ThreadPractice {
    public static void main(String[] args) {
//        написать А 8 раз через пробел
//
//        for (int i = 0; i < 8; i++) {
//            System.out.print("A ");
//        }
//        System.out.println();
//        написать А 8 раз через пробел с некоторой задержкой

//        for (int i = 0; i < 8; i++) {
//            for (int j = 0; j <1_000_000_000L ; j++) {
//            }
//            System.out.print("A ");
//        }
//        System.out.println();
//
//        for (int i = 0; i < 8; i++) {
//            try {
//                Thread.sleep(2000);
//            } catch (InterruptedException e) {
//                e.printStackTrace();
//            }
//            System.out.print("A ");
//        }
//        System.out.println();

        //       написать А 8 раз через пробел каждые 2 секунды и В каждые 3 секунды
        //(каждую по 6 раз)
        // 1 2 3 4 5 6 7 8 9 10 11 12 13 14 15 16 17 18 19 20
        //   А В А  АВ   А В  А    АВ     А  В        В

        Thread threadA = new PrinterA();
        threadA.start();

        Runnable runnableB = new PrinterB();
        Thread threadB = new Thread(runnableB);
        threadB.start();

//        Runnable runnableC = new Runnable() {
//            @SneakyThrows
//            @Override
//            public void run() {
//
//                for (int i = 0; i < 6; i++) {
//                    Thread.sleep(1000);
//                    System.out.print("C ");
//                }
//
//            }
//        };
//
//        new Thread(runnableC).start();

        Runnable runnableC = () -> {

                for (int i = 0; i < 6; i++) {
                    try {
                        Thread.sleep(1000);
                    } catch (InterruptedException e) {
                        e.printStackTrace();
                    }
                    System.out.print("C ");
                }

        };
        new Thread(runnableC).start();

    }
}

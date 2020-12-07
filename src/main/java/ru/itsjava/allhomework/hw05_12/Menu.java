package ru.itsjava.allhomework.hw05_12;

import java.util.InputMismatchException;
import java.util.Scanner;

public class Menu {



    public static void startMenu() throws MenuException {

        while (true) {

            Scanner console = new Scanner(System.in);

            System.out.println("//Меню:\n" +
                    "//1. Понедельник\n" +
                    "//2. Вторник\n" +
                    "//3. Среда\n" +
                    "//4. Четверг\n" +
                    "//5. Пятница\n" +
                    "//6. Суббота\n" +
                    "//7. Воскресенье");
            System.out.println("Введи номер меню: ");

            int menuNum = 8;

            try {
                menuNum = console.nextInt();
            } catch (InputMismatchException e) {
                throw new MenuException();
            }

            if (menuNum == 1) {
                System.out.println("Week.MONDAY.toString() = " + Week.MONDAY.toString());
            } else if (menuNum == 2) {
                System.out.println("Week.TUESDAY.toString() = " + Week.TUESDAY.toString());
            } else if (menuNum == 3) {
                System.out.println("Week.WEDNESDAY.toString() = " + Week.WEDNESDAY.toString());
            } else if (menuNum == 4) {
                System.out.println("Week.THURSDAY.toString() = " + Week.THURSDAY.toString());
            } else if (menuNum == 5) {
                System.out.println("Week.FRIDAY.toString() = " + Week.FRIDAY.toString());
            } else if (menuNum == 6) {
                System.out.println("Week.SATURDAY.toString() = " + Week.SATURDAY.toString());
            } else if (menuNum == 7) {
                System.out.println("Week.SUNDAY.toString() = " + Week.SUNDAY.toString());
            } else if (menuNum == 0) {
                System.out.println("Досвидание");
                System.exit(0);
            } else {
                try {
                    throw new MenuException();
                } catch (MenuException e) {
                    System.err.println("Не то число");
                }
            }
        }

    }

}

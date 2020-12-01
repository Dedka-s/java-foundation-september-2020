package ru.itsjava.hw_notepad;

import java.util.Scanner;

public class Menu {
    public void startNotepad(Notepad notepad) {

        Scanner console = new Scanner(System.in);
        printMenu();

        while (true) {
            System.out.println("Введи номер меню: ");
            int menuNum = console.nextInt();
            if (menuNum == 1) {
                notepad.show();
            } else if (menuNum == 2) {
                notepad.addRecord();
            } else if (menuNum == 3) {
                notepad.deleteRecord();
            } else if (menuNum == 4) {
                notepad.editRecord();
            } else if (menuNum == 0) {
                System.out.println("Досвидание");
                System.exit(0);
            } else {
                System.out.println("Неправильное число");
            }
        }
    }
    private void printMenu() {
        System.out.println("//Меню:\n" +
                "//1. Посмотерть все записи\n" +
                "//2. Добавить запись\n" +
                "//3. Удалить запись\n" +
                "//4. Отредактировать запись\n" +
                "//0. Выход");
    }

}

package ru.itsjava.HWNotepad;

import lombok.Data;

import java.util.Scanner;

@Data

public class Notepad {
    private Entry[] notepad;

    public Notepad() {
        this.notepad = new Entry[100];
        renumber();
    }

    public Notepad(int i) {
        this.notepad = new Entry[i];
        renumber();
    }

    public void startNotepad() {
        Scanner console = new Scanner(System.in);
        printMenu();

        while (true) {
            System.out.println("Введи номер меню: ");
            int menuNum = console.nextInt();
            if (menuNum == 1) {
                show();
            } else if (menuNum == 2) {
               addRecord();
            } else if (menuNum == 3) {
                deleteRecord();
            } else if (menuNum == 4) {
                editRecord();
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

    private void renumber () {
        for (int i = 0; i < this.notepad.length; i++) {
            String s = (i + 1) +  ".";
            this.notepad[i] = new Entry(s);
        }
    }

    private void show () {
        for (Entry entry:notepad) {
            System.out.println(entry.getNumber() + " " + entry.getMessage());
        }
    }

    private void addRecord () {
        Scanner console = new Scanner(System.in);
        for (int i = 0; i < this.notepad.length; i++) {
            if (this.notepad[i].getMessage().equals(" ")) {
                System.out.println("Введите новую запись");
                String record = console.next();
                this.notepad[i].setMessage(record);
                break;
            }
        }
    }

    private void deleteRecord () {
        Scanner console = new Scanner(System.in);
        System.out.println("Введите номер записи которую вы хотите удалить");
        int record = console.nextInt();
        this.notepad[record - 1].setMessage(" ");
        if (record - 1 != this.notepad.length-1) {
            while (this.notepad[record].getMessage() != " ") {
                this.notepad[record - 1].setMessage(this.notepad[record].getMessage());
                this.notepad[record].setMessage(" ");
                if (record == this.notepad.length-1) {
                    break;
                } else {
                    record++;
                }

            }
        }


    }

    private void editRecord () {
        Scanner console = new Scanner(System.in);
        System.out.println("Введите номер записи которую вы хотите отредактировать");
        int record = console.nextInt();
        System.out.println("Введите новый текст");
        String newRecord = console.next();
        this.notepad[record - 1].setMessage(newRecord);
    }





}

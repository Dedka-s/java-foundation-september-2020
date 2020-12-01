package ru.itsjava.hw_notepad;

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


    public void renumber () {
        for (int i = 0; i < this.notepad.length; i++) {
            String s = (i + 1) +  ".";
            this.notepad[i] = new Entry(s);
        }
    }

    public void show () {
        for (Entry entry:notepad) {
            System.out.println(entry.getNumber() + " " + entry.getMessage());
        }
    }

    public void addRecord () {
        Scanner console = new Scanner(System.in);
        if (this.notepad[this.notepad.length-1].getMessage().equals(" ")) {
            for (int i = 0; i < this.notepad.length; i++) {
                if (this.notepad[i].getMessage().equals(" ")) {
                    System.out.println("Введите новую запись");
                    String record = console.next();
                    this.notepad[i].setMessage(record);
                    break;
                }
            }
        } else {
            System.out.println("Блокнот заплнен, для записи нет места");
        }


    }

    public void deleteRecord () {
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

    public void editRecord () {
        Scanner console = new Scanner(System.in);
        System.out.println("Введите номер записи которую вы хотите отредактировать");
        int record = console.nextInt();
        System.out.println("Введите новый текст");
        String newRecord = console.next();
        this.notepad[record - 1].setMessage(newRecord);
    }





}

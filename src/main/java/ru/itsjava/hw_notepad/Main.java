package ru.itsjava.hw_notepad;

public class Main {
    public static void main(String[] args) {
        Notepad not = new Notepad(3);
        Menu menu = new Menu();
        menu.startNotepad(not);
    }
}

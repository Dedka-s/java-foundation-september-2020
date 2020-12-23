package ru.itsjava.allhomework.hw19_12_sreams.hw_notepad;

public class Main {
    public static void main(String[] args) {
    Notepad notepad = new Notepad("src/main/resources", "sentence.txt");
    Menu menu = new Menu();
    menu.startNotepad(notepad);

    }
}

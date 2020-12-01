package ru.itsjava.hw_notepad;

import lombok.Data;

@Data
public class Entry {
    private String number;
    private String  message;

    public Entry(String number) {
        this.number = number;
        this.message = " ";

    }
}

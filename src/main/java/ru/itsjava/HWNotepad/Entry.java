package ru.itsjava.HWNotepad;

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

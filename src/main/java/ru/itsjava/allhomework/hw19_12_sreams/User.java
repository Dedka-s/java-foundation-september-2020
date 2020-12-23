package ru.itsjava.allhomework.hw19_12_sreams;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.ToString;

import java.io.Serializable;

@Data
@ToString
@AllArgsConstructor
public class User implements Serializable {
    private String login;
    private transient String password;
}

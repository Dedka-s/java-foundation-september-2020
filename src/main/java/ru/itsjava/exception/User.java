package ru.itsjava.exception;


import lombok.SneakyThrows;

public class User {
    private String name;

    public User(String name) {
        //if(name.trim().equals("")) throw new IncorrectUserNameException();
        this.name = name;
    }

//    public void setName(String name) throws IncorrectUserNameException {
//        if(name.trim().equals("")) throw new IncorrectUserNameException();
//        this.name = name;
//    }

    @SneakyThrows
    public void setName(String name) {
        if(name.trim().equals("")) throw new IncorrectUserNameException();
        this.name = name;
    }
}

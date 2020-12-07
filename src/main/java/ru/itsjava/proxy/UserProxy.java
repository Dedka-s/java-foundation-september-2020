package ru.itsjava.proxy;

import ru.itsjava.exception.IncorrectUserNameException;

public class UserProxy extends User{

    public UserProxy(String name) {
        super(name);
    }

    public void setName(String name){

        try {
            super.setName(name);
        } catch (IncorrectUserNameException e) {
            e.printStackTrace();
        }
    }
}

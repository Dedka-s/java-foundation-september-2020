package ru.itsjava.allhomework.hw05_12;

public class Main {
    public static void main(String[] args) {

        try {
            throw new MenuException();
        } catch (MenuException e) {
            System.err.println("ошибочка 1");
        } finally {
            System.out.println("Finally 1");
        }


//        try {
//            System.out.println(1/0);
//        } catch (ArithmeticException ex) {
//            System.err.println("ошибочка 2");
//        }


        try {
            throw new MenuException();
        } catch (MenuException e) {
            try {
                System.err.println("Внешний Catch");;
                throw new MenuException("повторная ошибка");
            } catch (MenuException menuException) {
                System.err.println("Внутрений Catch");;
            } finally {
                System.out.println("Внутренее Finally");
            }
        } finally {
            System.out.println("Внешнее Finally");
        }

        try {
            Person ivan = new Person("Ivan",-20);
        } catch (AgeException age) {
            System.err.println("Не правильный возраст");
        }


    }



}

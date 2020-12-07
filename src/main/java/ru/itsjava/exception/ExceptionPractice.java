package ru.itsjava.exception;

public class ExceptionPractice {
    public static void main(String[] args) {
        //throw new NullPointerException();

//        try {
//            Object obj = null;
//            obj.toString();
//            throw new RuntimeException();
//        } catch (NullPointerException npe) {
//            System.err.println("У тебя npe");
//            //npe.printStackTrace();
//        } catch (Throwable throwable){
//            System.err.println("Я тебя поймал: " + throwable);
//        }
//        System.out.println("После обработки ошибки");

//        try {
//            throw new Exception();
//        } catch (Exception e) {
//            e.printStackTrace();
//        }

//        try {
//            throw new RuntimeException();
//        } catch (NullPointerException runtimeException){
//            System.err.println(runtimeException);
//        }finally {
//            System.out.println("FINALLY");
//        }

        User emptyUser = new User("");

//        try {
//            emptyUser.setName(" ");
//        } catch (IncorrectUserNameException iune){
//            System.err.println(iune);
//        }


//        emptyUser.setName(" ");


    }
}

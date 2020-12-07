package ru.itsjava.proxy;

public class Main {
    public static void main(String[] args) {
//        User user = new User("");
//        try {
//            user.setName("Vital");
//        } catch (IncorrectUserNameException e) {
//            e.printStackTrace();
//        }

        UserProxy user = new UserProxy("");
        user.setName("Vital");
    }
}

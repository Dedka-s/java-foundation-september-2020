package ru.itsjava.string;

public class StringPrak {
    public static void main(String[] args) {
        String str = "I am String cole";
        str = str.substring(1);
        System.out.println(str);


        String name = "Vitaliy";
        String nameCopy = "Vitaliy";
        String constrName = new String ("Vitaliy");
        String internName = constrName.intern();

        System.out.println("(name == nameCopy) = " + (name == nameCopy));
        System.out.println("( name==constrName) = " + (name == constrName));

        long start = System.currentTimeMillis();
        StringBuilder stringBuilder = new StringBuilder(str);
        for (int i = 0; i < 10000; i++){
            stringBuilder.append(1);
        }

        long end = System.currentTimeMillis();

        System.out.println(end - start);
    }
}

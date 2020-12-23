package ru.itsjava.iostreams;

import java.io.*;

public class IOStreamsPractice {

    public static void main(String[] args) {

        //File file = new File("my-file.txt");
        //File file = new File("C:/Users/Dedka/IdeaProjects/java-foundation-september-2020/src/main/resources/my-file.txt");
        File file = new File("src/main/resources/my-file.txt");

        try {
            PrintWriter printWriter = new PrintWriter(file);
            printWriter.println("Hello");
            printWriter.close();
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        }

        try (BufferedReader fileReader = new BufferedReader(new FileReader(file));){
            System.out.println(fileReader.readLine());
        } catch (IOException ioException) {
            ioException.printStackTrace();
        }
    }
}

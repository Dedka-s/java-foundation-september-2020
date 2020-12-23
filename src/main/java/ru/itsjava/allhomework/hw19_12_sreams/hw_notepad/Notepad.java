package ru.itsjava.allhomework.hw19_12_sreams.hw_notepad;

import lombok.Data;

import java.io.*;
import java.util.Scanner;

@Data

public class Notepad {
    private String[] notepad;
    File file;
// = new File("src/main/resources/sentence.txt")
    public Notepad(String path, String nameFile) {
        this.notepad = new String[10];
        file = new File(path + "/" + nameFile);
        writingFromFile();
    }


    public void writingFromFile() {
        int indexOfSentence = 0;
        try (BufferedReader fileReader = new BufferedReader(new FileReader(file));){
            String buffer = null;
            while( (buffer = fileReader.readLine() ) != null ) {
                notepad[indexOfSentence] = buffer;
                indexOfSentence++;
            }

        } catch (IOException ioException) {
            ioException.printStackTrace();
        }
    }

    public void writingToFile(){
        try(PrintWriter printWriter = new PrintWriter(file);) {
            for (int i = 0; i < 10; i++) {
                if (!(notepad[i]==null)){
                    printWriter.println(notepad[i]);
                } else {
                    break;
                }
            }
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        }
    }


    public void show () {
        for (String entry:notepad) {
            if (!(entry==null)) {
                System.out.print(entry + " ");
            } else {
                break;
            }

        }
        System.out.println();
    }

    public void addRecord () {
        Scanner console = new Scanner(System.in);
        System.out.println("Введите новую запись");
        String record = console.next();
        String[] resArray = new String[10];
        for (int i = 0; i < 9; i++) {
            if (!(notepad[i]==null)){
                resArray[i+1] = notepad[i];
            } else {
                break;
            }
        }
        notepad = resArray;
        notepad[0]=record;
        writingToFile();
    }
}

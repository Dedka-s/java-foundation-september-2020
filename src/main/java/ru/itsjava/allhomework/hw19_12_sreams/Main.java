package ru.itsjava.allhomework.hw19_12_sreams;


import java.io.*;

public class Main {
    public static void main(String[] args) throws IOException, ClassNotFoundException {
//2. Объект класса User (login, password) Проставить transient на password.
//Сериализовать объект. После десериализовать объект и вывести поля login и password.
        User user = new User("Ivan","password");
        System.out.println("Before: " + user);

        ObjectOutputStream objectOutputStream = new ObjectOutputStream( new FileOutputStream("src/main/resources/user.out"));
        objectOutputStream.writeObject(user);

        ObjectInputStream objectInputStream = new ObjectInputStream(new FileInputStream("src/main/resources/user.out"));
        Object objUser = objectInputStream.readObject();
        User userAfterSer = (User) objUser;
        System.out.println("AfterSer: " + userAfterSer);

//3. Даны 2 файла. В каждом файле содержится текст.
//Необходимо поменять местами содержимое файлов.

        File file1 = new File("src/main/resources/my-file1.txt");
        File file2 = new File("src/main/resources/my-file2.txt");
        String buffer1 = null;
        String buffer2 = null;
        StringBuilder stringBuilder = new StringBuilder();
        
        try (BufferedReader fileReader = new BufferedReader(new FileReader(file1));){
            
            String ls = System.getProperty("line.separator");
            while( ( buffer1 = fileReader.readLine() ) != null ) {
                stringBuilder.append( buffer1 );
                stringBuilder.append( ls );
            }
            buffer1 = stringBuilder.toString();
            stringBuilder.delete(0,stringBuilder.length());
        } catch (IOException ioException) {
            ioException.printStackTrace();
        }


        try (BufferedReader fileReader = new BufferedReader(new FileReader(file2));){

            String ls = System.getProperty("line.separator");
            while( ( buffer2 = fileReader.readLine() ) != null ) {
                stringBuilder.append( buffer2 );
                stringBuilder.append( ls );
            }
            buffer2 = stringBuilder.toString();
        } catch (IOException ioException) {
            ioException.printStackTrace();
        }

        try(PrintWriter printWriter = new PrintWriter(file1);) {
            printWriter.println(buffer2);
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        }

        try(PrintWriter printWriter = new PrintWriter(file2);) {
            printWriter.println(buffer1);
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        }




    }
}

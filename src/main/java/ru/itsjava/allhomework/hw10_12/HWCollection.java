package ru.itsjava.allhomework.hw10_12;

import java.util.ArrayList;
import java.util.List;

public class HWCollection {
    public static void main(String[] args) {

        //0.Создание списков
        List<String>stringList = new ArrayList<>();
        List<String> emptyList = new ArrayList<>(20);

        //2.Вставка элементов
        for (int i = 1; i < 6; i++){
            stringList.add("str" + i);
        }
        stringList.add(3,"str"+6);
        stringList.add(1,"str"+7);
        emptyList.addAll(stringList);

        //1.Получение алементов
        System.out.println("emptyList.get(0) = " + emptyList.get(0));
        System.out.println("emptyList.get(emptyList.size()-1) = " + emptyList.get(emptyList.size()-1));

        //3.Удаление элементов
        stringList.remove("str"+4);
        stringList.remove(0);

        //4.Наличие элемента
        System.out.println("stringList.contains(\"str\"+1) = " + stringList.contains("str" + 1));
        System.out.println("stringList.contains(\"str\"+7) = " + stringList.contains("str" + 7));

        //5.Вывод списка
        System.out.print("List1:{");
        for (int i = 0; i < stringList.size(); i++){
            System.out.print(stringList.get(i));
            if (i==stringList.size()-1){
                System.out.print("}");
                System.out.println();
                break;
            }
            System.out.print(";");
        }

        System.out.print("List2:{");
        for (int i = 0; i < emptyList.size(); i++){
            System.out.print(emptyList.get(i));
            if (i==emptyList.size()-1){
                System.out.print("}");
                System.out.println();
                break;
            }
            System.out.print(";");
        }

        //6.Отфильтровать список

        //а.Индекс делится на 3
        System.out.print("List2:{");
        for (int i = 0; i < emptyList.size(); i++){
            if (i%3==0) {
                System.out.print(emptyList.get(i));
                if (i==emptyList.size()-1){
                    System.out.print("}");
                    System.out.println();
                    break;
                }
                System.out.print(";");
            }
        }

        //б.Вернуть количество определенного элемента
        emptyList.add("str"+1);
        emptyList.add("str1");
        String str = "str1";
        System.out.print("Содержание " + str + " в List2 = ");
        int j = 0;
        for (int i = 0; i < emptyList.size(); i++){
            if (emptyList.get(i).equals(str)) j++;
        }
        System.out.print(j);
        System.out.println();

        //7.

        //а.Пропустить превые 3 элемента
        int k = 3;
        System.out.print("List2 пропуская " + k + " значений:{");
        for (int i = k; i < emptyList.size(); i++){
            System.out.print(emptyList.get(i));
            if (i==emptyList.size()-1){
                System.out.print("}");
                System.out.println();
                break;
            }
            System.out.print(";");
        }

        //б. Пропуская элементы выполнящим определенное условие
        emptyList.add(1,str);
        System.out.print("List2 пропуская все " + str +  " :{");
        int controller = 0;
        for (int i = 0; i < emptyList.size(); i++){

            if (!emptyList.get(i).equals(str)) {
                if (!(controller==0)) {
                    System.out.print(";");
                }
                System.out.print(emptyList.get(i));
                controller = 1;


            }
            if (i==emptyList.size()-1){
                System.out.print("}");
                System.out.println();
                break;
            }

        }

        System.out.print("List2:{");
        for (int i = 0; i < emptyList.size(); i++){
            System.out.print(emptyList.get(i));
            if (i==emptyList.size()-1){
                System.out.print("}");
                System.out.println();
                break;
            }
            System.out.print(";");
        }

        //7.Пропустить первые 2 элемента выполняющие условие

        System.out.print("List2 пропуская первые 2 " + str +  " :{");
        controller = 0;
        int controller2 = 0;

        for (int i = 0; i < emptyList.size(); i++){

            if ((!emptyList.get(i).equals(str))||controller2 >= 2) {
                if (!(controller==0)) {
                    System.out.print(";");
                }
                System.out.print(emptyList.get(i));
                controller = 1;


            } else controller2++;

            if (i==emptyList.size()-1){
                System.out.print("}");
                System.out.println();
                break;
            }

        }

        //8.Возращае первую строку длиной 3

        emptyList.add("str");
        emptyList.add(4,"str");
        emptyList.add(2,"vof");
        System.out.print("Первый елемент длиной в три символа в List2 = ");
        for (int i = 0; i < emptyList.size(); i++){
            if (emptyList.get(i).length()==3){
                System.out.println(emptyList.get(i));
                break;
            }
        }
        //9.ернуть все строки длиной 3

        System.out.print("Все строки длиной 3 в List2:{");
        for (int i = 0; i < emptyList.size(); i++){
            if (emptyList.get(i).length()==3) {
                System.out.print(emptyList.get(i));
                if (i==emptyList.size()-1){
                    System.out.print("}");
                    System.out.println();
                    break;
                }
                System.out.print(";");
            }
        }

        //10
        var boris = new Person(18,true,"Борис");
        var natasha = new Person(14,false,"Наташа");
        var nazir = new Person(21,true,"Назир");
        var nikita = new Person(13,true,"Никита");

        List<Person> armyList = new ArrayList<>();
        armyList.add(boris);
        armyList.add(natasha);
        armyList.add(nazir);
        armyList.add(nikita);

        System.out.print("В армию пойдут:{");
        char fname = 'Н';
        for (int i = 0; i < armyList.size(); i++){

            if ( armyList.get(i).isMale() == true && armyList.get(i).getAge() >=18 && armyList.get(i).getAge()<=27 && armyList.get(i).getName().charAt(0) == fname) {
                System.out.print(armyList.get(i));
                if (i==armyList.size()-1){
                    System.out.print("}");
                    System.out.println();
                    break;
                }
                System.out.print(";");
            }
        }
    }
}


package ru.itsjava.shop;

import java.util.Scanner;

public class Shop {
    public static void main(String[] args) {
        Goods peanuts = new Goods("Грецкий", 3);
        Goods hazelnuts = new Goods("Лесной",2);
        Goods walnuts = new Goods("Арахис",1);

        Goods[] items = new Goods[]{peanuts, hazelnuts, walnuts};
        Scanner console = new Scanner(System.in);
        Menu.printMenu();
        while (true) {
            System.out.println("Введи номер меню: ");
            int menuNum = console.nextInt();

            if (menuNum == 1) {
                Menu.printAllNuts(items);
            } else if (menuNum == 2) {
                items = Menu.addNut(items, console);
            } else if (menuNum == 3) {
               items = Menu.deleteNut(items, console);
            } else if (menuNum == 4) {
                Menu.mergeSort(items,0,items.length-1);
            } else if (menuNum == 0) {
                System.out.println("Досвидание");
                System.exit(0);
            }


        }
    }
    }




//Проект:
//Меню:
//1. Посмотерть все орехи
//2. Добавить орех
//3. Просыпать, удалить
//4. Отсортировать по алфавиту
//5. Проверить наличие ореха
//6. Замена ореха на другой
//0. Выход

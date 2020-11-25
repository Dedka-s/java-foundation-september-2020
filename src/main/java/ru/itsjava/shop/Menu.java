package ru.itsjava.shop;

import java.util.Scanner;

public class Menu {
    Goods peanuts = new Goods("Грецкий");
    Goods hazelnuts = new Goods("Лесной");
    Goods walnuts = new Goods("Арахис");

    Goods[] items = new Goods[]{peanuts, hazelnuts, walnuts};


    public void startShop() {
        Scanner console = new Scanner(System.in);
        printMenu();

        while (true) {
            System.out.println("Введи номер меню: ");
                int menuNum = console.nextInt();
                if (menuNum == 1) {
                    printAllNuts(items);
                } else if (menuNum == 2) {
                    items = addNut(items, console);
                } else if (menuNum == 3) {
                    items = deleteNut(items, console);
                } else if (menuNum == 4) {
                    mergeSort(items, 0, items.length - 1);
                } else if (menuNum == 0) {
                    System.out.println("Досвидание");
                    System.exit(0);
                } else {
                    System.out.println("Неправильное число");
                }
        }
    }


    public void printMenu() {
        System.out.println("//Меню:\n" +
                "//1. Посмотерть все орехи\n" +
                "//2. Добавить орех\n" +
                "//3. Просыпать, удалить\n" +
                "//4. Отсортировать по алфавиту\n" +
                "//5. Проверить наличие ореха\n" +
                "//6. Замена ореха на другой\n" +
                "//0. Выход");
    }
    public static void printAllNuts(Goods[] goods) {
        for (Goods good : goods) {
            System.out.print(good.getView() + " ");
        }
        System.out.println();
    }

    public Goods[] addNut(Goods[] goods, Scanner console) {
        System.out.println("Введите новый орех: ");
        String inputNut = console.next();
        Goods[] resNutsArray = new Goods[goods.length + 1];
        for (int i = 0; i < goods.length; i++) {
            resNutsArray[i] = goods[i];
        }
        resNutsArray[goods.length] = new Goods(inputNut);
        return resNutsArray;
    }
    public static int checkAvailabilityNut(Goods[] items, String inputNut) {

        for (int i = 0; i < items.length; i++) {
            if (items[i].getView().equalsIgnoreCase(inputNut)) {
                return i;
            }
        }
        return -1;
    }
    public static Goods[] deleteNut(Goods[] goods, Scanner console) {
        System.out.println("Введите орех который нужно удалить: ");
        String inputNut = console.next();
        int placeOfNut = checkAvailabilityNut(goods, inputNut);
        if (placeOfNut == -1) {
            System.out.println("Нет в наличии такого ореха");
            return goods;
        } else {
            Goods[] resNutsArray = new Goods[goods.length - 1];
            for (int i = 0, j = 0; i < goods.length; i++) {
                if (i != placeOfNut) {
                    resNutsArray[j] = goods[i];
                    j++;
                }
            }
            return resNutsArray;
        }
    }

    public static void mergeSort(Goods[] array, int left, int right) {
        if (right <= left) return;
        int mid = (left+right)/2;
        mergeSort(array, left, mid);
        mergeSort(array, mid+1, right);
        merge(array, left, mid, right);
    }

    public static void merge(Goods[] array, int left, int mid, int right) {
        // вычисляем длину
        int lengthLeft = mid - left + 1;
        int lengthRight = right - mid;

        // создаем временные подмассивы
        Goods leftArray[] = new Goods[lengthLeft];
        Goods rightArray[] = new Goods[lengthRight];

        // копируем отсортированные массивы во временные
        for (int i = 0; i < lengthLeft; i++)
            leftArray[i] = array[left+i];
        for (int i = 0; i < lengthRight; i++)
            rightArray[i] = array[mid+i+1];

        // итераторы содержат текущий индекс временного подмассива
        int leftIndex = 0;
        int rightIndex = 0;

        // копируем из leftArray и rightArray обратно в массив
        for (int i = left; i < right + 1; i++) {
            // если остаются нескопированные элементы в R и L, копируем минимальный
            if (leftIndex < lengthLeft && rightIndex < lengthRight) {
                if (leftArray[leftIndex].getView().charAt(0) < rightArray[rightIndex].getView().charAt(0)) {
                    array[i] = leftArray[leftIndex];
                    leftIndex++;
                }
                else {
                    array[i] = rightArray[rightIndex];
                    rightIndex++;
                }
            }
            // если все элементы были скопированы из rightArray, скопировать остальные из leftArray
            else if (leftIndex < lengthLeft) {
                array[i] = leftArray[leftIndex];
                leftIndex++;
            }
            // если все элементы были скопированы из leftArray, скопировать остальные из rightArray
            else if (rightIndex < lengthRight) {
                array[i] = rightArray[rightIndex];
                rightIndex++;
            }
        }
    }
}

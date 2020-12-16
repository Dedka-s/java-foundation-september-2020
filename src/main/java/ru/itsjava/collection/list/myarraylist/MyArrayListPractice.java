package ru.itsjava.collection.list.myarraylist;

public class MyArrayListPractice {
    public static void main(String[] args) {
        MyArrayList arrayList = new MyArrayList();
        System.out.println("arrayList.size() = " + arrayList.size());

        arrayList.add("str1");
        arrayList.add("str2");
        arrayList.add("str3");
        arrayList.add("str2");

        System.out.println(arrayList);


        arrayList.add(1,"fff");
        System.out.println(arrayList);
        arrayList.remove(1);
        System.out.println(arrayList);
    }
}

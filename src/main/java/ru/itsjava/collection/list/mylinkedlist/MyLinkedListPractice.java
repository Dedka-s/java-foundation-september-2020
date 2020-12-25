package ru.itsjava.collection.list.mylinkedlist;

public class MyLinkedListPractice {
    public static void main(String[] args) {
        String DEFAULT_ELEM = "Elem 1";
        String DEFAULT_ELEM2 = "Elem 2";
//        MyLinkedList linkedList = new MyLinkedList();
//        linkedList.add("First");
//        linkedList.add("Second");
//        linkedList.add("Third");
//        System.out.println(linkedList);
//        linkedList.set(1,"First");
//        System.out.println(linkedList);
//        System.out.println("linkedList.contains(\"First\") = " + linkedList.contains("First"));
//        System.out.println("linkedList.lastIndexOf(\"First\") = " + linkedList.lastIndexOf("First"));

        MyLinkedList list = new MyLinkedList();
        list.add(DEFAULT_ELEM);
        System.out.println(list.indexOf(DEFAULT_ELEM));
    }

}

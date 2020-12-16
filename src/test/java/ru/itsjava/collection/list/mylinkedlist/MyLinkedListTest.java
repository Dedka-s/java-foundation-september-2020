package ru.itsjava.collection.list.mylinkedlist;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import ru.itsjava.collection.list.myarraylist.MyArrayList;

@DisplayName("Класс MyLinkedList должен: ")
public class MyLinkedListTest {

    public static final String DEFAULT_ELEM = "Elem 1";

    @DisplayName(" корректно удалять элемент по элементу")
    @Test
    public void shouldHaveCorrectRemoveByElement(){
        MyArrayList list = new MyArrayList();
        list.add(DEFAULT_ELEM);
        int sizeBeforeRemove = list.size();
        list.remove(DEFAULT_ELEM);
        Assertions.assertEquals(sizeBeforeRemove-1, list.size());
    }

    @DisplayName(" корректно добовлять элемент")
    @Test
    public void shouldHaveCorrectAddElement(){
        MyLinkedList list = new MyLinkedList();
        list.add(DEFAULT_ELEM);
        Assertions.assertEquals(1, list.size());
    }

}

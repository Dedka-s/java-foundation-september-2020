package ru.itsjava.collection.list.myarraylist;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

@DisplayName("Класс MyArrayList должен: ")
public class MyArrayListTest {

    public static final String DEFAULT_ELEM = "Elem 1";
    public static final String DEFAULT_ELEM2 = "Elem 2";

    @DisplayName(" корректно отображать реальный размер")
    @Test
    public void shouldHaveCorrectOutputSize(){
        MyArrayList list = new MyArrayList();
        list.add(DEFAULT_ELEM);
        Assertions.assertEquals(1, list.size());
    }

    @DisplayName(" корректно давать информацию о заполнении")
    @Test
    public void shouldHaveCorrectOutputIsEmpty(){
        MyArrayList list = new MyArrayList();
        list.add(DEFAULT_ELEM);
        Assertions.assertEquals(false, list.isEmpty());
    }

    @DisplayName(" корректно давать информацию о наличии в списке конкретного элемента")
    @Test
    public void shouldHaveCorrectOutputContains(){
        MyArrayList list = new MyArrayList();
        list.add(DEFAULT_ELEM);
        Assertions.assertEquals(true, list.contains(DEFAULT_ELEM));
    }

    @DisplayName(" корректно конвертировать коллекцию в массив")
    @Test
    public void shouldHaveCorrectConvertToArray(){
        MyArrayList list = new MyArrayList();
        list.add(DEFAULT_ELEM);
        Object[] arrayFromCollection = list.toArray();
        Assertions.assertEquals(arrayFromCollection[0], list.get(0));
        Assertions.assertEquals(arrayFromCollection.length, list.size());
    }

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
        MyArrayList list = new MyArrayList();
        list.add(DEFAULT_ELEM);
        Assertions.assertEquals(1, list.size());
    }

    @DisplayName(" корректно очищать коллекцию")
    @Test
    public void shouldHaveCorrectClear(){
        MyArrayList list = new MyArrayList();
        list.add(DEFAULT_ELEM);
        list.clear();
        Assertions.assertEquals(0, list.size());
    }

    @DisplayName(" корректно возвращать значение заданого элемента")
    @Test
    public void shouldHaveCorrectGetElement(){
        MyArrayList list = new MyArrayList();
        list.add(DEFAULT_ELEM);
        Assertions.assertEquals(DEFAULT_ELEM, list.get(0));
    }

    @DisplayName(" корректно изменять значение заданого элемента")
    @Test
    public void shouldHaveCorrectSetElement(){
        MyArrayList list = new MyArrayList();
        list.add("");
        list.set(0,DEFAULT_ELEM);
        Assertions.assertEquals(DEFAULT_ELEM, list.get(0));
    }

    @DisplayName(" корректно добавлять значение в заданую ячейку")
    @Test
    public void shouldHaveCorrectAddElementForIndex(){
        MyArrayList list = new MyArrayList();
        list.add(DEFAULT_ELEM);
        list.add(DEFAULT_ELEM);
        int sizeBeforeLastAdd = list.size();
        list.add(1,DEFAULT_ELEM2);
        Assertions.assertEquals(DEFAULT_ELEM2, list.get(1));
        Assertions.assertEquals(sizeBeforeLastAdd + 1, list.size());
    }

    @DisplayName(" корректно удалять значение из заданной ячейки")
    @Test
    public void shouldHaveCorrectRemoveElementFromIndex(){
        MyArrayList list = new MyArrayList();
        list.add(DEFAULT_ELEM);
        list.add(DEFAULT_ELEM);
        list.add(1,DEFAULT_ELEM2);
        int sizeBeforeRemove = list.size();
        list.remove(0);
        Assertions.assertEquals(DEFAULT_ELEM2, list.get(0));
        Assertions.assertEquals(sizeBeforeRemove - 1, list.size());
    }

    @DisplayName(" корректно возвращать индекс первого появления элемента")
    @Test
    public void shouldHaveCorrectReturnIndexOf(){
        MyArrayList list = new MyArrayList();
        list.add(DEFAULT_ELEM);
        list.add(DEFAULT_ELEM);
        list.add(1,DEFAULT_ELEM2);
        Assertions.assertEquals(0, list.indexOf(DEFAULT_ELEM));
    }

    @DisplayName(" корректно возвращать индекс последнего появления элемента")
    @Test
    public void shouldHaveCorrectReturnLastIndexOf(){
        MyArrayList list = new MyArrayList();
        list.add(DEFAULT_ELEM);
        list.add(DEFAULT_ELEM);
        list.add(1,DEFAULT_ELEM2);
        Assertions.assertEquals(2, list.lastIndexOf(DEFAULT_ELEM));
    }

    @DisplayName(" корректно возвращать коллекцию строкой")
    @Test
    public void shouldHaveCorrectReturnToString(){
        MyArrayList list = new MyArrayList();
        list.add(DEFAULT_ELEM);
        list.add(DEFAULT_ELEM);
        list.add(1,DEFAULT_ELEM2);
        String exceptionString = "MyArrayList{" + DEFAULT_ELEM +  " " + DEFAULT_ELEM2 + " " + DEFAULT_ELEM + " }";
        Assertions.assertEquals(exceptionString, list.toString());
    }

}

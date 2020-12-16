package ru.itsjava.collection.list.myarraylist;

public class MyArrayList {
    private final static int DEFAULT_CAPACITY = 10;
    private Object[] array;
    private int realSize;

    public MyArrayList() {
        array = new Object[DEFAULT_CAPACITY];
        realSize = 0;
    }


    public int size() {
        return realSize;
    }

    public boolean isEmpty() {
        if (realSize > 0) {
            return true;
        }
        return false;
    }

    public boolean contains(Object o) {
        for (int i = 0; i < realSize; i++) {
            if (array[i].equals(o)) {
                return true;
            }
        }
        return false;
    }

    public Object[] toArray() {
            Object[] resArray = new Object[realSize];
            System.arraycopy(array, 0, resArray, 0, realSize);
            return  resArray;
        }

    public boolean add(Object o) {
        if (realSize == array.length){
            Object[] resArray = new Object[3*realSize/2 + 1];
            System.arraycopy(array, 0, resArray, 0, realSize);
            array = resArray;
        }
        array[realSize++] = o;
        return true;
    }

    public boolean remove(Object o) {
        Object[] resultArray = new Object[array.length];
        int removeIndex = realSize;
        for (int i = 0; i < realSize; i++) {
            if (array[i].equals(o)){
                removeIndex = i;
                break;
            }
            resultArray[i] = array[i];
        }
        if (removeIndex == realSize) return false;
        for (int i = removeIndex; i < realSize; i++) {
            resultArray[i] = array[i+1];
        }
        array = resultArray;
        realSize--;
        return true;
    }

    public void clear() {
        array = new Object[DEFAULT_CAPACITY];
        realSize = 0;
    }


    private void checkIndex(int index){
        if ((index < 0) || (index > realSize)) {
            throw new IndexOutOfBoundsException("Index: " + index + " out of size " + realSize);
        }
    }
    public Object get(int index) {
        checkIndex(index);
        return array[index];
    }

    public Object set(int index, Object element) {
        checkIndex(index);
        Object oldValue = array[index];
        array[index] = element;
        return oldValue;
    }

    public void add(int index, Object element) {
        checkIndex(index);
        if (realSize == array.length){
            Object[] resArray = new Object[3*realSize/2 + 1];
            System.arraycopy(array, 0, resArray, 0, realSize);
            array = resArray;
        }
        Object[] resultArray = new Object[array.length];
        for (int i = 0; i < index; i++) {
            resultArray[i] = array[i];
        }
        for (int i = index; i < realSize; i++) {
            resultArray[i + 1] = array[i];
        }
        resultArray[index] = element;
        array = resultArray;
        realSize++;
    }


    public Object remove(int index) {
        checkIndex(index);
        Object oldValue = array[index];
        Object[] resultArray = new Object[array.length];
        for (int i = 0; i < index; i++) {
            resultArray[i] = array[i];
        }
        for (int i = index; i < realSize; i++) {
            resultArray[i] = array[i+1];
        }
        array = resultArray;
        realSize--;
        return oldValue;
    }

    public int indexOf(Object o) {
        for (int i = 0; i < realSize; i++) {
            if (array[i].equals(o)){
                return i;
            }
        }
        return -1;
    }

    public int lastIndexOf(Object o) {
        for (int i = realSize-1; i >= 0; i--) {
            if (array[i].equals(o)){
                return i;
            }
        }
        return -1;
    }


    @Override
    public String toString() {
        StringBuilder str = new StringBuilder("MyArrayList{") ;
        for (int i = 0; i < realSize; i++){
            str = str.append(array[i]).append(" ");
        }
        str.append('}');
        return str.toString();
    }
}

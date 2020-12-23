package ru.itsjava.collection.list.mylinkedlist;


public class MyLinkedList {
    private Node head;
    private int realSize = 0;

    public int size() {
        return realSize;
    }

    private void checkIndex(int index){
        if ((index < 0) || (index > realSize)) {
            throw new IndexOutOfBoundsException("Index: " + index + " out of size " + realSize);
        }
    }

    public boolean isEmpty() {
        return realSize == 0;
    }

    public boolean contains(Object o) {
        return indexOf(o) >= 1;
    }

    public boolean add(Object o) {
        Node node = new Node(o, null);

        if (head == null){
            head = node;
        } else {
            Node curNode = head;
            while (!(curNode.getNext()==null)) {
                curNode = curNode.getNext();
            }
            curNode.setNext(node);
        }
        realSize++;
        return true;
    }

    public boolean remove(Object o) {
        if (head == null) {
            return false;
        }
        int curIndex = 0;
        Node curNode = head;
        while (!(curNode.getNext()==null)) {
            if (curNode.getValue().equals(o)) {
                remove(curIndex);
                return true;
            }
            curNode = curNode.getNext();
        }
        return false;
    }

    public void clear() {
        head = null;
        realSize = 0;
    }

    public Object get(int index) {
        checkIndex(index);
        int curIndex = 0;
        Node curNode = head;
        while (!(curIndex==index)) {
            curNode = curNode.getNext();
            curIndex++;
        }
        return curNode.getValue();
    }

    public Object set(int index, Object element) {
        checkIndex(index);
        int curIndex = 0;
        Node curNode = head;
        while (!(curIndex==index)) {
            curNode = curNode.getNext();
            curIndex++;
        }
        Node prevNode = curNode;
        curNode.setValue(element);
        return prevNode.getValue();
    }

    public void add(int index, Object element) {
        checkIndex(index);

        if (index == 0){
            Node prevHead = head;
            head = new Node(element,prevHead);
            realSize++;
            return;
        }

        Node prevNode = head;
        Node curNode = head.getNext();

        int curIndex = 1;
        while (!(curIndex == index)){
            prevNode=prevNode.getNext();
            curNode=curNode.getNext();
            curIndex++;
        }
        Node newNode = new Node (element,curNode);
        prevNode.setNext(newNode);
        realSize++;
    }


    public Object remove(int index) {
        checkIndex(index);

        if (index == 0){
            Node prevHead = head;
            head = head.getNext();
            prevHead.setNext(null);
            realSize--;
            return prevHead.getValue();
        }

        Node prevNode = head;
        Node curNode = head.getNext();

        int curIndex = 1;
        while (!(curIndex == index)){
            prevNode=prevNode.getNext();
            curNode=curNode.getNext();
            curIndex++;
        }
        prevNode.setNext(curNode.getNext());
        curNode.setNext(null);
        realSize--;

        return curNode.getValue();
    }

    public int indexOf(Object o) {
        int curIndex = 0;
        Node curNode = head;
        while (!(curNode.getNext()==null)) {
            if (curNode.getValue().equals(o)) {
                return curIndex;
            }
            curNode = curNode.getNext();
            curIndex++;
        }
        return -1;
    }

    public int lastIndexOf(Object o) {
        int curIndex = 0;
        int lastIndex = -1;
        Node curNode = head;
        while (!(curNode.getNext()==null)) {
            if (curNode.getValue().equals(o)) {
                lastIndex = curIndex;
            }
            curNode = curNode.getNext();
            curIndex++;
        }
        return lastIndex;
    }

    @Override
    public String toString() {
        StringBuilder stringBuilder = new StringBuilder("LinkedList{ ");
        Node cureNode = head;
        while (!(cureNode == null)){
            stringBuilder.append(cureNode.getValue()).append(" ");
            cureNode=cureNode.getNext();
        }
        return stringBuilder.append('}').toString();
    }
}

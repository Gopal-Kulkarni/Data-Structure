package com.DoubleLinkedList;

import com.SingleLinkedList.Operations;

public class DoubleLinkedList<T> implements Operations<T> {
    private DoubleNode head = null;

    public void addFirst(T ele) {
        DoubleNode node  = new DoubleNode();
        if( size() == 0){
            head = node;

        }
    }

    public void addLast(T ele) {

    }

    public void addAt(int i, T ele) {

    }

    public boolean deleteAt(int i) {
        return false;
    }

    public boolean deleteLast() {
        return false;
    }

    public boolean deleteFirst() {
        return false;
    }

    public void show() {

    }

    public int size() {
        int i = 0;
        DoubleNode n = head;
        while ( n.getNext() != null){
            i++;
        }
        return i;
    }
}

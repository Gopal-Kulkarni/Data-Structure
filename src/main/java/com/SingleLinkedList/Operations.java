package com.SingleLinkedList;

public interface Operations<T> {
    void addFirst(T ele);
    void addLast(T ele);
    void addAt(int i, T ele);
    boolean deleteAt(int i);
    boolean deleteLast();
    boolean deleteFirst();
    void show();
    int size();
}

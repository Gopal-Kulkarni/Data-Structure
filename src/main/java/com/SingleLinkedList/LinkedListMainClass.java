package com.SingleLinkedList;

public class LinkedListMainClass {
    public static void main(String[] args) {
        LinkedList list = new LinkedList();
        list.addFirst(1);
        list.addFirst(2);
        list.addFirst(3);
        list.addFirst(4);
        list.addLast("A");
        list.addAt(1,"ABC");
        list.show();
        System.out.println("**************Delete First");
        list.deleteFirst();
        list.show();
        System.out.println("**************Delete Last");
        list.deleteLast();
        list.show();
        System.out.println("**************Delete at"+0);
        list.deleteAt(0);
        list.show();
    }
}

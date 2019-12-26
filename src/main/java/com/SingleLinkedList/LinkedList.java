package com.SingleLinkedList;

public class LinkedList<T>  implements  Operations<T>{
    private Node head = null;

    public void addFirst(T ele) {
        Node node = new Node();
        node.setData(ele);
        node.setNext(head);
        head = node;
    }

    public void addLast(T ele) {
        Node node = new Node();
        node.setData(ele);
        Node n = head;
        while ( n.getNext() != null){
            n = n.getNext();
        }
        n.setNext(node);
    }

    public void addAt(int i, T ele) {
        Node node = new Node();
        node.setData(ele);
        Node n = head;
        if (i > size() || i < 0){
            System.out.println("Position is not proper");
            return;
        } else if ( i == 0){
            node.setNext(n);
            head = node;
        } else {
            while ( i > 1 ){
                i--;
                n = n.getNext();
            }
            node.setNext(n.getNext());
            n.setNext(node);
        }
    }

    public boolean deleteAt(int i) {
        Node p = head;
        Node n = head.getNext();
        if (i > size() || i < 0){
            System.out.println("Position is not proper");
            return false;
        } else if ( i == 0){
            head = head.getNext();
            return true;
        } else {
            while ( i > 1 ){
                i--;
                n = n.getNext();
                p = p.getNext();
            }
            p.setNext(n.getNext());
            return true;
        }
    }

    public boolean deleteLast() {
        Node n = head;

        while (n.getNext().getNext()!= null){
            n = n.getNext();
        }
        n.setNext(null);
        return true;
    }

    public boolean deleteFirst() {
        head = head.getNext();
        return true;
    }

    public void show() {
        Node n = head;
        while ( n!= null){
            System.out.println(n.getData());
            n = n.getNext();
        }
    }

    public int size() {
        Node n = head;
        int i = 0;
        while( n!= null){
            i++;
            n = n.getNext();
        }
        return i;
    }
}

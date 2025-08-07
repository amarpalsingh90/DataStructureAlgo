package com.dev.lib.doublylinkedlist;

public class DoublyLinkedList {
    Node head = null;
    Node tail = null;

    public void addNodeFront(int data) {
        Node temp = new Node();
        temp.data = data;
        temp.next = head;
        temp.prev = null;

        if (head != null) {
            head.prev = temp;
        }
        head = temp;
        if (tail == null) {
            tail = temp;
        }
    }


    public void addNodeBack(int data) {
        Node temp = new Node();
        temp.data = data;
        temp.prev = tail;
        temp.next = null;
        if (tail != null) {
            tail.next = temp;
        }
        tail = temp;
        if (head == null) {
            head = temp;
        }
    }

    public void iterateForward() {

        Node temp = head;
        while (temp != null) {
            System.out.println(temp.data);
            temp = temp.next;
        }

    }

    public void iterateBackward() {
        Node temp = tail;
        while (temp != null) {
            System.out.println(temp.data);
            temp = temp.prev;
        }
    }
}

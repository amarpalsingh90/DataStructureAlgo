package com.dev.lib.linkedlist;

public class LinkedList {
    Node head = null;

    public void insert(int data) {
        Node node = new Node();
        node.data = data;
        node.next = null;
        if (head == null) {
            head = node;
        } else {
            Node node1 = head;
            while (node1.next != null) {
                node1 = node1.next;
            }
            node1.next = node;
        }
    }

    public void insertAtStart(int data) {
        Node node = new Node();
        node.data = data;
        node.next = head;
        head = node;
    }

    public void insetAt(int index, int data) {
        Node node = new Node();
        node.data = data;
        node.next = null;
        if (head == null) {
            head = node;
        } else {
            Node node1 = head;
            for (int i = 0; i < index - 1; i++) {
                node1 = node1.next;
            }
            node.next = node1.next;
            node1.next = node;
        }
    }

    public void deleteAt(int index){
        if(head==null){
            System.out.println("List Is Empty");
        }  else if (index ==0){
            head= head.next;
        } else {
            Node node = head;
            Node node1 = null;
            for (int i = 0; i < index - 1; i++) {
                node = node.next;
            }
            node1= node.next;
            node.next= node1.next;
        }
    }

    public void showList() {
        if (head == null) {
            System.out.println("List Is Empty");
        } else {
            Node node = head;
            while (node.next != null) {
                System.out.print(node.data + "->");
                node = node.next;
            }
            System.out.print(node.data);
        }

    }
}

package com.dev.lib.doublylinkedlist;

public class DoublyListRunner {

    public static void main(String args[]) {
        DoublyLinkedList doublyLinkedList = new DoublyLinkedList();
        doublyLinkedList.addNodeFront(12);
        doublyLinkedList.addNodeFront(20);
        doublyLinkedList.addNodeFront(40);
        doublyLinkedList.addNodeBack(60);
        doublyLinkedList.addNodeBack(70);
        doublyLinkedList.addNodeFront(80);
        doublyLinkedList.iterateBackward();
        System.out.println("\n\n\n");
        doublyLinkedList.iterateForward();


    }
}

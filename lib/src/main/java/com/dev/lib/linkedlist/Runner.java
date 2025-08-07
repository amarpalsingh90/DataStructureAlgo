package com.dev.lib.linkedlist;

public class Runner {
    public static void main(String args[]) {
        LinkedList list = new LinkedList();
        list.insert(10);
        list.insert(24);
        list.insert(16);
        list.insert(18);
        list.insert(40);
        list.insetAt(3, 505);
        list.insertAtStart(456);
        list.showList();
        list.deleteAt(6);
        System.out.println("");
        list.showList();
    }
}

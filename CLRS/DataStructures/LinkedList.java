package DataStructures;

import DataStructures.SubClasses.Node;

public class LinkedList {
    private int size;
    Node head;

    public LinkedList() {
        size = 0;
        head = null;
    }

    public void insertFront(Object o) {
        Node newNode = new Node(o);
        if(head == null) {
            head = newNode;
        } else {
            newNode.setNext(head);
            head = newNode;
        }
    }
}

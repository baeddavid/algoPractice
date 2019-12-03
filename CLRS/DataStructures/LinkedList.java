package DataStructures;

import DataStructures.SubClasses.Node;

public class LinkedList {
    private int size;
    Node head;

    public LinkedList() {
        size = 0;
        head = null;
    }

    public Node search(int key) {
        Node current = head;
        while(current != null && current.getKey() != key) {
            current.setNext(current.getNext());
        }
        return current;
    }

    public void insertFront(Object o) {
        Node newNode = new Node(o);
        if (!isListEmpty()) {
            newNode.setNext(head);
        }
        head = newNode;
    }

    public boolean isListEmpty() {
        return size == 0;
    }
}

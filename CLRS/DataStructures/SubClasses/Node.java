package DataStructures.SubClasses;

public class Node {
    private Object content;
    private Node next;
    private int key;

    public Node(Object o) {
        o = content;
        next = null;
    }

    public Object getContent() {
        return content;
    }

    public void setContent(Object o) {
        o = content;
    }

    public Node getNext() {
        return next;
    }

    public void setNext(Node n) {
        next = n;
    }

    public int getKey() { return key; };

    public void setKey(int k) { key = k; }
}

package DataStructures.SubClasses;

public class Node {
    private Object content;
    private Node next;

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
}

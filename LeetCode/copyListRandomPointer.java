import java.util;

class Node {
  public int val;
  public Node next;
  public Node random;

  public Node() {}

  public Node(int _val,Node _next,Node _random) {
      val = _val;
      next = _next;
      random = _random;
  }
};

class copyListRandomPointer {
  public Node copyRandomList(Node head) {
    HashMap<Node, Node> m = HashMap<Node, Node>();
    Node c = head;

    while (c != null) {
      m.put(c, new Node(c.val));
      c = c.next;
    }

    c = head;
    while (c != null) {
      map.get(c).next = map.get(c.next);
      map.get(c).random = map.get(c.random);
    }
    return map.get(head);
  }
}
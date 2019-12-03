package DataStructures;

public class Queue {
    private int front;
    private int rear;
    private int size;
    private int nItems;
    private Object[] QueueArray;

    public Queue(int size) {
        front = 0;
        rear = -1;
        size = 0;
        QueueArray = new Object[size];
    }

    public void Enque(Object o) {
        if(rear == size - 1) {
            rear = -1;
        }
        QueueArray[++rear] = o;
        nItems++;
    }

    public Object deque() {
        Object returnObject = QueueArray[front++];
        if(front == size) {
            front = 0;
        }
        nItems--;
        return returnObject;
    }

    public boolean isFull() {
        return size == nItems;
    }

    public Object peek() {
        return QueueArray[front];
    }

    public int getSize() {
        return nItems;
    }
}

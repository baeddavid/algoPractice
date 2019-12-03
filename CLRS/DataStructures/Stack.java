package DataStructures;

public class Stack {
    int top;
    int size;
    Object[] StackArray;

    public Stack(int size) {
        top = -1;
        size = 0;
        StackArray = new Object[size];
    }

    public int getSize() {
        return size;
    }

    public Object peek() {
        return StackArray[top];
    }

    public void push(Object o) {
        if(isOverFlow()) {
            throw new Error("Overflow");
        } else {
            StackArray[++top] = o;
            size++;
        }
    }

    public Object pop() {
        if(isOverFlow()) {
            throw new Error("Underflow");
        } else {
            top--;
            size--;
            return StackArray[top];
        }
    }

    private boolean isOverFlow() {
        return top == StackArray.length - 1;
    }

    private boolean isUnderFlow() {
        return top < -1;
    }
}

package DataStructures;

public class Heap {
    private int[] Heap;
    private int size;
    private int maxSize;


    public Heap(int maxSize) {
        this.maxSize = maxSize;
        this.size = 0;
        Heap = new int[this.maxSize + 1];
        Heap[0] = Integer.MAX_VALUE;
    }

    public void print() {
        for (int i = 1; i <= size / 2; i++) {
            System.out.print(" PARENT : " + Heap[i] + " LEFT CHILD : " +
                    Heap[2 * i] + " RIGHT CHILD :" + Heap[2 * i + 1]);
            System.out.println();
        }
    }

    public void insert(int integer) {
        Heap[++size] = integer;
        int current = size;

        while(Heap[current] > Heap[getParentOfNode(current)]) {
            swap(current, getParentOfNode(current));
            current = getParentOfNode(current);
        }
    }

    public int extractMax() {
        int popped = Heap[1];
        Heap[1] = Heap[size--];
        maxHeapify(1);
        return popped;
    }

    public int getSize() {
        return size;
    }

    private void maxHeapify(int index) {
        if(isNodeLeaf(index))
            return;

        int largestIndex = index;
        int leftChild = getLeftChildOfNode(index);
        int rightChild = getRightChildOfNode(index);

        if(leftChild <= Heap.length &&
                Heap[leftChild] > Heap[index])
            largestIndex = leftChild;
        if(rightChild <= Heap.length &&
                Heap[rightChild] > Heap[largestIndex])
            largestIndex = rightChild;

        if(largestIndex != index) {
            swap(index, largestIndex);
            maxHeapify(largestIndex);
        }
    }

    private void swap(int a, int b) {
        int temp = Heap[a];
        Heap[a] = Heap[b];
        Heap[b] = temp;
    }

    private int getParentOfNode(int index) {
        return index / 2;
    }

    private int getLeftChildOfNode(int index) {
        return 2 * index;
    }

    private int getRightChildOfNode(int index) {
        return (2 * index) + 1;
    }

    private boolean isNodeLeaf(int index) {
        return index >= (size / 2) && index <= size;
    }
}

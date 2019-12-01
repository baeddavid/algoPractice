public class HeapSort implements Sorts{

    public void sort(int[] array) {
        buildHeap(array);
        for(int i = array.length - 1; i >= 0; i--) {
            swap(array, 0, i);
            heapify(array, i, 0);
        }
    }

    private void buildHeap(int[] array) {
        int n = array.length;
        for(int i = n / 2 - 1; i >= 0; i--)
            heapify(array, n, i);
    }

    private void heapify(int[] array, int size, int index) {
        int largest = index;
        int leftChildOfIndex = (2 * index) + 1;
        int rightChildOfIndex = (2 * index) + 2;

        if(leftChildOfIndex < size &&
            array[leftChildOfIndex] > array[largest])
            largest = leftChildOfIndex;

        if(rightChildOfIndex < size &&
            array[rightChildOfIndex] > array[largest])
            largest = rightChildOfIndex;

        if(largest != index) {
            swap(array, index, largest);
            heapify(array, size, largest);
        }
    }

    private void swap(int[] arr, int a, int b) {
        int temp = arr[a];
        arr[a] = arr[b];
        arr[b] = temp;
    }
}

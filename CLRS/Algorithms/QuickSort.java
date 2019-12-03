public class QuickSort implements Sorts{
    public void sort(int[] Array) {
        quickSort(Array, 0, Array.length - 1);
    }

    private void quickSort(int[] Array, int left, int right) {
        if(left < right) {
            int pivot = partitionArray(Array, left, right);
            quickSort(Array, left, pivot - 1);
            quickSort(Array, pivot + 1, right);
        }
    }

    private int partitionArray(int[] Array, int left, int right) {
        int pivot = Array[right];
        int pivotIndex = left - 1;

        for(int j = left; j < right; j++) {
            if(Array[j] <= pivot) {
                pivotIndex++;
                swap(Array, pivotIndex, j);
            }
        }
        swap(Array, pivotIndex + 1, right);
        return pivotIndex + 1;
    }

    private void swap(int[] a, int x, int y) {
        int temp = a[x];
        a[x] = a[y];
        a[y] = temp;
    }
}

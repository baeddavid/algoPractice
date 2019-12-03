package Algorithms;

public class QuickSelect {
    public int kthSmallestElement(int[] Array, int left, int right, int k) {
        int partition = partitionArray(Array, left, right);
        if(partition == k) return Array[partition];
        else if(partition < k) return kthSmallestElement(Array, partition + 1, right, k);
        else return kthSmallestElement(Array, left, partition -1, k);
    }

    private int partitionArray(int[] Array, int left, int right) {
        int pivot = Array[right], pivotIndex = left;
        for(int i = left; i < right; i++) {
            if(Array[i] <= pivot) {
                swap(Array, i, pivotIndex);
                pivotIndex++;
            }
        }
        swap(Array, right, pivotIndex);
        return pivotIndex;
    }

    private void swap(int[] A, int x, int y) {
        int temp = A[x];
        A[x] = A[y];
        A[y] = temp;
    }
}

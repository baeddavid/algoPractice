import static java.lang.Math.random;
import sorts.MergeSort;
import search.LinearSearch;

public class Practice {
    public static void main(String[] args) {
        int[] arr = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10};
        System.out.print(LinearSearch.recursiveSearch(arr, 0, 10));
    }

    static void insertionSort(int[] A) {
        for(int i = 1; i < A.length; i++) {
            int j = i - 1;
            int key = A[i];
            while(j >= 0 && A[j] > key) {
                A[j + 1] = A[j];
                j--;
            }
            A[j + 1] = key;
        }
    }
}

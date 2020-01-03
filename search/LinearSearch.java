package search;

public class LinearSearch {
    public static int linearSearch(int[] A, int key) {
        for(int i = 0; i < A.length; i++)
            if(A[i] == key)
                return i;
            return -1;
    }

    public static int recursiveSearch(int[] A, int start, int key) {
        if(A[start] == key) return start;
        if(start < A.length - 1)
            return recursiveSearch(A, start + 1, key);
        return -1;
    }
}

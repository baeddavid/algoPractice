class KthElement {

  public int FindKthElement(int[] A, int left, int right, int k) {
    if (k > 0 && k <= right - left + 1) {
      int p = partition(A, left, right);

      if (p == k) return A[p];

      if (p > k) return FindKthElement(A, left, p - 1, k);
      
      return FindKthElement(A, p + 1, right, k - p + left);
    }
    return -1;
  }

  public int partition(int[] A, int left, int right) {
    int pivot = A[right];
    int i = left - 1;

    for (int j = left; j < right; j++) {
      if (A[j] < pivot) {
        i++;
        int temp = A[i];
        A[i] = A[j];
        A[j] = temp;
      }
    }
    int temp = A[i + 1];
    A[i + 1] = A[right];
    A[right] = temp;
    return i + 1;
  }
}
class Amazon3Sum {
  public int threeSum(int[] A, int v) {
    Arrays.sort(A);
    int answer = A[0] + A[1] + A[A.length - 1];

    for (int i = 0; i < A.length - 2; i++) {
      int p1 = i + 1, p2 = A.length - 1;
      while (p1 < p2) {
        int currentSum = A[i] + A[p1] + A[p2];
        if (currentSum == v) return currentSum;
        if (currentSum < v) p1++;
        else p2--;
      }
      if (currenSum <  v && Math.abs(currenSum - v) < Math.abs(answer - v))
        answer = currenSum;
    }
    return answer;
  }
}
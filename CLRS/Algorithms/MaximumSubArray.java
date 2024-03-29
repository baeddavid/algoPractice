package Algorithms;

import static java.lang.Math.*;

public class MaximumSubArray {

    private int findMaxCrossingSubArray(int[] Array, int left, int middle, int right) {
        int leftSum = Integer.MIN_VALUE;
        int sum = 0;

        for(int i = middle; i >= 0; i--) {
            sum += Array[i];
            if(sum > leftSum)
                leftSum = sum;
        }

        int rightSum = Integer.MIN_VALUE;
        sum = 0;
        for(int i = middle + 1; i < Array.length; i++) {
            sum += Array[i];
            if(sum > rightSum)
                rightSum = sum;
        }

        return(leftSum + rightSum);
    }

    public int findMaximumSubArray(int[] Array, int left, int right) {
        if(right == left) return Array[left];
        int m = (left + right) / 2;

        return max(max(findMaximumSubArray(Array, left, m),
                findMaximumSubArray(Array, m + 1, right)),
                findMaxCrossingSubArray(Array, left, m, right));
    }

    public int findMaximumSubArraySLow(int[] Array) {
        if(Array.length == 1) return Array[0];

        int answer = Integer.MIN_VALUE;
        for(int i = 0; i < Array.length; i++) {
            int currentSum = Array[i];
            if(currentSum > answer) answer = currentSum;
            for(int j = i + 1; j < Array.length; j++) {
                currentSum += Array[j];
                if(currentSum > answer) answer = currentSum;
            }
        }
        return answer;
    }
}
import java.util.Arrays;

public class CountingSort {

    private int[] countElements(int[] array, int k) {
        int[] CountedArray = new int[k + 1];
        Arrays.fill(CountedArray, 0);

        for(int i : CountedArray)
            CountedArray[i] += 1;

        for(int i = 1; i < CountedArray.length; i++)
            CountedArray[i] += CountedArray[i - 1];
        return CountedArray;
    }

    public int[] sort(int[] input, int k) {
        int[] c = countElements(input, k);
        int[] sorted = new int[input.length];

        for(int i = input.length - 1; i >= 0; i--) {
            int current = input[i];
            sorted[c[current] - 1] = current;
            c[current] -= 1;
        }
        return sorted;
    }
}

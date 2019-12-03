package DataStructures;

import static java.lang.Math.*;

public class RodCutting {
    public int CutRod(int[] prices, int length) {
        int[] val = new int[length + 1];
        val[0] = 0;

        for(int i = 1; i < val.length; i++) {
            int max_val = Integer.MIN_VALUE;
            for(int j = 0; j < i; j++) {
                max_val = max(max_val, prices[j] + val[i - j + 1]);
                val[i] = max_val;
            }
        }
        return val[length];
    }
}

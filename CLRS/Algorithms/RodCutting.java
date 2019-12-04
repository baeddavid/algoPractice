package Algorithms;

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

    public int cutRod(int[] prices, int length) {
        if(length == 0) return 0;
        int a = Integer.MIN_VALUE;
        for(int i = 0; i < length; i++)
            a = max(a, prices[i] + cutRod(prices, length - 1));
        return a;
    }

    public int memoizedCutRod(int[] prices, int length) {
        int[] r = new int[length + 1];
        for(int i = 0; i <= length; i++)
            r[i] = Integer.MIN_VALUE;
        return memoizedCutRodAux(prices, length, r);
    }

    private int memoizedCutRodAux(int[] p, int length, int[] r) {
        int a;
        if(r[length] >= 0)
            return r[length];
        if(length == 0)
            a = 0;
        else {
            a = Integer.MIN_VALUE;
            for(int i  = 0; i < length; i++) {
                a = max(a, p[i] + memoizedCutRodAux(p, length - i, r));
            }
        }
        r[length] = a;
        return a;
    }
}

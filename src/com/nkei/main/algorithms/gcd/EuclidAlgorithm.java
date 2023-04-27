package com.nkei.main.algorithms.gcd;

public class EuclidAlgorithm implements GreatestCommonDivisor {

    @Override
    public int get(int a, int b) {
        if (b == 0) {
            return a;
        }
        return get(b, a % b);
    }
}

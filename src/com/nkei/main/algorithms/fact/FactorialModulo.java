package com.nkei.main.algorithms.fact;

public class FactorialModulo {

    public long get(int n, int p) {
        long res = 1;
        while (n > 1) {
            res = (res * ((n / p) % 2 == 0 ? p - 1 : 1)) % p;
            for (int i = 2; i <= n % p; ++i)
                res = (res * i) % p;
            n /= p;
        }

        return res % p;
    }
}

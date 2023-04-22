package com.nkei.main.algorithms.fact;

public class FactorialRecursive implements Factorial {
    @Override
    public long get(int num) {
        return num == 1 ? 1 : num * get(--num);
    }
}

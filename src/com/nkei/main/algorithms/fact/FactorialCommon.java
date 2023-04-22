package com.nkei.main.algorithms.fact;

public class FactorialCommon implements Factorial {
    @Override
    public long get(int num) {
        long answer = 1;
        for (int i = 1; i <= num; i++) {
            answer *= i;
        }

        return answer;
    }
}

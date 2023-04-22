package com.nkei.n0_1000.test;

import com.nkei.n0_1000.N1_TwoSum;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertArrayEquals;

class N1_TwoSumTest {

    @Test
    void test1() {
        N1_TwoSum t = new N1_TwoSum();
        int[] actual = t.twoSum(new int[]{2,2,3}, 4);

        assertArrayEquals(new int[]{0, 1}, actual);
    }

    @Test
    void test2() {
        N1_TwoSum t = new N1_TwoSum();
        int[] actual = t.twoSum(new int[]{988, 567, 9012, 16}, 10000);

        assertArrayEquals(new int[]{0, 2}, actual);
    }
}